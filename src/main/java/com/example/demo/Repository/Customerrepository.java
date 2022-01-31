package com.example.demo.Repository;



import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.Customerdetails;


public interface Customerrepository extends CrudRepository<Customerdetails, Integer>{

}
