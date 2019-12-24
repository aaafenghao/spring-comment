package com.fh.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;

@ComponentScan("com.fh")
@Configuration
@EnableAsync
public class AutoConfig {
}
