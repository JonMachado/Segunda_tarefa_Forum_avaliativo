package Program;

import java.util.Scanner;

public class program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Entrada y = null;
		
		for(;;) {
			System.out.printf("Escolha uma das opções: \n1 Cadastro em massa \n2 Verificação "
					+ "\n3 Aumento \n4 Imprimir \n5 Sair");
			int x = sc.nextInt();
			if( x == 5) {
				System.out.println("Fim!");
				break;
			}
			switch(x) {
			case '1': y.VetFuncionario();
			          break;
			case '2': Funcionario f = null;
					  y.Compare(f);
			          break;
			case '3': y.aumento();
			          break;
			case '4': y.imprimir();
			          break;
			}
				
			}
		
	}

}
