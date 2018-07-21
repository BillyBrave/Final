package pregunta2;

public class Client {

    public static void main(String[] args) {
        int[] numbers = { 1, 5, 7, 78, 9, 2, 24, 38, 78, 91, 96, 4, 6, 17, 101, 24, 38, 47, 37, 148, 2, 589};
        boolean hasDuplicates;
       
        ComplexityTypeStrategy complexityType1 = new LinealComplexityTypeStrategy();
         hasDuplicates = complexityType1.hasDuplicateValues(numbers);
       System.out.println(ComplexityType.Lineal.toString() + " - hasDuplicates: " + hasDuplicates);
       
       ComplexityTypeStrategy complexityType2 = new CuadraticComplexityTypeStrategy();
       hasDuplicates = complexityType2.hasDuplicateValues(numbers);
     System.out.println(ComplexityType.Cuadratic.toString() + " - hasDuplicates: " + hasDuplicates);
     
     ComplexityTypeStrategy complexityType3 = new ExponencialComplexityTypeStrategy();
     hasDuplicates = complexityType3.hasDuplicateValues(numbers);
   System.out.println(ComplexityType.Exponential.toString() + " - hasDuplicates: " + hasDuplicates);
                
        
       
    }
    
   
}
