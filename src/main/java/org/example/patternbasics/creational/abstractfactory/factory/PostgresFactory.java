package org.example.patternbasics.creational.abstractfactory.factory;

import org.example.patternbasics.creational.abstractfactory.product.command.Command;
import org.example.patternbasics.creational.abstractfactory.product.command.PostgresCommand;
import org.example.patternbasics.creational.abstractfactory.product.connection.Connection;
import org.example.patternbasics.creational.abstractfactory.product.connection.PostgresConnection;
import org.example.patternbasics.creational.abstractfactory.product.transaction.PostgresTransaction;
import org.example.patternbasics.creational.abstractfactory.product.transaction.Transaction;

/**
 * Concrete Factory - PostgreSQL Factory
 */
public class PostgresFactory implements DatabaseFactory {
    @Override
    public Connection createConnection() {
        return new PostgresConnection();
    }

    @Override
    public Command createCommand() {
        return new PostgresCommand();
    }

    @Override
    public Transaction createTransaction() {
        return new PostgresTransaction();
    }
}
