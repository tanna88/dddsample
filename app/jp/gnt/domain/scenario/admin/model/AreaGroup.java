package jp.gnt.domain.scenario.admin.model;

import java.util.List;

import com.google.code.morphia.annotations.Entity;

import play.db.jpa.Blob;
import play.db.jpa.Model;

@Entity(noClassnameStored = true)
public class AreaGroup extends Model {
	
	private static final long serialVersionUID = 943314520584650602L;

	private String name;
	
	private String description;
	
	private String descriptionAfterClear;
	
	private String image;
	
	private Blob upimage;
	
	private AreaGroup nextGroup;
	
	private List<Area> areaList;
}
