package com.partyrock.gui;

import org.eclipse.swt.widgets.Display;

import com.partyrock.LightMaster;

/**
 * LightWindowManager manages *all* GUI things. Constructing the
 * LightWindowManager automatically makes a LightWindow
 * @author Matthew
 * 
 */
public class LightWindowManager {
	private LightMaster master;
	private LightWindow main;
	private Display display;

	public LightWindowManager(LightMaster master) {
		this.master = master;
		display = new Display();
		main = new LightWindow(master, this);
	}

	public void loop() {
		main.loop();
	}

	public Display getDisplay() {
		return display;
	}

	public LightMaster getMaster() {
		return master;
	}

	public LightWindow getMain() {
		return main;
	}
}
