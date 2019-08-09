package br.com.solutis.treinamento.restAPI.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.solutis.treinamento.restAPI.model.Conta;

public interface ReceberDao extends JpaRepository<Conta, Long> {

}
