package com.example.Action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.ServletRequestAware;

import com.example.bean.User;
import com.example.dao.UserDAO;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class LoginAction extends ActionSupport implements ServletRequestAware,ModelDriven<User>{

	private static final long serialVersionUID = -7846336228868064793L;
	private User user = new User();
	private UserDAO userDao = new UserDAO();
	

	@Override
	public String execute() throws Exception {
		
		boolean result = userDao.validateUser(user.getMailid(),user.getPassword());
		
		if (result)
			return SUCCESS;
		else
			return ERROR;
	}


	@Override
	public User getModel() {
		return user;
	}


	@Override
	public void setServletRequest(HttpServletRequest request) {
		// TODO Auto-generated method stub
		
	}

	

	
	
}
