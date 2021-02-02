public class HWTask1 {

    //Задача 1. Да се напише програма на Java, която намира и показва всички цели, положителни числа в даден интервал}
    //[bottom, top], които при преместване на първата им цифра най-отзад, се увеличават с повече от дадено число difference.
    //Пример: Интервалът [bottom, top] е [10, 10000] difference = 5000; Примерно число, което отговаря на условието е:
    //1980, при преместване на първата му цифра най-отзад се получава 9801. Разликата между 9801 и 1980 е > 5000 (difference).

    //Изход (показани са само първите 10 числа, които се печатат на конзолата):
    //1667 6671 => 1667 - 6671 = 5004 > 5000
    //1668 6681 => 1668 - 6681 = 5013 > 5000
    //1669 6691 => 1669 - 6691 = 5022 > 5000
    //1670 6701 => 1670 - 6701 = 5031 > 5000
    //1671 6711 => 1671 - 6711 = 5040 > 5000
    //1672 6721 => 1672 - 6721 = 5049 > 5000
    //1673 6731 => 1673 - 6731 = 5058 > 5000
    //1674 6741 => 1674 - 6741 = 5067 > 5000
    //1675 6751 => 1675 - 6751 = 5076 > 5000
    //1676 6761 => 1676 - 6761 = 5085 > 5000

    public static void main(String[] args) {
        Calculations(1, 10000, 5000);
    }

    public static void Calculations(int bottom, int top, int difference) {
        // Check if interval is entered correctly.
        if (bottom > top) {
            System.out.println("The interval is not entered correctly!");
        } else {
            // Check if number is negative or one-digit and while it is true, increment this number (int bottom)
            while (bottom < 10) {
                bottom++;
            }

            // Doing different calculations according to number of digits
            // 1. Find number of digits.
            // 2. Calculate divisor according to number of digits.
            // 3. Create loop.

            for(int num = bottom; num <= top; num++) {
                int numOfDigits = String.valueOf(num).length();
                int divisor = (int) Math.pow(10, (numOfDigits - 1));

                int calculation1 = (num % divisor) * 10;
                int calculation2 = (num % (divisor * 10)) / divisor;
                int calculation3 = calculation1 + calculation2;

                int compareDifference = Math.abs(num - calculation3);

                if (difference < compareDifference) {
                    System.out.println(num + " " + calculation3 + " => " + num + " - " + calculation3 + " = " + compareDifference + " > " + difference);
                }
            }
        }
    }
}
