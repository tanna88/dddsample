package jp.gnt.domain.scenario.admin.model;

import com.google.code.morphia.annotations.Entity;

import play.db.jpa.Blob;
import play.db.jpa.Model;

@Entity(noClassnameStored = true)
public class Enemy extends Model {
	private static final long serialVersionUID = 943314520584650601L;

	private String name;
	private String description;
	private String image;

	private Blob upimage;
	
	private String image2;

	private Blob upimage2;
	
	private String image3;

	private Blob upimage3;
	
	private String image4;

	private Blob upimage4;
	
	private String image5;

	private Blob upimage5;
	
	private String image6;

	private Blob upimage6;
	
	private String image7;

	private Blob upimage7;
	
	private String image8;

	private Blob upimage8;
	
	private String image9;

	private Blob upimage9;
	
	private String image10;

	private Blob upimage10;
}
