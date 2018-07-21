package pregunta4;

public class Egg extends SandwichDecorator {
	Sandwich sandwich;
	
	public Egg(Sandwich sandwich) {
        this.sandwich = sandwich;
    }
	
	@Override
    public String make() {
        return sandwich.make() + ", Egg";
    }
}

