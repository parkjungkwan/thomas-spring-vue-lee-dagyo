package com.bitcamp.web.controller;

import java.util.ArrayList;
import java.util.List;

import com.bitcamp.web.domain.BbsDTO;
import com.bitcamp.web.entities.Bbs;
import com.bitcamp.web.repositories.BbsRepository;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * BbsController
 */
@CrossOrigin(origins = "http://localhost:8080", maxAge = 3600)
@RestController
@RequestMapping("/bbs")
public class BbsController {
    @Autowired BbsDTO bbsDTO;
    @Autowired BbsRepository repo;
    @Autowired ModelMapper modelMapper;
    
    @Bean
    public ModelMapper modelMapper(){
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper;
    }
 
    @GetMapping("/list")
    public List<BbsDTO> listView() {
        System.out.println("listView 진입");
        System.out.println(repo.findAll().toString());
        List<BbsDTO> list = new ArrayList<>();
        Iterable<Bbs> it = repo.findAll();
        for(Bbs b:it) {
            BbsDTO bbs = modelMapper.map(b, BbsDTO.class);
            list.add(bbs);
        }
        return list;
    }

    @GetMapping("/{bbsNum}")
    public void pageView(@PathVariable int bbsNum) {

    }

    @PostMapping("")
    public List<BbsDTO> write(@RequestBody BbsDTO dto) {
        List<BbsDTO> list = new ArrayList<>();
        System.out.println("write 진입");
        Bbs entity = new Bbs();
        entity.setTitle(dto.getTitle());
        entity.setContents(dto.getContents());
        entity.setPassword(dto.getPassword());
        entity.setWriter(dto.getWriter());
        repo.save(entity);
        Iterable<Bbs> it = repo.findAll();
        for(Bbs b:it) {
            BbsDTO bbs = modelMapper.map(b, BbsDTO.class);
            list.add(bbs);
        }
        return list;
    }

    @PutMapping("/{bbsNum}")
    public void modify() {
        
    }

    @DeleteMapping("/{bbsNum}")
    public void delete() {
        
    }
}