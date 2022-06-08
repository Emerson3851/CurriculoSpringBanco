package com.example.Controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.Model.Formação;
import com.example.Service.FormaçãoService;


@CrossOrigin(origins = "http://192.168.0.113:19006")
@RestController
public class FormaçãoController {

	
	@Autowired
	private FormaçãoService service;
	

	
	@RequestMapping(value = "/formação", method = RequestMethod.GET)
	public List<Formação> Listar(){
		return service.Listar();
	}

	
	@RequestMapping(value = "/formação", method =  RequestMethod.POST)
    public ResponseEntity<Void> Post(@Validated @RequestBody Formação form){
		form = service.Post(form);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().
				path("/{id}").buildAndExpand(form.getId()).toUri();
		
        return ResponseEntity.created(uri).build();
    }
	
    
    
    
}
