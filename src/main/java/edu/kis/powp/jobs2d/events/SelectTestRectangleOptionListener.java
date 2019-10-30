package edu.kis.powp.jobs2d.events;

import edu.kis.powp.jobs2d.command.CommandFactory;
import edu.kis.powp.jobs2d.drivers.DriverManager;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectTestRectangleOptionListener implements ActionListener {
    private DriverManager driverManager;

    public SelectTestRectangleOptionListener (DriverManager driverManager) {
        this.driverManager = driverManager;
    }

    @Override
    public void  actionPerformed (ActionEvent e) {
        CommandFactory.drawRectangle(-60, -60, 70, 110).execute(driverManager.getCurrentDriver());
    }
}
