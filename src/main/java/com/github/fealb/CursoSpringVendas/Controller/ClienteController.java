package com.github.fealb.CursoSpringVendas.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.github.fealb.CursoSpringVendas.Dto.ClienteDto;

@RestController
public class ClienteController {

	
	@GetMapping("/api/clientes/{id}")
	public ResponseEntity<ClienteDto> getClienteById(@PathVariable Integer id){
		
		ClienteDto c1 = new ClienteDto();
		c1.setId(1);
		c1.setNome("Teste 1");
		
		return ResponseEntity.ok(c1);
		
		
	}
	
	
}
