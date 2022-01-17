package com.ralph;

import org.eclipse.microprofile.openapi.annotations.OpenAPIDefinition;
import org.eclipse.microprofile.openapi.annotations.info.Contact;
import org.eclipse.microprofile.openapi.annotations.info.Info;
import org.eclipse.microprofile.openapi.annotations.servers.Server;

import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.core.Application;

/**
 * The Application class configures a JAX-RS endpoint.
 *
 * @author ralph.soika@imixs.com
 * 
 */
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
@ApplicationPath("api")
public class BaseApplication extends Application {

}
