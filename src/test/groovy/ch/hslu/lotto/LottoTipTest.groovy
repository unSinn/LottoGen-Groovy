package ch.hslu.lotto

import static org.junit.Assert.*

import org.junit.Test

class LottoTipTest {

	@Test
	public void test() {
		LottoTip tip = new LottoTip()
		tip.generate()
		tip.values.isEmpty()
		assertEquals(6, tip.values.size())
	}
	
	@Test
	public void testGenerateList(){
		def l = LottoTip.generateList(10)
		assert l.size() == 10
		assert l.unique().size() == 10
	}
}
