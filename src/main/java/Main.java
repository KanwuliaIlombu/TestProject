import java.util.Scanner;

    public class Main {

        public static void main(String[] args) {

            Scanner num = new Scanner(System.in);

            int[] numArray = {98, 78, 66, 81, 66, 77, 12, 105, 26, 87, 89, 67};

            // Biggest number starts at 0
            int biggestNum = 0;

            // i = index, continues adding by 1 until index is = or < numArray length, which is 12
            // Remember, index is zero based, while length isn't
            for (int i = 0; i < numArray.length; ++i) {
                // If the biggestNum (starts at zero) is smaller than the current value of i in the numArray then make the biggestNum the current value of i
                if (biggestNum < numArray[i]) {
                    biggestNum = numArray[i];

                }
                System.out.println(biggestNum);

            }
        }
    }