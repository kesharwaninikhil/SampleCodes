package com.example.springboot.mongo.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.springboot.mongo.model.Employee;

@Repository
public interface Employeedao extends MongoRepository<Employee, Integer> {

}