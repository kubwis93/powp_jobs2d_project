package edu.kis.powp.jobs2d.command;

import edu.kis.powp.jobs2d.Job2dDriver;

import java.util.List;

public class ComplexCommand implements DriverCommandInterface {

    private List<DriverCommandInterface> driverCommands;

    public ComplexCommand(List<DriverCommandInterface> driverCommands) {
        this.driverCommands = driverCommands;
    }

    @Override
    public void execute(Job2dDriver job2dDriver){
        for (DriverCommandInterface driverCommand : driverCommands){
            driverCommand.execute(job2dDriver);
        }
    }

}
