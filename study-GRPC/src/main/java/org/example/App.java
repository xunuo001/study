package org.example;

import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Iterator<ITest> ite= ServiceLoader.load(ITest.class).iterator();
        while(ite.hasNext()){
            ITest test= ite.next();
            test.test();
        }
    }
}
