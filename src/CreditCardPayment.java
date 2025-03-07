import java.util.Scanner;

public class CreditCardPayment implements PaymentStrategy {
    @Override
    public void processPayment(double valor) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número de cartão de crédito: ");
        String cardNumber = scanner.nextLine();
        System.out.println("Pagamento de " + valor + " realizado via cartão de crédito. Número do cartão: " + cardNumber);
    }
}