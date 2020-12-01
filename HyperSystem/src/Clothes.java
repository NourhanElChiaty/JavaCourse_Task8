
public class Clothes extends Products{
    public String size;
    public String color;
    public Clothes [] clothes;
    
    public double clothesPrice(String size) {
    	
    	if(size.toLowerCase()=="xxl"|| size.toLowerCase()=="xxxl") 
    	{
			productPrice=productPrice*1.4;
		}
		return productPrice;
    }
    
	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public Clothes() {
		super();
	}

	public String getColor() {
		return color;
	}

	

	public Clothes(String size, String color , double productPrice,String productName) {
		super();
		this.size = size;
		this.color = color;
		this.productName= productName;
		this.productPrice= productPrice;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Clothes[] getClothes() {
		return clothes;
	}

	public void setClothes(Clothes[] clothes) {
		this.clothes = clothes;
	}

	@Override
	public double calculatePrice() {
		// TODO Auto-generated method stub
		return 0;
	}
	public double calculatePrice(String size) {
		
		if(size.toLowerCase()=="xxl"|| size.toLowerCase()=="xxxl") 
    	{
			productPrice=productPrice*1.4;
		}
		return productPrice;
	}
	String result ="";
	@Override
	public String printSpecification() {
		// TODO Auto-generated method stub
		result+="Product: "+productName+" ";
		result+="Price: "+productPrice+" "; 
		result+="Size: "+size+" ";
		result+="Color: "+color+" ";
		
		return result;
	}
	public String printSpecification(Clothes [] clothes) {
		// TODO Auto-generated method stub
		for(int i=0;i<2;i++) {
			
		result+="Clothes\n"+"Product: "+clothes[i].productName+" ";
		result+="Price: "+clothes[i].calculatePrice(clothes[i].size)+" "; 
		result+="Size: "+clothes[i].size+" ";
		result+="Color: "+clothes[i].color+" ";
		}
		return result;
	}

}
