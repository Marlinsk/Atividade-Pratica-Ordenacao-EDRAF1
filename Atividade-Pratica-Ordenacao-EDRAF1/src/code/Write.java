package code;

import java.io.FileWriter; // cria um arquivo
import java.io.IOException; // trata uma exce��o de erro do tipo IO
import java.util.List; // l� um objeto arrayList
import java.util.stream.Collectors; // implementa v�rias opera��es �teis de agrega��o como contagem, m�dia, soma, m�ximo, agrupamento e outras que podem ser aplicadas ao final do processamento de uma Stream 

public class Write {
	
	// M�todo para criar o arquivo com os dados modificados
	public static void writeFile(List<Item> listaItens) throws IOException {
		
		// Especificando o caminho onde vai ficar salvo o arquivo criado
        FileWriter writer = new FileWriter("C://Users/Marlinsk/git/Atividade-Pratica-Ordenacao-EDRAF1/Atividade-Pratica-Ordenacao-EDRAF1/file/JogosOrdenados.csv");
        
        String collect =  listaItens.stream().map(item -> item.game + ", " + item.category + ", " + item.evaluation + "\n").collect(Collectors.joining(""));

        System.out.println(collect);

        writer.write(collect);
        writer.close();
    }
	
}
