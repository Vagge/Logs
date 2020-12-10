package com.example.Log.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.Log.Model.Log;

public interface LogRepo extends JpaRepository<Log, Long>
{
	@Query("FROM Log WHERE person= :receiver")
	List<Log> findByReceiver(@Param("receiver") String receiver);
}
