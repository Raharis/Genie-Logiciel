package fr.emse.test;

public interface IMoney {
 IMoney add(IMoney aMoney);
	IMoney addMoney(IMoney m);
	IMoney addMoneyBag(MoneyBag mb);
	String currency();
	IMoney addMoney(Money money);
}
