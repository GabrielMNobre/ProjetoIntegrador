import java.util.Scanner;

public class jogoCompleto {
	
	static void participacaoJogo() {
		Scanner sc = new Scanner(System.in);
		String confirmacao;
		int x = 0;
		
		System.out.println("                                                                                                                 \n" + 
				"88b           d88                       88        88                          88                                 \n" + 
				"888b         d888                ,d     88        88                          88                                 \n" + 
				"88`8b       d8'88                88     88        88                          88                                 \n" + 
				"88 `8b     d8' 88  ,adPPYYba,  MM88MMM  88aaaaaaaa88  ,adPPYYba,   ,adPPYba,  88   ,d8    ,adPPYba,  8b,dPPYba,  \n" + 
				"88  `8b   d8'  88  \"\"     `Y8    88     88\"\"\"\"\"\"\"\"88  \"\"     `Y8  a8\"     \"\"  88 ,a8\"    a8P_____88  88P'   \"Y8  \n" + 
				"88   `8b d8'   88  ,adPPPPP88    88     88        88  ,adPPPPP88  8b          8888[      8PP\"\"\"\"\"\"\"  88          \n" + 
				"88    `888'    88  88,    ,88    88,    88        88  88,    ,88  \"8a,   ,aa  88`\"Yba,   \"8b,   ,aa  88          \n" + 
				"88     `8'     88  `\"8bbdP\"Y8    \"Y888  88        88  `\"8bbdP\"Y8   `\"Ybbd8\"'  88   `Y8a   `\"Ybbd8\"'  88          \n" + 
				"                                                                                                              ");
		while (x != 1) {
			System.out.println("\n\t\t\t\t\tClique enter para jogar");
			confirmacao = sc.nextLine();
			
			if (confirmacao.equals("")) {
				x = 1;
			} else {
				x = 0;
			}
		}
	}
	
	static String[] definiPersonagem() {
		Scanner sc = new Scanner(System.in);
		String nomePersonagem = "";
		int idade = 0,
			x = 0;
		char sexo;
		String resultado[] = new String[3];
		
		System.out.println("Bem-vindo ao MatHacker!");
		System.out.println("\nVamos escolher como será seu personagem");
		System.out.println("\nQual o sexo? \nM - Masculino \nF - Feminino");
		sexo = sc.next().toUpperCase().charAt(0);
		System.out.print("\nQual o nome desejado? ");
		nomePersonagem = sc.next();
		
		while (x != 1) {
			System.out.print("\nQual a idade? ");
			idade = sc.nextInt();
			if (idade < 18) {
				System.out.println("O personagem precisa ser 18+ \nInsira uma idade válida!");
				x = 0;
			} else {
				x = 1;
			}
		}
		
		resultado[0] = String.valueOf(sexo); 
		resultado[1] = nomePersonagem;
		resultado[2] = String.valueOf(idade);
		
		return resultado;
	}
	

	static String confereInformacoes(String informacoes[]) {
		//função que observa se todos as informações inseridas pelo funcionário foram colocadas dentro do array
		String resultado = "";
		if ((informacoes[0] != "") && (informacoes[1] != "") && (informacoes[2] != "")) {
			resultado = "ok";
		} else {
			resultado = "error";
		}
		return resultado;
	}
	
	static String selecionaBoneco(char sexo) {
		String boneco = "";
		switch (sexo) {
			case 'M': 
				boneco = "      ////^\\\\\\\\\n" + 
						"      | ^   ^ |\n" + 
						"     @ (o) (o) @\n" + 
						"      |   <   |\n" + 
						"      |  ___  |\n" + 
						"       \\_____/\n" + 
						"     ____|  |____\n" + 
						"    /    \\__/    \\\n" + 
						"   /              \\\n" + 
						"  /\\_/|        |\\_/\\\n" + 
						" / /  |________|  \\ \\\n";
				break;
			case 'F':
				boneco = " /////////////\\\\\\\\\n" + 
						"(((((((((((((( \\\\\\\\\n" + 
						"))) ~~      ~~  (((\n" + 
						"((( (*)     (*) )))\n" + 
						")))     <       (((\n" + 
						"((( '\\______/`  )))\n" + 
						")))\\___________/(((\n" + 
						"       _) (_\n" + 
						"      / \\_/ \\\n" + 
						"     /(     )\\\n" + 
						"    // )___( \\\\\n";
				break;
		}
		return boneco;
	}
	
