package com.mockito.example;

public class MathApp {

	private CalculationService calculationService;

	public void setCalculationService(CalculationService calculationService) {
		this.calculationService = calculationService;
	}
	public int add(int a,int b) {
		return calculationService.add(a, b);
	}
	public int sub(int a,int b) {
		return calculationService.sub(a, b);
	}
}
