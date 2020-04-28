package Program;

import java.util.Scanner;

public class Entrada {
	
	Scanner sc = new Scanner(System.in);
	
	Funcionario[] v = new Funcionario[10];
	
public void VetFuncionario() {
	
	String nome;
	String funcao;
	float sal;
		
		for(;;) {
			try {
				for(int i=0; i<v.length; i++) {
					System.out.print("Nome: ");
					nome = sc.nextLine();
					System.out.print("Nome: ");
					funcao = sc.nextLine();
					System.out.print("Nome: ");
					sal = sc.nextFloat();
					v[i] = new Funcionario(nome, funcao, sal);
				}
			}
			catch(Exception e){
				System.out.println("Erro!, tente novamente");
			}
		}
	}
	 
	public int Compare(Funcionario f) {
		int p = -1;
		for(int i=0; i<v.length; i++) {
			if(v[i].getNome().equals(f.getNome())) {
				p = i;
				break;
			}
			
		}
		return p;
	}
	
	public void aumento() {
		for(int i=0; i<v.length; i++) {
			if (v[i].getSal() > 1000) {
				float percent = v[i].getSal() * 10 / 100;
				v[i].setSal(v[i].getSal() + percent);
			}
	}
}
	
	public void imprimir() {
			for(int i=0; i<v.length; i++) {
				
				System.out.println("Funcionario" + i+1);
				System.out.println("Nome: " + v[i].getNome());
				System.out.println("Função: " + v[i].getFuncao());
				System.out.printf("Salario: %.2f", v[i].getSal());
				System.out.println("\nMatricula: " + v[i].getMat());
				System.out.println();
		}
	}

}
