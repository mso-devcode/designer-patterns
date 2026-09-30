package br.com.alura.loja;

import br.com.alura.loja.imposto.CalculadoraDeImposto;
import br.com.alura.loja.imposto.TipoImposto;

import java.math.BigDecimal;

public class TesteImpostos {

    public static void main(String[] args) {

        Orcamento orcamento = new Orcamento(new BigDecimal("1000"));
        CalculadoraDeImposto calculadora = new CalculadoraDeImposto();
        System.out.println(calculadora.calcular(orcamento, TipoImposto.ISS));

    }
}
