package com.adm.main.album;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.adm.main.dto.AlbumDTO;
import com.adm.main.repository.AlbumRepository;

@SpringBootTest
public class AlbumTest {
	@Autowired
	AlbumRepository ar;
	
	@Test
	void contextLoads() {
		AlbumDTO album = new AlbumDTO().builder()
				.albumid(100)
				.gatherid(1)
				.img("a.jpg")
				.build();
		
		ar.save(album);
	}
	
	@Test
	void findAll() {
		List<AlbumDTO> album = ar.findAll();
	}
	
//	@Test
//	void delete() {
//		AlbumDTO album = ar.findById((int)1).get();
//		ar.delete(album);
//	}

}
