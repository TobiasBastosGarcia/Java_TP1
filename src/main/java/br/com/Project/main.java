package br.com.Project;
import java.util.Scanner;
import br.com.Project.Pack1.Somar;
import br.com.Project.Pack2.Subtrair;
import br.com.Project.Pack3.Multiplicar;
import br.com.Project.Pack4.Dividir;

public class main {
    public static void main(String[] args) {
        double a = 10;
        double b = 8;

        Somar som = new Somar();
        double resultado1 = som.soma(a,b);
        System.out.println(resultado1);
        System.out.println();

        Subtrair sub = new Subtrair();
        double resultado2 = sub.subitrai(a,b);
        if (resultado2<0){
            System.out.println("O resultado deu negativo!");
        }
        System.out.println(resultado2);
        System.out.println();

        Multiplicar mult = new Multiplicar();
        double resultado3 = mult.multiplica(a,b);
        System.out.println(resultado3);
        System.out.println();

        Dividir div = new Dividir();
        double resultado4 = div.divisao(a, b);
        System.out.println(resultado4);
    }
}
