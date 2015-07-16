package com.github.hackapplication.model;


/**
 * <h1> Parsed Email model </h1>
 * 
 * An instance of this must be populated from the model factory.
 * 
 * @author bbecerr
 * 
 * @see com.github.hackapplication.factory.EmailFactory
 *
 */
public class ParsedEmail {
	/*Deleted unused fields after project */
	private String msgTopic;
	private String msgBcc;
	private String msgCc;
	private String msgFrom;
	private String msgTo;
	private String msgHeader;
	private String msgHtmlBody;
	private String msgMessageClass;
	private String msgDate;
	private String msgRecipientEmailAddress;
	private String[] msgRecipientEmailAddressList;
	private String msgRecipientName;
	private String msgSubject;
	private String msgTextBody;
	public String getMsgTopic() {
		return msgTopic;
	}
	public void setMsgTopic(String msgTopic) {
		this.msgTopic = msgTopic;
	}
	public String getMsgBcc() {
		return msgBcc;
	}
	public void setMsgBcc(String msgBcc) {
		this.msgBcc = msgBcc;
	}
	public String getMsgCc() {
		return msgCc;
	}
	public void setMsgCc(String msgCc) {
		this.msgCc = msgCc;
	}
	public String getMsgFrom() {
		return msgFrom;
	}
	public void setMsgFrom(String msgFrom) {
		this.msgFrom = msgFrom;
	}
	public String getMsgTo() {
		return msgTo;
	}
	public void setMsgTo(String msgTo) {
		this.msgTo = msgTo;
	}
	public String getMsgHeader() {
		return msgHeader;
	}
	public void setMsgHeader(String msgHeader) {
		this.msgHeader = msgHeader;
	}
	public String getMsgHtmlBody() {
		return msgHtmlBody;
	}
	public void setMsgHtmlBody(String msgHtmlBody) {
		this.msgHtmlBody = msgHtmlBody;
	}
	public String getMsgMessageClass() {
		return msgMessageClass;
	}
	public void setMsgMessageClass(String msgMessageClass) {
		this.msgMessageClass = msgMessageClass;
	}
	public String getMsgDate() {
		return msgDate;
	}
	public void setMsgDate(String msgDate) {
		this.msgDate = msgDate;
	}
	public String getMsgRecipientEmailAddress() {
		return msgRecipientEmailAddress;
	}
	public void setMsgRecipientEmailAddress(String msgRecipientEmailAddress) {
		this.msgRecipientEmailAddress = msgRecipientEmailAddress;
	}
	public String[] getMsgRecipientEmailAddressList() {
		return msgRecipientEmailAddressList;
	}
	public void setMsgRecipientEmailAddressList(String[] msgRecipientEmailAddressList) {
		this.msgRecipientEmailAddressList = msgRecipientEmailAddressList;
	}
	public String getMsgRecipientName() {
		return msgRecipientName;
	}
	public void setMsgRecipientName(String msgRecipientName) {
		this.msgRecipientName = msgRecipientName;
	}
	public String getMsgSubject() {
		return msgSubject;
	}
	public void setMsgSubject(String msgSubject) {
		this.msgSubject = msgSubject;
	}
	public String getMsgTextBody() {
		return msgTextBody;
	}
	public void setMsgTextBody(String msgTextBody) {
		this.msgTextBody = msgTextBody;
	}
	
}
