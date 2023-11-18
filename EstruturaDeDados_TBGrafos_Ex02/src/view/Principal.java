package view;
import java.util.Scanner;

import controller.Grafos;

public class Principal {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Grafos control=new Grafos();
		System.out.println("Valor de n: ");
		int n=sc.nextInt();
		n=3;
		int [][] matriz=new int[n][n];
		control.preencher(matriz);
		control.printMatriz(matriz);
		control.listaAdjacencia(matriz);
	}
}
