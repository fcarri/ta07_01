package project7;

import java.util.*;

public class ta07_1_App {
	public static void main(String args[]){
		
		int no_Alumnos = 2;
		String alumno;		
		double notaAsig1;
		double notaAsig2;
		double notaAsig;
		
		Hashtable<String,Double> contenidor = new Hashtable<String,Double>();		
		Scanner sc = new Scanner(System.in);
		
		for (int n=1;n<=no_Alumnos;n++) {
			
			System.out.println("n : " +n);
			System.out.println("alumno: ");
			alumno = sc.nextLine();
				
			System.out.println("Nota asignatura_1: ");
			String nl = sc.nextLine();
			notaAsig1 = Double.parseDouble(nl);
				
			System.out.println("Nota asignatura_2: ");
			String nl2 = sc.nextLine();
			notaAsig2 = Double.parseDouble(nl2);			
				
			notaAsig = (notaAsig1 + notaAsig2) / 2;
			
			contenidor.put(alumno,notaAsig);							
			
		}		
	
		Enumeration <Double> enumeration = contenidor.elements();
		Enumeration <String> claus = contenidor.keys();
		
		//System.out.println("Cont : " + contenidor);
		while(enumeration.hasMoreElements()) {
			
			String clau = claus.nextElement();			
			System.out.println("Alumne "+clau+" nota mitja = "+enumeration.nextElement());
		}
					
		
		sc.close();				
		 
	}
}
