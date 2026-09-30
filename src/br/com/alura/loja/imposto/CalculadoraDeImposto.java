package br.com.alura.loja.imposto;

import br.com.alura.loja.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeImposto {

    public BigDecimal calcular(Orcamento orcamento, TipoImposto tipoImposto) {

        switch (tipoImposto) {
            case ICMS:
                return orcamento.getValor().multiply(BigDecimal.valueOf(0.1));
            case ISS:
                return orcamento.getValor().multiply(BigDecimal.valueOf(0.06));
            default:
                return BigDecimal.ZERO;
        }

    }
}
