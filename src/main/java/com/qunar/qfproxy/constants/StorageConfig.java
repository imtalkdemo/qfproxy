package com.qunar.qfproxy.constants;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;


@PropertySource(value = ("classpath:storage.properties"))
@Component
@ConfigurationProperties(prefix = "store")
public class StorageConfig {
    private static final Logger LOGGER = LoggerFactory.getLogger(StorageConfig.class);

    private String storageFolder;
    private String storageFolderEmo;

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

    @PostConstruct
    private void initStoreFolder() {
        try {
            File f = new File(this.storageFolder);
            f.setWritable(true, false);
            f.mkdirs();
            File fEmo = new File(this.storageFolderEmo);
            fEmo.setWritable(true, false);
            fEmo.mkdirs();
            LOGGER.info("upload文件件初始化创建成功");
        } catch (Exception e) {
            LOGGER.error("upload文件件初始化创建失败！异常原因:{}", e);
        }
    }

}
