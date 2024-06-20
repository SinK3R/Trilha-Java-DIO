package org.example.sistema.service;

import org.example.sistema.model.Pagamento;
import org.springframework.stereotype.Service;

@Service
public class PagamentoServiceImpl implements PagamentoService {
    @Override
    public void processarPagamento(Pagamento pagamento) {
        // Implemente a lógica para processar o pagamento aqui
        System.out.println("Processando pagamento de " + pagamento.getValor() + " " + pagamento.getTipo());
    }
}
