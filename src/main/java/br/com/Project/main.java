package br.com.Project;
import java.util.Scanner;
import br.com.Project.Pack1.Somar;
import br.com.Project.Pack2.Subtrair;
import br.com.Project.Pack3.Multiplicar;

public class main {
    public static void main(String[] args) {
        Somar som = new Somar();
        int resultado1 = som.soma(5,6);
        System.out.println(resultado1);
        System.out.println();

        Subtrair sub = new Subtrair();
        int resultado2 = sub.subitrai(7,16);
        if (resultado2<0){
            System.out.println("O resultado deu negativo!");
        }
        System.out.println(resultado2);
        System.out.println();

        Multiplicar mult = new Multiplicar();
        int resultado3 = mult.multiplica(5,6);
        System.out.println(resultado3);
    }
}
