package com.madadipouya.demo.springbootawssecretmanager.repository;


import com.madadipouya.demo.springbootawssecretmanager.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

    List<User> findAll();
}