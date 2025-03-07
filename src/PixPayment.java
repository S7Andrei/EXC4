import java.util.UUID;

public class PixPayment implements PaymentStrategy {
    @Override
    public void processPayment(double valor) {
        String pixCode = UUID.randomUUID().toString();
        System.out.println("Códio Pix: " + pixCode);
        System.out.println("Pagamento de " + valor + " realizado via Pix.");
    }
}