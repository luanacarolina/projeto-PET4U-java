package Projeto;

	import java.util.*;

	public class PessoaTeste {

		public static void main(String []args)
		{
			Scanner leia = new Scanner(System.in);
			String nome = "", sobrenome = "", genero = "", telefone = "", endereco = "",cpf ="";
			int idade = 0;
			Pessoa pessoa1 = new Pessoa (nome,sobrenome,genero,idade,cpf,telefone,endereco);


			System.out.println("\nQual � o seu nome?");
			nome = leia.next();
			pessoa1.setNome(nome);
			System.out.println("\nQual � o seu sobrenome?");
			sobrenome = leia.next();
			pessoa1.setSobrenome(sobrenome);
	    	System.out.println("\nInforme o seu g�nero.");
	        genero = leia.next();
	        pessoa1.setGenero(genero);
	        System.out.println("\nQual � a sua idade?");
	        idade = leia.nextInt();
	        pessoa1.setIdade(idade);
	        System.out.println("\nQual � o seu CPF?");
	        cpf = leia.next();
	        pessoa1.setCpf(cpf);
	        System.out.println("\nQual � o seu telefone: ");
	      	telefone = leia.next();
	      	pessoa1.setTelefone(telefone);
			leia.nextLine();
	      	System.out.println("\nInforme seu endere�o.");
	        endereco = leia.nextLine();
	      	pessoa1.setEndereco(endereco);
			  pessoa1.imprimirInfo();

		}
		
	}
