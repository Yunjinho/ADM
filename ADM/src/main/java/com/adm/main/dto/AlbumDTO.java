package com.adm.main.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@Entity
@Setter
@Getter
@NoArgsConstructor
@Table(name="album")
public class AlbumDTO {
	@Id
	int albumid;
	int gatherid;
	String img;
	
	@Builder
	public AlbumDTO(int albumid, int gatherid, String img) {
		this.albumid = albumid;
		this.gatherid = gatherid;
		this.img = img;
	}

}
