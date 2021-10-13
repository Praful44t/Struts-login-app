package com.example.Action;

import com.example.bean.User;
import com.example.dao.UserDAO;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport{

	private static final long serialVersionUID = -7846336228868064793L;
	private User user;
	private UserDAO userDao;
	

	@Override
	public String execute() throws Exception {
		userDao = new UserDAO();
		user = userDao.searchUser(user.getMailid(),user.getPassword());
		boolean result = userDao.validateUser(user.getMailid(),user.getPassword());
		
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
