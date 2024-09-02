package edu.eci.cvds;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        if (args.length >1){
            String nombre = args[0];
            String ape = args[1];

            System.out.println( "Hello World! " + nombre + " " +ape);
        } else if (args.length==1){
            String nombre = args[0];
            System.out.println( "Hello World! " + nombre);
        }
        else {
            System.out.println( "Hello World! ");
        }

    }
}
