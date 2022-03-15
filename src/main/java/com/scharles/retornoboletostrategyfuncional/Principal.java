/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.scharles.retornoboletostrategyfuncional;

/**
 *
 * @author SCHARLES
 */
public class Principal {
    
    public static void main(String[] args) {
        ProcessarBoletos processador = null;
        processador = new ProcessarBoletos(LeituraRetorno::lerBancoBrasil);
        //processador.setLeituraRetorno(LeituraRetorno::lerBancoBrasil);
        //processador.processar("src/main/java/banco-brasil-1.csv");
        processador.setLeituraRetorno(LeituraRetorno::lerBancoBradesco);
        processador.processar("src/main/java/bradesco-1.csv");
        
        //"src/main/java/banco-brasil-1.csv"
        //"src/main/java/bradesco-1.csv"
    }
    
}
