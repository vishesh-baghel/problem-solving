import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class CreditCardValidator {

    public static void main(String[] args) {
        String validNumber = "4137894711755904";
        String invalidNumber = "1234556643234323";

        validator(validNumber);
        validator(invalidNumber);
    }

    public static void validator(String creditCardNumber) {
        List<Integer> cardNumbers = Arrays.stream(creditCardNumber.split(""))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        System.out.println("Processing this card number: " + creditCardNumber);
        for (int i = 0; i < cardNumbers.size(); i++) {
            if (i % 2 == 0) {
                int digit = cardNumbers.get(i);
                int doubledDigit = digit * 2;
                if (doubledDigit > 9 && doubledDigit < 100) {
                    cardNumbers.set(i, sumOfDigits(doubledDigit));
                } else {
                    cardNumbers.set(i, doubledDigit);
                }
            }
        }
        System.out.println("Transformed card digits: " + cardNumbers);

        int sum = cardNumbers.stream().mapToInt(Integer::intValue).sum();

        if (sum % 10 == 0) {
            System.out.println("This number is valid: " + creditCardNumber + "\n");
        } else {
            System.out.println("This number is invalid: " + creditCardNumber + "\n");
        }
    }

    private static Integer sumOfDigits(int doubledDigit) {
        int sum;

        int firstDigit = doubledDigit / 10;
        int secondDigit = doubledDigit % 10;
        sum = firstDigit + secondDigit;

        return sum;
    }
}
