import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class jogoCompleto {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void participacaoJogo() {
		//exibe o título e ao clicar enter o jogo inicia
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
	
	public static String[] definiPersonagem() {
		//usuário insere as informações do funcionário e armazena em um array
		String nomePersonagem = "";
		int idade = 0,
			x = 0,
			z = 0;
		char sexo = 0;
		String resultado[] = new String[3];
		
		System.out.println("Bem-vindo ao MatHacker!");
		System.out.println("\nVamos escolher como será seu personagem");
		
		//confere se o sexo passado pelo usuário é um tipo válido, M ou F
		while (z != 1) {
			System.out.println("\nQual o sexo? \nM - Masculino \nF - Feminino");
			sexo = sc.next().toUpperCase().charAt(0);
			if (sexo != 'M' && sexo != 'F') {
				System.out.println("Opção inexistente!\nInsira uma opção disponível!");
				z = 0;
			} else {
				z = 1;
			}
		}
		
		//confere se o personagem tem idade maior que 18 anos
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
	

	public static String confereInformacoes(String informacoes[]) {
		//função que observa se todos as informações inseridas pelo funcionário foram colocadas dentro do array
		String resultado = "";
		if ((informacoes[0] != "") && (informacoes[1] != "") && (informacoes[2] != "")) {
			resultado = "ok";
		} else {
			resultado = "error";
		}
		return resultado;
	}
	
	public static String selecionaBoneco(char sexo) {
		//defini a partir da entrada do sexo no array de informações qual será o personagem do usuário
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
	
	/******************************************************************INÍCIO FASE 1****************************************************************/
	public static void carregarInicio(String status) {
		//método que marca o início da primeira fase
		switch(status) {
			case "ok":
				System.out.println("\nVocê está pronto? O jogo vai começar");
				System.out.println("Mostre suas habilidades");
				System.out.println("Tente vencer os desafios");
				try {
					//programa aguarda 60 segundos para exibir que começo o jogo
					Thread.sleep(6000);
					System.out.println("\n\n ██████           ██  ██████   ██████   ██████       ██████  ██████  ███    ███ ███████  ██████  █████       █████   ██████   ██████  ██████   █████  \n" + 
										   "██    ██          ██ ██    ██ ██       ██    ██     ██      ██    ██ ████  ████ ██      ██      ██   ██     ██   ██ ██       ██    ██ ██   ██ ██   ██ \n" + 
										   "██    ██          ██ ██    ██ ██   ███ ██    ██     ██      ██    ██ ██ ████ ██ █████   ██      ███████     ███████ ██   ███ ██    ██ ██████  ███████ \n" + 
										   "██    ██     ██   ██ ██    ██ ██    ██ ██    ██     ██      ██    ██ ██  ██  ██ ██      ██      ██   ██     ██   ██ ██    ██ ██    ██ ██   ██ ██   ██ \n" + 
										   " ██████       █████   ██████   ██████   ██████       ██████  ██████  ██      ██ ███████  ██████ ██   ██     ██   ██  ██████   ██████  ██   ██ ██   ██");
					//marca o inicio da primeira faase
					System.out.println("\n\t\t\t\t\t\t\t\tFASE I");
				} catch (InterruptedException e) {
					System.out.println("Mexeu");
				}
				
				break;
			case "error":
				break;
		}
	}
	
	public static void historiaInicial(String nome, int idade, char sexo) {
		//metodo que traz a contextualização e a história inicial do jogo 
		String genero = "",
			   artigo = "";
		//define o a partir do sexo do personagem o artigo da frase
		if (sexo == 'M') {
			genero = "é um homem de "+idade+" anos";
			artigo = "O";
		} else {
			genero = "é uma mulher "+idade+" anos";
			artigo = "A";
		}
		//escreve história utilizando o nome e o artigo
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
		//exibi cada frase ou palavra do array um após o outro com delay de 5 segundos
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
	
	public static String desafio1(String nome, char sexo, String personagem) {
		int resposta = 0,
			cont = 1;
		String artigo = "",
			   status = "";
		//define o a partir do sexo do personagem o artigo da frase
		if(sexo == 'M') {
			artigo = "ele";
		} else {
			artigo = "ela";
		}
		//contextualização e história do primeiro desafio, utilizando o nome e o artigo
		String desafio[] = 
			{
				"\nEm um certo dia", nome, "com o objetivo de", "testar seus conhecimentos", "decide abrir", "a porta do quarto da irmã.",
				"O quarto tinha", "uma fechadura eletrônica", "com senha de três dígitos.", "Por sempre observar", "a irmã digitar a senha de desbloqueio",
				artigo,"já sabia", "que os dois primeiros dígitos eram,", "respectivamente,", "2 e 3.", "Resta agora para descobrir,", "apenas o terceiro dígito.",
				"Para descobrir", "ele entrou no sistema", "da fechadura,", "ao abrir o sistema ele se deparou", "com o algoritmo de criação do último digito", 
				"que era:", "\nTERCEIRO DÍGITO = (((SEGUNDO DÍGITO x 8) + PRIMEIRO DÍGITO) - (PRIMEIRO DÍGITO x 6)) / PRIMEIRO DÍGITO .", "\nPor já saber os primeiros digitos,", nome,
				"organizou a função", "para descobrir com mais facilidade,", "desta forma a função ficou:", "\nTERCEIRO DÍGITO = (((3 x 8) + 2) - (2 x 6)) / 2"
			};
		//exibição do array com dela de 5 segundos 
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
		//mostra o personagem e a senha com a incógnita
		System.out.println("\n\n"+personagem+"  _____    _____    _____\n"
				          +" |     |  |     |  |     |\n"
				          + " |  2  |  |  3  |  |  ?  |\n"
				          + " |_____|  |_____|  |_____|\n");
		
		System.out.println(nome+" tem apenas 2 tentativas");
		// pede para o usuáŕio entrar com a resposta da incógnita e exibe
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
			//este laço é exibido no máximo duas vezes, parando a exibição também se o usuário acertar na primeira tentativa
		} while (resposta != 7 && cont <= 2);
		
		return status;
		
	}
	
	public static void historiaDesafio2(String nome, char sexo) {
		String artigo = "";
		//define o a partir do sexo do personagem o artigo da frase
		if(sexo == 'M') {
			artigo = "ele";
		} else {
			artigo = "ela";
		}
		//historia do segundo desafio
		System.out.println("\n");
		//utiliza o nome e o artigo para escrever a história
		String historia[] = 
			{
				nome, "começou a perceber", "que suas contas de luz", "estavam atingindo", "valores exorbitantes,", "muito maiores do que", "a família",
				"poderia pagar.", "Ele procurou", "em seus arquivos", "e observou uma brecha", "onde poderia agir.", "Havia uma parte do código", "que permitia",
				"que com algumas mudanças", nome, "determinasse aonde","o relógio medidor de luz","pararia de contar", "os kWh(kilowatt) gastos.",
				"Para determinar", "ele precisa", "estipular o valor máximo a ser pago.",nome,"conversou", "com sua família e", "juntos decidiram que", 
				"R$250,00 era o máximo que", "conseguiriam pagar.", "Com o valor máximo determinado,", nome, "entrou no sistema do", "relógio medidor",
				"e descobriu que", "o preço do kWh era de R$0,4.", "Sabendo disso restava descobrir apenas", "aonde aonde o relógio pararia de contar",
				"para isso", nome, "escreveu a seguinte função:", "\nMÁXIMO KWH x PREÇO KWH = VALOR MÁXIMO .", "\nCruzando com as informações", "que",artigo,
				"já tinha,", nome, "reescreveu a função da seguinte maneira:", "\nMÁXIMO KWH x 0,4 = 250 .",nome, "tem apenas 2 tentativas."
				
			};
		//exibição com delay de 5 segundos
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
	
	public static String desafio2() {
		int correta = 0;
		int cont = 1;
		String status = "";
		char resposta = 0;
		ArrayList<String> alternativas = new ArrayList<String>();
		//adicionando as alternativas ao arraylist
		alternativas.add("620");
		alternativas.add("625");
		alternativas.add("650");
		alternativas.add("600");
		alternativas.add("575");
		
		 do {
			System.out.println("\nDescobrir o máximo de kWh => MÁXIMO KWH x 0,4 = 250");
			System.out.println("\nO relógio terá que parar de registrar ao chegar a marca de quantos kWh?");
			//troca as alternativas de posição
			Collections.shuffle(alternativas);
			//exie todas as alternatias do arraylist 
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
			//observa se a resposta inputada pelo usuário está correta
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
				//este laço tem sua execução interrompida após a realização das duas tentativas ou respota correta
		} while (correta != 1 && cont <= 2);
		 return status;
	}
	
	public static void historiaDesafio3(char sexo, String nome) {
		//historia do desafio 3
		String artigo = "";
		//define o a partir do sexo do personagem o artigo da frase
		if(sexo == 'M') {
			artigo = "ele";
		} else {
			artigo = "ela";
		}
		System.out.println("\n");
		//utiliza o nome e o artigo para escrever a história
		String historia[] = 
			{
				"Após realizar", "estes testes mais simples", nome, "decide realizar um", "teste mais desafiador.", nome, "precisava entrar no", "computador",
				"do zelador do prédio", "onde morava.", "Para isso", "ele precisa descobrir o", "horário que a sala", "do zelador está vazia", "entrar e", 
				"hackear a senha", "do computador.", nome, "começou a observar o zelador", "e descobriu que", "todo dia no horário", "das 7 da noite", 
				"o zelador saía", "para jantar", "e a sala ficava sozinha", "por meia hora.", "Oportunidade perfeita", "para agir sem ser descoberto.",
				nome, "se preparou e", "às 7 da noite, se dirigiu a sala", "chegando lá", "se deparou com o seguinte algoritmo para determinar a senha:", 
				"Senha composta por", "4 dígitos,", "o número formado", "pelos quatro dígitos unidos", "constava na classe", "dos números naturais e",
				"na casa dos milhares.", nome, "não entendeu muito este algoritmo de formação,", "para entender ele", "começou a procurar", "um exemplo e",
				artigo, "achou.", "O exemplo foi o seguinte :", "\nSe o algoritmo da senha for", "\n1 x 1000", "+ 7 x 100", "+ 0 x 10", "+ 9 x 1", "\nA senha",
				"será 1709.", nome, "entendeu a explicação e foi tentar acertar", "a senha do zelador", artigo, "pode tentar até acertar."
				
			};
		//exibição com delay de 5 segundos
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
	
	public static String desafio3(String personagem) {
		String senha = "",
			   senhaInserida = "",
			   status = "";
		int digito1 = 0,
			digito2 = 0,
			digito3 = 0,
			digito4 = 0,
			correta = 0;
		Random variavel = new Random();
		//determina que o valor da senha do zelador terá que ser entre 1000 e 9999
		senha = String.valueOf(variavel.nextInt((9999 - 1000) + 1) + 1000);
		do {
			System.out.println("\nQual é a senha para entrar no computador?");
			System.out.print("O algoritmo de formação da senha do zelador é: ");
			//exibe o algoritmo de formação da senha através do tratamento via substring da senha do zelador
			System.out.println(senha.substring(0, 1) + " x 1000 + " + 
							   senha.substring(1, 2) + " x 100 + " + 
							   senha.substring(2, 3) + " x 10 + " + 
							   senha.substring(3) + " x 1");
			//exibe todas os dígitos da senha como incógnitas
			System.out.println("\n"+personagem+"  _____    _____    _____    _____\n"
			          +" |     |  |     |  |     |  |     |\n"
			          + " |  ?  |  |  ?  |  |  ?  |  |  ?  |\n"
			          + " |_____|  |_____|  |_____|  |_____|\n");
			System.out.print("Entre com o primeiro dígito: ");
				digito1 = sc.nextInt();
			System.out.print("Entre com o segundo dígito: ");
				digito2 = sc.nextInt();
			System.out.print("Entre com o terceiro dígito: ");
				digito3 = sc.nextInt();
			System.out.print("Entre com o quarto dígito: ");
				digito4 = sc.nextInt();
			//observa se os valores inutados pelo usuário são válidos 
			if ((digito1 >= 0 && digito1 < 10) && (digito2 >= 0 && digito2 < 10) && (digito3 >= 0 && digito3 < 10) && (digito4 >= 0 && digito4 < 10)) {
				//exibe as entradas dousuário no lugar das incógnitas
				System.out.println("  _____    _____    _____    _____\n"
				          +" |     |  |     |  |     |  |     |\n"
				          + " |  "+digito1+"  |  |  "+digito2+"  |  |  "+digito3+"  |  |  "+digito4+"  |\n"
				          + " |_____|  |_____|  |_____|  |_____|\n");
				//concatena todas as entradas do usuário e transforma em um única String
				senhaInserida = String.valueOf(digito1)+String.valueOf(digito2)+String.valueOf(digito3)+String.valueOf(digito4);
				//compara se a senha original do zelador é igual a senha inserida pelo usuário
				if (senha.equals(senhaInserida)) {
					System.out.println("Senha Correta! Computador desbloqueado!");
					correta = 1;
					status = "correta";
				} else {
					System.out.println("Senha Incorreta! Tente novamente!");
				}
			} else {
				System.out.println("Algum valor inserido é inválido, por ser maior que 9 ou negativo");
			}
			//este laço só te sua exibição interrompida quando o usuário acerta a resposta
		} while(correta != 1);
		return status;
	}
	
	public static void historiaDesafio4(char sexo, String nome) {
		//historia do desafio 4
		String artigo = "";
		//define o a partir do sexo do personagem o artigo da frase
		if(sexo == 'M') {
			artigo = "ele";
		} else {
			artigo = "ela";
		}
		System.out.println("\n");
		//utiliza o nome e o artigo para escrever a história
		String historia[] = 
			{
				"O acesso ao computador", "do zelador", "foi um sucesso,", "porém tinha um problema,", "para descobrir a senha", artigo, "tinha demorado",
				"10 minutos.", "Então só restavam", "mais 20 minutos para o", "zelador voltar,", "por isso", nome, "tinha que agir", "com muita velocidade.", 
				"Tinham duas coisas", "que", nome, "queria fazer,", "acessar o servidor de câmeras do prédio", "e acessar", "o servidor de alarmes.",
				"Com o acesso", "ao servidor de câmeras", "ele vai conseguir saber tudo", "o que está acontecendo", "no prédio.", "Então", nome, 
				"começou por esse servidor,", "para conseguir acessar", "era necessário obter a senha", "do servidor,", "para isso", artigo, "tinha que",
				"analisar o código.", nome, "observou que a senha", "era guardada dentro do sistema", "com uma criptografia", "de hexadecimal,", "no",
				"sistema havia um comentário", "que exemplificava a", "criptografia:", "\nSENHA = 64202 .", "SENHA GUARDADA NO SISTEMA = FACA .", "Logo",
				artigo, "percebeu que", "para descobrir a senha do servidor era só", "converter a senha que estava no sistema", "em base hexadecimal", 
				"para base decimal.", "Essa senha é", "composta por", "5 dígitos.", nome, "tem 2 tentativas."
				
			};
		//exibição com delay de 5 segundos
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
	
	public static String desafio4(String personagem) {
		//estrutura desafio 4
		Random posicao = new Random();
		String senhaServidor = "",
			   senhaInserida = "";
		int elevado = 0;
		int senhaDecimal = 0,
			correta = 0,
			tentativa = 1;
		String digito1 = "",
			   digito2 = "",
			   digito3 = "",
			   digito4 = "",
			   digito5 = "",
			   status = "";
		String[] possibilidadeSenha = new String[5];
		//adicionando possíveis senhas
		possibilidadeSenha[0] = "CADA";
		possibilidadeSenha[1] = "BABA";
		possibilidadeSenha[2] = "FADA"; 
		possibilidadeSenha[3] = "DADA"; 
		//escolhendo uma das opções de senha de dentro do array
		senhaServidor = possibilidadeSenha[posicao.nextInt(4)];
		
		
			
			//transformando a senha escolhida de hexadecimal para decimal
			for (int i = 0; i < senhaServidor.length(); i++) {
				if (i == 0) {
					elevado = 3;
				} else if (i == 1) {
					elevado = 2;
				} else if (i == 2) {
					elevado = 1;
				} else if (i == 3) {
					elevado = 0;
				}
			 	if (senhaServidor.substring(i, (i+1)).equals("A")) {
			 		senhaDecimal += 10 * (int)Math.pow(16, elevado);
			 	} else if (senhaServidor.substring(i, (i+1)).equals("B")) {
			 		senhaDecimal += 11 * (int)Math.pow(16, elevado);
			 	} else if (senhaServidor.substring(i, (i+1)).equals("C")) {
			 		senhaDecimal += 12 * (int)Math.pow(16, elevado);
			 	} else if (senhaServidor.substring(i, (i+1)).equals("D")) {
			 		senhaDecimal += 13 * (int)Math.pow(16, elevado);
			 	} else if (senhaServidor.substring(i, (i+1)).equals("F")) {
			 		senhaDecimal += 15 * (int)Math.pow(16, elevado);
			 	}
			}
			//pedindo para o usuário inputar a senha correta
			do {
			System.out.println("\nA senha que está no servidor é: "+senhaServidor);
			System.out.println("Qual a senha para acessar o servidor?");
			System.out.println("\n"+personagem+"  _____    _____    _____    _____    _____\n"
			          +" |     |  |     |  |     |  |     |  |     |\n"
			          + " |  ?  |  |  ?  |  |  ?  |  |  ?  |  |  ?  |\n"
			          + " |_____|  |_____|  |_____|  |_____|  |_____|\n");
			System.out.print("Entre com o primeiro dígito: ");
				digito1 = sc.next();
			System.out.print("Entre com o segundo dígito: ");
				digito2 = sc.next();
			System.out.print("Entre com o terceiro dígito: ");
				digito3 = sc.next();
			System.out.print("Entre com o quarto dígito: ");
				digito4 = sc.next();
			System.out.print("Entre com o quinto dígito: ");
				digito5 = sc.next();
			
			senhaInserida = digito1 +""+ digito2 +""+ digito3 +""+ digito4 +""+ digito5; 
			System.out.println("  _____    _____    _____    _____    _____\n"
			          +" |     |  |     |  |     |  |     |  |     |\n"
			          + " |  "+digito1+"  |  |  "+digito2+"  |  |  "+digito3+"  |  |  "+digito4+"  |  |  "+digito5+"  |\n"
			          + " |_____|  |_____|  |_____|  |_____|  |_____|\n");
			if(senhaInserida.equals(String.valueOf(senhaDecimal))) {
				System.out.println("Senha correta! Servidor pode ser acessado!");
				correta = 1;
				status = "correta";
			} else {
				System.out.println("Senha Incorreta! Não foi possível conectar ao servidor!");
				correta = 0;
				status = "incorreta";
			}
			tentativa++;
			//laço de repetição para a execução se a alternativa estiver correta ou o número de tentativas extrapole
		}while(correta != 1 && tentativa <= 2);
		return status;
	}
	
	public static void historiaDesafio5(char sexo, String nome) {
		//historia do desafio 5
		String artigo = "";
		//define o a partir do sexo do personagem o artigo da frase
		if(sexo == 'M') {
			artigo = "ele";
		} else {
			artigo = "ela";
		}
		System.out.println("\n");
		//utiliza o nome e o artigo para escrever a história
		String historia[] = 
			{
				"Para tentar achar", "a senha do servidor de", "câmeras,", nome, "gastou mais 10 minutos.", "Por isso as",
				"coisas tinham se dificultado,", "só restavam mais 10 minutos", "para", artigo, "conseguir descobrir a senha do", 
				"servidor de alarmes.", "Se tudo correr bem,", nome, "termina de acessar", "e consegue sair da sala do", 
				"zelador antes dele voltar.", nome, "quer o acesso aos", "alarmes", "porque", "com os acessos em mãos,",
				"ele vai conseguir", "programar o sistema", "para enviar alertas de movimento", "próximos ao seu", "andar.",
				"Conseguindo desta forma", "estar preparado e", "antecipado a qualquer pessoa", "que se aproxime de sua casa.",
				nome, "começou a procurar", "no código", "o algoritmo de formação da senha", "do servidor de câmeras.", "Quando", artigo,
				"achou, ele percebeu", "que esta seria a", "resolução que traria mais dificuldade,", "pois o algoritmo de formação", "era o seguinte:",
				"Primeiro dígito do produto de 12345679 pela chave gerada pelo sistema,", "onde para cada dígito será fornecido uma chave.",
				"A senha é formada por", "4 dígitos.", nome, "não entendeu",
				"muito, por isso", "continuou procurando", "e achou um exemplo mais claro", "que era:", "\nDÍGITO 1 =>", "12345679 x 9 =>", "1", 
				"(onde 9 foi a chave fornecida pelo sistema", "e 1 o primeiro dígito do produto)", "\nDÍGITO 2 =>", "12345679 x 63 =>", "7", 
				"(onde 63 foi a chave fornecida pelo sistema", "e 7 o primeiro dígito do produto)", "\nDÍGITO 3 =>", "12345679 x 0 =>", "0", 
				"(onde 0 foi a chave fornecida pelo sistema", "e 0 o primeiro dígito do produto)","\nDÍGITO 4 =>", "12345679 x 9 =>", "1", 
				"(onde 9 foi a chave fornecida pelo sistema", "e 1 o primeiro dígito do produto)", "\nA senha seria => 1701 .", nome,
				"pode tentar até acertar.\n"
			};
		//exibição com delay de 5 segundos
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
	
	public static String desafio5(String personagem) {
		String senha = "",
			   status = "",
			   senhaInserida = "";
		int digito1 = 0,
			digito2 = 0,
			digito3 = 0,
			digito4 = 0,
			correta = 0,
			tentativas = 0;
		Random variavel = new Random();
		int digitos[] = new int[4];
		//determina que o valor da senha do zelador terá que ser entre 1000 e 9999
		senha = String.valueOf(variavel.nextInt((9999 - 1000) + 1) + 1000);
		do {
			//pede a entrada de cada dígito individualmente
			System.out.println("\nQual a senha para acessar o servidor?\n");
			//gera as chaves da senha baseado na senha gerada automaticamente 
			for(int i = 0; i <= digitos.length-1; i++) {
				digitos[i] = Integer.parseInt(senha.substring(i, (i+1)));
				System.out.println("A chave para o "+(i+1)+"° dígito => "+(digitos[i]*9));
			}
			System.out.println("\n"+personagem+"  _____    _____    _____    _____\n"
			          +" |     |  |     |  |     |  |     |\n"
			          + " |  ?  |  |  ?  |  |  ?  |  |  ?  |\n"
			          + " |_____|  |_____|  |_____|  |_____|\n");
			System.out.print("Entre com o primeiro dígito: ");
				digito1 = sc.nextInt();
			System.out.print("Entre com o segundo dígito: ");
				digito2 = sc.nextInt();
			System.out.print("Entre com o terceiro dígito: ");
				digito3 = sc.nextInt();
			System.out.print("Entre com o quarto dígito: ");
				digito4 = sc.nextInt();
			
			//transforma a senha em uma String
			senhaInserida = String.valueOf(digito1) + String.valueOf(digito2) + String.valueOf(digito3) + String.valueOf(digito4);
			System.out.println("  _____    _____    _____    _____\n"
			          +" |     |  |     |  |     |  |     |\n"
			          + " |  "+digito1+"  |  |  "+digito2+"  |  |  "+digito3+"  |  |  "+digito4+"  |\n"
			          + " |_____|  |_____|  |_____|  |_____|\n");
			
			//compara a senha gerada no início com a senha inserida pelo usuário
			if(senha.equals(senhaInserida)) {
				System.out.println("Senha correta! Servidor pode ser acessado!");
				correta = 1;
				status = "correta";
			}  else {
				System.out.println("Senha incorreta! Não foi possível conectar ao servidor!\n");
				correta = 0;
				status = "incorreta";
			}
		}while(correta != 1 && tentativas <= 2);
		System.out.println("\t\t\t\t\t\t\tFIM FASE 1\n");
		return status;
	}
	
	//detalha com o usuári se saiu em cada desafio(acerto ou erro)
	public static String feedbackFase1(String array[]) {
		String retorno = "";
		//percorre o array e verifica cada posicao
		for(int i = 0; i <= array.length-1; i++) {
			//checa a correspodencia das posições do arrya com as questões ex: posicao 0 do array == desafio1
			if (i == 0) {
				//verifica se o usuário acertou ou errou o desafio, adicionando a String retorno se foi acerto ou erro
				if(array[i].equals("correta")) {
					retorno += "\t\t\t\t\t\t __________________________\n";
					retorno += "\t\t\t\t\t\t|                          |\n";
					retorno += "\t\t\t\t\t\t| Você acertou o desafio "+(i+1)+" |\n";
				} else {
					retorno += "\t\t\t\t\t\t __________________________\n";
					retorno += "\t\t\t\t\t\t|                          |\n";
					retorno += "\t\t\t\t\t\t| Você errou o desafio "+(i+1)+"   |\n";
				}
			} else if (i == 1) {
				if(array[i].equals("correta")) {
					retorno += "\t\t\t\t\t\t| Você acertou o desafio "+(i+1)+" |\n";
				} else {
					retorno += "\t\t\t\t\t\t| Você errou o desafio "+(i+1)+"   |\n";
				}
			} else if (i == 2) {
				if(array[i].equals("correta")) {
					retorno += "\t\t\t\t\t\t| Você acertou o desafio "+(i+1)+" |\n";
				} else {
					retorno += "\t\t\t\t\t\t| Você errou o desafio "+(i+1)+"   |\n";
				}
			} else if (i == 3) {
				if(array[i].equals("correta")) {
					retorno += "\t\t\t\t\t\t| Você acertou o desafio "+(i+1)+" |\n";
				} else {
					retorno += "\t\t\t\t\t\t| Você errou o desafio "+(i+1)+"   |\n";
				}
			} else if (i == 4) {
				if(array[i].equals("correta")) {
					retorno += "\t\t\t\t\t\t| Você acertou o desafio "+(i+1)+" |\n";
					retorno += "\t\t\t\t\t\t|__________________________|\n";
				} else {
					retorno += "\t\t\t\t\t\t| Você errou o desafio "+(i+1)+"   |\n";
					retorno += "\t\t\t\t\t\t|__________________________|\n";
				}
			}
		}
		//retorna a String retorno, que contém o feedback geral do usuário dizendo onde errou ou acertou
		return retorno;
	}
	
	//se na função feedbackFase1 o usuário tiver algum erro, essa função é exibida para ele tentar refazer o desafio que foi errado
	public static String[] necessidadeRefazer(String dados[], String nome, char sexo, String visual) {
		String retorno[] = new String[5];
		String retDesafio = "";
		int x = 0;
		for(int i = 0; i <= dados.length-1; i++) {
			//confere se o array tem alguma posição incorreta
			if(dados[i].equals("incorreta")) {
				x++;
			}
		}
		
		if(x != 0) {
			//se existir alguma posição marcada como errada aqui é permitido refaze-la
			System.out.println("\nVocê terá uma chance de realizar apenas os desafios que você errou!");
			System.out.println("Se não conseguir acertar todos...\n");
			System.out.println("GAME OVER\n");
			for (int i = 0; i <= dados.length-1; i++) {
				if(dados[i].equals("incorreta")) {
					//exibe o desafio que foi errado de acordo com a posição do array
					System.out.println("Você não acertou o desafio "+(i+1)+".\nFaça novamente!");
					if(i == 0) {
						retDesafio = desafio1(nome, sexo, visual);
					} else if(i == 1) {
						retDesafio = desafio2();
					} else if(i == 2) {
						retDesafio = desafio3(visual);
					} else if(i == 3) {
						retDesafio = desafio4(visual);
					} else {
						retDesafio = desafio5(visual);
					}
					retorno[i] = retDesafio;
				} else {
					retorno[i] = dados[i];
				}
			}
		}
		return retorno;
	}
	
	//função que demarca o fim da fase 1
	public static void fimFase1(String dados[]) {
		int x = 0;
		//confere se o array passado contém alguma resposta incorreta
		for(int i = 0; i <= dados.length-1; i++) {
			if(dados[i].equals("incorreta")) {
				x++;
			}
		}
		
		if(x == 0) {
			//se não tem nenhuma incorreta, o personagem vira o melhor hacker de sp
			System.out.println("\n");
			System.out.println("███╗   ███╗███████╗██╗     ██╗  ██╗ ██████╗ ██████╗     ██╗  ██╗ █████╗  ██████╗██╗  ██╗███████╗██████╗     ██████╗ ███████╗    ███████╗██████╗ \n" + 
							   "████╗ ████║██╔════╝██║     ██║  ██║██╔═══██╗██╔══██╗    ██║  ██║██╔══██╗██╔════╝██║ ██╔╝██╔════╝██╔══██╗    ██╔══██╗██╔════╝    ██╔════╝██╔══██╗\n" + 
							   "██╔████╔██║█████╗  ██║     ███████║██║   ██║██████╔╝    ███████║███████║██║     █████╔╝ █████╗  ██████╔╝    ██║  ██║█████╗      ███████╗██████╔╝\n" + 
							   "██║╚██╔╝██║██╔══╝  ██║     ██╔══██║██║   ██║██╔══██╗    ██╔══██║██╔══██║██║     ██╔═██╗ ██╔══╝  ██╔══██╗    ██║  ██║██╔══╝      ╚════██║██╔═══╝ \n" + 
							   "██║ ╚═╝ ██║███████╗███████╗██║  ██║╚██████╔╝██║  ██║    ██║  ██║██║  ██║╚██████╗██║  ██╗███████╗██║  ██║    ██████╔╝███████╗    ███████║██║     \n" + 
							   "╚═╝     ╚═╝╚══════╝╚══════╝╚═╝  ╚═╝ ╚═════╝ ╚═╝  ╚═╝    ╚═╝  ╚═╝╚═╝  ╚═╝ ╚═════╝╚═╝  ╚═╝╚══════╝╚═╝  ╚═╝    ╚═════╝ ╚══════╝    ╚══════╝╚═╝    ");
			//demarca o início da fase 2
			System.out.println("\t\t\t\t\t\t\t\tFASE 2");
		} else {
			//se tiver questão incorreta no array, determina o fim do jogo
			System.out.println("\t\t\t\t ██████╗  █████╗ ███╗   ███╗███████╗     ██████╗ ██╗   ██╗███████╗██████╗ \n" + 
							   "\t\t\t\t██╔════╝ ██╔══██╗████╗ ████║██╔════╝    ██╔═══██╗██║   ██║██╔════╝██╔══██╗\n" + 
							   "\t\t\t\t██║  ███╗███████║██╔████╔██║█████╗      ██║   ██║██║   ██║█████╗  ██████╔╝\n" + 
							   "\t\t\t\t██║   ██║██╔══██║██║╚██╔╝██║██╔══╝      ██║   ██║╚██╗ ██╔╝██╔══╝  ██╔══██╗\n" + 
							   "\t\t\t\t╚██████╔╝██║  ██║██║ ╚═╝ ██║███████╗    ╚██████╔╝ ╚████╔╝ ███████╗██║  ██║\n" + 
							   "\t\t\t\t ╚═════╝ ╚═╝  ╚═╝╚═╝     ╚═╝╚══════╝     ╚═════╝   ╚═══╝  ╚══════╝╚═╝  ╚═╝");
			//fecha a aplicação sendo necessário o reinicio do jogo
			System.exit(0);
		}
	}
	/******************************************************************FIM FASE 1****************************************************************/
	
	/******************************************************************INÍCIO FASE 2*************************************************************/
	
	public static void historiaInicialFase2(char sexo, String nome) {
		//historia inicial da segunda fase
		String artigo = "";
		//define o a partir do sexo do personagem o artigo da frase
		if(sexo == 'M') {
			artigo = "ele";
		} else {
			artigo = "ela";
		}
		System.out.println("\n");
		//utiliza o nome e o artigo para escrever a história
		String historia[] = 
			{
				nome, "conseguiu provar", "a toda a comunidade dos hackers", "que ele era o melhor,", "podendo se entitular como:",
				"O MELHOR HACKER DE SÃO  PAULO.", "Por ter tamanha capacidade,", artigo, "começou a ser", "invejado por outros", 
				"hackers.", "Na tentativa de", "se tornar melhor que ele", "um grupo de hackers se uniu,", "porém, esse grupo",
				"não fazia coisas", "que não faziam mal a ninguém", "como", nome, "fazia.", "O grupo realizava", "ações que eram",
				"prejudiciais a comunidade", "como roubo de informações", "e até mesmo em casos extremos,", "roubo de bitcoins,",
				"moeda valiosa no mundo dos hackers.", "Esses delitos começaram a", "ser mais frequentes", "e a polícia", "precisou intervir.",
				"A equipe de defesa cibernética", "da polícia, foi chamada", " e tentou de diversas maneiras", "impedir este grupo,", "porém as tetativas foram",
				"todas por água abaixo.", "E a cada embate com a polícia,","que eles venciam,","o grupo de hackers", "se tornava cada vez mais forte.",
				"Com a força do grupo aumentando,", "e a força da polícia para", "combatê-los cada", "vez mais fraca,","o grupo se prepara",
				"para o ataque de maior", "intensidade:","ATACAR TODA A BASE DE DADOS", "DO FACEBOOK.", "Uma vez dentro da base", "o grupo teria acesso",
				"a informações pessoais de 500 milhões de usuários", "e conseguiria vender tudo na", "deep web, recebendo muito dinheiro", "nessa transação.",
				"A polícia começou a suspeitar", "sobre um ataque maior,", "devido o crescimento", "na dificuldade dos últimos desafios.",
				"Pensando nisso,", "a polícia sabendo que", "não tinha forças para combater o","grupo, decide procurar", "um hacker bom para combatê-los.",
				"Após procurar muito", "a polícia achou", nome, "que era cohecido", "como o melhor hacker de São Paulo,", "se encaixando", 
				"perfeitamente no que a polícia", "procurava.", "A polícia", "fez a proposta e", nome, "aceitou, agora o melhor hacker fazia",
				"parte da equipe da polícia."
			};
		//exibição com delay de 5 segundos
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
	
	public static void historiaDesafio1Fase2(char sexo, String nome) {
		//historia do desafio 1 fase 2
		String artigo = "";
		//define o a partir do sexo do personagem o artigo da frase
		if(sexo == 'M') {
			artigo = "ele";
		} else {
			artigo = "ela";
		}
		System.out.println("\n");
		//utiliza o nome e o artigo para escrever a história
		String historia[] = 
			{
				"Chegou o dia em que", "o grupo de hackers", "ia realizar entrada nos servidores", "do Facebook, para o roubo", "das informações.",
				nome, "estava acompanhando", "as movimentações", "do servidor do Facebook pois,", "ele havia sido contratado", "para realizar este monitoramento.",
				"O grupo iniciou o ataque", "a estratégia do grupo era simples", "entrar no servidor", "pegar as senhas que estavam", "criptografadas",
				"e roubar as informações.", "Porém eles não", "contavam que a polícia", "havia se reforçado", "e estava preparada.", nome, "sabia",
				"qual seria o plano de ação", "do grupo de hackers,", "pois já tinha hackeado um servidor parecido antes.", "Por estar sozinho,", nome,
				"teve que estudar como se defender,", "ele sabia que o grupo estava preparado fortemente.", "Para se defender",artigo ,"precisava descobrir",
				"qual era essa criptografia.", nome, "começou a observar","e percebeu que por padrão", "a senha era composta por 8 dígitos numéricos", 
				"e no servidor esta senha era criptgrafada", "da seguinte maneira:", "SENHA DO USUÁRIO => 12345678 .", "SENHA NO SERVIDOR => ABCDEFGH ."
			};
		//exibição com delay de 5 segundos
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
	
	public static String desafio1Fase2() {
		int correta = 0;
		int cont = 1;
		String status = "";
		char resposta = 0;
		ArrayList<String> alternativas = new ArrayList<String>();
		//adicionando as alternativas ao arraylist
		alternativas.add("Número => Caractere correspondente");
		alternativas.add("Caractere correspondente => Número");
		alternativas.add("Número => Hexadecimal");
		alternativas.add("Número => Caractere sortido");
		
		 do {
			System.out.println("\nQual a criptografia?");
			//troca as alternativas de posição
			Collections.shuffle(alternativas);
			//exibe todas as alternatias do arraylist 
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
				}
			}
				resposta = sc.next().toUpperCase().charAt(0);
			//observa se a resposta inputada pelo usuário está correta
				switch(resposta) {
				case 'A':
					if (alternativas.get(0).equals("Número => Caractere correspondente")) {
						System.out.println("Criptografia correta!");
						correta = 1;
						status = "correta";
					} else {
						System.out.println("Criptografa incorreta!");
						correta = 0;
						status = "incorreta";
					}
					break;
				case 'B':
					if (alternativas.get(1).equals("Número => Caractere correspondente")) {
						System.out.println("Criptografia correta!");
						correta = 1;
						status = "correta";
					} else {
						System.out.println("Criptografa incorreta!");
						correta = 0;
						status = "incorreta";
					}
					break;
				case 'C':
					if (alternativas.get(2).equals("Número => Caractere correspondente")) {
						System.out.println("Criptografia correta!");
						correta = 1;
						status = "correta";
					} else {
						System.out.println("Criptografa incorreta!");
						correta = 0;
						status = "incorreta";
					}
					break;
				case 'D':
					if (alternativas.get(3).equals("Número => Caractere correspondente")) {
						System.out.println("Criptografia correta!");
						correta = 1;
						status = "correta";
					} else {
						System.out.println("Criptografa incorreta!");
						correta = 0;
						status = "incorreta";
					}
					break;
			}
				cont++;
				//este laço tem sua execução interrompida após a realização das duas tentativas ou respota correta
		} while (correta != 1 && cont <= 2);
		 return status;
	}
	
	public static void main(String[] args) {
		//utilizamos a main como um maestro, apenas chamando as funções
		int idadePersonagem = 0,
			correta = 0;
		char sexoPersonagem;
		String nomePersonagem = "",
			   condicaoInicioJogo = "",
			   visualPersonagem = "",
			   desafio1 = "",
			   desafio2 = "",
			   desafio3 = "",
			   desafio4 = "",
			   desafio5 = "",
			   resultadoDesafio1 = "",
			   desafio1Fase2 = "",
			   modoTeste = "";
		String informacoesPersonagem[] = new String[3];
		String statusDesafiosFase1[] = new String[5];
		String statusRefeito[] = new String[5];
		
		participacaoJogo();
		informacoesPersonagem = definiPersonagem();
		
		sexoPersonagem = informacoesPersonagem[0].charAt(0);
		nomePersonagem = informacoesPersonagem[1].substring(0, 1).toUpperCase().concat(informacoesPersonagem[1].substring(1).toLowerCase());
		idadePersonagem = Integer.parseInt(informacoesPersonagem[2]);
		
		condicaoInicioJogo = confereInformacoes(informacoesPersonagem);
		visualPersonagem = selecionaBoneco(sexoPersonagem);
		System.out.println("\n"+nomePersonagem +" seu personagem para participar do jogo será: \n\n"+visualPersonagem);
		carregarInicio(condicaoInicioJogo);
		//começa a fase 1
		historiaInicial(nomePersonagem, idadePersonagem, sexoPersonagem);
		desafio1 = desafio1(nomePersonagem, sexoPersonagem, visualPersonagem);
		historiaDesafio2(nomePersonagem, sexoPersonagem);
		desafio2 = desafio2();
		historiaDesafio3(sexoPersonagem, nomePersonagem);
		desafio3 = desafio3(visualPersonagem);
		historiaDesafio4(sexoPersonagem, nomePersonagem);
		desafio4 = desafio4(visualPersonagem);
		historiaDesafio5(sexoPersonagem, nomePersonagem);
		desafio5 = desafio5(visualPersonagem);
		
		//armazena dentro do array se o usuário acertou ou errou os desafios, esse array será utilizado para fazer o feedback da primeira fase
		statusDesafiosFase1[0] = desafio1;
		statusDesafiosFase1[1] = desafio2;
		statusDesafiosFase1[2] = desafio3;
		statusDesafiosFase1[3] = desafio4;
		statusDesafiosFase1[4] = desafio5;
		
		resultadoDesafio1 = feedbackFase1(statusDesafiosFase1);
		System.out.println(resultadoDesafio1);
		statusRefeito = necessidadeRefazer(statusDesafiosFase1, nomePersonagem, sexoPersonagem, visualPersonagem);
		
		for(int i = 0; i <= statusDesafiosFase1.length-1; i++) {
			if(statusDesafiosFase1[i].equals("incorreta")) {
				//confere se o usuário acertou ou não todos os desafios
				correta++;
			}
		}
		if(correta > 0) {
			//se ele não acertou todas, passamos o array que retornou da função necessidadeRefazer
			fimFase1(statusRefeito);
		} else {
			//se ele acertou todas as questões, passamos o array original statusDesafiosFase1
			fimFase1(statusDesafiosFase1);
		}
		//termina a fase 1
		
		//começa a fase 2
		historiaInicialFase2(sexoPersonagem, nomePersonagem);
		historiaDesafio1Fase2(sexoPersonagem, nomePersonagem);
		desafio1Fase2 = desafio1Fase2();
		System.out.println(desafio1Fase2);
	}
}