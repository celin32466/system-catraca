package aplcaçao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.catrac;

public class Program {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println("nome completo: ");
		String nome = sc.nextLine();
		System.out.println("Data de entrada de pagamento (dd/MM/yyyy):  ");
		Date entrada = sdf.parse(sc.next());
		System.out.println("data de vencimento dd/MM/yyyy");
		Date saida = sdf.parse(sc.next());

		if (!saida.after(entrada)) {
			System.out.println("erro nas datas!");

		} else {
			catrac cac = new catrac(nome, entrada, saida);
			System.out.println("dados do cliente: " + cac);

	System.out.println("deseja renovar sua entrada ? (s/n): ");
			char ch = sc.next().charAt(0);
			if (ch == 's') {
				System.out.println("nome completo: ");
				sc.next();
				nome = sc.nextLine();
				System.out.println(" nova Data de entrada de pagamento (dd/MM/yyyy):  ");
				entrada = sdf.parse(sc.next());
				System.out.println("nova data de vencimento dd/MM/yyyy");
				saida = sdf.parse(sc.next());

				cac.novadata(entrada, saida);
				System.out.println("dados do cliente: " + cac);
				if (ch == 'n') {
					System.out.println("obrigado!");
				}

			}

		}
	}

}
