package com.ssd.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ssd.entity.Task;

@Repository
public class MyDao {

	@Autowired
	TaskRepository taskRepository;

	public Task saveOrUpdate(Task task) {

		return taskRepository.save(task);

	}

}
