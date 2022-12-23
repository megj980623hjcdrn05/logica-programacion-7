package siete;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		String day;
		ArrayList<String> daysDeS=new ArrayList<String>();
		daysDeS.add("lunes");
		daysDeS.add("martes");
		daysDeS.add("miercoles");
		daysDeS.add("jueves");
		daysDeS.add("viernes");
		int hrs;
		int minu;
		int fechaIntro=0;
		int minuViernes=6660;
		do {
			System.out.println("Dame el dia de la semana: ");
			day=scanner.nextLine().toLowerCase();
			if (!daysDeS.contains(day)) {
				System.out.println("Errror," +day+ " no es un dia valido.");
			}
		} while (!daysDeS.contains(day));
		do {
			System.out.println("Dame la hora: ");
			hrs=scanner.nextInt();
			scanner.nextLine();
			if (hrs<0||hrs>=24) {
				System.out.println("Errror," +hrs+ " no es una hora valida.");
			}
		} while (hrs<0||hrs>=24);
		do {
			System.out.println("Dame los minu: ");
			minu=scanner.nextInt();
			scanner.nextLine();
			if (minu<0||minu>=60) {
				System.out.println("Errror," +minu+ " no son minutos validos.");
			}
		} while (minu<0||minu>=60);
		
		switch (day) {
		case "lunes":
			fechaIntro=0;
			break;
		case "martes":
			fechaIntro=1440;
			break;
		case "miercoles":
			fechaIntro=2880;
			break;
		case "jueves":
			fechaIntro=4320;
			break;
		case "viernes":
			fechaIntro=5760;
			break;

		default:
			break;
		}
		fechaIntro+=((hrs*60)+minu);
		int minusF=minuViernes-fechaIntro;
		if (minusF>0) {
			System.out.println("Faltan "+minusF+" minutos para el fin de semana");
		}else {
			System.out.println("Es fin de semana");
		}
		scanner.close();
		
		
	}

}
