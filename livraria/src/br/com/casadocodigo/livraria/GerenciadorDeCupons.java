package br.com.casadocodigo.livraria;

import java.util.HashMap;
import java.util.Map;

public class GerenciadorDeCupons {

    private Map<String, Double> cupons;

    public GerenciadorDeCupons() {
        this.cupons = new HashMap<>();
        
        cupons.put("CUP74", 10.0);
        cupons.put("CUP158", 15.00);
        cupons.put("CUP14", 5.99);
        cupons.put("CUP52", 20.00);
        // cupons.addAll(Arrays.asList("", "", "", "", "CUP21", "CUP221", "CUP91", "CUP327",
        //                             "CUP410", "CUP275", "CUP484", "CUP207", "CUP96", "CUP119", "CUP174", "CUP291",
        //                             "CUP1", "CUP115", "CUP222", "CUP272"));
    }

    public Double validaCupom(String cupom) {
        return this.cupons.get(cupom);
    }
}