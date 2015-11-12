package com.vquochuy.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.vquochuy.dao.MusicDAO;
import com.vquochuy.model.Music;

@Service
public class MusicServiceImpl implements MusicService {

	MusicDAO musicDAO;
	
	public MusicDAO getMusicDAO() {
		return musicDAO;
	}

	public void setMusicDAO(MusicDAO musicDAO) {
		this.musicDAO = musicDAO;
	}

	@Override
	public Music getMusicById(int id) {
		return musicDAO.getMusicById(id);
	}

	@Override
	public List<Music> getMusicAll() {
		return musicDAO.getMusicAll();
	}

	@Override
	public void save(Music music) {
		musicDAO.save(music);
		
	}

	@Override
	public void update(Music music) {
		musicDAO.update(music);
		
	}

	@Override
	public void delete(int id) {
		musicDAO.delete(id);
	}

}
