package com.skorupa.springWebApp.repositories;

import com.skorupa.springWebApp.model.Customer;
import org.springframework.data.repository.CrudRepository;



public interface CustomerrRepository extends CrudRepository<Customer, Long> {

}
