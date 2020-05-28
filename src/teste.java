
public class teste {
	public static void main(String args[]) {
		System.out.println("Realizando os testes...");
		//testando o funcionamento das historias
		
		int idade = 15;
		String nome = "Eduardo";
		char sexo = 'M';
		String teste = "sim";
		String personagem = "      ////^\\\\n" + 
							"      | ^   ^ |\n" + 
							"     @ (o) (o) @\n" + 
							"      |   <   |\n" + 
							"      |  ___  |\n" + 
							"       \\_____/\n" + 
							"     ____|  |____\n" + 
							"    /    \\__/    \\\n" + 
							"   /              \\\n" + 
							"  /\\_/|        |\\_/\\\n" + 
							" / /  |________|  \\ \\\n";;
		
		jogoCompleto.historiaInicial(nome, idade, sexo);
		
		jogoCompleto.historiaDesafio2(nome, sexo);
		
		jogoCompleto.historiaDesafio2(nome, sexo);
		
		jogoCompleto.historiaDesafio3(sexo, nome);
		
		jogoCompleto.historiaDesafio4(sexo, nome);
		
		jogoCompleto.historiaDesafio5(sexo, nome);
		
		jogoCompleto.desafio1(nome, sexo, personagem, teste);
		
		jogoCompleto.desafio2(teste);
		
		jogoCompleto.desafio3(personagem, teste);
		
		jogoCompleto.desafio4(personagem, teste);
		
		jogoCompleto.desafio5(personagem, teste);
	}
}
