/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.cvds.tdd.aerodescuentos;

/**
 *
 * @author daniel.gomez-su
 */
import org.junit.Assert;
import org.junit.Test;

public class TarifasTest {
    
    private CalculadorDescuentos calculadora ;
    
    @Test
    public void validarDescuentosAntMe() {
      double valor =calculadora.calculoTarifa(1000,21,66);
      Assert.assertEquals(770, valor,0.0001);
    }
    
    @Test
    public void validarDescuentosAntMenor() {
       double valor = calculadora.calculoTarifa(1000, 21, 15);
       Assert.assertEquals(800, valor, 0.0001);
    }
    
    @Test
    public void validarDescuentosnNoantMayor() {
       double valor = calculadora.calculoTarifa(1000, 20, 32);
       Assert.assertEquals(1000, valor, 0.0001);
    }
    
}
