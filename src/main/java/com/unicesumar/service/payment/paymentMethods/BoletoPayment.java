package com.unicesumar.service.payment.paymentMethods;

public class BoletoPayment implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Pagamento efetuado com sucesso via boleto");
    }
}