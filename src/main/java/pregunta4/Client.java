package pregunta4;

public class Client {

    public static void main(String[] args) {
    	Sandwich smallBreadSandwich = new SmallBreadSandwich();
           
        smallBreadSandwich = new Bacon(smallBreadSandwich);
        smallBreadSandwich = new Beef(smallBreadSandwich);
        smallBreadSandwich = new Turkey(smallBreadSandwich);
           
        System.out.println(smallBreadSandwich.make());
        
    
        
        Sandwich largeBreadSandwich = new LargeBreadSandwich();
                
        largeBreadSandwich = new Egg(largeBreadSandwich);
        largeBreadSandwich = new Chicken(largeBreadSandwich);
        
        System.out.println(largeBreadSandwich.make());
    }
}
