package com.spring.basecurd.Service.impl;


import com.spring.basecurd.Model.TechStack;
import com.spring.basecurd.Service.TechService;
import com.spring.basecurd.Utils.DateTimeFormatUtils;
import com.spring.basecurd.Utils.UuidUtils;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class TechServiceImpl implements TechService {

    private final Map<String, TechStack> techStack;

     {
        techStack = new HashMap<>();
        String uuid = UuidUtils.generateUUID();
        techStack.put(uuid, new TechStack(uuid, "Java-Core", 5, LocalDate.parse("2019-01-01")));
        uuid = UuidUtils.generateUUID();
        techStack.put(uuid, new TechStack(uuid, "Android", 2, LocalDate.parse("2020-01-01")));
        uuid = UuidUtils.generateUUID();
        techStack.put(uuid, new TechStack(uuid, "Servlet", 2, LocalDate.parse("2021-01-01")));
        uuid = UuidUtils.generateUUID();
        techStack.put(uuid, new TechStack(uuid, "SpringMVC", 3, LocalDate.parse("2022-01-01")));
        uuid = UuidUtils.generateUUID();
        techStack.put(uuid, new TechStack(uuid, "SpringBoot", 4, LocalDate.parse("2022-01-01")));
    }

    @Override
    public List<TechStack> findAll() {
        return new ArrayList<>(techStack.values());
    }

    @Override
    public TechStack findById(String id) {
        return techStack.get(id);
    }

    @Override
    public void create(TechStack techStack) {
        this.techStack.put(techStack.getId(), techStack);
    }

    @Override
    public void update(String id, TechStack techStack) {
        this.techStack.put(id, techStack);
    }

    @Override
    public void remove(String id) {
        techStack.remove(id);
    }
}
