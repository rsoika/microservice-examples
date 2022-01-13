package com.ralph.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "mail")
public class MailConfigProperties {

	private String host="undefined";

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}
	

}
