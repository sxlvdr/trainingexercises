
package com.mycompany.exampleproj;

/**
 *
 * @author a838595
 * This is a simple example of abstraction, polymorphism and inheritance with Java 
 */

//We create the abstract class that will be inherited 
abstract class Countries {
    public abstract void countryLanguage();
}

//Using Inheritance we can extend the countries class using 'extends'
class Mexico extends Countries{
    @Override
    public void countryLanguage(){
        System.out.println("Mexico's Language is: Spanish");
    }
} 
/**By using different implementations of the same method 
 * from different classes we are using Polymorphism
**/
class USA extends Countries{
    @Override
    public void countryLanguage(){
        System.out.println("USA's Language is: English");
    }
}

class Brazil extends Countries{
    @Override
    public void countryLanguage(){
        System.out.println("Brazil's Language is: Portuguese");
    }
}
public class abstraction {
    public static void main(String[] args) {
        Mexico myMexico = new Mexico();
        myMexico.countryLanguage();
    }
}
