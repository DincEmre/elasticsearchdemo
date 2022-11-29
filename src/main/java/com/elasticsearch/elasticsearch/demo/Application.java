package com.elasticsearch.elasticsearch.demo;

import com.elasticsearch.elasticsearch.demo.config.ArticleRepository;
import com.elasticsearch.elasticsearch.demo.model.Article;
import com.elasticsearch.elasticsearch.demo.model.Author;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class Application implements CommandLineRunner {

	@Autowired
	private ArticleRepository articleRepository;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Article article = new Article("Spring Data Elasticsearch");
		article.setAuthors(Arrays.asList(new Author("John Smith"), new Author("John Doe")));
		articleRepository.save(article);
	}
}
