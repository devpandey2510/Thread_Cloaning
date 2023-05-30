package com.Thread.Thread_Demo;

import java.applet.Applet;
import java.awt.Graphics;
import java.util.Date;

public class App extends Applet implements Runnable
{
	Thread t = null;
	String str = null;
	
	public void init() {
		t = new Thread(this);
		str = "";
		
		t.start();
	}
	
	public void run() {
		while(true) {
			Date d = new Date();
			str = d.toString();
			
			try {
				t.sleep(1000);
				repaint();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public void paint(Graphics g) {
		g.drawString(str, 200, 200);
	}
}
