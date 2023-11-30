package com.p1.trail.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.p1.trail.repository.*;

import com.p1.trail.model.*;

@Service
public class DAO {
	
	@Autowired
	Repository repo;
	public void insert(Work w)
	{
		repo.save(w);
	}
	public List<Work> getAll()
	{
		return repo.findAll();
	}

}
