package ch.hslu.lotto

class Main {

	static main(args) {
		def list = [new LottoTip()]*10;

		list.each {tip ->
			tip.generate()
			tip.println()
		}
	}
}
