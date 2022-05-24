package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double a,b;
		
		System.out.println("Digite um numero para (a) : ");
		a = scan.nextDouble();
		System.out.println("Digite um numero para (b) : ");
		b = scan.nextDouble();
		
		double soma = soma(a,b);
		double multiplicacao = multiplicacao(a,b);
		double divisao = divisao(a,b);
		double subtracao = subtracao(a,b);
		
		System.out.println("Div : " + divisao);
		System.out.println("Sub : " + subtracao);
		System.out.println("Som : " + soma);
		System.out.println("Mult : " + multiplicacao);
		
	}
	
	public static double soma(double a,double b) {
		return a + b;
	}
	public static double multiplicacao(double a,double b) {
		return a * b;
	}
	public static double divisao(double a,double b) {
		return a / b;
	}
	public static double subtracao(double a,double b) {
		return a - b;
	}
}
