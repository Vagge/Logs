package com.example.Log.Model;


import java.util.Date;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class Log 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long logId;
	private String message;
	private Date created;
	private String person;
	
	public Log(@JsonProperty("message") String message, @JsonProperty String person)
	{
		this.message = message;
		this.person = person;
		created = new Date();
	}
	
	public Log()
	{
	}
	
	public String getPerson() {
		return person;
	}

	public void setPerson(String person) {
		this.person = person;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public Long getLogId() {
		return logId;
	}
	public void setLogId(Long logId) {
		this.logId = logId;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "Log [logId=" + logId + ", message=" + message + ", created=" + created + ", person=" + person + "]";
	}
	
	
}