package simulacao_candidado;

import java.util.Locale;
import java.util.Scanner;

public class SimulacaoCandidato {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		//Variáveis escolaridade
		int ensinoFundamental = 10;
		int ensinoMedio = 20;
		int ensinoSuperior = 30;
		int posGraduacao = 40;
		
		//Variáveis Experiência
		int semExperiencia = 0;
		int doisAnosExperiencia = 10;
		int entreDoisECincoAnosExperiencia = 20;
		int maisDeCincoAnosExperiencia = 40;
		
		System.out.println("Qual sua escolaridade?");
		System.out.println("1) Ensino Fundamental");
		System.out.println("2) Ensino Médiol");
		System.out.println("3) Ensino Superior");
		System.out.println("4) Pós-graduação");
		
		System.out.print("Digite uma opção: ");
		int escolaridade = sc.nextInt();
		
		
		
		
		
		
		
		
	}

}
