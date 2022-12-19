package com.ssd.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ssd.entity.Task;

public interface TaskRepository extends JpaRepository<Task, Integer> {

}
