package br.com.grupoicts;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int iNumero, iFatorialResult;
	    System.out.println("Para calcular o Fatorial Digite um numero(Positivo > 0):");
	    iNumero = sc.nextInt();
	    iFatorialResult = calcFatorial(iNumero);
	    System.out.println("O Fatorial de [" + iNumero + "] igual a [" + iFatorialResult + "]");
	    sc.close();
	}
	private static int calcFatorial(int iNumero) {
		int iFatorial = 1;
		if (iNumero < 0) {
			//Erro Numero tem que ser positivo
		       System.out.printf("O Numero %d precisa ser positivo!\n",iNumero);
		       return -1;
		}
		else if (iNumero == 0) {
			//Erro Numero Precisa ser maior que zero
		       System.out.printf("O Numero %d precisa ser Maior que zero! \n",iNumero);
		       return 0;
		}
		//
		// Numero eh valido
		//
		iFatorial = 1;
		for(int i = iNumero;i>0;i--)
		{
			iFatorial *=i;
		}
	    System.out.printf("O Numero Fatorial de [%d]  eh [%d]\n",iNumero,iFatorial);
		return iFatorial;
	}

}
