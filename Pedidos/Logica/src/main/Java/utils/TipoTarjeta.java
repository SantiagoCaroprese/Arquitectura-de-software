package utils;

public class TipoTarjeta {

    public static String execute(String cardNumber){
        return  (cardNumber.charAt(0) == '4') ? "VisaPayment" : "MasterCardPayment";
    }

}
