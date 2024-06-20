// org.example.Main.java
package org.example;

import org.example.pagamento.PagamentoCartaoCredito;
import org.example.pagamento.PagamentoBoleto;
import org.example.pagamento.PagamentoStrategy;
import org.example.sistema.SistemaPagamento;

// Exemplo de uso
public class Main {
    public static void main(String[] args) {
        // Obtém a instância do sistema de pagamento (Singleton)
        SistemaPagamento sistemaPagamento = SistemaPagamento.getInstance();

        // Define a estratégia de pagamento como cartão de crédito
        sistemaPagamento.setEstrategiaPagamento(new PagamentoCartaoCredito());

        // Realiza um pagamento
        sistemaPagamento.realizarPagamento(100.0);

        // Define a estratégia de pagamento como boleto bancário
        sistemaPagamento.setEstrategiaPagamento(new PagamentoBoleto());

        // Realiza outro pagamento
        sistemaPagamento.realizarPagamento(50.0);
    }
}
