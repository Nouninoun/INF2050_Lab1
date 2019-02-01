package org.exemple.lab2;

import org.apache.commons.lang3.StringUtils;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

	int a = 1452;
	int b = 567;
	int f = add(a,b);
	System.out.println("Valeur: " + f);
        
	
	String phrase = "Cette phrase n'est pas vide.";
	if (StringUtils.isEmpty(phrase)) {
	    System.out.println("Cette phrase est vide!!!");
	} else {
	    System.out.println("Reponse attendue, pas vide.");
	}
        
	if (StringUtils.isEmpty("")) {
	    System.out.println("String vide"); 
	} else {
            System.out.println("String pas vide?");
	}

    } // fin main

    public static int add(int valeur1, int valeur2) {
        return valeur1 + valeur2;
	//return 1234;
    }
}
