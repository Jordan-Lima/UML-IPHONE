import devices.Ipod;
import devices.Navegador;
import devices.Telefone;

public class Iphone {
    Ipod reprodutorMusica = new Ipod();
    Navegador navegador = new Navegador();
    Telefone telefone = new Telefone();

    public static void main(String[] args) {
        Iphone iphone = new Iphone();
        
        iphone.reprodutorMusica.play();
        iphone.reprodutorMusica.play();
        iphone.navegador.acessarLink();
        iphone.telefone.realizarChamada();
    }
}

