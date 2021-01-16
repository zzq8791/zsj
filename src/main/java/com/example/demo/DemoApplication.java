package com.example.demo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.bean.Article;


@SpringBootApplication
public class DemoApplication implements InitializingBean{

	
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void afterPropertiesSet() throws Exception {
//		Article article = new Article();
//		article.setArticleName("zzq");
//		article.setCreatetime(new Date());
//		article.setId(1);
//		articleRep.save(article);
		List<Article> list = new ArrayList<>();
		while(true){
			Article article = new Article();
			list.add(article);
		}
	}

}
