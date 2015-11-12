package com.vquochuy.dao;

import java.util.List;

import com.vquochuy.model.Music;

public interface MusicDAO {
	public Music getMusicById(int id);

	public List<Music> getMusicAll();

	public void save(Music music);
	
	public void update(Music music);

	public void delete(int id);
}
