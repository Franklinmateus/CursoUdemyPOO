package util;

public class ConversorMoeda {

	public static final double IMP = 0.06;
	
	public static double conversor(double valorD, double dolarQtd) {
		return valorD * dolarQtd * (1 + IMP);
	}
}
