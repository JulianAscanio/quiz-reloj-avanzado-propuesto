

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class RelojTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class RelojTest
{
    /**
     * Default constructor for test class RelojTest
     */
    public RelojTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
    
    @Test
    public void testConsstructores()
    {
        Reloj reloj = new Reloj();
        assertEquals(0, reloj.getSegundos());
        assertEquals(0, reloj.getMinutos());
        assertEquals(12, reloj.getHoras());
        
        reloj = new Reloj(5,5,5);
        assertEquals(5, reloj.getSegundos());
        assertEquals(5, reloj.getMinutos());
        assertEquals(5, reloj.getHoras());
    } 

    @Test
    public void testAvanzarHorario1()
    {
        Reloj reloj = new Reloj();
        reloj.setHoras(10);
        reloj.avanzarHorario();
        reloj.avanzarHorario();
        reloj.avanzarHorario();
        assertEquals(0, reloj.getSegundos());
        assertEquals(0, reloj.getMinutos());
        assertEquals(1, reloj.getHoras());
    }
    
    @Test
    public void testRetrocederHorario1()
    {
        Reloj reloj = new Reloj();
        reloj.setHoras(3);
        reloj.retrocederHorario();
        reloj.retrocederHorario();
        reloj.retrocederHorario();
        assertEquals(0, reloj.getSegundos());
        assertEquals(0, reloj.getMinutos());
        assertEquals(12, reloj.getHoras());
    }
    
    @Test
    public void testAvanzarHorario2()
    {
        Reloj reloj = new Reloj();
        reloj.setHoras(1);
        reloj.avanzarHorario();
        reloj.avanzarHorario();
        reloj.avanzarHorario();
        assertEquals(0, reloj.getSegundos());
        assertEquals(0, reloj.getMinutos());
        assertEquals(4, reloj.getHoras());        
    }  
    
    @Test
    public void testRetrocederHorario2()
    {
        Reloj reloj = new Reloj();
        reloj.setHoras(4);
        reloj.retrocederHorario();
        reloj.retrocederHorario();
        reloj.retrocederHorario();
        assertEquals(0, reloj.getSegundos());
        assertEquals(0, reloj.getMinutos());
        assertEquals(1, reloj.getHoras());        
    }  

    @Test
    public void testAvanzarMinutero1()
    {
        Reloj reloj = new Reloj();
        reloj.setMinutos(57);
        reloj.setHoras(1);
        reloj.avanzarMinutero();
        reloj.avanzarMinutero();
        reloj.avanzarMinutero();
        assertEquals(0, reloj.getSegundos());
        assertEquals(0, reloj.getMinutos());
        assertEquals(2, reloj.getHoras());
    }
    
    @Test
    public void testRetrocederMinutero1()
    {
        Reloj reloj = new Reloj();
        reloj.setMinutos(2);
        reloj.setHoras(2);
        reloj.retrocederMinutero();
        reloj.retrocederMinutero();
        reloj.retrocederMinutero();
        assertEquals(0, reloj.getSegundos());
        assertEquals(59, reloj.getMinutos());
        assertEquals(1, reloj.getHoras());
    }
    
    @Test
    public void testAvanzarMinutero2()
    {
        Reloj reloj = new Reloj();
        reloj.setMinutos(2);
        reloj.avanzarMinutero();
        reloj.avanzarMinutero();
        reloj.avanzarMinutero();
        assertEquals(0, reloj.getSegundos());
        assertEquals(5, reloj.getMinutos());
        assertEquals(12, reloj.getHoras());
    } 
    
    @Test
    public void testRetrocederMinutero2()
    {
        Reloj reloj = new Reloj();
        reloj.setMinutos(5);
        reloj.retrocederMinutero();
        reloj.retrocederMinutero();
        reloj.retrocederMinutero();
        assertEquals(0, reloj.getSegundos());
        assertEquals(2, reloj.getMinutos());
        assertEquals(12, reloj.getHoras());
    }

    @Test
    public void testAvanzarSegundero1() 
    {
        Reloj reloj = new Reloj();
        reloj.setSegundos(57);
        reloj.avanzarSegundero();
        reloj.avanzarSegundero();
        reloj.avanzarSegundero();
        assertEquals(0, reloj.getSegundos());
        assertEquals(1, reloj.getMinutos());
        assertEquals(12, reloj.getHoras());
    }
    
    @Test
    public void testRetrocederSegundero1() 
    {
        Reloj reloj = new Reloj();
        reloj.setSegundos(2);
        reloj.setMinutos(2);
        reloj.retrocederSegundero();
        reloj.retrocederSegundero();
        reloj.retrocederSegundero();
        assertEquals(59, reloj.getSegundos());
        assertEquals(1, reloj.getMinutos());
        assertEquals(12, reloj.getHoras());
    }
    
    @Test
    public void testAvanzarSegundero2()
    {
        Reloj reloj = new Reloj();
        reloj.setSegundos(2);
        reloj.avanzarSegundero();
        reloj.avanzarSegundero();
        reloj.avanzarSegundero();
        assertEquals(5, reloj.getSegundos());
        assertEquals(0, reloj.getMinutos());
        assertEquals(12, reloj.getHoras());    
    } 
    
    @Test
    public void testRetrocederSegundero2()
    {
        Reloj reloj = new Reloj();
        reloj.setSegundos(5);
        reloj.retrocederSegundero();
        reloj.retrocederSegundero();
        reloj.retrocederSegundero();
        assertEquals(2, reloj.getSegundos());
        assertEquals(0, reloj.getMinutos());
        assertEquals(12, reloj.getHoras());     
    } 

    @Test
    public void testIntegralAvanzar1()
    {
        Reloj reloj = new Reloj();
        reloj.setSegundos(59);
        reloj.setMinutos(59);
        reloj.setHoras(12);
        reloj.avanzarSegundero();
        assertEquals(0, reloj.getSegundos());
        assertEquals(0, reloj.getMinutos());
        assertEquals(1, reloj.getHoras());
    }
    
    @Test
    public void testIntegralRetroceder1()
    {
        Reloj reloj = new Reloj();
        reloj.setHoras(1);
        reloj.retrocederSegundero();
        assertEquals(59, reloj.getSegundos());
        assertEquals(59, reloj.getMinutos());
        assertEquals(12, reloj.getHoras());
    }
    
    @Test
    public void testIntegralAvanzar2()
    {
        Reloj reloj = new Reloj();
        reloj.setSegundos(59);
        reloj.setMinutos(59);
        reloj.setHoras(12);
        reloj.avanzarMinutero();
        assertEquals(59, reloj.getSegundos());
        assertEquals(0, reloj.getMinutos());
        assertEquals(1, reloj.getHoras());
    }    
    
    @Test
    public void testIntegralRetroceder2()
    {
        Reloj reloj = new Reloj();
        reloj.setHoras(1);
        reloj.retrocederMinutero();
        assertEquals(0, reloj.getSegundos());
        assertEquals(59, reloj.getMinutos());
        assertEquals(12, reloj.getHoras());
    }
    
    @Test
    public void testIntegral1()
    {
        Reloj reloj = new Reloj();
        reloj.setSegundos(10);
        reloj.setMinutos(10);
        reloj.setHoras(10);
        reloj.avanzarSegundero();
        assertEquals(11, reloj.getSegundos());
        assertEquals(10, reloj.getMinutos());
        assertEquals(10, reloj.getHoras());
        reloj.avanzarMinutero();
        assertEquals(11, reloj.getSegundos());
        assertEquals(11, reloj.getMinutos());
        assertEquals(10, reloj.getHoras());
        reloj.avanzarHorario();
        assertEquals(11, reloj.getSegundos());
        assertEquals(11, reloj.getMinutos());
        assertEquals(11, reloj.getHoras());
    }        
    
    @Test
    public void testIntegral2()
    {
        Reloj reloj = new Reloj();
        reloj.setSegundos(11);
        reloj.setMinutos(11);
        reloj.setHoras(11);
        reloj.retrocederSegundero();
        assertEquals(10, reloj.getSegundos());
        assertEquals(11, reloj.getMinutos());
        assertEquals(11, reloj.getHoras());
        reloj.retrocederMinutero();
        assertEquals(10, reloj.getSegundos());
        assertEquals(10, reloj.getMinutos());
        assertEquals(11, reloj.getHoras());
        reloj.retrocederHorario();
        assertEquals(10, reloj.getSegundos());
        assertEquals(10, reloj.getMinutos());
        assertEquals(10, reloj.getHoras());
    } 
    
    @Test
    public void testIntegral3()
    {
        Reloj reloj = new Reloj();
        reloj.setHoras(1);
        reloj.avanzarSegundero();
        reloj.avanzarMinutero();        
        reloj.avanzarHorario();                
        assertEquals(1, reloj.getSegundos());
        assertEquals(1, reloj.getMinutos());
        assertEquals(2, reloj.getHoras());
        reloj.retrocederSegundero();
        reloj.retrocederMinutero();
        reloj.retrocederHorario();
        assertEquals(0, reloj.getSegundos());
        assertEquals(0, reloj.getMinutos());
        assertEquals(1, reloj.getHoras());
        reloj.retrocederSegundero();
        reloj.retrocederMinutero();
        reloj.retrocederHorario();
        assertEquals(59, reloj.getSegundos());
        assertEquals(58, reloj.getMinutos());
        assertEquals(11, reloj.getHoras());
        reloj.avanzarSegundero();
        reloj.avanzarMinutero();        
        reloj.avanzarHorario(); 
        assertEquals(0, reloj.getSegundos());
        assertEquals(0, reloj.getMinutos());
        assertEquals(1, reloj.getHoras());
    } 
}




