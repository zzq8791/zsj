/*package com.example.demo;

import java.util.Date;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.bean.Article;
import com.example.demo.rep.ArticleRep;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	ArticleRep articleRep;
	
	@Test
	void contextLoads() {
		Article article = new Article();
		article.setArticleName("zzq");
		article.setCreatetime(new Date());
		article.setId(1);
		articleRep.save(article);
	}

}
*/