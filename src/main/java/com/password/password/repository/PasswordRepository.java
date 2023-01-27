package com.password.password.repository;



import org.springframework.data.repository.CrudRepository;

import com.password.password.model.Password;

public interface PasswordRepository extends CrudRepository<Password, Integer> {

    
}
