package edu.kis.powp.jobs2d.command;

import edu.kis.powp.jobs2d.Job2dDriver;

public class CommandOperateTo implements DriverCommandInterface {

    private int x;
    private int y;

    public CommandOperateTo(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void execute(Job2dDriver job2dDriver){
        job2dDriver.operateTo(x, y);
    }
}
