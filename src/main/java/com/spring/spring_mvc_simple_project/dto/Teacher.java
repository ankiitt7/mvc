package com.spring.spring_mvc_simple_project.dto;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Teacher {

	@Id
	private int teacherId;
	private String teacherName;
	private String teacherSubject;
	private LocalDateTime batchTime;

	public int getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public String getTeacherSubject() {
		return teacherSubject;
	}

	public void setTeacherSubject(String teacherSubject) {
		this.teacherSubject = teacherSubject;
	}

	public LocalDateTime getBatchTime() {
		return batchTime;
	}

	public void setBatchTime(LocalDateTime batchTime) {
		this.batchTime = batchTime;
	}

	
}
