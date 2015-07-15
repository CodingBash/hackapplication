package com.github.hackapplication.reports;

import com.github.hackapplication.exception.FieldsNotInstantiatedException;
import com.github.hackapplication.model.ParsedEmail;

import de.tudarmstadt.ukp.jwktl.api.IWiktionaryEdition;

public class GrammarReport implements Report {

	private ParsedEmail email;
	private IWiktionaryEdition wkt;
	private String emailTextBody;

	public void setEmail(ParsedEmail email) {
		this.email = email;
	}

	public void setWkt(IWiktionaryEdition wkt) {
		this.wkt = wkt;
	}

	public void setEmailTextBody() {
		if (emailTextBody == null) {
			if (email != null) {
				emailTextBody = email.getMsgTextBody();
			}
		}
	}

	public void run() throws FieldsNotInstantiatedException {
		if (email == null || wkt == null || emailTextBody == null) {
			throw new FieldsNotInstantiatedException();
		}
		

	}

}
