/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.scharles.retornoboletostrategyfuncional;

import java.util.List;
import java.util.function.Function;

/**
 *
 * @author SCHARLES
 */
public class ProcessarBoletos {
    private Function<String, List<Boleto>> leituraRetorno;

    

    public ProcessarBoletos(Function<String, List<Boleto>> leituraRetorno) {
        this.leituraRetorno = leituraRetorno;
    }

   
    public void processar(String nomeArquivo){
        List<Boleto> listaBoletos = leituraRetorno.apply(nomeArquivo);
        for (Boleto boleto : listaBoletos) {
            System.out.println(boleto);
        }
    }
    
    public Function<String, List<Boleto>> getLeituraRetorno() {
        return leituraRetorno;
    }

    public void setLeituraRetorno(Function<String, List<Boleto>> leituraRetorno) {
        this.leituraRetorno = leituraRetorno;
    }
    
}