	static void carregarInicio(String status) {
		Thread timer = new Thread();
		switch(status) {
			case "ok":
				System.out.println("\nVocê está pronto? O jogo vai começar");
				System.out.println("Mostre suas habilidades");
				System.out.println("Tente vencer os desafios");
				try {
					timer.sleep(6000);
					System.out.println("\n\n ██████           ██  ██████   ██████   ██████       ██████  ██████  ███    ███ ███████  ██████  █████       █████   ██████   ██████  ██████   █████  \n" + 
										   "██    ██          ██ ██    ██ ██       ██    ██     ██      ██    ██ ████  ████ ██      ██      ██   ██     ██   ██ ██       ██    ██ ██   ██ ██   ██ \n" + 
										   "██    ██          ██ ██    ██ ██   ███ ██    ██     ██      ██    ██ ██ ████ ██ █████   ██      ███████     ███████ ██   ███ ██    ██ ██████  ███████ \n" + 
										   "██    ██     ██   ██ ██    ██ ██    ██ ██    ██     ██      ██    ██ ██  ██  ██ ██      ██      ██   ██     ██   ██ ██    ██ ██    ██ ██   ██ ██   ██ \n" + 
										   " ██████       █████   ██████   ██████   ██████       ██████  ██████  ██      ██ ███████  ██████ ██   ██     ██   ██  ██████   ██████  ██   ██ ██   ██");
				} catch (InterruptedException e) {
					System.out.println("Mexeu");
				}
				
				break;
			case "error":
				break;
		}
	}
	
	static void historiaInicial(String nome, int idade, char sexo) {
		String genero = "",
			   artigo = "";
		if (sexo == 'M') {
			genero = "é um homem de "+idade+" anos";
			artigo = "O";
		} else {
			genero = "é uma mulher "+idade+" anos";
			artigo = "A";
		}
		String pt1[] = 
			{
					"\n\nNossa", "história", "se", "passa", "em", "São Paulo.", "O século XXI", "está em seu", "ápice,",
					"a globalização", "se torna", "cada vez", "mais notável.", "Os avanços tecnológicos", 
					"começam a ser percebidos e", "diversos grupos", "de malfeitores se aproveitam", "destes avanços para",
					"cometer crimes", "no ambiente virtual.", "Inserido neste contexto", nome, "começa a se", "interessar",
					"pelos conhecimentos tecnológicos.\n",nome, genero, "que mora em", "um condomínio",
					"com seu pai,", "sua mãe", "e sua irmã.", "Após obter o interesse", "nos conhecimentos da", 
					"área de tecnologia,", nome, "investiu em aprender", "e dominar esta arte,", 
					"com um único", "objetivo em mente:", "SE TORNAR",artigo, "MELHOR HACKER", "DE SÃO PAULO"
			};
		String pt2[] = 
			{
				"\n\nPara se tornar", artigo.toLowerCase(), "melhor hacker", "era necessário", "testar seus conhecimentos,", "para ver se as habilidades", "haviam sido desenvolvidas",
				"da melhor maneira.", "Os testes começaram a ser realizados", "e", nome, "se mostrou muito talentoso.", "Porém, passados os desafios iniciais,",
				"as coisas se tornaram mais difíceis", "e", nome, "começou a ter mais dificuldades."
			};
		
		for (int i = 0; i <= pt1.length-1; i++) {
			if(pt1[i].contains(".") || pt1[i].contains(":")) {
				System.out.print(pt1[i]+"\n");
			} else {
				System.out.print(pt1[i]+" ");
			}
			try {
				Thread.sleep(500);
			} catch(InterruptedException e) {
				System.out.println(e);
			}
		}
		
		for (int i = 0; i <= pt2.length-1; i++) {
			if(pt2[i].contains(".") || pt2[i].contains(":")) {
				System.out.print(pt2[i]+"\n");
			} else {
				System.out.print(pt2[i]+" ");
			}
			try {
				Thread.sleep(500);
			} catch(InterruptedException e) {
				System.out.println(e);
			}
		}
		
	}
	
