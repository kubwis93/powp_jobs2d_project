package edu.kis.powp.jobs2d.command;

import edu.kis.powp.jobs2d.Job2dDriver;

public class CommandSetPosition  implements DriverCommandInterface {

    private int x;
    private int y;

    public CommandSetPosition (int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public void execute(Job2dDriver job2dDriver){
        job2dDriver.setPosition(x, y);
    }
}
