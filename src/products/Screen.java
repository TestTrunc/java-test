package products;

public abstract class Screen {
	
	private int id;
	private String name;
	private double price;
	private String description;
	private float displaySize;

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public float getDisplaySize() {
		return displaySize;
	}

	public void setDisplaySize(float displaySize) {
		this.displaySize = displaySize;
	}


}
