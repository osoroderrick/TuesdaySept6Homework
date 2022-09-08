import java.util.StringTokenizer;

public class LoopsControlFlowArraysMethods {


    //Question 1
    public static int getLastIndex(String[] names) {
        return  names.length - 1;
    }
    //Question 2
    public static int getSecondToLastIndex(String[] names) {
        return names.length - 2;
    }

    //Question 3
    public static String getFirstElement(String[] names) {
        return names[0];
    }

    //Question 4
    public static String getLastElement(String[] names) {
        String lastElement = names[names.length - 1];
        return lastElement;
    }

    //Question 5
    public static String getSecondToLastElement(String[] names) {
        String secondToLastElement = names[names.length - 2];
        return secondToLastElement;
    }

    //Question 6
    public static int getSum(int[] ints) {
        int sum = 0;
        for (int i = 0; i < ints.length; i++) {
            sum += ints[i];
        }
        return sum;
    }

    //Question 7
    public static int getAverage(int[] ints) {
        int sum = 0;
        int average;
        for (int i = 0; i < ints.length; i++) {
            sum += ints[i];
        }
        average = sum / ints.length;
        return average;
    }

    //Question 8
    public static String extractAllOddNumbers(int[] numbers) {
        int number = 0;
        int position = 0;
        String oddNumbers = " ";
        while (position < numbers.length){
            number = numbers[position];
            position++;
            if(number %2!=0)
            {
                oddNumbers = oddNumbers + number + " ";
            }

        }
        return oddNumbers;
    }

    //Question 9
    public static String extractAllEvenNumbers(int[] numbers) {
        int number = 0;
        int position = 0;
        String evenNumbers = " ";
        while (position < numbers.length){
            number = numbers[position];
            position++;
            if(number %2==0)
            {
                evenNumbers = evenNumbers + number + " ";
            }

        }
        return evenNumbers;
    }
    //Question 10
    public static boolean contains(String[] names, String element ) {
        for (String n : names ){
            if (  element == n ){
                return true;
            }
        }
        return false;
    }

    //Question 11
    public static int getIndexByElement(String[] names, String element) {
        int i = 0;
        int index = 0;
        for (i = 0; i < names.length; i++) {
            if (names[i] == element) {
                index = i;
            }
        }
        return index;
    }
    //Question 12
    public static int printOddNumbersInRange(int start, int end) {
        System.out.println("Odd Numbers in range: ");
        int i = start;
        int e = end;
        for (i = start; i < e - 1 ; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");

            }
            if (e % 2!= 0){
                System.out.println(e + " ");
            }

        }
        return i;
    }

    //Question 13
    public static String printGivenStringTimesNumberGiven(String str, int n) {
        int i;
        String result = str;
        for (i = 0; i < n -1;i+=1)
        {
            result += str;
        }

        return result;
    }

    //Question 14
    public static String repeatFirstThreeLetters(String str, int n) {
        String firstThreeLett = str.substring(0, 2);
        int i = 0;
        do {
            System.out.println(firstThreeLett);
            i++;
        }
        while (i < n -1);
        return firstThreeLett;
    }




     //Question 15
     public static int WordsInAStringCounter(String str){
        if (str == null || str.isEmpty()){
            return 0;
        }
         StringTokenizer tokens = new StringTokenizer(str);
        return tokens.countTokens();
     }


    public static void main(String[] args) {

        //Question 1
        System.out.println("Question 1:");
        String [] names = {"John", "Jacob", "Charles", "Samuel", "Trevor", "Michael", "Sheldon"};
        System.out.println(getLastIndex(names));

        //Question 2
        System.out.println("Question 2:");
        System.out.println(getSecondToLastIndex(names));

        //Question 3
        System.out.println("Question 3:");
        System.out.println(getFirstElement(names));

        //Question 4
        System.out.println("Question 4:");
        System.out.println(getLastElement(names));

        //Question 5
        System.out.println("Question 5:");
        System.out.println(getSecondToLastElement(names));

        //Question 6
        System.out.println("Question 6:");
        int [] ints = {2,4,6,8,10,12,14,16};
        System.out.println(getSum(ints));

        //Question 7
        System.out.println("Question 7:");
        System.out.println(getAverage(ints));

        //Question 8
        System.out.println("Question 8:");
        int [] numbers = {3,5,6,8,7,10,11};
        System.out.println(extractAllOddNumbers(numbers));

        //Question 9
        System.out.println("Question 9:");
        System.out.println(extractAllEvenNumbers(numbers));

        //Question 10
        System.out.println("Question 10:");
        System.out.println(contains(names,"Derrick"));

        //Question 11
        System.out.println("Question 11:");
        System.out.println(getIndexByElement(names, "Michael"));

        //Question 12
        System.out.println("Question 12:");
        System.out.println(printOddNumbersInRange(22,38));

        //Question 13
        System.out.println("Question 13:");
        System.out.println(printGivenStringTimesNumberGiven("hello" , 4));

        //Question 14
        System.out.println("Question 14:");
        System.out.println(repeatFirstThreeLetters("Indiana",7));
        //Question 15
        System.out.println("Question 15:");
        System.out.println(WordsInAStringCounter("Tuesday Application Development Homework"));














    }




}







