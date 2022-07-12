package com.crud1.Repo;
import java.util.List;
import com.crud1.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


public interface Studentrepo extends JpaRepository<student, Integer>{

	
	List<student> findByDep(String dep);
	
	List<student> findByRnoGreaterThan(int rno);
	
	@Query("from student where dep=?1 order by name")
	List<student> findByDepSorted(String dep);
	
	
}
