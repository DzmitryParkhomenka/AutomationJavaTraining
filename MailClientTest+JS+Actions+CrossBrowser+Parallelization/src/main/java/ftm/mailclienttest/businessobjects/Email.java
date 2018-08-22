package ftm.mailclienttest.businessobjects;

public class Email {
	private static final String TO = "dimos-eskimos@yandex.ru";
	private static final String SUBJECT = "Learn To Automate";
	private static final String TEXT = "Getting some knowledge";
	
	public String getTo() {
		return TO;
	}
	
	public String getSubject() {
		return SUBJECT;
	}
	
	public String getText() {
		return TEXT;
	}
}
