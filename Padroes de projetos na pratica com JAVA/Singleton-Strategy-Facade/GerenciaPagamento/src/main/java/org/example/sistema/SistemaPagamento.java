// org.example.sistema.SistemaPagamento.java
package org.example.sistema;

import org.example.pagamento.PagamentoStrategy;

// Fachada para o sistema de pagamento
public class SistemaPagamento {
    private static SistemaPagamento instancia = new SistemaPagamento();
    private PagamentoStrategy estrategia;

    private SistemaPagamento() {}

    public static SistemaPagamento getInstance() {
        return instancia;
    }

    public void setEstrategiaPagamento(PagamentoStrategy estrategia) {
        this.estrategia = estrategia;
    }

    public void realizarPagamento(double valor) {
        if (estrategia != null) {
            estrategia.pagar(valor);
        } else {
            System.out.println("Por favor, defina uma estratégia de pagamento antes de realizar o pagamento.");
        }
    }
}
