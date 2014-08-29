package ch.hslu.lotto

class LottoTip {

	def List values = []
	
	def generate(){
		while(values.size() < 6){
			def random = new Random()
			def v = random.nextInt(42)+1
			if(!values.contains(v)){
				values.add(v);
			}
		}
	}

	def println() {
		values.sort().each{v ->
			print String.format("%3d", v)
		}
		print "\n";
	}
}
