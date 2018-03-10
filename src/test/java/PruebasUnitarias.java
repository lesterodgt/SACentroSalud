/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import sa.ws_centro_salud_2.WS;

/**
 *
 * @author scxal
 */
public class PruebasUnitarias {
    
    public PruebasUnitarias() {
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public void IngresoPaciente(){
        WS webService = new WS();
        int result = webService.pacientes("{ paciente:[]}");
        assertEquals(result,0);
    }
    
    @Test
    public void IngresoMedico(){
        WS webService = new WS();
        int result = webService.IngresoMedicoCS2("{medico:[]}");
        assertEquals(result,0);
    }
    
    @Test
    public void IngresoDiagnostico(){
        WS webService = new WS();
        int result = webService.IngresoDiagnosticoCS2("{diagnostico:[]}");
        assertEquals(result,0);
    }
    
    @Test
    public void IngresoCita(){
        WS webService = new WS();
        int result = webService.IngresoCitaCS2("{cita:[]}");
        assertEquals(result,0);
    }
    
    @Test
    public void IngresoAtencionMedica(){
        WS webService = new WS();
        int result = webService.IngresoAtencionMedicaCS2("{atencion:[]}");
        assertEquals(result,0);
    }
    
    @Test
    public void IngresoReceta(){
        WS webService = new WS();
        int result = webService.IngresoRecetaCS2("{receta:[]}");
        assertEquals(result,0);
    }
    
    @Test
    public void consultarReceta(){
        WS webService = new WS();
        int result = webService.ConsultarRecetaCS2(999999);
        assertEquals(result,0);
    }
    
}
