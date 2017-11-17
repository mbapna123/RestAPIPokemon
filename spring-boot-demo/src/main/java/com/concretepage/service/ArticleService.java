package com.concretepage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.concretepage.dao.IArticleDAO;
import com.concretepage.entity.Article;
@Service
public class ArticleService implements IArticleService {
	@Autowired
	private IArticleDAO articleDAO;
	@Override
	public Article getArticleById(int id) {
		Article obj = articleDAO.getArticleById(id);
		return obj;
	}	
	@Override
	public List<Article> getAllArticles(){
		return articleDAO.getAllArticles();
	}
	@Override
	public List<Article> getArticlesPoke(String pokemone){
		return articleDAO.getArticlesPoke(pokemone);
	}
	@Override
	public synchronized boolean addArticle(Article article){
       if (articleDAO.articleExists(article.getPokemon(), article.getImagelink())) {
    	   return false;
       } else {
    	   articleDAO.addArticle(article);
    	   return true;
       }
	}
	@Override
	public void updateArticle(Article article) {
		articleDAO.updateArticle(article);
	}
	@Override
	public void deleteArticle(int id) {
		articleDAO.deleteArticle(id);
	}
}
