package com.slc;


import com.slc.service.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
public class SpringBootWebApplication extends SpringBootServletInitializer {
    private static final Logger log = LoggerFactory.getLogger(SpringBootWebApplication.class);

    @Autowired
    @Qualifier("service")
    private Service service;

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {

        return application.sources(SpringBootWebApplication.class);
    }

}
