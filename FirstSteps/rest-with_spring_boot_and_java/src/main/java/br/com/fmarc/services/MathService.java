package br.com.fmarc.services;


public class MathService {

	public Double sum(Double numberOne, Double numberTwo) {
		return (numberOne) + (numberTwo);
	}

	public Double substraction(Double numberOne, Double numberTwo) {
		return (numberOne) - (numberTwo);
	}

	public Double multiplication(Double numberOne, Double numberTwo) {
		return (numberOne) * (numberTwo);
	}

	public Double division(Double numberOne, Double numberTwo) {
		return (numberOne) / (numberTwo);
	}

	public Double mean(Double numberOne, Double numberTwo) {
		return ((numberOne) + (numberTwo)) / 2;
	}

	public Double squareRoot(Double number) {
		return Math.sqrt((number));
	}

}
