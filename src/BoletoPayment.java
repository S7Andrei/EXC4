import java.util.UUID;

public class BoletoPayment implements PaymentStrategy {
    @Override
    public void processPayment(double valor) {
        String boletoCode = UUID.randomUUID().toString();
        System.out.println("Código de boleto: " + boletoCode);
        System.out.println("Pagamento de " + valor + " realizado via boleto.");
    }
}
