import java.util.Random;
import java.util.Scanner;

public class Ecercicio01Gabarito {
	public static boolean shuffle;
	public static int atual=0;
	
	public static void exibirLista(String[] vetor) {
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i] + ".mp3");
		}
	}

	public static void ativaShuffle() {
		shuffle =!shuffle;
	}

	public static String avancarMusica(String[] vetor) {
		Random gerador = new Random();
		
		if(shuffle ==true) {
			atual = gerador.nextInt(vetor.length);
		}else {
			atual++;
		}if (atual>= vetor.length) {
			atual=0;
		}
		
		return vetor[atual] +".mp3";
	}

	public static String voltarMusica(String[] vetor) {
	Random gerador = new Random();
		
		if(shuffle ==true) {
			atual = gerador.nextInt(vetor.length);
		}else {
			atual--;
		}if (atual<= 0) {
			atual=0;
		}
		return vetor[atual] +".mp3";
	}

	public static String play(String[] vetor) {
		return "Tocando agora " + vetor[atual] + ".mp3";
	}

	public static String stop() {
		atual=0;
		shuffle= false;
		return "Parado ai";
	}


	
	public static void main(String[] args) {
		String[] musicas = { "Uma Arlinda Mulher", "Pelados Em Santos", "1406", "Mundo Animal", "Débil Metal",
				"Lá Vem o Alemão", "Chopis Centis", "Jumento Celestino", "Cabeça de Bagre II", "Sabão Crá-Crá",
				"Não Peide Aqui, Baby", "Renato, o Gaúcho", "Desabafo do Dinho", "Desnudos En Cancún", "Marylou",
				"Joelho", "Vira-Vira", "Robocop Gay" };
		shuffle = false;
		int opcao=0;
		Scanner leitor = new Scanner(System.in);
		
		
		while(opcao!=7) {
			System.out.println("MP3 player ninja do zirigidun!");
			System.out.println("Escolha sua opcao: ");
			System.out.println("1 - Exibir playlist");
			System.out.println("2 - Play");
			System.out.println("3 - Stop");
			System.out.println("4 - Avançar");
			System.out.println("5 - Voltar");
			System.out.println("6 - Aleatorio");
			System.out.println("7 - Sair");
			opcao = leitor.nextInt();
			
			switch(opcao) {
			case 1:
				exibirLista(musicas);
				break;
			case 2:
				System.out.println(play(musicas));
				break;
			case 3:
				System.out.println(stop());
				break;
			case 4:
				System.out.println( avancarMusica(musicas));
				break;
			case 5:
				System.out.println(voltarMusica(musicas));
				break;
			case 6:
				ativaShuffle();
				break;
			case 7:
				System.out.println("Saindo : (");
				break;
			}
		}
	}

}