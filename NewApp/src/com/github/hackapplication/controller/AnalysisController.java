package com.github.hackapplication.controller;

import com.github.hackapplication.model.ParsedEmail;

import com.github.hackapplication.model.SPI;

import de.tudarmstadt.ukp.jwktl.api.IWiktionaryEdition;
public class AnalysisController extends AbstractController {

	private ParsedEmail email;
	private SPI spi;
	IWiktionaryEdition wkt;

	public void initJwktlConnection() {
		// if(wkt == null){
		// wkt = JWKTL.openEdition();
		// }
	}

	public void closeJwktlConnection() {
		if (wkt != null)
			wkt.close();
	}

	public void setEmail(ParsedEmail email) {
		this.email = email;
	}

	public void setSpi(SPI spi) {
		this.spi = spi;
	}

	public void setWkt(IWiktionaryEdition wkt) {
		this.wkt = wkt;
	}

}
