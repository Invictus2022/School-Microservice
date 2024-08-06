package com.hexagon.school_service.repository;



import com.hexagon.school_service.model.SchoolModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SchoolRepository extends JpaRepository<SchoolModel,Integer> {

}
