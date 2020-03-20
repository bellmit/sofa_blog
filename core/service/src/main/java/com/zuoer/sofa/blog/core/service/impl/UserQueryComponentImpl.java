/**
 * BenchCode.com Inc.
 * Copyright (c) 2005-2009 All Rights Reserved.
 */
package com.zuoer.sofa.blog.core.service.impl;

import com.zuoer.sofa.blog.core.model.User;
import com.zuoer.sofa.blog.core.service.UserQueryComponent;
import com.zuoer.sofa.blog.core.service.converter.UserConverter;
import com.zuoer.sofa.blog.dal.dao.UserBaseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 
 * @author zuoer
 *
 * @version $Id: UserQueryComponentImpl.java, v 0.1 2019年12月6日 下午3:21:01 zuoer Exp $
 */
@Component
public class UserQueryComponentImpl implements UserQueryComponent {
	
	@Autowired
	private UserBaseMapper userBaseMapper;
	
	@Autowired
	private UserConverter userConverter;

	/* (non-Javadoc)
	 * @see com.zuoer.sofa.blog.core.service.UserQueryComponent#getAll()
	 */
	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return userConverter.convertMany(userBaseMapper.selectAll());
	}

	/* (non-Javadoc)
	 * @see com.zuoer.sofa.blog.core.service.UserQueryComponent#getByUserName(java.lang.String)
	 */
	@Override
	public User getByUserName(String userName) {
		// TODO Auto-generated method stub
		return userConverter.convertOne(userBaseMapper.selectByUserName(userName));
	}

}
