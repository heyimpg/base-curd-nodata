package com.spring.basecurd.Service.impl;

import com.spring.basecurd.Model.TechStack;
import com.spring.basecurd.Respository.TechRepository;
import com.spring.basecurd.Service.TechService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
//@Primary
public class Tech2ServiceImpl implements TechService {
    @Autowired
    private TechRepository techRepository;

    @Override
    public List<TechStack> findAll() {
        return techRepository.findAll();
    }

    @Override
    public TechStack findById(String id) {
        return techRepository.findById(id).get();
    }

    @Override
    public void create(TechStack techStack) {
        techRepository.insert(techStack.getId(), techStack.getName(), techStack.getLevel(), techStack.getSince().toString());
    }

    @Override
    public void update(String id, TechStack techStack) {
        techRepository.save(techStack);
    }

    @Override
    public void remove(String id) {
        techRepository.delete(techRepository.getById(id));
    }
}