	static String desafio1(String nome, char sexo, String personagem) {
		Scanner sc = new Scanner(System.in);
		int resposta = 0,
			cont = 1;
		String artigo = "",
			   status = "";
		if(sexo == 'M') {
			artigo = "ele";
		} else {
			artigo = "ela";
		}
		
		String desafio[] = 
			{
				"\nEm um certo dia", nome, "com o objetivo de", "testar seus conhecimentos", "decide abrir", "a porta do quarto da irmã.",
				"O quarto tinha", "uma fechadura eletrônica", "com senha de três dígitos.", "Por sempre observar", "a irmã digitar a senha de desbloqueio",
				artigo,"já sabia", "que os dois primeiros dígitos eram,", "respectivamente,", "2 e 3.", "Resta agora para descobrir,", "apenas o terceiro dígito.",
				"Para descobrir", "ele entrou no sistema", "da fechadura,", "ao abrir o sistema ele se deparou", "com o algoritmo de criação do último digito", 
				"que era:", "\nTERCEIRO DÍGITO = (((SEGUNDO DÍGITO x 8)+PRIMEIRO DÍGITO) - (PRIMEIRO DÍGITO x 6)) / PRIMEIRO DÍGITO .", "\nPor já saber os primeiros digitos,", nome,
				"organizou a função", "para descobrir com mais facilidade,", "desta forma a função ficou:", "\nTERCEIRO DÍGITO = (((3 x 8) + 2) - (2 x 6)) / 2"
			};
		
		for (int i = 0; i <= desafio.length-1; i++) {
			if(desafio[i].contains(".") || desafio[i].contains(":")) {
				System.out.print(desafio[i]+"\n");
			} else {
				System.out.print(desafio[i]+" ");
			}
			try {
				Thread.sleep(500);
			} catch(InterruptedException e) {
				System.out.println(e);
			}
		}
		
		System.out.println("\n\n"+personagem+"  _____    _____    _____\n"
				          +" |     |  |     |  |     |\n"
				          + " |  2  |  |  3  |  |  ?  |\n"
				          + " |_____|  |_____|  |_____|\n");
		
		System.out.println(nome+" tem apenas 2 tentativas");
		
		do {
			System.out.print("\nQual dígito que está faltando? ");
			resposta = sc.nextInt();
			
			if(cont == 2) {
				if(resposta == 7) {
					System.out.println("Resposta Correta!");
					status = "correta";
				} else {
					System.out.println("Resposta Incorreta!");
					status = "incorreta";
				}
			} else {
				if(resposta == 7) {
					System.out.println("Resposta Correta!");
					status = "correta";
				} else {
					System.out.println("Resposta Incorreta! Tente novamente.");
					status = "incorreta";
				}
			}
			cont++;
		} while (resposta != 7 && cont <= 2);
		
		return status;
		
	}
	
	public static void main(String[] args) {
		int idadePersonagem = 0;
		char sexoPersonagem;
		String nomePersonagem = "",
			   condicaoInicioJogo = "",
			   visualPersonagem = "",
			   desafio1 = "";
		String informacoesPersonagem[] = new String[3];
		String statusDesafios[] = new String[5];
		
		participacaoJogo();
		informacoesPersonagem = definiPersonagem();
		
		sexoPersonagem = informacoesPersonagem[0].charAt(0);
		nomePersonagem = informacoesPersonagem[1].substring(0, 1).toUpperCase().concat(informacoesPersonagem[1].substring(1));
		idadePersonagem = Integer.parseInt(informacoesPersonagem[2]);
		
		condicaoInicioJogo = confereInformacoes(informacoesPersonagem);
		visualPersonagem = selecionaBoneco(sexoPersonagem);
		System.out.println("\n"+nomePersonagem +" seu personagem para participar do jogo será: \n\n"+visualPersonagem);
		carregarInicio(condicaoInicioJogo);
		historiaInicial(nomePersonagem, idadePersonagem, sexoPersonagem);
		desafio1 = desafio1(nomePersonagem, sexoPersonagem, visualPersonagem);
		
		statusDesafios[1] = desafio1;
		System.out.println(statusDesafios[1]);
	}
}
