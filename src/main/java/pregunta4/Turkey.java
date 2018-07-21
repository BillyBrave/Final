package pregunta4;


public class Turkey extends SandwichDecorator {
	Sandwich sandwich;
	
	public Turkey(Sandwich sandwich) {
        this.sandwich = sandwich;
    }
	
	@Override
    public String make() {
        return sandwich.make() + ", Turkey";
    }
}

