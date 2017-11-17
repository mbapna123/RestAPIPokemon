package com.concretepage.service;

import java.util.List;

import com.concretepage.entity.Article;

public interface IArticleService {
     List<Article> getAllArticles();
     List<Article> getArticlesPoke(String pokemone);
     Article getArticleById(int id);
     boolean addArticle(Article article);
     void updateArticle(Article article);
     void deleteArticle(int id);
}
