import java.util.Date;

import javax.swing.JOptionPane;

public class Vegetables extends Products {

	public String expiryDate;
	public int amount;
	public Vegetables [] vegetables;
	
	
	public Vegetables(String productName ,String expiryDate, int amount, double productPrice) {
		super();
		this.productName = productName;
		this.expiryDate = expiryDate;
		this.amount = amount;
		this.productPrice =productPrice;
	}
	public String getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	@Override
	public double calculatePrice() {
		return amount * productPrice;
	}
	
	String result ="";
	public Vegetables() {
		super();
	}
	@Override
	public String printSpecification() {
		// TODO Auto-generated method stub
		result+="Product: "+getProductName()+" ";
		result+=" Price: "+productPrice+" ";
		result+=" Amount: "+getAmount()+" ";
		result+=" Expiry Date: "+getExpiryDate()+" ";
		return result;
	}
	
	public String printSpecification(Vegetables []vege) {
		// TODO Auto-generated method stub
		
	
		for(int i=0;i<2;i++) {
			
		result+="Vegetable\n"+"Product: "+vege[i].getProductName()+" ";
		result+=" Price: "+vege[i].calculatePrice()+" ";
		result+=" Amount: "+vege[i].getAmount()+" ";
		result+=" Expiry Date: "+vege[i].getExpiryDate()+" \n";
		}
		
		return result;
		
		
	}
	
	public Vegetables [] removeVegetable(Vegetables[] vegetables) {
		
		for(int i=0;i<vegetables.length-1;i++) {
		this.vegetables[i]=vegetables[i];
		}
		return this.vegetables;
		
	}

}
