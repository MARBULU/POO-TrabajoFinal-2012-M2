
package pe.ist.crm.model;

import java.util.Calendar;
import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import pe.ist.crm.entity.Prospecto;

public class ProspectoModelTest {
    
    public ProspectoModelTest() {
    }

    

    @Test
    public void testCrear01() {
        // Dato
        Prospecto o = new Prospecto();
        o.setPaterno("Gonzales");
        o.setMaterno("Perez");
        o.setNombre("Hector");
        o.setEmail("hector@hotmail.com");
        o.setDni("09247122");
        o.setTelefono("5337620");
        o.setFecha(Calendar.getInstance().getTime());
        // Valor esperado
        int valorEsperado = 1;
        // Respuesta obtenida
        ProspectoModel model = new ProspectoModel();
        int rpta = model.crear(o);
        // Prueba
        assertEquals(valorEsperado, rpta);
    }
    
    @Test
    public void testCrear02() {
        // Dato
        Prospecto o = new Prospecto();
        o.setPaterno("Gonzales");
        o.setMaterno("Mejia");
        o.setNombre("Hector");
        o.setEmail("hector@hotmail.com");
        o.setDni("09247122");
        o.setTelefono("5337620");
        o.setFecha(Calendar.getInstance().getTime());
        // Valor esperado
        int valorEsperado = 1;
        // Respuesta obtenida
        ProspectoModel model = new ProspectoModel();
        int rpta = model.crear(o);
        // Prueba
        assertEquals(valorEsperado, rpta);
    }
    @Test
    public void testCrear03() {
        // Dato
        Prospecto o = new Prospecto();
        o.setPaterno("Gonzales");
        o.setMaterno("Avendaño");
        o.setNombre("Hector");
        o.setEmail("hector@hotmail.com");
        o.setDni("09247122");
        o.setTelefono("5337620");
        o.setFecha(Calendar.getInstance().getTime());
        // Valor esperado
        int valorEsperado = 1;
        // Respuesta obtenida
        ProspectoModel model = new ProspectoModel();
        int rpta = model.crear(o);
        // Prueba
        assertEquals(valorEsperado, rpta);
    }
    
    @Test
    public void testCrear04() {
        // Dato
        Prospecto o = new Prospecto();
        o.setPaterno("Gonzales");
        o.setMaterno("Mejia");
        o.setNombre("Hector");
        o.setEmail("hector@hotmail.com");
        o.setDni("49258862"); // DNI duplicado
        o.setTelefono("5337620");
        o.setFecha(Calendar.getInstance().getTime());
        // Valor esperado
        int valorEsperado = -2; // Por DNI duplicado
        // Respuesta obtenida
        ProspectoModel model = new ProspectoModel();
        int rpta = model.crear(o);
        // Prueba
        assertEquals(valorEsperado, rpta);
    }
    
    @Test
    public void testActulizar01() {
        // Dato
        Prospecto o = new Prospecto();
        o.setCodigo(200L); // No existe
        o.setPaterno("Gonzales");
        o.setMaterno("Mejia");
        o.setNombre("Hector");
        o.setEmail("hector@hotmail.com");
        o.setDni("49258862"); 
        o.setTelefono("5337620");
        o.setFecha(Calendar.getInstance().getTime());
        // Valor esperado
        int valorEsperado = -3; // Por codigo no existente
        // Respuesta obtenida
        ProspectoModel model = new ProspectoModel();
        int rpta = model.actualizar(o);
        // Prueba
        assertEquals(valorEsperado, rpta);
    }
    
    
}
