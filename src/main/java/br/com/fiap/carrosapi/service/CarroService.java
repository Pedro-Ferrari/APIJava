package br.com.fiap.carrosapi.service;

import java.util.List;

import br.com.fiap.carrosapi.data.CarrosDao;
import br.com.fiap.carrosapi.model.Carro;

public class CarroService {
	
	CarrosDao dao = new CarrosDao();

	public List<Carro> findAll() {
		return dao.findAll();
	}

}
