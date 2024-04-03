package fr.emse.test;

public class Money implements IMoney {
	private int fAmount;
	private String fCurrency;

	public Money(int amount, String currency) {
		fAmount = amount;
		fCurrency = currency;
	}
	public int amount () {
		return fAmount;
	}
	public String currency () {
		return fCurrency;
	}
	@Override
	public IMoney add (IMoney m) {
		return m.addMoney (this);
		
	}
	@Override
	public IMoney addMoney (Money money) {
		if (money.currency().equals(currency()))
			return new Money(amount()+ money.amount(), currency());
		return new MoneyBag (this, money);
		
	}
	@Override
	public IMoney addMoneyBag (MoneyBag mb) {
		return mb.addMoney (this);
		
	}
	
	public Money add(Money m) {
		if (m.currency().equals(currency()))
			return new Money(amount() + m.amount(), currency());
			return new MoneyBag(this, m);
	}
	public boolean equals (Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		Money other =(Money) obj;
		return fAmount == other.fAmount && fCurrency.equals(other.fCurrency);
	}
	@Override
	public IMoney addMoney(IMoney m) {
		// TODO Auto-generated method stub
		return null;
	}
}
