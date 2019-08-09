package br.com.solutis.treinamento.restAPI.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.solutis.treinamento.restAPI.dao.ReceberDao;
import br.com.solutis.treinamento.restAPI.model.Conta;
import br.com.solutis.treinamento.restAPI.model.enums.CicloEnum;
import br.com.solutis.treinamento.restAPI.model.enums.TipoEnum;

@Service
public class TestService {

	@Autowired
	private ReceberDao receberDao;
	
	public void instantiationDatabase() {
		
		Conta c1 = new Conta(null, "Pagamento Aluguel", 400.00, 3.0, TipoEnum.PAGAR, CicloEnum.PARCELADO, null);
		
		receberDao.saveAll(Arrays.asList(c1));
		
	}

}
