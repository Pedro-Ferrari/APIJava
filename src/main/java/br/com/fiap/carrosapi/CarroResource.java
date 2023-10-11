package br.com.fiap.carrosapi;

import java.util.List;

import br.com.fiap.carrosapi.model.Carro;
import br.com.fiap.carrosapi.service.CarroService;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("carro")
public class CarroResource {
	
	CarroService service = new CarroService();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Carro> index() {
		return service.findAll();
	}

}
