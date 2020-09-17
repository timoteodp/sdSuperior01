package com.devsuperior.dspesquisa.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dspesquisa.dto.GameDTO;
import com.devsuperior.dspesquisa.services.GameService;

@RestController //Controlador
@RequestMapping(value = "/games")//definição da rota principal
public class GameResource {
	
	//@Autowired //Pre processamento de injeção de dependencia
	//private GameRepository gameRepository;
	
	@Autowired
	private GameService service;
	
	@GetMapping
	public ResponseEntity<List<GameDTO>> findAll(){
		List<GameDTO>list = service.findAll();
		return ResponseEntity.ok().body(list);
	}

}
