package com.spring.basecurd.Respository;

import com.spring.basecurd.Model.TechStack;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface TechRepository extends JpaRepository<TechStack, String> {

    @Modifying
    @Query(value = "INSERT INTO TBL_TECH_STACK VALUES(:id, :name, :level, :since)", nativeQuery = true)
    @Transactional
    void insert(String id, String name, int level, String since);
}
