package code;

import java.io.BufferedReader; // faz a leitura da entrada de dados
import java.io.FileNotFoundException; // tratativa de erro ao n�o encontrar o arquivo
import java.io.FileReader; // l� o arquivo
import java.util.List; // l� um objeto arrayList

public class Read {
	
	 // M�todo para ler arquivo csv 
	public static void Readfile(List<Item> Itemlist) throws Exception {
		try {
			
			// Caminho do arquivo JogosDesordenados.csv
			String path = "C://Users/Marlinsk/git/Atividade-Pratica-Ordenacao-EDRAF1/Atividade-Pratica-Ordenacao-EDRAF1/file/JogosDesordenados.csv";
			BufferedReader br = new BufferedReader(new FileReader(path));
			
			// Armazena os dados do arquivo JogosDesordenados.csv
			String line = "";
			
			// Criando um loop para percorrer os dados do arquivo JogosDesordenados.csv e armazenar em um atributo
			while ((line = br.readLine()) != null) {
				
				// Separa os dados por uma (,)
				String[] Gameslist = line.split(",");
				
				// Instanciando um objeto para obter seus atributos.
				Item item = new Item();
				
				// Armazenando na posi��o
				item.game = Gameslist[0]; // Armazena todos os nomes dos jogos 
				item.category = Gameslist[1]; // Armazena todos os nomes das categorias
				item.evaluation = Gameslist[2]; // Armazena todas as notas/avalia��es dos jogos
				
				Itemlist.add(item);
				
			}
		// Para tratativa de erro caso ocorra uma falha ao o arquivo	
		} catch (FileNotFoundException e) {
			throw e;
		}
	}
}
