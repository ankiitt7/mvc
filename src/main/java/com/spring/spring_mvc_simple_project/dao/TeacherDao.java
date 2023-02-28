package com.spring.spring_mvc_simple_project.dao;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.spring.spring_mvc_simple_project.dto.Teacher;

@Component
public class TeacherDao {

	@Autowired
	EntityManagerFactory entityManagerFactory;

	// save methodTeacher
	public Teacher saveTeacher(Teacher teacher) {

		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		teacher.setBatchTime(LocalDateTime.now());

		entityTransaction.begin();

		entityManager.persist(teacher);

		entityTransaction.commit();

		return null;
	}

	public Teacher getTeacherById(int id) {

		EntityManager entityManager = entityManagerFactory.createEntityManager();
		return entityManager.find(Teacher.class, id);
	}

	// display Teacher
	public List<Teacher> getAllTeachers() {

		EntityManager entityManager = entityManagerFactory.createEntityManager();
		String seletcQuery = "Select t From Teacher t";

		return entityManager.createQuery(seletcQuery, Teacher.class).getResultList();
	}
	
	//delete Teacher
	public void deleteTeacherById(int id) {

		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.remove(entityManager.find(Teacher.class, id));
		entityTransaction.commit();
	}
	
	//updateTeacher
}
