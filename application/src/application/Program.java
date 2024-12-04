package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Program {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicita ao usuário o caminho completo do arquivo de entrada
        System.out.print("Enter file full path: ");
        String path = sc.nextLine();

        // Map para armazenar a contagem de votos de cada candidato, ordenado alfabeticamente
        Map<String, Integer> votes = new TreeMap<>();

        // Map<String, Integer> votes = new LinkedHashMap<>();
        /** Usa LinkedHashMap, que mantém a ordem de inserção dos elementos.
        Isso significa que os candidatos serão exibidos na ordem em que foram lidos do arquivo, em vez de em ordem alfabética. **/

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;

            // Lê cada linha do arquivo
            while ((line = br.readLine()) != null) {
                // Divide a linha em nome do candidato e a quantidade de votos
                String[] fields = line.split(",");
                String candidate = fields[0].trim(); // Nome do candidato
                int voteCount = Integer.parseInt(fields[1].trim()); // Quantidade de votos

                // Adiciona a quantidade de votos ao candidato no map
                votes.put(candidate, votes.getOrDefault(candidate, 0) + voteCount);
            }

            // Exibe o relatório consolidado
            System.out.println();
            for (Map.Entry<String, Integer> entry : votes.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }

        } catch (IOException e) {
            // Trata erro ao ler o arquivo
            System.out.println("Error: " + e.getMessage());
        }

        sc.close(); // Fecha o scanner
    }
}