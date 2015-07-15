package com.github.hackapplication.swing;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import com.github.hackapplication.constants.OtherConstants;
import com.github.hackapplication.constants.SwingConstants;

public class LogWindowPanel extends JPanel {

	private static final long serialVersionUID = -7576807156383836831L;
	private JTextArea textArea = null;
	
	public LogWindowPanel(){
		textArea = new JTextArea(SwingConstants.LOG_ROWS, SwingConstants.LOG_COLUMNS);
		textArea.setEditable(false);
		setSize(SwingConstants.LOG_WIDTH, SwingConstants.LOG_HEIGHT);
		add(new JScrollPane(textArea));
		setVisible(true); //Do this in panel manager
	}
	
	public void showInfo(String data) {
		textArea.append(data + OtherConstants.NEWLINE);
		this.validate();
	}

}

