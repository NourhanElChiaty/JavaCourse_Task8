
public class Electronics extends Products {
     public String type;
     public String brand;
     
	public Electronics(String type, String brand, String productName,Double productPrice) {
		super();
		this.type = type;
		this.brand = brand;
		this.productName = productName;
		this.productPrice= productPrice;
	}
	public Electronics() {
		super();
	}
	@Override
	public double calculatePrice() {
		// TODO Auto-generated method stub
		return productPrice;
	}
    String result="";
	@Override
	public String printSpecification() {
		// TODO Auto-generated method stub
		result+="Product: "+productName+" ";
		result+=" Price: "+productPrice+" ";  	
		result+=" Type: "+type+" ";
		result+=" Brand: "+brand+" ";
		
		return result;
	}
	
	public String printSpecification(Electronics [] electronics) {
		// TODO Auto-generated method stub
		for (int i=0;i<2;i++) {
		
		result+="Electronics"+"Product: "+electronics[i].productName+" ";
		result+=" Price: "+electronics[i].productPrice+" ";  	
		result+=" Type: "+electronics[i].type+" ";
		result+=" Brand: "+electronics[i].brand+" ";
		}
		return result;
	}

}
