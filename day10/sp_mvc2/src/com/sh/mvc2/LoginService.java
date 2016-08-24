package com.sh.mvc2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {
	@Autowired
	private LoginDao loginDao;
	public boolean validate(LoginModel lmFromUser) {
		LoginModel lmFromDb = loginDao.findLogin(lmFromUser.getUsername());
		if(lmFromDb!=null && lmFromUser.getPassword().equals(lmFromDb.getPassword()))
			return true;
		return false;
	}
}
