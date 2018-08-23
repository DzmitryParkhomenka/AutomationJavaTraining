package BusinessObject;

public class Email {
	private static final String TO = "dimos-eskimos@yandex.ru";
	private static final String SUBJECT = "Learn To Automate";
	private static final String TEXT = "Getting some knowledge";
	
	public static String getTo() {
		return TO;
	}
	
	public static String getSubject() {
		return SUBJECT;
	}
	
	public static String getText() {
		return TEXT;
	}
}
