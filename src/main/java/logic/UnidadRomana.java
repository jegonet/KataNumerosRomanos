/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

/**
 *
 * @author Jorge Eliecer Gantiva Ochoa
 */
public class UnidadRomana {
    
    private String valorMinimo;
    private String valorMedio;
    private String valorMaximo;
    
    public UnidadRomana(String valorMinimo, String valorMedio, String valorMaximo) {
        this.valorMinimo = valorMinimo;
        this.valorMedio = valorMedio;
        this.valorMaximo = valorMaximo;
    }
    
    public String convertirUnidad(int valor){
        switch (valor) {
            case 0:
                return "";
            case 4:
                return valorMinimo + valorMedio;
            case 9:
                return valorMinimo + valorMaximo;
            case 5:
                return valorMedio;
            default:
                return (valor>5?valorMedio:"") + multiplicarCadena(valorMinimo, (valor>5?valor-5:valor)) ;
        }
    }
    
    public String multiplicarCadena(String cadena, int veces){
        String concatena = "";        
        for(int i=0; i<veces; i++){
            concatena += cadena;
        }  
        return concatena;
    }
}