package org.example;

import java.io.File;

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
        System.out.println(Object.class.getSimpleName());
        System.out.println(File.class.getSimpleName());
        System.out.println(File.class.getName());
        System.out.println(Object.class.getName());
    }
}
