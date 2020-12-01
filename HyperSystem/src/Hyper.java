import java.util.Date;

import javax.swing.JOptionPane;

public class Hyper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//JOptionPane option = new JOptionPane();
		Vegetables vegetable = new Vegetables();
		Electronics electronic = new Electronics();
		Clothes cloth = new Clothes();
		
		
	    //  Products [] products = new Products[3];
	      Vegetables [] vegetables = new Vegetables[2];
	      Electronics [] electronics = new Electronics[2];
	      Clothes [] clothes = new Clothes [2];
	      while(JOptionPane.OPTIONS_PROPERTY!=null) {   
        String selection =JOptionPane.showInputDialog(null, "Welcome Please Select: \n  (+) to add product "
        		+ "\n  (-) to remove product \n  (#) to show all product");
        
       
        	
        if(selection.equals("+")) {
        	String productType = JOptionPane.showInputDialog(null,"1-Vegetables     2-Electronic Product    3-ClothProduct");
        	//for(int j=0 ; j<3;j++) {
        
        		
        	if(productType.equals("1")) {
        		for(int i=0;i<2;i++) {
        		String productName = JOptionPane.showInputDialog(null,"Please Enter Vegetable Name");
        		
        		String price= JOptionPane.showInputDialog(null,"Please Enter Vegetable Price");
        		double vegetablePrice=Double.parseDouble(price);
        		String vegetableAmount =JOptionPane.showInputDialog(null,"Please Enter Vegetable amount");
        		int productamount = Integer.parseInt(vegetableAmount);
        		
        		String expiryDate =JOptionPane.showInputDialog(null,"Please Enter Vegetable Expiry Date");
        		
        		Vegetables vege	 = new Vegetables(productName,expiryDate,productamount,vegetablePrice );
        		
        		vegetables[i]=vege;
        	
        	}
        	}
        	
        	
        	 else if (productType.equals("2")) {
        		 
        		 for(int z=0;z<2;z++) {
        		String productName = JOptionPane.showInputDialog(null,"Please Enter Electronic Name");
        		
        		String price= JOptionPane.showInputDialog(null,"Please Enter Electronic Price");
        		
        		double electronicPrice=Double.parseDouble(price);
        		
        		String electronicType = JOptionPane.showInputDialog(null,"Please Enter Electronic Type");
        		
        		String electronicBrand = JOptionPane.showInputDialog(null,"Please Enter Electronic Brand");
        		
        		Electronics electric = new Electronics(electronicType, electronicBrand, productName, electronicPrice);
        		
        		electronics[z]=electric;
        		
        		 }
        		
        	}
        	 else if (productType.equals("3")) {
        		 
        		 for(int j=0;j<2;j++) {
        		 String productName = JOptionPane.showInputDialog(null,"Please Enter Clothes Name");
         		
         		String price= JOptionPane.showInputDialog(null,"Please Enter Clothes Price");
         		double clothPrice=Double.parseDouble(price);
         		String size=JOptionPane.showInputDialog(null,"Please Enter Clothes size");
         		String color =JOptionPane.showInputDialog(null,"Please Enter Clothes color");
         		
         		Clothes clo = new Clothes(size,color,clothPrice,productName);
         		 clothes[j]=clo;
        		 }
        	 }
        	 else {
        		 JOptionPane.showMessageDialog(null, "Please enter a valid option");
        	 }
        	
        	 
        	
        //	}
        	
        	
        	
        	}
        	
        	
        	 
        	
        
        else if(selection.equals("-")) {
        	vegetable.setProducts(vegetables);
        	vegetable.removeVegetable(vegetables);
        		}
        		
        		
        	
        	
        
        else if(selection.contentEquals("#")) {
        	
        	vegetable.setProducts(vegetables);
        	
        	JOptionPane.showMessageDialog(null, vegetable.printSpecification(vegetables));
        	
        	electronic.setProducts(electronics);
        	JOptionPane.showMessageDialog(null, electronic.printSpecification(electronics));
        	
        	cloth.setClothes(clothes);
        	JOptionPane.showMessageDialog(null, cloth.printSpecification(clothes));
        	
        }
}
	}



}

