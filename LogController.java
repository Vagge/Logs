package com.example.Log.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.Log.Dao.LogService;
import com.example.Log.Model.Log;

@RequestMapping("/log")
@RestController
public class LogController 
{
	@Autowired
	LogService service;

	@GetMapping
	public List<Log> getLogs(@RequestParam String receiver)
	{
		return service.findLogsFor(receiver);
	}
	
	@PostMapping
	public void addMessage(@RequestBody Log log)
	{
		service.addLog(log);
	}
}
