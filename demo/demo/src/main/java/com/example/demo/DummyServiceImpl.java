package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DummyServiceImpl implements IDemoService {

    @Autowired
    private IDemoRepository iDemoRepository;


    @Override
    public String save(Demo demo) {
        Demo existingDemoObj = iDemoRepository.save(demo);
        return existingDemoObj!=null ? "Successfully inserted" : "not Inserted";
    }
    @Override
    public List<Demo> findAll() {
        return iDemoRepository.findAll();

    }
}
