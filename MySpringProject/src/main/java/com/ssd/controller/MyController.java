package com.ssd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssd.entity.Task;
import com.ssd.service.MyService;
import com.ssd.utils.MyUtils;

@RestController
@RequestMapping("/myController")
public class MyController {

	@Autowired
	MyService myService;

	@Autowired
	MyUtils myUtils;

	@GetMapping(value = "/getSuccess", produces = MediaType.ALL_VALUE)
	public void getSuccess() throws Exception {
		throw new Exception("Exception is thrown....");
	}

	@PutMapping(value = "/task/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Task saveOrUpdate(@PathVariable(required = false) String id,
			@RequestBody Task task) {

		myUtils.validatetaskrequest(task);

		if (id != null) {
			task.setId(
					id.equalsIgnoreCase("null") ? null : Integer.parseInt(id));
		}

		return myService.saveOrUpdate(task);

	}

}
