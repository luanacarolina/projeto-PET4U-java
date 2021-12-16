package Projeto;

public class Pessoa {

		
		private String nome;
		private String sobrenome;
		private String genero;
		private int idade;
		private String cpf;
		private String telefone;
		private String endereco;
		
		
	    public Pessoa (String nome, String sobrenome, String genero, int idade, String cpf, String telefone, String endereco)
	    {
	    	this.nome = nome;
	    	this.sobrenome = sobrenome;
	    	this.genero = genero; 
	    	this.idade = idade;
	    	this.cpf = cpf;
	    	this.telefone = telefone;
	    	this.endereco = endereco;
	    }


	  	public String getNome() {
			return this.nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getSobrenome() {
			return sobrenome;
		}

		public void setSobrenome(String sobrenome) {
			this.sobrenome = sobrenome;
		}

		public String getGenero() {
			return genero;
		}

		public void setGenero(String genero) {
			this.genero = genero;
		}

		public int getIdade() {
			return idade;
		}

		public void setIdade(int idade) {
			this.idade = idade;
		}

		public String getCpf() {
			return cpf;
		}

	    public void setCpf(String cpf) {
		    this.cpf = cpf;
	    }

		public String getTelefone() {
			return telefone;
		}

		public void setTelefone(String telefone) {
			this.telefone = telefone;
		}

		public String getEndereco() {
			return this.endereco;
		}

		public void setEndereco(String endereco) {
			this.endereco = endereco;
		}


		public void imprimirInfo()
	    {
	    	System.out.println("\n*****Bem vinde "+getNome()+" "+getSobrenome()+" ao PET4U! Nós estamos muito felizes por você querer fazer a diferença e formar uma "
	    			+ "família com nossos amicãos!*****");
	    	System.out.println("\nPodemos confirmar alguns dados antes de continuarmos?");
	    	System.out.println("\nSeu nome completo é:"+getNome()+" "+getSobrenome());
	    	System.out.println("\nVocê é do gênero: "+getGenero());
	    	System.out.println("\nSua idade é: "+getIdade()+ " anos.");
	      	System.out.println("\nSeu telefone é: "+getTelefone());
	      	System.out.println("\nSeu endereço é: "+getEndereco());
	      	  	
	    }
		
	}


