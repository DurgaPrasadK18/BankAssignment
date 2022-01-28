package com.example.demo.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Depositdetails;


@Repository
public interface Depositrepository extends CrudRepository<Depositdetails, Integer> {

}
