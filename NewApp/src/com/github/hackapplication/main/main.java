package com.github.hackapplication.main;

import java.awt.EventQueue;

import com.github.hackapplication.manager.FrameManager;
import com.github.hackapplication.swing.MainWindowFrame;

public class main {
	@SuppressWarnings("all")
	public static void main(String[] args){
		String mockup = "testemail@statefarm.com";
		int domainStart = mockup.lastIndexOf('@');
		String domain = mockup.substring(domainStart);
		System.out.println(domain);
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindowFrame frame = new MainWindowFrame();
					FrameManager.addFrame("main", frame);
					FrameManager.setInitialFrame("main");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
