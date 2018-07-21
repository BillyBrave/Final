package pregunta4;

public class Beef extends SandwichDecorator {
	Sandwich sandwich;
	
	public Beef(Sandwich sandwich) {
        this.sandwich = sandwich;
    }
	
	@Override
    public String make() {
        return sandwich.make() + ", Beef";
    }
}

