package br.com.solutis.treinamento.restAPI.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.solutis.treinamento.restAPI.model.Conta;
import br.com.solutis.treinamento.restAPI.service.ReceberService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api/receber")
@Api(value = "API REST Pagamento")
@CrossOrigin(origins = "*")
public class Receber {

	private ReceberService receberService;
	
    public Receber(@Autowired ReceberService service) {
		this.receberService = service;
	}

    @GetMapping(path = "/contas")
    @ApiOperation(value = "Retorna lista de contas cadastradas")
    public List<Conta> contas(){
    	return receberService.findAll();
    }
    
    @GetMapping(path = "/conta/{id}")
    @ApiOperation(value = "Retorna lista de conta cadastrada através do {id} da conta ")
    public Optional<Conta> getContaById(@PathVariable("id") Long id ){
    	return receberService.findById(id);
    }
        
    @PostMapping(path = "/conta")
    @ApiOperation(value = "Cadastra uma conta")
    public void inserirConta(@RequestBody Conta conta) {
    	receberService.persistOrMerge(conta);
    }
    
    @PutMapping(path = "/conta/{id}")
    @ApiOperation(value = "Atualiza uma conta identificando através do {id}")
    public void atualizarConta(@PathVariable("id") Long id) {
    	receberService.persistOrMerge(new Conta(id));
    }
    
    @DeleteMapping(path = "/conta/{id}")
    @ApiOperation(value = "Remove uma conta através do {id}")
    public void deletarConta(@PathVariable("id") Long id) {
    	this.receberService.delete(new Conta(id));
    }
    
}















