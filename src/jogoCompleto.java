import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class jogoCompleto {
	
	static Scanner sc = new Scanner(System.in);
	
	static void participacaoJogo() {
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
		switch(status) {
			case "ok":
				System.out.println("\nVocê está pronto? O jogo vai começar");
				System.out.println("Mostre suas habilidades");
				System.out.println("Tente vencer os desafios");
				try {
					Thread.sleep(6000);
					System.out.println("\n\n ██████           ██  ██████   ██████   ██████       ██████  ██████  ███    ███ ███████  ██████  █████       █████   ██████   ██████  ██████   █████  \n" + 
										   "██    ██          ██ ██    ██ ██       ██    ██     ██      ██    ██ ████  ████ ██      ██      ██   ██     ██   ██ ██       ██    ██ ██   ██ ██   ██ \n" + 
										   "██    ██          ██ ██    ██ ██   ███ ██    ██     ██      ██    ██ ██ ████ ██ █████   ██      ███████     ███████ ██   ███ ██    ██ ██████  ███████ \n" + 
										   "██    ██     ██   ██ ██    ██ ██    ██ ██    ██     ██      ██    ██ ██  ██  ██ ██      ██      ██   ██     ██   ██ ██    ██ ██    ██ ██   ██ ██   ██ \n" + 
										   " ██████       █████   ██████   ██████   ██████       ██████  ██████  ██      ██ ███████  ██████ ██   ██     ██   ██  ██████   ██████  ██   ██ ██   ██");
					System.out.println("\n\t\t\t\t\t\t\t\tFASE I");
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
			System.out.println("  _____    _____    _____\n"
			          +" |     |  |     |  |     |\n"
			          + " |  2  |  |  3  |  |  "+resposta+"  |\n"
			          + " |_____|  |_____|  |_____|\n");
			if(cont == 2) {
				if(resposta == 7) {
					System.out.println("Porta desbloqueada!");
					status = "correta";
				} else {
					System.out.println("Senha incorreta!");
					status = "incorreta";
				}
			} else {
				if(resposta == 7) {
					System.out.println("Porta desbloqueada!");
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
	
	static void historiaDesafio2(String nome, char sexo) {
		String artigo = "";
		if(sexo == 'M') {
			artigo = "ele";
		} else {
			artigo = "ela";
		}
		
		System.out.println("\n");
		String historia[] = 
			{
				nome, "começou a perceber", "que suas contas de luz", "estavam atingindo", "valores exorbitantes,", "muito maiores do que", "a família",
				"poderia pagar.", "Ele procurou", "em seus arquivos", "e observou uma brecha", "onde poderia agir.", "Havia uma parte do código", "que permitia",
				"que com algumas mudanças", nome, "determinasse aonde","o relógio medidor de luz","pararia de contar", "os kWh(kiloWhats) gastos.",
				"Para determinar", "ele precisa", "estipular o valor máximo a ser pago.",nome,"conversou", "com sua família e", "juntos decidiram que", 
				"R$250,00 era o máximo que", "conseguiriam pagar.", "Com o valor máximo determinado,", nome, "entrou no sistema do", "relógio medidor",
				"e descobriu que", "o preço do kWh era de R$0,4.", "Sabendo disso restava descobrir apenas", "aonde aonde o relógio pararia de contar",
				"para isso", nome, "escreveu a seguinte função:", "\nMÁXIMO KWH x PREÇO KWH = VALOR MÁXIMO .", "\nCruzando com as informações", "que",artigo,
				"já tinha,", nome, "reescreveu a função da seguinte maneira:", "\nMÁXIMO KWH x 0,4 = 250 .",nome, "tem apenas uma tentativa"
				
			};
		
		for (int i = 0; i <= historia.length-1; i++) {
			if(historia[i].contains(".") || historia[i].contains(":")) {
				System.out.print(historia[i]+"\n");
			} else {
				System.out.print(historia[i]+" ");
			}
			try {
				Thread.sleep(500);
			} catch(InterruptedException e) {
				System.out.println(e);
			}
		}
		
	}
	
	static String desafio2() {
		Scanner sc = new Scanner(System.in); 
		int correta = 0;
		int cont = 1;
		String status = "";
		char resposta = 0;
		ArrayList<String> alternativas = new ArrayList();
		
		alternativas.add("620");
		alternativas.add("625");
		alternativas.add("650");
		alternativas.add("600");
		alternativas.add("575");
		
		 do {
			System.out.println("O relógio terá que parar de registrar ao chegar a marca de quantos kWh?");
			Collections.shuffle(alternativas);
			for(int i = 0; i <= alternativas.size()-1; i++) {
				switch (i) {
					case 0:
						System.out.println("a) "+alternativas.get(i));
						break;
					case 1:
						System.out.println("b) "+alternativas.get(i));
						break;
					case 2:
						System.out.println("c) "+alternativas.get(i));
						break;
					case 3:
						System.out.println("d) "+alternativas.get(i));
						break;
					case 4:
						System.out.println("e) "+alternativas.get(i));
						break;
				}
			}
				resposta = sc.next().toUpperCase().charAt(0);
			
				switch(resposta) {
				case 'A':
					if (alternativas.get(0).equals("625")) {
						System.out.println("Quantidade de kWh correta!");
						correta = 1;
						status = "correta";
					} else {
						System.out.println("Quantidade de kWh incorreta!");
						correta = 0;
						status = "incorreta";
					}
					break;
				case 'B':
					if (alternativas.get(1).equals("625")) {
						System.out.println("Quantidade de kWh correta!");
						correta = 1;
						status = "correta";
					} else {
						System.out.println("Quantidade de kWh incorreta!");
						correta = 0;
						status = "incorreta";
					}
					break;
				case 'C':
					if (alternativas.get(2).equals("625")) {
						System.out.println("Quantidade de kWh correta!");
						correta = 1;
						status = "correta";
					} else {
						System.out.println("Quantidade de kWh incorreta!");
						correta = 0;
						status = "incorreta";
					}
					break;
				case 'D':
					if (alternativas.get(3).equals("625")) {
						System.out.println("Quantidade de kWh correta!");
						correta = 1;
						status = "correta";
					} else {
						System.out.println("Quantidade de kWh incorreta!");
						correta = 0;
						status = "incorreta";
					}
					break;
				case 'E':
					if (alternativas.get(4).equals("625")) {
						System.out.println("Quantidade de kWh correta!");
						correta = 1;
						status = "correta";
					} else {
						System.out.println("Quantidade de kWh incorreta!");
						correta = 0;
						status = "incorreta";
					}
					break;
			}
				cont++;
		} while (correta != 1 && cont <= 2);
		 return status;
	}
	
	public static void main(String[] args) {
		int idadePersonagem = 0;
		char sexoPersonagem;
		String nomePersonagem = "",
			   condicaoInicioJogo = "",
			   visualPersonagem = "",
			   desafio1 = "",
			   desafio2 = "";
		String informacoesPersonagem[] = new String[3];
		String statusDesafiosFase1[] = new String[5];
		
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
		historiaDesafio2(nomePersonagem, sexoPersonagem);
		desafio2 = desafio2();
		
		statusDesafiosFase1[0] = desafio1;
		statusDesafiosFase1[1] = desafio2;
		
		for(int i = 0; i <= statusDesafiosFase1.length-1; i++) {
			System.out.println("DESAFIO "+i+" => "+statusDesafiosFase1[i]);
		}
	}
}
