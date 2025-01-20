package org.example.PatternBasics.abstractfactory.factory;

import org.example.PatternBasics.abstractfactory.product.command.Command;
import org.example.PatternBasics.abstractfactory.product.command.MySQLCommand;
import org.example.PatternBasics.abstractfactory.product.connection.Connection;
import org.example.PatternBasics.abstractfactory.product.connection.MySQLConnection;
import org.example.PatternBasics.abstractfactory.product.transaction.MySQLTransaction;
import org.example.PatternBasics.abstractfactory.product.transaction.Transaction;

/**
 * Concrete Factory - MySQL Factory
 */
public class MySQLFactory implements DatabaseFactory {
    @Override
    public Connection createConnection() {
        return new MySQLConnection();
    }

    @Override
    public Command createCommand() {
        return new MySQLCommand();
    }

    @Override
    public Transaction createTransaction() {
        return new MySQLTransaction();
    }
}
