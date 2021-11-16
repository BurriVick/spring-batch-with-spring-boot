package com.coder.springbatchwithspringboot.writer;

import java.io.Serializable;
import java.util.List;

import javax.batch.api.chunk.ItemWriter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coder.springbatchwithspringboot.entity.User;
import com.coder.springbatchwithspringboot.repository.UserRepository;

@Component
public class DBWriter implements ItemWriter {

	@Autowired
	private UserRepository repo;

	@Override
	public void open(Serializable checkpoint) throws Exception {

	}

	@Override
	public void close() throws Exception {

	}

	@Override
	@SuppressWarnings("unchecked")
	public void writeItems(List<Object> items) throws Exception {
		List<User> users = (List<User>) (List<?>) items;
		repo.saveAll(users);
	}

	@Override
	public Serializable checkpointInfo() throws Exception {
		return null;
	}

}
