package org.example.PatternBasics.abstractfactory.factory;

import org.example.PatternBasics.abstractfactory.product.command.Command;
import org.example.PatternBasics.abstractfactory.product.command.PostgresCommand;
import org.example.PatternBasics.abstractfactory.product.connection.Connection;
import org.example.PatternBasics.abstractfactory.product.connection.PostgresConnection;
import org.example.PatternBasics.abstractfactory.product.transaction.PostgresTransaction;
import org.example.PatternBasics.abstractfactory.product.transaction.Transaction;

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
