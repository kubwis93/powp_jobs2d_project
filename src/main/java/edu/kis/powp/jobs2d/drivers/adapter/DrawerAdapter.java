package edu.kis.powp.jobs2d.drivers.adapter;

import edu.kis.legacy.drawer.panel.DrawPanelController;
import edu.kis.legacy.drawer.shape.ILine;
import edu.kis.legacy.drawer.shape.LineFactory;
import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.features.DrawerFeature;

/**
 * driver adapter to drawer with several bugs.
 */
public class DrawerAdapter implements Job2dDriver {
	private final DrawPanelController drawPanelController;
	private int startX = 0, startY = 0;
	private ILine line;

	public DrawerAdapter(DrawPanelController drawPanelController, ILine line) {
		this.drawPanelController = drawPanelController;
		this.line = line;
	}

	@Override
	public void setPosition(int x, int y) {
		this.startX = x;
		this.startY = y;
	}

	@Override
	public void operateTo(int x, int y) {
		//ILine line = LineFactory.getBasicLine();
		line.setStartCoordinates(this.startX, this.startY);
		line.setEndCoordinates(x, y);
		DrawerFeature.getDrawerController().drawLine(line);
		drawPanelController.drawLine(line);
		this.setPosition(x, y);

	}

	@Override
	public String toString() {
		return "Attempt";
	}
}
