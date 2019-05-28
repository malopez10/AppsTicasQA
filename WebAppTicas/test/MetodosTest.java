/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mysql.jdbc.Connection;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ACER
 */
public class MetodosTest {
    
    public MetodosTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of conectar method, of class Metodos.
     */
    @Test
    public void testConectar() {
        System.out.println("conectar");
        Metodos instance = new Metodos();
        Connection expResult = null;
        Connection result = instance.conectar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of CalificarApp method, of class Metodos.
     */
    @Test
    public void testCalificarApp() {
        System.out.println("CalificarApp");
        int idUsuario = 0;
        int idApp = 1;
        int Calificacion = 5;
        Metodos instance = new Metodos();
        boolean expResult = false;
        boolean result = instance.CalificarApp(idUsuario, idApp, Calificacion);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    /**
     * Test of ListarApps method, of class Metodos.
     */
    /*@Test
    public void testListarApps() {
        System.out.println("ListarApps");
        int desarrollador = 0;
        int categoria = 0;
        Metodos instance = new Metodos();
        boolean expResult = false;
        boolean result = instance.ListarApps(desarrollador, categoria);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/
    
}
