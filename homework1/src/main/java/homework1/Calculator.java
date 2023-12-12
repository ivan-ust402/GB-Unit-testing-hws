package homework1;

// Задание 1. ** В классе Calculator создайте метод calculateDiscount, который принимает сумму покупки и процент скидки
// и возвращает сумму с учетом скидки. Ваша задача - проверить этот метод с использованием библиотеки AssertJ. Если
// метод calculateDiscount получает недопустимые аргументы, он должен выбрасывать исключение ArithmeticException.
// Не забудьте написать тесты для проверки этого поведения.
public class Calculator {
    public double calculateDiscount(double amount, double discount) {
        if (amount < 0 || discount < 0 || discount > 100) {
            throw new ArithmeticException("Invalid arguments");
        }

        double discountAmount = amount * discount / 100;

        return amount - discountAmount;
    }
}
