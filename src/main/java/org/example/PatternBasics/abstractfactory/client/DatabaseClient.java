package org.example.PatternBasics.abstractfactory.client;

import org.example.PatternBasics.abstractfactory.factory.DatabaseFactory;
import org.example.PatternBasics.abstractfactory.product.command.Command;
import org.example.PatternBasics.abstractfactory.product.connection.Connection;
import org.example.PatternBasics.abstractfactory.product.transaction.Transaction;

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
