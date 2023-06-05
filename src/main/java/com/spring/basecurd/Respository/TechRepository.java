package com.spring.basecurd.Respository;

import com.spring.basecurd.Model.TechStack;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TechRepository extends JpaRepository<TechStack, String> {

}
