package com.tsmurer.shopjoin.utils;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Data
@Configuration
@EnableConfigurationProperties
@ConfigurationProperties
public class YAMLConfig {
    private String name;
    private String environment;
    private boolean enabled;
    private List<String> servers = new ArrayList<>();
}
