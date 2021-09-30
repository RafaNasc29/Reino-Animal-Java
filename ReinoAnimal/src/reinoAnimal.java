import java.util.Scanner;

public class reinoAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.println("Bem vindo ao Reino Animal \nMais especificamente ao filo dos Cordados que possuem como pricpais caracteristicas: ");

		Cordados c = new Cordados();
		c.caracCordados();

		System.out.println("\nDentro desse filo ha os animais Vertebrados, das seguintes classes:");

		System.out.println("Informe qual grupo \n1) Mamiferos \n2) Aves \n3) Répteis \n4) Anfibios \n5) Peixes");
		System.out.print("Escolha: ");
		int op = input.nextInt();
		System.out.println("");

		// mamiferos
		if (op == 1) {
			System.out.println("Informe se quer um\n1) Voador\n2) Terrestre\n3) Aquatico");
			System.out.print("Escolha: ");
			int op2 = input.nextInt();
			System.out.println("");

			// Aereos
			if (op2 == 1) {
				System.out.println("Suas escolhas levaram as seguintes caracteristicas");
				mamiAereos mAe = new mamiAereos();
				mAe.caracMamiAereos();
			}
			// Terrestres
			if (op2 == 2) {
				System.out.println("Suas escolhas levaram as seguintes caracteristicas");
				mamiTerrestre mT = new mamiTerrestre();
				mT.caracMamiTerestre();
			}
			// Aquaticos
			if (op2 == 3) {
				System.out.println("Suas escolhas levaram as seguintes caracteristicas");
				mamiAquaticos mAq = new mamiAquaticos();
				mAq.caracMamiAquaticos();
			}
		}

		// Aves
		if (op == 2) {
			System.out.println("Informe se quer um\n1) Aquatica\n2) Terrestre");
			int op2 = input.nextInt();
			// Aquatica
			if (op2 == 1) {
				System.out.println("Suas escolhas levaram as seguintes caracteristicas");
				avesAquaticas aA = new avesAquaticas();
				aA.caracAvesAquaticas();
			}
			// Terrestre
			if (op2 == 2) {
				System.out.println("Suas escolhas levaram as seguintes caracteristicas");
				avesTerrestres aT = new avesTerrestres();
				aT.caracAvesTerrestres();
			}

		}

		// Repteis
		if (op == 3) {
			System.out.println("Suas escolhas levaram as seguintes caracteristicas");
			Repteis aR = new Repteis();
			aR.caracRepteis();
		}

		// Anfibios
		if (op == 4) {
			System.out.println("Informe se quer um\n1) Urodela ou Caudata\n2) Anura\n3) Apoda ou Gymnophiona");
			int op2 = input.nextInt();

			if (op2 == 1) {
				System.out.println("Suas escolhas levaram as seguintes caracteristicas");
				UrodelaouCaudata aUC = new UrodelaouCaudata();
				aUC.caracUrodelaCaudata();
			}

			if (op2 == 2) {
				System.out.println("Suas escolhas levaram as seguintes caracteristicas");
				Anura aAn = new Anura();
				aAn.caracAnura();
			}

			if (op2 == 3) {
				System.out.println("Suas escolhas levaram as seguintes caracteristicas");
				ApodaouGymnophiona aAG = new ApodaouGymnophiona();
				aAG.caracApodaGymnophiona();
			}
		}

		// Peixes
		if (op == 5) {
			System.out.println("Informe se quer um\n1) Peixes cartilaginosos\n2) Peixes Ósseos");
			int op2 = input.nextInt();

			if (op2 == 1) {
				System.out.println("Suas escolhas levaram as seguintes caracteristicas");
				cartilaginoso pC = new cartilaginoso();
				pC.caracCarti();
			}

			if (op2 == 2) {
				System.out.println("Suas escolhas levaram as seguintes caracteristicas");
				osseos pO = new osseos();
				pO.caracOsseos();
			}
		}
	}

}
