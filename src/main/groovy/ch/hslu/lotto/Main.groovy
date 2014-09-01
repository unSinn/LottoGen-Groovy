package ch.hslu.lotto

class Main {

	static main(args) {
		LottoTip.generateList().each{
			tip -> tip.println()
		}
	}
}
