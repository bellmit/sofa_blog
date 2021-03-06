/**
 * BenchCode.com Inc.
 * Copyright (c) 2005-2009 All Rights Reserved.
 */
package com.zuoer.sofa.blog.core.service;

import com.zuoer.sofa.blog.core.model.Article;
import com.zuoer.sofa.blog.facade.api.request.ArticleSearchRequest;

import java.util.List;

/**
 * 文章查询组件
 * @author zuoer
 *
 * @version $Id: ArticleQueryComponent.java, v 0.1 2019年11月28日 下午5:47:02 zuoer Exp $
 */
public interface ArticleQueryComponent {

	/**
	 * 根据id查询
	 * @param id
	 * @return
	 */
	public Article getById(long id);
	
	/**
	 * 查询全部
	 * @return
	 */
	public List<Article> getAll();
	
	/**
	 * 搜索
	 * @return
	 */
	public List<Article> search(ArticleSearchRequest request);
	
	/**
	 * 根据tagId查询
	 * @param tagId
	 * @return
	 */
	public List<Article> getByTagId(int tagId);
}
