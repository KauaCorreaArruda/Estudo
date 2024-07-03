package Entity;

public class Product {

	public String name;
	public double price;
	public int quantity;
	
	public double totalValueInStock() {
		
		return price * quantity;
		
	}
	
	public void AddProducts(int quantity) {
		
		this.quantity += quantity; 
		//O comando this, deixa explícito que refere-se ao atributo da classe, e não ao parâmetro recebido
		
	}
	
	public void removeProducts(int quantity) {
		
		this.quantity -= quantity;
		
	}
	
}
