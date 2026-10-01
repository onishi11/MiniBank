package com.example.minibank.domain.service;

import java.util.List;

import com.example.minibank.domain.model.UserModel;

public interface UserService {

	public List<UserModel> getAll();

	public UserModel getUyById(int userId);

}
