import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

public class Main {

    // Atributo da classe com Array de nomes
    private static String[] nomes = {"João", "José", "Pedro",
            "Carlos","Jaqueline","Matheus","Marcelo"};

    public Main() {
        // Instanciando HashMap para armazenar a quantidade de
        // nomes que iniciam com determinada letra
        HashMap map = new HashMap<>();
        // Wrapper Class Integer para registrar a quantidade de ocorrências
        // de determinada letra (campo VALOR)
        Integer i;

        // Percorrendo o Array de nomes para criar as chaves e valores
        for(int j=0; j<nomes.length; j++) {
            // Verificar a quantidade de ocorrências de determinada letra
            // usando o método get
            i = (Integer) map.get(new Character((nomes[j].charAt(0))));

            // Caso não tenha retornado ocorrências da letra pesquisada
            // Criar uma chave para esta letra e inicializar com 1
            if(i==null) {
                map.put(new Character(nomes[j].charAt(0)),new Integer(1));
            } else {
                // Caso tenha retornado ocorrências da letra pesquisada
                // Incrementar o valor em 1
                map.put(new Character(nomes[j].charAt(0)),new Integer(i.intValue()+1));
            }
        }
        // Gerando a saída no método geraSaidaMap
        this.geraSaidaMap(map);
    }

    private void geraSaidaMap(Map mapRef) {
        String saida = "";
        saida += "Número de palavras iniciadas com a letra: ";
        saida += "\n" + mapRef.toString();
        saida += "\nQuantidade de valores do Map: " + mapRef.size();
        saida += "\né vazio?: " + mapRef.isEmpty();

        // Configurando a TextArea
        JTextArea saidaArea = new JTextArea();
        // Atribuindo a string à TextArea
        saidaArea.setText(saida);

        // Exibindo a TextArea em uma caixa de diálogo
        JOptionPane.showMessageDialog(null,saidaArea,"Trabalhando com Maps",JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }

    public static void main(String[] args) {
        // Chamando o construtor da classe para executar
        // a pesquisa e montagem do HashMap
        new Main();
    }
}
