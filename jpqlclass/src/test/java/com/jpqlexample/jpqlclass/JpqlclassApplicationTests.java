package com.jpqlexample.jpqlclass;

import com.jpqlexample.jpqlclass.entity.Student;
import com.jpqlexample.jpqlclass.repository.StudentRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.transaction.Transactional;
import java.util.List;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class JpqlclassApplicationTests {
	
	@Autowired
	StudentRepository studentRepository;

	@Test
	void contextLoads() {
	}
	
	@Test
	void testStudentCreate(){
//		Student student1 = new Student();
//		student1.setFirstName("Aakash");
//		student1.setLastName("Sharma");
//		student1.setScores(10);
//		studentRepository.save(student1);
		
		Student student2 = new Student();
		student2.setFirstName("Shivani");
		student2.setLastName("Mehrotra");
		student2.setScores(89);
		studentRepository.save(student2);
	}
	
	@Test
	void testFindAllStudents(){
		System.out.println(studentRepository.findAllStudent(PageRequest.of(1,2, Sort.by("firstName"))));
	}
	
	@Test
	void testFindAllStudentsPartial(){
		List<Object[]> partialList = studentRepository.findAllStudentPartial();
		for(Object[] obj : partialList){
			System.out.println(obj[0]);
			System.out.println(obj[1]);
		}
	}
	
	@Test
	void testFindAllStudentsByFirstName(){
		System.out.println(studentRepository.findAllStudentsByFirstName("Aakash"));
	}
	@Test
	void testFindAllStudentsBetweenRange(){
		System.out.println(studentRepository.findAllStudentsBetweenRange(90, 101));
	}
	
	@Test
	@Transactional
	@Rollback(false)
	void testDeleteStudentData(){
		studentRepository.deleteStudentByFirstName("Shivani");
	}
	
	@Test
	void testFindAllStudentsUsingNativeQuery(){
		System.out.println(studentRepository.findAllStudentUsingNativeQuery(PageRequest.of(0,2)));
	}

}
