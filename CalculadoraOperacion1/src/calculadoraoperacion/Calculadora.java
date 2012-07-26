

package calculadoraoperacion;


public class Calculadora {
    
    private Double resultado;
    

    public Calculadora() {
    }
    
    public Double areaCirculo(Integer radio){
    
        resultado=Math.PI*Math.pow(radio, 2);
        
        return resultado;
        
    }
    
    public Double areaCuadrado(Integer lado){
        
        resultado=Math.pow(lado, 2);
        
        return resultado;
    
    }
    
    public Integer factorial(Integer numero){
        
        Integer factorial=1;
        
        for (int i = 1; i <= numero; i++) {
            
            factorial=factorial*i;
            
        }
        
        return  factorial;
    }
    
    
    public String numeroPrimo(Integer numero){
        
        int acumulador=0;
        String resultado="";
        
        for (int i = 1; i <= numero; i++) {
            
            if (numero%i==0) {
                acumulador=acumulador+1;
            }
            
            if (acumulador==2) {
                resultado= numero+" es primo";
            }
            else{
                resultado= numero+" no es primo";
            }
            
        }
        
        
        return resultado;
        
    }
    
}
