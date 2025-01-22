package org.example.patternbasics.creational.abstractfactory.config;

import org.example.patternbasics.creational.abstractfactory.factory.DatabaseFactory;
import org.example.patternbasics.creational.abstractfactory.factory.MySQLFactory;
import org.example.patternbasics.creational.abstractfactory.factory.PostgresFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Configuration class for database-related beans.
 */
@Configuration
public class DatabaseConfig {
    /**
     * Type of the database, injected from application properties.
     * Example: "postgresql", "mysql".
     */
    @Value("${database.type}")
    private String dbType;

    /**
     * Creates and returns a DatabaseFactory bean based on the configured database type.
     *
     * @return an instance of DatabaseFactory specific to the database type.
     * @throws IllegalStateException if the database type is not recognized.
     */
    @Bean
    public DatabaseFactory databaseFactory() {
        return switch (dbType.toLowerCase()) {
            case "postgresql" -> new PostgresFactory();
            case "mysql" -> new MySQLFactory();
            default -> throw new IllegalStateException("Unknown database type: " + dbType);
        };
    }
}
