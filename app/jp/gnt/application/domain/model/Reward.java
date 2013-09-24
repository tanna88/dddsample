package jp.gnt.application.domain.model;

import java.io.Serializable;

public class Reward implements Serializable {
	private static final long serialVersionUID = 143314524584650601L;
	
	public int id;		
	public int probability;
	public boolean check = false;
	public int num;
}
