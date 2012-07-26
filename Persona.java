/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package caso2;

/**
 *
 * @author jcarrill
 */
public class Persona {
    private String strNombre;
    private int intEdad;

    public Persona(String _strNombre, int _intEdad) {
        this.strNombre = _strNombre;
        this.intEdad = _intEdad;
    }

    public Persona() {
    }
    
    public String TocaOreja(Mascota objMascota)
    {
        return strNombre + " toco la oreja su mascota, " + objMascota.Acercar();
    }
    
    public String MuestraZanahoria(Mascota objMascota)
    {
        return strNombre + " muestra zanahoria a su mascota, " + objMascota.MoverCola();
    }
    
}
