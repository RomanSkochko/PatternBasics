package org.example.patternbasics.creational.abstractfactory.client;

import org.example.patternbasics.creational.abstractfactory.factory.DatabaseFactory;
import org.example.patternbasics.creational.abstractfactory.product.command.Command;
import org.example.patternbasics.creational.abstractfactory.product.connection.Connection;
import org.example.patternbasics.creational.abstractfactory.product.transaction.Transaction;

/**
 * Client code example
 */
public class DatabaseClient {
    private final DatabaseFactory factory;
    private final Connection connection;
    private final Command command;
    private final Transaction transaction;

    public DatabaseClient(DatabaseFactory factory) {
        this.factory = factory;
        this.connection = factory.createConnection();
        this.command = factory.createCommand();
        this.transaction = factory.createTransaction();
    }

    public void executeQuery(String sql) {
        connection.connect();
        transaction.begin();
        try {
            command.execute(sql);
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
            throw e;
        } finally {
            connection.disconnect();
        }
    }
}
