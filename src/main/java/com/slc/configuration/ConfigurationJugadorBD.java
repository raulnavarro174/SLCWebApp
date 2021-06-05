package com.slc.configuration;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;

@Configuration
@EnableJpaRepositories(basePackages = "com.slc.model.bd", entityManagerFactoryRef = "jugadorEntityManagerFactory", transactionManagerRef = "jugadorTransactionManager")
public class ConfigurationJugadorBD {
    @Primary
    @Bean(name = "jugadorDataSource")
    @ConfigurationProperties(prefix = "spring.datasource")
    public DataSource customerDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Primary
    @Bean(name = "jugadorEntityManagerFactory")
    public LocalContainerEntityManagerFactoryBean entityManagerFactory(EntityManagerFactoryBuilder builder,
            @Qualifier("jugadorDataSource") DataSource dataSource) {
        return builder.dataSource(dataSource).packages("com.slc.model.bd")
                .build();
    }

    @Primary
    @Bean(name = "jugadorTransactionManager")
    public PlatformTransactionManager customerTransactionManager(
            @Qualifier("jugadorEntityManagerFactory") EntityManagerFactory customerEntityManagerFactory) {
        return new JpaTransactionManager(customerEntityManagerFactory);
    }
}