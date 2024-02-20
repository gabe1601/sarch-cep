import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {

        SearchLink searchLink = new SearchLink();
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um CEP: ");
        var cep = sc.nextLine();

        try {
            Address address = searchLink.searchCep(cep);
            System.out.println(address);
            FileGenerate generator = new FileGenerate();
            generator.saveJson(address);
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
            System.out.println("Finalizando aplicação!");
        }
    }
}
