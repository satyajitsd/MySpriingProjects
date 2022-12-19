package com.ssd.utils;

import org.springframework.stereotype.Service;

import com.ssd.entity.Task;
import com.ssd.exception.MyException;

@Service
public class MyUtils {

	public void validatetaskrequest(Task task) {
		if (task.getDescription() == null) {
			throw new MyException("Description is required", 400);
		}
	}

}
