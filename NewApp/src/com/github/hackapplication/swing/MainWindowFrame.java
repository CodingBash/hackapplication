package com.github.hackapplication.swing;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Logger;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import com.github.hackapplication.controller.AbstractController;

public class MainWindowFrame extends JFrame {

	private WindowHandler handler = null;
	private Logger logger = null;
	BorderLayout layout = new BorderLayout();

	@SuppressWarnings("static-access")
	public MainWindowFrame() {
		initialize();
		/* Sets the initial position of the window */
		setBounds(100, 100, 450, 300);
		/* Sets the size of the window */
		setSize(new Dimension(1280, 720));
		/* Set close operation */
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		/* Obtain layout-ing tool */
		
		/* Create a menu bar at the top */
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		/* Create a menu and add the menu bar */
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);

		/* Create a menu item and add the menu */
		JMenuItem mntmNew = new JMenuItem("New Log");
		mntmNew.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				logger.info("Clicked Log");
			}
		});
		mnFile.add(mntmNew);

		/* Create a menu item and add the menu */
		JMenuItem mntmExit = new JMenuItem("Exit");
		mntmExit.addActionListener(new ActionListener() {
			/* menu item action */
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(ABORT);

			}
		});
		mnFile.add(mntmExit);

		/* Create a menu item and add the menu */
		JMenuItem mntmOther = new JMenuItem("Other");
		mnFile.add(mntmOther);

		JMenu mnAbout = new JMenu("About");
		mnAbout.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// Change to new window to show about page.
			}
		});
		
		/*Create a simple button*/
		JButton button = new JButton("Import");
		button.setVerticalTextPosition(AbstractButton.CENTER);
		button.setHorizontalTextPosition(AbstractButton.LEADING);
		button.setMnemonic(0);
		button.setActionCommand(null);
		button.setSize(new Dimension(100,100));
		button.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				logger.info("Button clicked");
			}
			
		});
		add(button, layout.EAST);
		
	}

	private void initialize() {
		/* Initialize Logger */
		handler = WindowHandler.getInstance();
		logger = Logger.getLogger("logging.handler");
		logger.addHandler(handler);
		logger.info("Hello World");
		add(handler.getWindowPanel(), layout.SOUTH);
		
	}

	/**
	 * Links a controller with this frame (view).
	 * 
	 * @param controller
	 */
	public void setController(AbstractController controller) {

	}
}
