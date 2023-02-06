package com.adm.main.album;

import java.util.Optional;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import com.adm.main.dto.AlbumDTO;
import com.adm.main.repository.AlbumRepository;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(false)
public class AlbumUpdate {
	@Autowired
	AlbumRepository ar;
	
	@Test
	void AlbumUpdate() {
		int albumid = 100;
		Optional<AlbumDTO> optionalAlbum = ar.findById(albumid);
		AlbumDTO album = optionalAlbum.get();
		album.setImg("b.jpg");
		ar.save(album);
		
		AlbumDTO updateAlbum = ar.findById(albumid).get();
		Assertions.assertThat(updateAlbum.getImg()).isEqualTo("b.jpg");
	}

}
