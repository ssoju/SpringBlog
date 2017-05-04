package com.hanulo.blog.infrastructure.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hanulo.blog.domain.model.entity.Hello;

public interface HelloDao extends JpaRepository<Hello, Integer> {

}
