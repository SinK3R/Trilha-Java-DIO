// org.example.pagamento.PagamentoCartaoCredito.java
package org.example.pagamento;

// Implementação de pagamento com cartão de crédito
public class PagamentoCartaoCredito implements PagamentoStrategy {
    public void pagar(double valor) {
        System.out.println("Pagamento realizado com cartão de crédito no valor de " + valor);
    }
}
