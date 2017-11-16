package com.concretepage.dao;
import java.util.List;
import com.concretepage.entity.Article;
public interface IArticleDAO {
    List<Article> getAllArticles();
    Article getArticleById(int id);
    void addArticle(Article article);
    void updateArticle(Article article);
    void deleteArticle(int id);
    boolean articleExists(String pokemon, String imagelink);
}
 