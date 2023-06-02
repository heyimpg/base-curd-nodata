package com.spring.basecurd.Service;

import com.spring.basecurd.Model.TechStack;

import java.util.List;


public interface TechService {

    List<TechStack> findAll();

    TechStack findById(String id);

    void create(TechStack techStack);

    void update(String id, TechStack techStack);

    void remove(String id);

}
