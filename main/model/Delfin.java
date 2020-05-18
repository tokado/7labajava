package model;

public class Delfin {
	private String name;
	private String color;
	private Integer id;
	
	 public Delfin() {
		  
	  }
	public Delfin(String name, String color) {
		super();
		this.name = name;
		this.color = color;

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
