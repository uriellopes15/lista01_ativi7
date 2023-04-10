import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Digite o valor da lateral do quadrado: ");
    float lado = new Scanner(System.in).nextFloat();
    
    System.out.println("O dobro da area do quadrado eh de: " + ((lado * lado) * 2) );
    }
}
