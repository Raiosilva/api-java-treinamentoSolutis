package br.com.solutis.treinamento.restAPI.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.solutis.treinamento.restAPI.dao.ReceberDao;
import br.com.solutis.treinamento.restAPI.model.Conta;

@Service
public class TestService {

	@Autowired
	private ReceberDao receberDao;
	
	public void instantiationDatabase() {
		
		Conta c1 = new Conta(null, "Pagamento Aluguel", 400.00, 3.0, null, null);
		
		receberDao.saveAll(Arrays.asList(c1));
		
	}

}
