package pizza;

public class pizzamain {
		// TODO Auto-generated method stub
	
	private int itemid;
	private int billid;
	private String category;
	private String type;
	private String size;
	
	pizzamain(int itemid,int billid,String category,String type,String size){
		this.itemid=itemid;
		this.billid=billid;
		this.category=category;
		this.type=type;
		this.size=size;
		
	}

	public int getItemid() {
		return itemid;
	}

	public void setItemid(int itemid) {
		this.itemid = itemid;
	}
    public int getBillid() {
    	return billid;
    }
    
	public String getCategory() {
		 return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}
	
	public boolean validateCategory() {
		if(category.equalsIgnoreCase("veg")||category.equalsIgnoreCase("nonveg"))
		{
			return true;
		}
		else {
			return false;
		}
	}
		
	
	public boolean validatesize() {
		if(size.equalsIgnoreCase("small")||size.equalsIgnoreCase("medium")||size.equalsIgnoreCase("large"))
		{
			return true;
		}
		else {
			return false;
		}
	}
	

}

