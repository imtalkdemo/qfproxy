package com.qunar.qfproxy.constants;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@PropertySource(value = ("classpath:qfproxy.properties"))
@Configuration
@ConfigurationProperties(prefix = "qfproxy")
public class Config {
    private String hostPort;

    public String getHostPort() {
        return hostPort;
    }

    public void setHostPort(String hostPort) {
        this.hostPort = hostPort;
    }
}
