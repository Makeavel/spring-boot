package com.phga.spring3.view;

import com.phga.spring3.model.empregoM;

import org.springframework.data.repository.CrudRepository;

public interface empregoInterface extends CrudRepository<empregoM,Long> {
    
}
