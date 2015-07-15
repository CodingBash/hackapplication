package com.github.hackapplication.manager;

import java.util.HashMap;

import javax.swing.JFrame;

import com.github.hackapplication.exception.FrameVisibleException;

/**
 * <h1>Manages all frames in program.</h1>
 * <p>
 * Contains a map of frames.
 * </p>
 * <p>
 * Adds and deletes frames.
 * </p>
 * <p>
 * Transitions/switches between frames.
 * </p>
 * 
 * @author bbecerr
 * 
 * @see javax.swing.JFrame
 *
 */
public class FrameManager {
	/**
	 * Map of contained frames. Access but map.get("key")
	 * 
	 * @see java.util.HashMap
	 */
	static HashMap<String, JFrame> frameList = new HashMap<String, JFrame>();

	/**
	 * Switches from current frame to another frame.
	 * 
	 * @param originatingFrame
	 *            frame the program is currently on.
	 * @param nextFrameKey
	 *            frame the program transitions to.
	 */
	public static void switchFrame(JFrame originatingFrame, String nextFrameKey) {
		originatingFrame.setVisible(false);
		((JFrame) frameList.get(nextFrameKey)).setVisible(true);
	}

	/**
	 * Sets initial frame of program. Frame must be added prior to this invoke.
	 * No other frames should be visible.
	 * 
	 * @param frameKey
	 *            map key of requested frame.
	 * @throws FrameVisibleException
	 */
	public static void setInitialFrame(String frameKey) throws FrameVisibleException {
		for (JFrame frame : frameList.values()) {
			if (frame.isVisible()) {
				throw new FrameVisibleException("A frame is currently visible");
			}
		}
		((JFrame) frameList.get(frameKey)).setVisible(true);
	}

	/**
	 * Adds a frame to the map to be requested at a later time.
	 * 
	 * @param frameKey
	 *            map key of frame
	 * @param frame
	 *            frame object
	 */
	public static void addFrame(String frameKey, JFrame frame) {
		frameList.put(frameKey, frame);
	}

	/**
	 * Deletes frame from request of key.
	 * 
	 * @param frameKey
	 *            map key of requested frame
	 */
	public static void deleteFrame(String frameKey) {
		frameList.remove(frameKey);
	}
}
