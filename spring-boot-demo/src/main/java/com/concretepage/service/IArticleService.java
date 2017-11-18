package com.concretepage.service;

import java.util.List;

import com.concretepage.entity.Article;

public interface IArticleService {
     List<Article> getAllArticles();
     List<Article> getArticlesPoke(String pokemone);
}
