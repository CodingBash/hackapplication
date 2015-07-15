package com.github.hackapplication.main;

import java.awt.EventQueue;

import com.github.hackapplication.manager.FrameManager;
import com.github.hackapplication.swing.MainWindowFrame;

public class main {
	@SuppressWarnings("all")
	public static void main(String[] args){
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
