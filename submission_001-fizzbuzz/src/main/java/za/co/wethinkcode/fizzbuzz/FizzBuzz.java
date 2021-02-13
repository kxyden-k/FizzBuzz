package za.co.wethinkcode.fizzbuzz;

public class FizzBuzz {
    public String checkNumber(int number) {
        boolean divisibleBy3 = number % 3 == 0;
        boolean divisibleBy5 = number % 5 == 0;

        if ( divisibleBy3 && divisibleBy5 ) {
            return "FizzBuzz";
        }
        else if (divisibleBy3) {
            return "Fizz";
        }
        else if (divisibleBy5) {
            return "Buzz";
        }
        return String.valueOf(number);
    }

    public String countTo(int number) {
        String list = "["; 

        for (int i = 1; i <= number; i++) {
            if (i % 3 == 0 && i % 5 ==0) {

                list = list+"FizzBuzz";
            }
            else if (i % 3 == 0) {
                list = list+"Fizz";
            }
            else if (i % 5 == 0) {
                list = list+"Buzz";
            }
            else {
                list = list+i;
            }
            if (i != number) {
                list = list+", ";
            }
        }
        list = list+"]";

        return list;
    }
}
