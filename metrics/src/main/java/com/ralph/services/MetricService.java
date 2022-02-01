/*  
 *  Imixs-Workflow 
 *  
 *  Copyright (C) 2001-2020 Imixs Software Solutions GmbH,  
 *  http://www.imixs.com
 *  
 *  This program is free software; you can redistribute it and/or 
 *  modify it under the terms of the GNU General Public License 
 *  as published by the Free Software Foundation; either version 2 
 *  of the License, or (at your option) any later version.
 *  
 *  This program is distributed in the hope that it will be useful, 
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of 
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU 
 *  General Public License for more details.
 *  
 *  You can receive a copy of the GNU General Public
 *  License at http://www.gnu.org/licenses/gpl.html
 *  
 *  Project: 
 *      https://www.imixs.org
 *      https://github.com/imixs/imixs-workflow
 *  
 *  Contributors:  
 *      Imixs Software Solutions GmbH - Project Management
 *      Ralph Soika - Software Developer
 */

package com.ralph.services;

import java.nio.file.AccessDeniedException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.ObserverException;
import javax.enterprise.event.Observes;
import javax.inject.Inject;

import org.eclipse.microprofile.metrics.Counter;
import org.eclipse.microprofile.metrics.Metadata;
import org.eclipse.microprofile.metrics.MetricRegistry;
import org.eclipse.microprofile.metrics.MetricType;
import org.eclipse.microprofile.metrics.Tag;
import org.eclipse.microprofile.metrics.annotation.RegistryType;

/**
 * The MetricSerivce is a monitoring resource requests in the prometheus format.
 * The MetricService is based on Microprofile 2.2 and MP-Metric-API 2.2
 * <p>
 * A metric is created each time when a APIEvent is fired. The service exports
 * counter metrics in prometheus text format. A counter will always increase. To
 * extract the values in prometheus use the rate function - Example:
 * <p>
 * <code>rate(application_data_total{method="load"}[1m])</code>
 * <p>
 * The service expects MP Metrics v2.0. A warning is logged if corresponding
 * version is missing.
 * <p>
 * 
 * @author rsoika
 * @version 1.0
 */
@ApplicationScoped
public class MetricService {

    public static final String METRIC_DATA = "data";

    @Inject
    @RegistryType(type = MetricRegistry.Type.APPLICATION)
    MetricRegistry metricRegistry;

    private static Logger logger = Logger.getLogger(MetricService.class.getName());

    
    /**
     * ProcessingEvent listener to generate a metric.
     * 
     * @param processingEvent
     * @throws AccessDeniedException
     */
    public void onProcessingEvent(@Observes APIEvent apiEvent) {

        if (apiEvent == null) {
            return;
        }
        try {
            Counter counter = buildMetric(apiEvent);
            counter.inc();
        } catch (IncompatibleClassChangeError | ObserverException oe) {
            logger.warning("...Microprofile Metrics not supported!");
            oe.printStackTrace();
        }
    }

    /**
     * This method builds a Microprofile Metric for a Counter. The metric contains
     * the tags 'method' and 'category' which are generated form the APIEvent.
     * 
     * @return Counter metric
     */
    private Counter buildMetric(APIEvent event) {
        // Constructs a Metadata object
        Metadata metadata = Metadata.builder().withName(METRIC_DATA).withDescription("Nobel Prize Event count")
                .withType(MetricType.COUNTER).build();
        List<Tag> tags = new ArrayList<Tag>();
        tags.add(new Tag("method", event.getEventType()));
        tags.add(new Tag("category", event.getData().getCategory()));
        Counter counter = metricRegistry.counter(metadata, tags.toArray(new Tag[tags.size()]));

        return counter;
    }

}
