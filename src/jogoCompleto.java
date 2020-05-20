import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class jogoCompleto {
	
	static Scanner sc = new Scanner(System.in);
	
	static void participacaoJogo() {
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
	
	static String[] definiPersonagem() {
		//usuário insere as informações do funcionário e armazena em um array
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
	
	static void carregarInicio(String status) {
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
	
	static void historiaInicial(String nome, int idade, char sexo) {
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
	
	static String desafio1(String nome, char sexo, String personagem) {
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
	
	static void historiaDesafio2(String nome, char sexo) {
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
	
	static String desafio2() {
		int correta = 0;
		int cont = 1;
		String status = "";
		char resposta = 0;
		ArrayList<String> alternativas = new ArrayList();
		//adicionando as alternativas ao arraylist
		alternativas.add("620");
		alternativas.add("625");
		alternativas.add("650");
		alternativas.add("600");
		alternativas.add("575");
		
		 do {
			System.out.println("O relógio terá que parar de registrar ao chegar a marca de quantos kWh?");
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
	
	static void historiaDesafio3(char sexo, String nome) {
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
	
	static String desafio3(String personagem) {
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
	
	public static void main(String[] args) {
		//utilizamos a main como um maestro, apenas chamando as funções
		int idadePersonagem = 0;
		char sexoPersonagem;
		String nomePersonagem = "",
			   condicaoInicioJogo = "",
			   visualPersonagem = "",
			   desafio1 = "",
			   desafio2 = "",
			   desafio3 = "";
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
		historiaDesafio3(sexoPersonagem, nomePersonagem);
		desafio3 = desafio3(visualPersonagem);
		
		//armazena dentro do array se o usuário acertou ou errou os desafios, esse array será utilizado para fazer o feedback da primeira fase
		statusDesafiosFase1[0] = desafio1;
		statusDesafiosFase1[1] = desafio2;
		statusDesafiosFase1[2] = desafio3;
		
		for(int i = 0; i <= statusDesafiosFase1.length-1; i++) {
			System.out.println("DESAFIO "+i+" => "+statusDesafiosFase1[i]);
		}
	}
}
