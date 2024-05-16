import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Criar uma lista simples para demonstração
        List<String> lista = new ArrayList<>();
        lista.add("Item 1");
        lista.add("Item 2");
        lista.add("Item 3");

        // Chamar o método para gravar a lista em um arquivo JSON
        gravarListaComoJson(lista);
    }

    public static void gravarListaComoJson(List<String> lista) {
        // Criar um objeto Gson para serialização
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        try (FileWriter writer = new FileWriter("lista.json")) {
            // Serializar a lista em formato JSON e gravar no arquivo
            gson.toJson(lista, writer);
            System.out.println("Lista gravada como JSON com sucesso!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
