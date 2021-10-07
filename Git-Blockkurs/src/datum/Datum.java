package datum;

public class Datum {
	public static final int[] MONATSLAENGEN = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	private int tag;
	private int monat;
	private int jahr;

	public Datum(int tag, int monat, int jahr) {
		// wirft im Fehlerfall eine Ausnahme (siehe Hinweise unten)
		if (jahr <= 2100 && jahr >= 1800) {
			if (this.tag <= getMonatslaenge(monat, jahr)) {
				this.tag = tag;
				this.monat = monat;
				this.jahr = jahr;
			} else {
				throw new InvalidDateException("Bitte wählen Sie ein Datum im Wertebereich");
			}
		} else {
			throw new DateOutOfRangeException("Bitte wählen Sie ein Jahr zwischen 1800-2100");
		}

	}

	public static int getMonatslaenge(int monat, int jahr) {
		// gibt Laenge des Monats zurueck, beruecksichtigt Schaltjahre
		if (monat == 2) {
			if (isSchaltjahr(jahr)) {
				return MONATSLAENGEN[monat - 1] + 1;
			} else {
				return MONATSLAENGEN[monat - 1];
			}
		} else {
			return MONATSLAENGEN[monat - 1];
		}

	}

	public static boolean isSchaltjahr(int jahr) {
		// gibt true zurueck, wenn das uebergebene Jahr ein Schaltjahr
		// ist, ansonsten false (siehe Hinweise unten)
		boolean erg;
		if (jahr % 4 == 0) {
			if (jahr % 100 == 0) {
				if (jahr % 400 == 0) {
					erg = true;
				} else {
					erg = false;
				}

			} else {
				erg = true;
			}
		} else {
			erg = false;
		}
		return erg;

	}

	public boolean equals(Datum a) {
		// ueberprueft, ob this und a das gleiche Datum darstellen
		if (isGleicherTag(a) && this.jahr == a.jahr) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isGleicherTag(Datum a) {
		// ueberprueft, ob Tag und Monat gleich sind
		// (ohne Beruecksichtigung des Jahres)
		if (this.tag == a.tag && this.monat == a.monat) {
			return true;
		} else {
			return false;
		}

	}

	public String toString() {
		// gibt eine passende String-Darstellung des Datums zurueck
		return "" + this.tag + ". " + this.monat + ". " + this.jahr;

	}

	public Datum morgen() {
		// gibt das Datum von this + 1 Tag zurueck
		Datum erg;
		if (this.tag < getMonatslaenge(this.monat, this.jahr)) {
			this.tag = this.tag + 1;
		} else {
			if (this.monat < 12) {
				this.monat = this.monat + 1;
			} else {
				this.jahr = this.jahr + 1;
				this.monat = 1;
			}
			this.tag = 1;
		}
		erg = new Datum(this.tag, this.monat, this.jahr);
		return erg;
	}

	public Datum gestern() {
		// gibt das Datum von this - 1 Tag zurueck
		Datum erg;
		if (this.tag == 1) {
			if (this.monat == 1) {
				this.jahr = this.jahr - 1;
				this.monat = 12;
				this.tag = getMonatslaenge(this.monat, this.jahr);
			} else {
				this.monat = this.monat - 1;
				this.tag = getMonatslaenge(this.monat, this.jahr);
			}
		} else {
			this.tag = this.tag - 1;
		}
		erg = new Datum(this.tag, this.monat, this.jahr);
		return erg;
	}
}