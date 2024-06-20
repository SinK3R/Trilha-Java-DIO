package org.example.sistema.controller;

import org.example.sistema.model.Pagamento;
import org.example.sistema.service.PagamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PagamentoController {

    private final PagamentoService pagamentoService;

    @Autowired
    public PagamentoController(PagamentoService pagamentoService) {
        this.pagamentoService = pagamentoService;
    }

    @PostMapping("/pagamento")
    public ResponseEntity<String> processarPagamento(@RequestBody Pagamento pagamento) {
        pagamentoService.processarPagamento(pagamento);
        return ResponseEntity.ok("Pagamento processado com sucesso");
    }
}