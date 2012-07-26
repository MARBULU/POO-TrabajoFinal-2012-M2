
package pe.ist.crm.model;

import java.util.Calendar;
import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import pe.ist.crm.entity.Ventas;

public class VentaModelTest {
    
    public VentaModelTest() {
    }
 @Test
    public void testventas01() {
        // Dato
        Ventas o = new Ventas();
        o.setConcepto(null);
        o.setFechaEmision(Calendar.getInstance().getTime());
        o.setFechaVencimiento(Calendar.getInstance().getTime());
        o.setFechaPago(Calendar.getInstance().getTime());
        // Valor esperado
        int valorEsperado = -1; // Por datos no ingresados
        // Respuesta obtenida
        VentasModel model = new VentasModel();
        int rpta = model.validarNulos(o);
        // Prueba
        assertEquals(valorEsperado, rpta);
    }

    
}
