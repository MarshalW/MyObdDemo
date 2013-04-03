package com.example;

import eu.lighthouselabs.obd.commands.ObdCommand;

/**
 * Created with IntelliJ IDEA.
 * User: marshal
 * Date: 13-4-2
 * Time: 下午6:47
 * To change this template use File | Settings | File Templates.
 */
public class MyCommand extends ObdCommand {

    private String command;

    public MyCommand(String command) {
        super(command);
        this.command=command;
    }

    @Override
    public String getFormattedResult() {
        return "Custom command result: " + this.getResult();
    }

    @Override
    public String getName() {
        return this.command;
    }
}
