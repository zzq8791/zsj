package com.example.demo.bean;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.elasticsearch.annotations.Document;

//@Document(indexName="articleIndex",indexStoreType="fs",type="article")
public class Article implements Serializable{

	private int id;
	private String articleName;
	private Date createtime;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getArticleName() {
		return articleName;
	}
	public void setArticleName(String articleName) {
		this.articleName = articleName;
	}
	public Date getCreatetime() {
		return createtime;
	}
	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}
	@Override
	public String toString() {
		return "Article [id=" + id + ", articleName=" + articleName + ", createtime=" + createtime + "]";
	}
	
	
}
