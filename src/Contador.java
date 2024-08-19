import java.util.Scanner;

public class Contador{

    static void mostrarNumeros(int num1, int num2) throws ParametrosInvalidosException{
        if(num1 >= num2){
            throw new ParametrosInvalidosException();
        }
        for (int i = num1; i <= num2; i++){
            System.out.println("Mostrando o numero " + i + ".\n");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        int num1 = scanner.nextInt();
        System.out.println("Digite o segundo numero: ");
        int num2 = scanner.nextInt();
        try{
            mostrarNumeros(num1, num2);
        }
        catch(ParametrosInvalidosException e){
            System.out.println("O primeiro numero deve ser maior que o segundo!\n");
        }
    }
}