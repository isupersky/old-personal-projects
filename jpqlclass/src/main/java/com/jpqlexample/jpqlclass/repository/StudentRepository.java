package com.jpqlexample.jpqlclass.repository;

import com.jpqlexample.jpqlclass.entity.Student;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
//import java.awt.print.Pageable;
import java.util.List;


@Repository
public interface StudentRepository extends CrudRepository<Student,Long> {

//	@Query("select * from Student")
//	or
	@Query("from Student")
	List<Student> findAllStudent(Pageable pageable);
	
	@Query("select firstName,lastName from Student")
	List<Object[]> findAllStudentPartial();
	
	@Query("from Student where firstName=:firstName")
	List<Student>findAllStudentsByFirstName(@Param("firstName") String firstName);
	
	@Query("from Student where scores>:min and scores<:max ")
	List<Student>findAllStudentsBetweenRange(@Param("min") Integer min, @Param("max") Integer max);
	
	@Query("delete from Student where firstName=:firstName")
	@Modifying
	void deleteStudentByFirstName(@Param("firstName") String firstName);
	
	@Query(value = "select * from studenttest",nativeQuery = true)
	List<Student> findAllStudentUsingNativeQuery(Pageable pageable);
}
