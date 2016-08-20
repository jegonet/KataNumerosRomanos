package logic;

import params.Constantes;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jorge Eliécer Gantiva Ochoa
 */
public class KatadorNumerosRomanos {
    
    private static UnidadRomana unidad;
    private static UnidadRomana decena;
    private static UnidadRomana centena;
    private static UnidadRomana mil;

    public static String convertirEntero(int numero) throws Exception {
        
        validarEntero(numero);
        
        unidad = new UnidadRomana("I", "V", "X");
        decena = new UnidadRomana("X", "L", "C");
        centena = new UnidadRomana("C", "D", "M");
        mil = new UnidadRomana("M", "", "");  //No asigno algunas variables porque no son necesarias para el ejecercicio

        String valorTextual = Integer.toString(numero);
        String valorRomano = "";
        
        int unidadVal, decenaVal, centenaVal, milVal;
        
        switch(valorTextual.length())
        {
            case 1:
                valorRomano = unidad.convertirUnidad(numero);
                break;
            case 2:
                unidadVal = Integer.parseInt(String.valueOf(valorTextual.toCharArray()[1]));
                decenaVal = Integer.parseInt(String.valueOf(valorTextual.toCharArray()[0]));
                valorRomano = decena.convertirUnidad(decenaVal) + unidad.convertirUnidad(unidadVal);
                break;
            case 3:
                unidadVal = Integer.parseInt(String.valueOf(valorTextual.toCharArray()[2]));
                decenaVal = Integer.parseInt(String.valueOf(valorTextual.toCharArray()[1]));
                centenaVal = Integer.parseInt(String.valueOf(valorTextual.toCharArray()[0]));
                valorRomano = centena.convertirUnidad(centenaVal) + decena.convertirUnidad(decenaVal) 
                        + unidad.convertirUnidad(unidadVal);
                break;
            default:
                unidadVal = Integer.parseInt(String.valueOf(valorTextual.toCharArray()[3]));
                decenaVal = Integer.parseInt(String.valueOf(valorTextual.toCharArray()[2]));
                centenaVal = Integer.parseInt(String.valueOf(valorTextual.toCharArray()[1]));
                milVal = Integer.parseInt(String.valueOf(valorTextual.toCharArray()[0]));
                valorRomano = mil.convertirUnidad(milVal) + centena.convertirUnidad(centenaVal) + 
                        decena.convertirUnidad(decenaVal) + unidad.convertirUnidad(unidadVal);
                break;
        }
        
        return valorRomano;
    }
    
    private static void validarEntero(int numero) throws Exception{
        if(numero==0)
            throw new Exception(Constantes.ERROR_MESSAGE_CERO);
        else if (numero<0)
            throw new Exception(Constantes.ERROR_MESSAGE_NEGATIVO);
    }
}