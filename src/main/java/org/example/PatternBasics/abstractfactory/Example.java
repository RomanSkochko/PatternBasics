package org.example.PatternBasics.abstractfactory;

import org.example.PatternBasics.abstractfactory.client.DatabaseClient;
import org.example.PatternBasics.abstractfactory.factory.DatabaseFactory;
import org.example.PatternBasics.abstractfactory.factory.MySQLFactory;
import org.example.PatternBasics.abstractfactory.factory.PostgresFactory;

/**
 * Demonstrates Abstract Factory usage:
 * Shows how different database implementations (PostgreSQL/MySQL)
 * can be created and used through the same interface,
 * while concrete factories handle specific implementation details.
 */
public class Example {
    public void example() {
        // Create PostgreSQL factory and client
        // All PostgreSQL-specific implementations (Connection, Command, Transaction)
        // will be created automatically through the factory
        DatabaseFactory postgresFactory = new PostgresFactory();
        DatabaseClient postgresClient = new DatabaseClient(postgresFactory);
        postgresClient.executeQuery("SELECT id, username, email FROM users");

        // Create MySQL factory and client
        // All MySQL-specific implementations (Connection, Command, Transaction)
        // will be created automatically through the factory
        DatabaseFactory mysqlFactory = new MySQLFactory();
        DatabaseClient mysqlClient = new DatabaseClient(mysqlFactory);
        mysqlClient.executeQuery("SELECT id, username, email FROM users");
    }
}
