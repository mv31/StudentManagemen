package com.app.service;

import org.springframework.stereotype.Service;

import com.app.model.Student;

@Service
public interface RegistrationService {

	public Student fetchStudentByEmailId(String tempEmail, Student student) throws Exception;
	public Student fetchStudentByEmailIdAndPassword(String tempEmail, String tempPass) throws Exception;

}
