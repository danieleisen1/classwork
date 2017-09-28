package Chatbot;

public interface Topic {

	void talk(String response);

	boolean isTriggered(String response);
}
