package com.example.tetra.TetraRestDemo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.tetra.TetraRestDemo.model.Topic;

public interface TopicRepository extends JpaRepository<Topic, Long> {

}
