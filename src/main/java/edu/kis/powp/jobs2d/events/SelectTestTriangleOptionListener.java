package edu.kis.powp.jobs2d.events;

import edu.kis.powp.jobs2d.command.CommandFactory;
import edu.kis.powp.jobs2d.drivers.DriverManager;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectTestTriangleOptionListener implements ActionListener {
    private DriverManager driverManager;

    public SelectTestTriangleOptionListener (DriverManager driverManager) {
        this.driverManager = driverManager;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        CommandFactory.drawTriangle(-150, 50, 20, 60, 70, -90).execute(driverManager.getCurrentDriver());
    }
}
