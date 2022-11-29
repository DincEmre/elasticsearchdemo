package com.elasticsearch.elasticsearch.demo.controller;

import com.elasticsearch.elasticsearch.demo.model.Article;
import com.elasticsearch.elasticsearch.demo.service.ElasticService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Emre Dinç
 */
@RequiredArgsConstructor
@RestController
@RequestMapping("/")
public class ElasticController {


    private final ElasticService elasticService;

    @GetMapping("{name}")
    Page<Article> findByAuthorsName(@PathVariable(value = "name") String name){
        return elasticService.findByAuthorsName(name, PageRequest.of(0, 10));
    }

    @GetMapping
    Iterable<Article> findAll(){
        return elasticService.findAll();
    }



}
