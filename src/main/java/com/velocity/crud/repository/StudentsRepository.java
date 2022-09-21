package com.velocity.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.velocity.crud.entity.Students;


@Repository
public interface StudentsRepository extends JpaRepository<Students, Integer>{

}
