package com.it.springboot;

import jdk.nashorn.internal.runtime.PropertyListeners;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.it.springboot.dao")
@EntityScan(basePackages = "com.it.springboot.pojo")
public class SpringBootApplicationStart {
    public static void main(String[] args)throws Exception {
   SpringApplication.run(SpringBootApplicationStart.class);
    }
}
