package com.example.minibank.domain.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.minibank.domain.model.UserModel;
import com.example.minibank.domain.repository.UserRepository;
import com.example.minibank.domain.service.UserService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService{
	
	private final UserRepository userRepository;

	@Override
	public List<UserModel> getAll() {
		// TODO 自動生成されたメソッド・スタブ
		return userRepository.findAll();
	}

	@Override
	public UserModel getUyById(int userId) {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	
	
}
