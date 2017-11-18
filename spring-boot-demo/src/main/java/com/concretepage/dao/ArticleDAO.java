package com.concretepage.dao;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.concretepage.entity.Article;
@Transactional
@Repository
public class ArticleDAO implements IArticleDAO {
	@PersistenceContext	
	private EntityManager entityManager;	
	@SuppressWarnings("unchecked")
	@Override
	public List<Article> getAllArticles() {
		String hql = "FROM Article as atcl ORDER BY atcl.id";
		return (List<Article>) entityManager.createQuery(hql,Article.class).getResultList();
	}	
	@Override
	public List<Article> getArticlesPoke(String pokemone) {
		char ch='"';
		String hql = "FROM Article as atcl WHERE atcl.pokemon=" +"'"+pokemone+"'";
		return (List<Article>) entityManager.createQuery(hql).getResultList();
	}	
}
