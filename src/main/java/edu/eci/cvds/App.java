package edu.eci.cvds;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        if (args[0] != null){
            String nombre = args[0];
            System.out.println( "Hello World! " + nombre);
        }
        else {
            System.out.println( "Hello World! ");
        }

    }
}
