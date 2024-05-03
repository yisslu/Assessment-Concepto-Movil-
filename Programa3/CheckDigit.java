package Programa3;
import java.util.Scanner;

public class CheckDigit {
    public static int getVerificationDigit(int digit) {
        int sum = 0, factor = 2, adigit, product, mod, checkDig;
        String digitStr = String.valueOf(digit);

        for (int i = digitStr.length() - 1; i >= 0; i--) {
            adigit = Character.getNumericValue(digitStr.charAt(i));
            product = adigit * factor;

            while(product > 0){
                sum += product % 10;
                product /= 10;
            }
    
            factor = (factor == 2) ? 1 : 2;
        }

        mod = sum % 10;
        checkDig = (mod == 0) ? 0 : (10 - mod);
        return checkDig;
    }

    public static void main(String[] args){
        int digit,checkDigit;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el digito a verificar:");
        digit = scanner.nextInt();
        scanner.close();
        checkDigit = getVerificationDigit(digit);
        System.out.println("El digito verificador de la cantidad " + digit + " " + "es: " + checkDigit);
    }
}
