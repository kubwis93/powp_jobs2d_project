package edu.kis.powp.jobs2d.command;

import java.util.ArrayList;
import java.util.List;

public class CommandFactory {
    public static ComplexCommand drawRectangle(int x, int y, int width, int height) {
        List<DriverCommandInterface> driverCommands = new ArrayList<>();

        driverCommands.add(new CommandSetPosition(x, y));
        driverCommands.add(new CommandOperateTo(x + width, y));
        driverCommands.add(new CommandOperateTo(x + width, y + height));
        driverCommands.add(new CommandOperateTo(x, y + height));
        driverCommands.add(new CommandOperateTo(x, y));

        return new ComplexCommand(driverCommands);
    }

    public static ComplexCommand drawTriangle (int x0, int y0, int x1, int y1, int x2, int y2) {
        List<DriverCommandInterface> driverCommands = new ArrayList<>();

        driverCommands.add(new CommandSetPosition(x0 ,y0));
        driverCommands.add(new CommandOperateTo(x1, y1));
        driverCommands.add(new CommandOperateTo(x2, y2));
        driverCommands.add(new CommandOperateTo(x0, y0));

        return new ComplexCommand(driverCommands);
    }
}
