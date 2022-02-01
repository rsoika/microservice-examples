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

import javax.inject.Named;

import com.ralph.data.NobelPrize;
/**
 * The APIEvent provides a CDI observer pattern. The event is fired
 * by the NobelPriceResource each time a resource is requested. An event Observer can react on a save or load
 * event.
 * 
 * @author Ralph Soika
 * @version 1.0
 */
@Named
public class APIEvent {

    public static final String ON_SAVE = "save";
    public static final String ON_LOAD = "load";
    public static final String ON_DELETE = "delete";

    private String eventType;
    private NobelPrize data;

    public APIEvent(NobelPrize data, String eventType) {
        this.eventType = eventType;
        this.data = data;
    }

    public String getEventType() {
        return eventType;
    }

    public NobelPrize getData() {
        return data;
    }

}
