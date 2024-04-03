package fr.emse.test;

import java.util.Vector;

public class MoneyBag implements IMoney {
	private Vector<IMoney> fMonies = new Vector<>();
	MoneyBag(Money m1, Money m2) {
	appendMoney(m1);
	appendMoney(m2);
	}
	MoneyBag(Money bag[]) {
	for (int i = 0; i < bag.length; i++)
	appendMoney(bag[i]);
	}
	private void appendMoney(IMoney m) {
	if (fMonies.isEmpty()) {
	fMonies.add(m);
	} else {
	int i = 0;
	while ((i < fMonies.size())
	&& (!(fMonies.get(i).currency().equals(m.currency()))))
	i++;
	if (i >= fMonies.size()) {
	fMonies.add(m);
	} else {
	/*fMonies.set(i, new Money(fMonies.get(i).amount() +
			m.amount(),
			m.currency()));*/
		IMoney existingMoney = fMonies.get(i);
		fMonies.set(i, existingMoney.add(m));
		
	}
	}
	}
	@Override
	public IMoney add (IMoney m) {
		return m.addMoneyBag(this);
		
	}
	public boolean equals (Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		MoneyBag other =(MoneyBag) obj;
		if (fMonies.size ()!=other.fMonies.size())
			return false;
		for (int i=0;i<fMonies.size();i++) {
			if (!fMonies.contains(other.fMonies.get(i)))
				return false;
		}
		return true;
	}
	@Override
	public IMoney addMoney(IMoney m) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public IMoney addMoneyBag(MoneyBag mb) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String currency() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public IMoney addMoney(Money money) {
		// TODO Auto-generated method stub
		return null;
	}

}
