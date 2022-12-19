package com.ssd.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssd.dao.MyDao;
import com.ssd.entity.Task;

@Service
public class MyService {

	@Autowired
	MyDao myDao;

	public Task saveOrUpdate(Task task) {

		return myDao.saveOrUpdate(task);

	}

}
