package org.exemple.lab2;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import junit.framework.Assert; // ajout pour la solution

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    
     // @return the suite of tests being tested
    
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }
    
    /*
    public static Test suite() {
	suite.addTest(new AppTest("verifyAdd"));
	return suite; 
    } 
    */ 

    /*
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }


    // SOLUTION	
    private App nomVariable;
    public void testCalcule() { // est-ce que la fonction doit obligatoirement commencer par test? oui, mais la suite n'a pas a matcher le nom de la fonction a tester
        int a = 2, b = 3;
	int valeurAttendue = a+b;
	assertTrue("La fonction add créée par Romy n'effectue pas une addition.", valeurAttendue == nomVariable.add(a,b));
    }



    /*
    @Test
    public void verifyAdd() {
	    //vérifier que la fonction Add effectue bien une addition
	    //on doit effectuer un test via un assertTrue
	    //il faut que ça soit accompagné d'un commentaire explicite
	    //sur le type d'erreur potentiellement trouvé... via try catch
	    //mettre un booléen dans le assertTrue
	    //essayer de mettre un message dans le assertTrue
	    //verifier si static ou pas : je pense non,
	    //   car test effectué sur une instance de la classe AppTest
	    //paramètres requis: non, on effectue un processus, et dépend du
	    //   code écrit dans le test, à essayer avec paramètres
	    //type de retour : void, selon exemple sur internet, 
	    //   on effectue un processus
	try {
	    int result = App.add(2,3);
	    assertTrue(result == 5);
	} catch (Exception e) {
	    System.out.println(e.getMessage());
	    System.out.println("Le test n'a pas effectué une addition.");
	}
	int result = App.add(2,3);
        assertTrue(result == 5);
    }*/

    /*
    public void verifyAdd() {
        int result = App.add(2,3);
	assertTrue(result == 5);
    }

  // TestCase test = new AppTest("verifyAdd");
  // test.run();
   //
    TestCase test = new AppTest("addition") {
        public void runTest() {
            verifyAdd();
        }
    };
    test.run();
*/

}
