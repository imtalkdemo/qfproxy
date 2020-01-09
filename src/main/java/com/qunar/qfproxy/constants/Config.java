package com.qunar.qfproxy.constants;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "qfproxy")
public class Config {
    private String hostPort;
    private String storageFolder;
    private String storageFolderEmo;

    public String getHostPort() {
        return hostPort;
    }

    public void setHostPort(String hostPort) {
        this.hostPort = hostPort;
    }

    public String getStorageFolder() {
        return storageFolder;
    }

    public void setStorageFolder(String storageFolder) {
        this.storageFolder = storageFolder;
    }

    public String getStorageFolderEmo() {
        return storageFolderEmo;
    }

    public void setStorageFolderEmo(String storageFolderEmo) {
        this.storageFolderEmo = storageFolderEmo;
    }
}
