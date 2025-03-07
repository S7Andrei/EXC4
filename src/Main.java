import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Selecione método de pagamento:");
        System.out.println("1: Pix");
        System.out.println("2: Cartão de crédito");
        System.out.println("3: Boleto");

        int choice = scanner.nextInt();
        System.out.print("Digite o valor: ");
        double valor = scanner.nextDouble();

        PaymentStrategy paymentStrategy = null;

        switch (choice) {
            case 1:
                paymentStrategy = new PixPayment();
                break;
            case 2:
                paymentStrategy = new CreditCardPayment();
                break;
            case 3:
                paymentStrategy = new BoletoPayment();
                break;
            default:
                System.out.println("Escolha invalidá.");
                System.exit(0);
        }

        PaymentProcessor processor = new PaymentProcessor(paymentStrategy);
        processor.process(valor);
    }
}