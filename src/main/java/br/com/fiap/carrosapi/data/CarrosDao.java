package br.com.fiap.carrosapi.data;

import java.util.ArrayList;
import java.util.List;

import br.com.fiap.carrosapi.model.Carro;

public class CarrosDao {
	
	List<Carro> carros = new ArrayList<>();
	
	public CarrosDao() {
		var carro1 = new Carro(
				1L, 
				"Fit", 
				"Honda", 
				4.0
			);
		var carro2 = new Carro(
				1L, 
				"I30", 
				"Hyunday", 
				5.0
			);
		carros.add(carro1);
		carros.add(carro2);
	}

	public List<Carro> findAll() {
		return carros;
	}

}
