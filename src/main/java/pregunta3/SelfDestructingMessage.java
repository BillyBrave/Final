package pregunta3;

public class SelfDestructingMessage implements Message {

	@Override
	public String transform(String message) {
		return	 "☠" + message + "☠";
	}

}
