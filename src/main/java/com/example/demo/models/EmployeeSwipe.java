package com.example.demo.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee_swipe")
public class EmployeeSwipe {
	
	private Integer id;
	private Integer emp_id;
	private Date date;
	private String location;
	private Date swipe_in;
	private Date swipe_out;
	
	@Id
	@GeneratedValue
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(Integer emp_id) {
		this.emp_id = emp_id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Date getSwipe_in() {
		return swipe_in;
	}
	public void setSwipe_in(Date swipe_in) {
		this.swipe_in = swipe_in;
	}
	public Date getSwipe_out() {
		return swipe_out;
	}
	public void setSwipe_out(Date swipe_out) {
		this.swipe_out = swipe_out;
	}
	public EmployeeSwipe(Integer id, Integer emp_id, Date date, String location, Date swipe_in, Date swipe_out) {
		super();
		this.id = id;
		this.emp_id = emp_id;
		this.date = date;
		this.location = location;
		this.swipe_in = swipe_in;
		this.swipe_out = swipe_out;
	}
	@Override
	public String toString() {
		return "EmployeeSwipe [id=" + id + ", emp_id=" + emp_id + ", date=" + date + ", location=" + location
				+ ", swipe_in=" + swipe_in + ", swipe_out=" + swipe_out + "]";
	}
	
	
	

}
