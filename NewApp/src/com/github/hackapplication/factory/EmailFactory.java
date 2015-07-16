package com.github.hackapplication.factory;

import java.io.FileNotFoundException;

import com.github.hackapplication.constants.FileConstants;
import com.github.hackapplication.model.ParsedEmail;

public class EmailFactory {
	public ParsedEmail email = null;

	public EmailFactory(String filename) throws FileNotFoundException {
		if (email == null) {
			email = new ParsedEmail();
		}

		if (filename == FileConstants.TEST_FILE_SUCCESS) {
			composeModelSuccess();
		}

		if (filename == FileConstants.TEST_FILE_FAIL) {
			composeModelFail();
		} else {
			throw new FileNotFoundException();
		}

	}

	private void composeModelSuccess() {
		email.setMsgFrom("aaron.wiessing.tbq0@statefarm.com");
		email.setMsgSubject("Timecard");
		email.setMsgTextBody("Please remember to fill out your timecards no later than 2pm today (Jul 16).");

	}

	private void composeModelFail() {
		email.setMsgFrom("edrust@notstatefarm.com");
		email.setMsgSubject("Urgent Notice");
		email.setMsgTextBody("State Farm is currently undergoing a huge overhall of the timecard system for hourly employees."
				+ "Please go to SFtimecard.net and register in the new sys."
				+ "DO NOT REPLY TO THIS EMAIL.");

	}

	public void initParsedEmail() {
		if (email != null)
			email = new ParsedEmail();
	}

}
