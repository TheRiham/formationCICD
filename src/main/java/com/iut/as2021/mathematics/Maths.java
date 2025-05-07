package com.iut.as2021.mathematics;

import com.iut.as2021.exceptions.MathsExceptions;
import com.iut.as2021.interfaces.IMaths;

public class Maths implements IMaths {

	@Override
	public int addition(int a, int b) {
		return a + b;
	}

	@Override
	public int soustraction(int a, int b) {
		return a - b;
	}

	/*@Override
	public int multiplication(int a, int b) {
		return a * b;
	}*/

	@Override
	public int multiplication(int a, int b) {
		int resultat = 0;

		// Gérer les cas où b est négatif
		boolean negatif = false;
		if (b < 0) {
			b = -b;
			negatif = true;
		}

		for (int i = 0; i < b; i++) {
			resultat = addition(resultat, a);
		}

		return negatif ? -resultat : resultat;
	}

	@Override
	public double division(int a, int b) throws MathsExceptions {
		if (b == 0) {
			throw new MathsExceptions("Division par zero impossible");
		}
		try {
			return a / b;
		} catch (Exception e) {
			throw new MathsExceptions(e.getMessage());
		}
	}
}
