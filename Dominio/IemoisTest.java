package Dominio;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;
public class IemoisTest {
    private Iemois test;
    private Mooc git;
    private Mooc java;
    @Before
    public void before() throws IEMOISExcepcion {
        test = new Iemois();
        git = new Mooc("Git", "Control de versiones", "Aprender Git", "Platzi", 1);
        java = new Mooc("Java","Ingenieria de Software","Aprender java","Udemy",3);
    }
    @Test
    public void deberiaAdicionarUnMooc(){
        try {
            test.adicione(git);
            test.adicione(java);
            if(test.numerocursos() == 2){
                assertTrue(true);
            }
            else{
                fail("No agrego los cursos");
            }

        }
        catch (IEMOISExcepcion e){
            fail("Lanzo una Excepcion");
        }
    }
    @Test
    public void deberiaListarUnMooc() throws IEMOISExcepcion {
        test.adicione(git);
        if(test.toString().contains("Git") && test.toString().contains("Control de versiones") &&
           test.toString().contains("Platzi") && test.toString().contains("1") &&
           test.toString().contains("Aprender Git")){ assertTrue(true);}
        else{
            fail("No esta listando el Mooc");
        }
    }
    @Test
    public void deberiaLanzarExcepcionMoocSinNombre(){
        try{
            test.adicione(new Mooc("", "Control de versiones", "Aprender Git", "Platzi", 1));
        }
        catch(IEMOISExcepcion e){
            assertEquals(IEMOISExcepcion.SIN_NOMBRE,e.getMessage());
        }
    }
    /**
    @Test
    public void deberiaLanzarExcepcionSemanasString()throws IEMOISExcepcion{
        try{
            test.adicione(new Mooc("Git", "Control de versiones", "Aprender Git", "Platzi", "varias"));
            fail();
        }
        catch(Exception e){
            assertTrue(true);
        }
    }
     **/
    @Test
    public void deberiaLanzarExcepcionMoocRepetido() {
        try {
            test.adicione(git);
            test.adicione(git);

        } catch (IEMOISExcepcion e) {
            assertEquals(IEMOISExcepcion.YA_EXISTE, e.getMessage());
        }
    }
    @Test
    public void deberiaLanzarExcepcionNoEncontroPalabra(){
        try{
            test.busque("Git");
        } catch (IEMOISExcepcion e) {
            assertEquals(IEMOISExcepcion.NO_EXISTE_PALABRA,e.getMessage());
        }
    }
    @Test
    public void deberiaBuscarUnMooc(){
        try{
            test.adicione(git);
            ArrayList<Mooc> result = test.busque("Git");
            assertEquals(git,result.get(0));
        } catch (IEMOISExcepcion e) {
            fail("No encontro el mooc adicionado");
        }
    }
}
