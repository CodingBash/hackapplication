package com.github.hackapplication.analysis;

import com.github.hackapplication.model.ParsedEmail;
import com.github.hackapplication.model.SPI;

import de.tudarmstadt.ukp.jwktl.api.IWiktionaryEdition;

public class Analyzer {

	private ParsedEmail email;
	private SPI spi;
	IWiktionaryEdition wkt;
	
		public void initJwktlConnection(){
		//if(wkt == null){
			//wkt = JWKTL.openEdition();
		//}
	}
	
	public void closeJwktlConnection(){
		if(wkt != null)
			wkt.close();
	}
}
