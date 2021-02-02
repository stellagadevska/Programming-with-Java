public class HWTask2 {

    // Да се напише програма на Java, която отпечатва последователност от числа, в зависимост от зададен размер
    // (цяло положително число), както на примерите във фигурите подолу:
    //    123456654321
    //     2345665432
    //      34566543
    //       456654
    //        5665
    //         66
    //        5665
    //       456654
    //      34566543
    //     2345665432
    //    123456654321

    public static void main(String[] args) {
        Calc(7);
    }

    public static void Calc(int sequence) {
        int n = sequence;

        for (int i = 1; i <= n; i++) {

            // ******
            //  ****
            //   **

            for (int space = 0; space < i; space++) {
                System.out.print(" ");
            }

            //Left
            for (int j = i; j <= n; j++) {
                System.out.print(j);
            }

            //Right
            for (int k = n; k >= i; k--) {
                System.out.print(k);
            }

            System.out.println();
        }


        for (int i = n - 1; i > 0; i--) {

            //   **
            //  ****
            // ******

            for (int space = 0; space < i; space++) {
                System.out.print(" ");
            }

            //Left
            for (int j = i; j <= n; j++) {
                System.out.print(j);
            }

            //Right
            for (int k = n; k >= i; k--) {
                System.out.print(k);
            }

            System.out.println();
        }
    }

}

