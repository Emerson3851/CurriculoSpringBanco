package com.example.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.Model.Formação;
import com.example.Repository.FormaçãoRepository;

@Service
public class FormaçãoService {
	
	@Autowired
	private FormaçãoRepository repository;
	
	public List<Formação> Listar(){
		return repository.findAll();
	}
	

    public Formação Post(@Validated @RequestBody Formação form){
        return repository.save(form);
    }
	
}
