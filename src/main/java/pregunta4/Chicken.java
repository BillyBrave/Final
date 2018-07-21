package pregunta4;

public class Chicken extends SandwichDecorator {
	Sandwich sandwich;
	
	public Chicken(Sandwich sandwich) {
        this.sandwich = sandwich;
    }
	
	@Override
    public String make() {
        return sandwich.make() + ", Chicken";
    }
}

