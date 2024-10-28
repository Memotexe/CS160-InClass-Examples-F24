import java.util.*;

// public class Primes {
//     public static void main(String[] args) {
//         boolean isPrime;
//         for (int n = 0; n < 1000000; n++){
//             if(n == 0 || n == 1){
//                 System.out.println("- 0 has no factors other than itself and 1 has only one factor, which is itself");
//                 continue;
//             }
//             isPrime=true;
//             for (int i = 2; i <= n/2; i++){
//                 if(n % i == 0){
//                     isPrime = false;
//                     break;
//                 }
//             }
//             if (isPrime) System.out.println(n);
//         }
//    }
// }

public class Primes {
    public static void main(String[] args) {

        try (Scanner scan = new Scanner(System.in)) {
            boolean isPrime;
            boolean flag = false;
            int amount = 0;

            do {

                System.out.println("How many values do you wish to check?");
                amount = scan.nextInt();
                for (int n = 0; n < amount; n++) {
                    if (n == 0) {
                        System.out.println("- 0 has no factors other than itself");
                        continue;
                    } else if (n == 1) {
                        System.out.println("- 1 has only one factor, which is itself");
                        continue;
                    } else {
                        isPrime = true;
                        for (int i = 2; i <= n / 2; i++) {
                            if (n % i == 0) {
                                isPrime = false;
                                break;
                            }
                        }
                        if (isPrime)
                            System.out.println(n);
                    }
                }

                System.out.println("Do you want to run the isPrime evaluation tool again? Enter 'y',"+
                "otherwise enter any other character to exit");
                if ((scan.next()).equalsIgnoreCase("y")) {
                    flag = true;
                } else {
                    System.out.println("Failed to enter 'y', now exiting...");
                    flag = false;
                    // System.exit(0);
                }
            } while (flag);
        }

    }
}