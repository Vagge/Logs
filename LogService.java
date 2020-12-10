package com.example.Log.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Log.Model.Log;

@Service
public class LogService 
{
	@Autowired
	private LogRepo repo;
	
	public List<Log> findAll()
	{
		return (List<Log>)repo.findAll();
	}
	
	public List<Log> findLogsFor(String receiver)
	{
		return (List<Log>)repo.findByReceiver(receiver);
	}
	
	public void addLog(Log log)
	{
		repo.save(log);
	}

}
