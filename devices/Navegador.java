package devices;

import interfaces.InterfaceNavegador;
import java.util.Scanner;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URI;
import java.net.URISyntaxException;

public class Navegador implements InterfaceNavegador {
    @Override
    public void acessarLink() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite seu link: ");
        String link = scan.nextLine();
        scan.close();

        try {
            URI uri = new URI(link);
            URL url = uri.toURL();
            HttpURLConnection connection = (HttpURLConnection)  url.openConnection();
            int responseCode = connection.getResponseCode();

            if(responseCode == HttpURLConnection.HTTP_OK) {
                System.out.println("Acessou");
            } else {
                System.out.println("Não está disponível");
            }
        } catch (URISyntaxException e) {
            System.out.println("Erro na sintaxe da URL: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Site inexistente!");
        }

    }

    @Override
    public void novaAba() {
        int numeroAbas = 1;
        numeroAbas +=1;
        System.out.println("Você está na aba "+ numeroAbas);

    }

    @Override
    public void recarregar() {
        System.out.println("Recarregando");
    }
}
