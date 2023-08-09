package com.ex;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {

 
	@Modifying
	@Transactional
	@Query("update Student x set x.marks=?1 where x.id=?2")
	int updateMarks(int marks, int id);
	

}
