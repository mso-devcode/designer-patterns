package br.com.alura.loja.imposto;

import br.com.alura.loja.Orcamento;

import java.math.BigDecimal;

public interface TipoImposto {

    BigDecimal calcular(Orcamento orcamento);
}
