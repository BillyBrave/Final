package pregunta3;

public class SecureMessage implements Message {

	 private String encrypt(String message) {
	        message = message.substring(message.length() - 1) + message.substring(0, message.length() - 1);
	        return message;
	    }
	 @Override
	    public String transform(String message) {
	        return encrypt(message);
	       
	    }
}
