package com.singleton;

// Código retirado do livro :FREEMAN, Eric; FREEMAN, Elisabeth. Use a cabeça: padrões e projetos. 2. ed. rev. Rio de Janeiro: Alta Books, 2009. xxiv, 478 p. (Use a cabeça!). ISBN 9788576081746.
public class Chocolateboiler {
    private static Chocolateboiler singleChocolateboiler;
    private boolean empty;
    private boolean boiled;

    /**
     * Este código só é iniciado quando a caldeira está vazia
     */
    private Chocolateboiler() {
        empty = true;
        boiled = false;
        System.out.println("Caldeira esta vazia.");
    }

    public static Chocolateboiler createChocolateBoiler() {
        if (singleChocolateboiler == null) {
            singleChocolateboiler = new Chocolateboiler();
        }
        return singleChocolateboiler;
    }

    /**
     * Para encher a caldeira, ela deve estar vazia e , quando estiver cheia,
     * configuramos os indicadores de empty e boiled
     */
    public void fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;
            // preencha a caldeira com uma mistura de leite e chocolate
            System.out.println("Preencha a caldeira com uma mistura de leite e chocolate");
        }
    }

    /**
     * Para drenar a caldeira, ela deve estar cheia (não vazia) e também em
     * ebulição. Depois, configuramos empty como true novamente
     */
    public void drain() {
        if (!isEmpty() && isBoiled()) {
            //drene o leite e o chocolate fervidos
            System.out.println("Drene o leite e o chocolate fervidos");
            empty = true;
        }
    }

    /**
     * Para fever a mistura, a caldeira deve estar cheia e ainda não deve ter
     * fervida. Depois de fever, congiguramos o indicador boiled como true.
     */
    public void boil() {
        if (!isEmpty() && !isBoiled()) {
            //coloque o conteúdo em ebulição  
            System.out.println("Coloque o conteúdo em ebulição  ");
            boiled = true;
        }
    }

    public boolean isEmpty() {
        System.out.println("isEmpty:" + empty);
        return empty;
    }

    public boolean isBoiled() {
        System.out.println("isBoiled:" + boiled);
        return boiled;
    }
}
