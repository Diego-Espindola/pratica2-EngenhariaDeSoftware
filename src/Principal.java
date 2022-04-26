
import com.singleton.Chocolateboiler;

public class Principal {

    public static void main(String[] args) {

        Chocolateboiler choco1 = new Chocolateboiler();
        Chocolateboiler choco2 = new Chocolateboiler();

        if (choco1 == choco2) {
            System.out.println("Os objetos sao iguais");
        } else {
            System.out.println("Os objetos sao diferentes");
        }
    }
}
