package zad3;

class ReversibleDouble extends Reversible {
	double numer;

	ReversibleDouble(double numer) {
		this.numer = numer;
	}

	public Reversible reverse() {
		double nowy = 1 / numer;
		numer = nowy;
		return new ReversibleDouble(numer);

	}

	public String toString() {
		return Double.toString(numer);
	}

}