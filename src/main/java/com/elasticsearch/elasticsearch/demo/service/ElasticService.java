package com.elasticsearch.elasticsearch.demo.service;

import com.elasticsearch.elasticsearch.demo.config.ArticleRepository;
import com.elasticsearch.elasticsearch.demo.model.Article;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

/**
 * @author Emre Dinç
 */
@Service
@RequiredArgsConstructor
public class ElasticService {
    private final ArticleRepository articleRepository;

    public Page<Article> findByAuthorsName(String name, Pageable pageable){
        return articleRepository.findByAuthorsNameUsingCustomQuery(name, pageable);
    }

    public Iterable<Article> findAll() {
        return articleRepository.findAll();
    }
}
