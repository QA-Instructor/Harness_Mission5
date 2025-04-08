package com.qa;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println(sayHello());
        System.out.println(sayHelloToSomeone("Alice"));
        System.out.println(sayHelloToSomeone("Bob"));
        System.out.println(sayHelloToSomeone("Charlie"));
        System.out.println(sayHelloToSomeone("Daniella"));
        System.out.println(sayHelloToSomeone("Edwin"));
        System.out.println(sayHelloToSomeone("Fowsiya"));
        System.out.println(sayHelloToSomeone("Guiseppe"));
        System.out.println(sayHelloToSomeone("Hannah"));
        System.out.println(sayHelloToSomeone("Iona"));
        System.out.println(sayHelloToSomeone("Jo"));
        System.out.println(sayHelloToSomeone("Kendrick"));
        System.out.println(sayHelloToSomeone("Lauren"));
        System.out.println(sayHelloToSomeone("Victoria"));
        System.out.println(sayHelloToSomeone("William"));
        System.out.println(sayHelloToSomeone("Xavier"));
        System.out.println(sayHelloToSomeone("Yasmin"));
        System.out.println(sayHelloToSomeone("Zena"));
        System.out.println(sayGoodbye());
    }

    public static String sayHello(){
        return "Hello World!";
    }

    public static String sayGoodbye(){
        return "Goodbye World!";
    }

    public static String sayHelloToSomeone(String name){
        return "Hello " + name ;
    }
}
