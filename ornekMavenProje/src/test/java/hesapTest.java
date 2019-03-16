import org.junit.*;

import ornekMavenProje.hesap;

import static org.junit.Assert.*;
public class hesapTest {
   //@org.junit.Test
	@Test
	
public void testTopla() {
	hesap h=new hesap();
	int sonuc =h.topla(345, 453);
	assertEquals(798,sonuc);
	
}
	
	public void testFaktoriyel() {
		hesap h=new hesap();
		int sonuc =h.faktoriyel(10);
		assertEquals(3628801,sonuc);
		
	}
}
