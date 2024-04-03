package fr.emse.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MoneyTest {
	private Money m12CHF;
	private Money m14CHF;
	private Money f12CHF;
	private Money f7USD;
	
	@Before
	public void  setUp () {
		Money m12CHF= new Money(12, "CHF");
		Money m14CHF = new Money(14,"CHF");
	}

	@Test
	public void testSimpleAdd() {
		Money m12CHF= new Money(12, "CHF");
		Money m14CHF = new Money(14,"CHF");
		Money expected = new Money (26, "CHF");
		Money result = m12CHF.add(m14CHF);
		assertTrue(expected.equals(result));
	}
	@Test
	public void testEquals() {
	Money m12CHF= new Money(12, "CHF");
	Money m14CHF= new Money(14, "CHF");
	assertTrue(!m12CHF.equals(null));
	assertEquals(m12CHF, m12CHF);
	assertEquals(m12CHF, new Money(12, "CHF"));
	assertTrue(!m12CHF.equals(m14CHF));
	}
	@Test
	public void testMixedSimpleAdd() {
	// [12 CHF] + [7 USD] == {[12 CHF][7 USD]}
	Money bag[] = { f12CHF, f7USD };
	MoneyBag expected = new MoneyBag(bag);
	assertEquals(expected, f12CHF.add(f7USD));
	}
	
	@Test
	public void testBagSimpleAdd() {
		MoneyBag bag = new MoneyBag(f12CHF, f7USD);
		Money expected = new Money (19, "CHF");
		assertEquals (expected, bag.add(f12CHF));
	}
	@Test
	public void testSimpleBagAdd () {
		MoneyBag bag = new MoneyBag(f12CHF, f7USD);
		Money expected = new Money (26, "USD");
		assertEquals (expected, f7USD.add(bag));	
	}
	
	@Test
	public void testBagAdd () {
		MoneyBag bag1= new MoneyBag(f12CHF, f7USD);
		MoneyBag bag2= new MoneyBag(f12CHF, f7USD);
		MoneyBag expected= new MoneyBag(new Money(24, "CHF"), new Money(14, "USD"));
		assertEquals(expected, bag1.add(bag2));
	}


}
