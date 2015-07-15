package com.github.hackapplication.swing;

import java.util.logging.Formatter;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.LogRecord;
import java.util.logging.SimpleFormatter;

import javax.swing.JPanel;

public class WindowHandler extends Handler {

	private LogWindowPanel window = null;
	private static WindowHandler handler = null;

	private WindowHandler() {
		LogManager manager = LogManager.getLogManager();
		String className = this.getClass().getName();
		String level = manager.getProperty(className + ".level");
		setLevel(level != null ? Level.parse(level) : Level.INFO);
		if (window == null)
			window = new LogWindowPanel();
	}

	public static synchronized WindowHandler getInstance() {
		if (handler == null)
			handler = new WindowHandler();
		return handler;
	}

	public synchronized JPanel getWindowPanel() {
		if (window == null)
			window = new LogWindowPanel();
		return window;
	}

	@Override
	public synchronized void publish(LogRecord record) {
		String message = null;
		if (!isLoggable(record))
			return;
		if(handler == null)
			handler = new WindowHandler();
		Formatter methodFormatter = getFormatter();
		if(methodFormatter == null)
			methodFormatter = new SimpleFormatter();
		message = methodFormatter.format(record);
		window.showInfo(message);
	}

	@Override
	public void flush() {
	}

	@Override
	public void close() throws SecurityException {
	}

}
