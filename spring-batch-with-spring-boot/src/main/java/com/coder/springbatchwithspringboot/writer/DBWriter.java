package com.coder.springbatchwithspringboot.writer;

import java.util.List;

import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coder.springbatchwithspringboot.entity.User;
import com.coder.springbatchwithspringboot.repository.UserRepository;

@Component
public class DBWriter implements ItemWriter<User> {

	@Autowired
	private UserRepository repo;

	@Override
	public void write(List<? extends User> users) throws Exception {
		repo.saveAll(users);
	}
}
