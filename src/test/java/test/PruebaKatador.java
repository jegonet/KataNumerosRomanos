package test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import logic.KatadorNumerosRomanos;
import org.testng.Assert;
import org.testng.annotations.Test;
import params.Constantes;

/**
 *
 * @author Jorge Eliecer Gantiva Ochoa
 */

@Test
public class PruebaKatador {
    
    @Test(expectedExceptions = Exception.class, expectedExceptionsMessageRegExp = Constantes.ERROR_MESSAGE_NEGATIVO)
    public void validarNumeroNegativo() throws Exception {
        KatadorNumerosRomanos.convertirEntero(-1);
    }
    
    @Test(expectedExceptions = Exception.class, expectedExceptionsMessageRegExp = Constantes.ERROR_MESSAGE_CERO)
    public void validarNumeroCero() throws Exception {
        KatadorNumerosRomanos.convertirEntero(0);
    }
    
    @Test
    public void validarNumeroUnidad3() throws Exception{
        String res=KatadorNumerosRomanos.convertirEntero(3);
        Assert.assertEquals(res, "III");
    }
    
    @Test
    public void validarNumeroUnidad4() throws Exception{
        Assert.assertEquals(KatadorNumerosRomanos.convertirEntero(4), "IV");
    }
    
    @Test
    public void validarNumeroUnidad8() throws Exception{
        Assert.assertEquals(KatadorNumerosRomanos.convertirEntero(8), "VIII");
    }
    
    @Test
    public void validarNumeroUnidad9() throws Exception{
        Assert.assertEquals(KatadorNumerosRomanos.convertirEntero(9), "IX");
    }
    
    @Test
    public void validarNumeroDecima3() throws Exception{
        Assert.assertEquals(KatadorNumerosRomanos.convertirEntero(30), "XXX");
    }
    
    @Test
    public void validarNumeroDecima4() throws Exception{
        Assert.assertEquals(KatadorNumerosRomanos.convertirEntero(40), "XL");
    }
    
    @Test
    public void validarNumeroDecima8() throws Exception{
        Assert.assertEquals(KatadorNumerosRomanos.convertirEntero(80), "LXXX");
    }
    
    @Test
    public void validarNumeroDecima9() throws Exception{
        Assert.assertEquals(KatadorNumerosRomanos.convertirEntero(90), "XC");
    }
    
    @Test
    public void validarNumeroCentena3() throws Exception{
        Assert.assertEquals(KatadorNumerosRomanos.convertirEntero(300), "CCC");
    }
    
    @Test
    public void validarNumeroCentena4() throws Exception{
        Assert.assertEquals(KatadorNumerosRomanos.convertirEntero(400), "CD");
    }
    
    @Test
    public void validarNumeroCentena8() throws Exception{
        Assert.assertEquals(KatadorNumerosRomanos.convertirEntero(800), "DCCC");
    }
    
    @Test
    public void toDoValidarDecima99() throws Exception{
        Assert.assertEquals(KatadorNumerosRomanos.convertirEntero(99), "XCIX");
    }   
    
    @Test
    public void toDoValidarCentena999() throws Exception{
        Assert.assertEquals(KatadorNumerosRomanos.convertirEntero(999), "CMXCIX");
    }
    
    @Test
    public void validarNumeroCentena9() throws Exception{
        Assert.assertEquals(KatadorNumerosRomanos.convertirEntero(900), "CM");
    }
    
    @Test
    public void validarNumeroMiles3() throws Exception{
        Assert.assertEquals(KatadorNumerosRomanos.convertirEntero(3000), "MMM");
    }
    
    @Test
    public void validarNumeroCompletoConcatenacion() throws Exception{
        Assert.assertEquals(KatadorNumerosRomanos.convertirEntero(3497), "MMMCDXCVII");
    }
}