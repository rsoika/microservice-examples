package com.ralph;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import org.eclipse.microprofile.openapi.annotations.OpenAPIDefinition;
import org.eclipse.microprofile.openapi.annotations.info.Contact;
import org.eclipse.microprofile.openapi.annotations.info.Info;
import org.eclipse.microprofile.openapi.annotations.servers.Server;

import com.ralph.data.NobelPrize;

/**
 * The Application class configures a JAX-RS endpoint.
 *
 * @author ralph.soika@imixs.com
 * 
 */
@ApplicationPath("api")
@OpenAPIDefinition(info = @Info(title = "Example application", version = "1.0.0", contact = @Contact(name = "Ralph Soika", email = "ralph.soika@imixs.com", url = "https://www.imixs.org")), servers = {
        @Server(url = "/", description = "localhost") })
public class BaseApplication extends Application {
    private static Logger logger = Logger.getLogger(BaseApplication.class.getName());

    Map<Long, NobelPrize> data;

    // generate some example data....
    @PostConstruct
    public void init() {

        logger.info("******************************");
        logger.info("*...generate sample data....");
        logger.info("*******************************");
        data = new HashMap<Long, NobelPrize>();

        data.put(1l, new NobelPrize("Klaus Hasselmann", 2021, "Physics", 1l));
        data.put(2l, new NobelPrize("Syukuro Manabe", 2021, "Physics", 2l));
        data.put(3l, new NobelPrize("Giorgio Parisi", 2021, "Physics", 3l));

        data.put(4l, new NobelPrize("David Julius", 2021, "Medicine", 4l));
        data.put(5l, new NobelPrize(" Ardem Patapoutian", 2021, "Medicine", 5l));

        data.put(6l, new NobelPrize("Benjamin List", 2021, "Chemistry", 6l));
        data.put(7l, new NobelPrize("David MacMillan", 2021, "Chemistry", 7l));

        data.put(8l, new NobelPrize("Abdulrazak Gurnah", 2021, "Literature", 8l));

        data.put(9l, new NobelPrize("Maria Ressa", 2021, "Peace ", 9l));
        data.put(10l, new NobelPrize("Dmitri Muratow", 2021, "Peace ", 10l));

        data.put(11l, new NobelPrize("David Card", 2021, "Economic", 11l));
        data.put(12l, new NobelPrize("Joshua Angrist", 2021, "Economic", 12l));
        data.put(13l, new NobelPrize("Guido Imbens", 2021, "Economic", 13l));

    }

    public Map<Long, NobelPrize> getData() {
        return data;
    }

}
