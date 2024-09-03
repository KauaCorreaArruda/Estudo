package entities;

public class SavingsAccount extends Account{

	private Double interestRate;
	
	public SavingsAccount() {	
		super();
	}

	public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
	
	public void updateBalance() {
		balance += balance * interestRate;
	}
	
	//O uso da anotacao override, é importante, pois identifca que é um método sobrescrito de outra classe
	@Override
	public void withdraw(double amount) {
		balance -= amount;
	}
	
}