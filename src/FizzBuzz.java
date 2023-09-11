/**
 * Solve the FizzBuzz challenge.
 */
class FizzBuzz { //define the class

    public static void main(String[] args) {

        int i = 1;

        while (i < 100) { //set a range for the class

            doFizzBuzz(i);
            i++;
        }
    }

    static void doFizzBuzz(int i) {
        // Find out which numbers divide i.
        boolean divisibleBy3 = i % 3 == 0; //define a boolean which True when is divisible by 3
        boolean divisibleBy5 = i % 5 == 0; //define a boolean which True when is divisible by 5

        // Print our appropriate result.
        if (divisibleBy3 && divisibleBy5) {

            System.out.println("Fizz Buzz");

        } else if (divisibleBy3) {

            System.out.println("Fizz");

        } else if (divisibleBy5) {

            System.out.println("Buzz");

        } else {

            System.out.println(i);

        }
    }
}
