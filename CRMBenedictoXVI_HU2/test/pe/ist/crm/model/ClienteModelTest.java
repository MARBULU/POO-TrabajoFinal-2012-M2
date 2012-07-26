
package pe.ist.crm.model;

import java.util.Calendar;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import pe.ist.crm.entity.Cliente;

public class ClienteModelTest {
    
    public ClienteModelTest() {
    }

    @Test
    public void testCrear01() {
        // Dato
        Cliente o = new Cliente();
        o.setPaterno("Arbulu");
        o.setMaterno("Anicama");
        o.setNombre("Jose");
        o.setEmail("martin.arbulu@gmail.com");
        o.setDni("42762681");
        o.setTelefono("2482329");
        o.setFecha(Calendar.getInstance().getTime());
        // Valor esperado
        int valorEsperado = 1;
        // Respuesta obtenida
        ClienteModel model = new ClienteModel();
        int rpta = model.crear(o);
        // Prueba
        assertEquals(valorEsperado, rpta);
    }
    
    @Test
    public void testCrear02() {
        // Dato
        Cliente o = new Cliente();
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
        ClienteModel model = new ClienteModel();
        int rpta = model.crear(o);
        // Prueba
        assertEquals(valorEsperado, rpta);
    }
    @Test
    public void testCrear03() {
        // Dato
        Cliente o = new Cliente();
        o.setPaterno("Rojas");
        o.setMaterno("Rojas");
        o.setNombre("Jesus");
        o.setEmail("jrojas@gmail.com");
        o.setDni("40021130");
        o.setTelefono("3484727");
        o.setFecha(Calendar.getInstance().getTime());
        // Valor esperado
        int valorEsperado = 1;
        // Respuesta obtenida
        ClienteModel model = new ClienteModel();
        int rpta = model.crear(o);
        // Prueba
        assertEquals(valorEsperado, rpta);
    }
    
    @Test
    public void testCrear04() {
        // Dato
        Cliente o = new Cliente();
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
        ClienteModel model = new ClienteModel();
        int rpta = model.crear(o);
        // Prueba
        assertEquals(valorEsperado, rpta);
    }
    
    @Test
    public void testActulizar01() {
        // Dato
        Cliente o = new Cliente();
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
        ClienteModel model = new ClienteModel();
        int rpta = model.actualizar(o);
        // Prueba
        assertEquals(valorEsperado, rpta);
    }
    
    
}
