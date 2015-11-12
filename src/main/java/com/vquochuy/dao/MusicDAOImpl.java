package com.vquochuy.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.vquochuy.model.Music;
import com.vquochuy.repo.MusicRepository;
@Repository
public class MusicDAOImpl implements MusicDAO {
	@Autowired
	private MusicRepository repo;
	
	@Override
	public Music getMusicById(int id) {
		return repo.findOne(id);
	}

	@Override
	public List<Music> getMusicAll() {
		return (List<Music>) repo.findAll();
	}

	@Override
	public void save(Music music) {
		repo.save(music);
	}

	@Override
	public void update(Music music) {
		repo.save(music);
	}

	@Override
	public void delete(int id) {
		repo.delete(id);
	}

}
