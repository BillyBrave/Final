package pregunta4;

public class Bacon extends SandwichDecorator {
	Sandwich sandwich;
	
	public Bacon(Sandwich sandwich) {
        this.sandwich = sandwich;
    }
	
	@Override
    public String make() {
        return sandwich.make() + ", Bacon";
    }
}

