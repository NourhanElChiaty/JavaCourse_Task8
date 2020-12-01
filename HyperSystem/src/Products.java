
public abstract class Products {
	protected String productName;
    protected double productPrice;
    protected Vegetables [] vegetables;
    protected Clothes [] clothes;
    protected Electronics [] electronics;
    public abstract double calculatePrice();
    
    public abstract String printSpecification();

	public Products() {
		super();
	}

	/*public Products(String productName, double productPrice, Products[] products) {
		super();
		this.productName = productName;
		this.productPrice = productPrice;
		this.products = products;
	}*/
	public Products(String productName, double productPrice) {
		super();
		this.productName = productName;
		this.productPrice = productPrice;
		
	}
	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

/*	public Products[] getProducts() {
		return products;
	}
	*/
	public void setProducts(Vegetables [] vegetables) {
		this.vegetables = vegetables;
	}
	public void setProducts(Clothes [] clothes) {
		this.clothes = clothes;
	}
	public void setProducts(Electronics [] electronics) {
		this.electronics  =electronics ;
	}
    
	public Products[] mergeProducts(Vegetables [] vegetabeles , Electronics [] electronics , Clothes [] clothes) {
		
		Products [] products = new Products[vegetabeles.length+electronics.length+clothes.length];
		int i;
		for(i=0;i<vegetabeles.length;i++) 
			products[i]=vegetabeles[i];
			
		
		for(int j=0;j<electronics.length;j++) 
		products[i++]=electronics[j];
		
		for(int z=0;z<clothes.length;z++) 
			products[i++]=clothes[z];
		
		return products;
	}
	
}
