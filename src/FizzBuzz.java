/**
 * Solve the FizzBuzz challenge.
 */
class FizzBuzz {

    public static void main(String[] args) {

        // for (int i = 1; i < 100; i++) {
        // i++ = i += 1?
        int i = 1;
        while (i < 100) {

            i = doFizzBuzz(i);
        }
    }

    public static int doFizzBuzz(int i) {
        // Find out which numbers divide i.
        boolean divisibleBy3 = i % 3 == 0;
        boolean divisibleBy5 = i % 5 == 0;
        // divisibleBy3 = True (set up type as boolean)
        // i % 3 == 0 is similar

        // Print our appropriate result.
        // the if-else structure below is similar to R
        // the use of { is also similar to R throughout
        if (divisibleBy3 && divisibleBy5) {

            System.out.println("Fizz Buzz");

        } else if (divisibleBy3) {

            System.out.println("Fizz");

        } else if (divisibleBy5) {

            System.out.println("Buzz");

        } else {

            System.out.println(i);

        }

        i++;
        return i;
    }
}
