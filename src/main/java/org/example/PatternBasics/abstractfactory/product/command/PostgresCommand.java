package org.example.PatternBasics.abstractfactory.product.command;

/**
 * Concrete Product - PostgreSQL Command
 */
public class PostgresCommand implements Command {
    @Override
    public void execute(String sql) {
        // PostgreSQL specific command execution
    }

    @Override
    public Object getResult() {
        // PostgreSQL specific result handling
        return null;
    }
}
