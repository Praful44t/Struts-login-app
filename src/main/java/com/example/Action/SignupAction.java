package com.example.Action;

import com.example.bean.User;
import com.example.dao.UserDAO;
import com.opensymphony.xwork2.ActionSupport;

public class SignupAction extends ActionSupport{

	private static final long serialVersionUID = -6854295689965894930L;
	private User user;
	private UserDAO userDao;
	
	@Override
	public String execute() throws Exception {
		
		userDao = new UserDAO();
		
		boolean result = userDao.addUser(user);
		if (result)
			return SUCCESS;
		else
			return ERROR;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	
	
}
