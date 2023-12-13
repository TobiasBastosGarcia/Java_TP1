package br.com.Project;

import br.com.Project.Pack1.Somar;
import br.com.Project.Pack2.Subtrair;
import br.com.Project.Pack4.Dividir;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AppTest {
    @Test
    @DisplayName("Deve testar a soma de dois numeros")
    public void testarSoma(){
        Somar sum = new Somar();

        assertEquals(4,sum.soma(2,2));
    } @Test
    @DisplayName("Deve testar a divisão de dois numeros ")
    public void testarDiv(){
       Dividir div = new Dividir();
       assertEquals(1,div.divisao(3,3));
        assertThrows(ArithmeticException.class, ()-> {
            assertEquals(1,div.divisao(3,0));
        });

    }

}
