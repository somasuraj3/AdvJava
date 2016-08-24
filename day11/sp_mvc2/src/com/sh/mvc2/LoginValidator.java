package com.sh.mvc2;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
public class LoginValidator implements Validator {
	@Override
	public boolean supports(Class<?> cls) {
		return Login.class.equals(cls) || LoginModel.class.equals(cls);
	}

	@Override
	public void validate(Object target, Errors err) {
		if(target instanceof Login) {
			Login login = (Login) target;
			//if(!login.getPassword().equals(login.getConfirmPassword()))
			if(!login.getPassword().equals("confirm"))
				err.rejectValue("password", "Mismatch", "password should match");
		} else if(target instanceof LoginModel) {
			//...
		}
	}
}
