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
	@Override
	public Article getArticleById(int id) {
		return entityManager.find(Article.class, id);
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<Article> getAllArticles() {
		String hql = "FROM pokedata as atcl ORDER BY atcl.id";
		return (List<Article>) entityManager.createQuery(hql).getResultList();
	}	
	@Override
	public void addArticle(Article article) {
		entityManager.persist(article);
	}
	@Override
	public void updateArticle(Article article) {
		Article artcl = getArticleById(article.getId());
		artcl.setPokemon(article.getPokemon());
		artcl.setHeight(article.getHeight());
		entityManager.flush();
	}
	@Override
	public void deleteArticle(int id) {
		entityManager.remove(getArticleById(id));
	}
	@Override
	public boolean articleExists(String pokemon, String imagelink) {
		String hql = "FROM Article as atcl WHERE atcl.title = ? and atcl.category = ?";
		int count = entityManager.createQuery(hql).setParameter(0, pokemon)
		              .setParameter(1, imagelink).getResultList().size();
		return count > 0 ? true : false;
	}
}
