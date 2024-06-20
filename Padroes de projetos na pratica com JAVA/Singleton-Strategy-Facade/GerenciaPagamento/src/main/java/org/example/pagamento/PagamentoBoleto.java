// org.example.pagamento.PagamentoBoleto.java
package org.example.pagamento;

// Implementação de pagamento com boleto bancário
public class PagamentoBoleto implements PagamentoStrategy {
    public void pagar(double valor) {
        System.out.println("Pagamento realizado com boleto bancário no valor de " + valor);
    }
}
