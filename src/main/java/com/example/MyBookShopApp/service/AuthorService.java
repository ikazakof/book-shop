package com.example.MyBookShopApp.service;

import com.example.MyBookShopApp.entity.author.Author;
import com.example.MyBookShopApp.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

@Service
public class AuthorService {

    private AuthorRepository authorRepository;

    @Autowired
    public AuthorService(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public Map<String, List<Author>> getAuthorsMap() {
        return authorRepository.findAll().stream()
                .sorted(Comparator.comparing(Author::getName))
                .collect(Collectors.groupingBy(author -> author.getName().substring(0, 1), TreeMap::new, Collectors.toList()));
    }

}
