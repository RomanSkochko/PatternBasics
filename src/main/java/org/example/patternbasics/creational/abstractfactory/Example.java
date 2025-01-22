package org.example.patternbasics.creational.abstractfactory;

import org.example.patternbasics.creational.abstractfactory.client.DatabaseClient;
import org.example.patternbasics.creational.abstractfactory.config.DatabaseConfig;
import org.example.patternbasics.creational.abstractfactory.factory.DatabaseFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Demonstrates Abstract Factory usage with Spring:
 * Shows how different database implementations (PostgreSQL/MySQL)
 * can be dynamically created and used through the same interface,
 * while the factory is provided by Spring's dependency injection
 * based on the configured database type.
 */
public class Example {
    public void example() {
        // Initialize Spring application context
        try (var context = new AnnotationConfigApplicationContext(DatabaseConfig.class)) {
            // Retrieve the factory bean configured in DatabaseConfig
            DatabaseFactory factory = context.getBean(DatabaseFactory.class);

            // Create a database client using the factory
            // Automatically handles the creation of database-specific implementations
            // (e.g., Connection, Command, Transaction) for the configured database type
            DatabaseClient client = new DatabaseClient(factory);

            // Execute a query using the client
            client.executeQuery("SELECT id, username, email FROM users");
        }
    }
}
