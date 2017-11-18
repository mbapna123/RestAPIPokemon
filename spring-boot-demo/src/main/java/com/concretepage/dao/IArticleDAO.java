package com.concretepage.dao;
import java.util.List;
import com.concretepage.entity.Article;
public interface IArticleDAO {
    List<Article> getAllArticles();
    List<Article> getArticlesPoke(String pokemone);
}
 