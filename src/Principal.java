
import com.singleton.Chocolateboiler;

public class Principal {

    public static void main(String[] args) {

        Chocolateboiler choco1 = Chocolateboiler.createChocolateBoiler();
        Chocolateboiler choco2 = Chocolateboiler.createChocolateBoiler();


        System.out.println(choco1);
        System.out.println(choco2);

        Chocolateboiler choco3 = Chocolateboiler.createChocolateBoiler();
        System.out.println(choco3);
        if (choco1 == choco2 && choco2 == choco3) {
            System.out.println("Os objetos sao iguais");
        } else {
            System.out.println("Os objetos sao diferentes");
        }
    }
}
