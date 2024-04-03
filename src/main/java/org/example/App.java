package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println(App.class.getDeclaredClasses());
        System.out.println( "Hello World!" );
        System.out.println(App.class.getDeclaringClass());
    }
}
