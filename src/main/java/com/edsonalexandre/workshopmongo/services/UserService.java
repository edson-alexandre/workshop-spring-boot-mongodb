package com.edsonalexandre.workshopmongo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edsonalexandre.workshopmongo.domain.User;
import com.edsonalexandre.workshopmongo.dto.UserDTO;
import com.edsonalexandre.workshopmongo.repository.UserRepository;
import com.edsonalexandre.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class UserService {

	@Autowired
	private UserRepository repo;
	
	public List<User> findAll() {
		return repo.findAll();
	}
	
	public User findById(String id) {
		Optional<User> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado!"));
	}
	
	public User insert(User obj) {
		return repo.insert(obj);
	}
	
	public User fromDto(UserDTO userDto) {		
		return new User(userDto.getId(), userDto.getName(), userDto.getEmail());
	}
}
