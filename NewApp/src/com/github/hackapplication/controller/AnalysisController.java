package com.github.hackapplication.controller;

import com.github.hackapplication.exception.FieldsNotInstantiatedException;
import com.github.hackapplication.model.ParsedEmail;
import com.github.hackapplication.model.SPI;
public class AnalysisController extends AbstractController {

	private ParsedEmail email;
	private SPI spi;
	

	public void setEmail(ParsedEmail email) {
		this.email = email;
	}

	public void setSpi(SPI spi) {
		this.spi = spi;
	}
	
	public void initializeAnalysis() throws FieldsNotInstantiatedException{
		if(email == null || spi == null){
			throw new FieldsNotInstantiatedException();
		}
		
		analyzeFrom();
		analyzeGrammer();
		analyzeKeywords();
	}
	 
	private void analyzeKeywords() {
		// TODO Auto-generated method stub
		
	}

	private void analyzeGrammer() {
		// TODO Auto-generated method stub
		
	}

	private void analyzeFrom() {
		String mockup = "testemail@statefarm.com";
		int domainStart = mockup.lastIndexOf('@') + 1;
		String domain = mockup.substring(domainStart);
		
	}

}
