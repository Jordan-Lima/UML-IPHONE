package devices;

import java.util.Scanner;
import interfaces.InterfaceTelefone;

public class Telefone implements InterfaceTelefone {
    boolean statusLigacao;
    
    @Override
    public void realizarChamada() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite os números: ");
        String numeroTelefone = scanner.nextLine();
        System.out.println("Ligando para " + " " + numeroTelefone);
        scanner.close();
        statusLigacao = true;
    }
    public void desligarChamada() {
        if(statusLigacao) {
            statusLigacao = false;
        }
    }
    public void atenderChamada() {
        if (statusLigacao == false) {
            statusLigacao = true;
        }
    }
}
