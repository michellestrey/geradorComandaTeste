package com.entities;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Comanda {

	private Integer id;
	private LocalDate today = LocalDate.now();
	private LocalDateTime time1 = LocalDateTime.now();
	
	public Comanda(Integer id, LocalDate today, LocalDateTime time1) {
		super();
		this.id = id;
		this.today = today;
		this.time1 = time1;
	}
	public Comanda() {
		
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public LocalDate getToday() {
		return today;
	}
	public void setToday(LocalDate today) {
		this.today = today;
	}
	public LocalDateTime getTime1() {
		return time1;
	}
	public void setTime1(LocalDateTime time1) {
		this.time1 = time1;
	}
	@Override
	public String toString() {
		return "Comanda [id=" + id + ", today=" + today + ", time1=" + time1 + "]";
	}
	
	
	
	
}
