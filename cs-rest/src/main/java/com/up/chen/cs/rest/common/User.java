package com.up.chen.cs.rest.common;

import java.io.Serializable;

public class User {

    private static final long serialVersionUID = 1L;

	private Long id;
	private String userName;


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}


	@Override
	public String toString() {
		return "User{" +
			"id=" + id +
			", userName=" + userName +
			"}";
	}
}
