package com.ralph;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import org.eclipse.microprofile.openapi.annotations.OpenAPIDefinition;
import org.eclipse.microprofile.openapi.annotations.info.Contact;
import org.eclipse.microprofile.openapi.annotations.info.Info;
import org.eclipse.microprofile.openapi.annotations.servers.Server;

/**
 * The Application class configures a JAX-RS endpoint.
 *
 * @author ralph.soika@imixs.com
 * 
 */
@ApplicationPath("api")
@OpenAPIDefinition(info = @Info(
        title = "Example application", 
        version = "1.0.0", 
        contact = @Contact(
                name = "Ralph Soika", 
                email = "ralph.soika@imixs.com",
                url = "https://www.imixs.org")
        ),
        servers = {
            @Server(url = "/",description = "localhost")
        }
)
public class BaseApplication extends Application {

}
