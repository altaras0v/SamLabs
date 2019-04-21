package com.Tarasov.CurrencyConverter.ClientCommand;

/**
 * Closes the client
 */
public class ExitCommand implements AbstractCommand {
    @Override
    public void execute() {
        System.exit(0);
    }
}