import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class PuzzleJava {
    public static void Numbers() {

        int sum = 0;
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(3);
        numbers.add(5);
        numbers.add(1);
        numbers.add(2);
        numbers.add(7);
        numbers.add(9);
        numbers.add(8);
        numbers.add(13);
        numbers.add(25);
        numbers.add(32);

        int numbersLength = numbers.size();
        ArrayList<Integer> newArray = new ArrayList<Integer>();
        for (int i = 0; i < numbersLength; i++) {
            sum = sum + numbers.get(i);


            if (numbers.get(i) > 10) {
                newArray.add(numbers.get(i));
            } 
        }
        System.out.println(sum);
        System.out.println(newArray);
    
    }

    public static void Names() {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Nancy");
        names.add("Jinichi");
        names.add("Fujibayashi");
        names.add("Momochi");
        names.add("Ishikawa");
        Collections.shuffle(names);
        System.out.println(names);

        int namesLength = names.size();
        ArrayList<String> longNames = new ArrayList<String>();
        for(int i = 0; i < namesLength; i++) {
            if(names.get(i).length() > 5) {
                longNames.add(names.get(i));
            }
        }
        System.out.println(longNames);
    }

    public static void Alphabet() {
        ArrayList<String> alphabet = new ArrayList<String>();
        alphabet.add("A");
        alphabet.add("B");
        alphabet.add("C");
        alphabet.add("D");
        alphabet.add("E");
        alphabet.add("F");
        alphabet.add("G");
        alphabet.add("H");
        alphabet.add("I");
        alphabet.add("J");
        alphabet.add("K");
        alphabet.add("L");
        alphabet.add("M");
        alphabet.add("N");
        alphabet.add("O");
        alphabet.add("P");
        alphabet.add("Q");
        alphabet.add("R");
        alphabet.add("S");
        alphabet.add("T");
        alphabet.add("U");
        alphabet.add("V");
        alphabet.add("W");
        alphabet.add("X");
        alphabet.add("Y");
        alphabet.add("Z");
        Collections.shuffle(alphabet);
        System.out.println(alphabet.get(0));
        System.out.println(alphabet.get(25));
    }

    public static void RandomTen() {
        Random r = new Random();

        ArrayList<Integer> randomArray = new ArrayList<Integer>();
        for(int i = 0; i <= 10; i++) {
            int randomNum = r.nextInt(100 - 55) + 55;
            randomArray.add(randomNum);
        }
        System.out.println(randomArray);
    }

    public static void SortedTen() {
        Random r = new Random();

        ArrayList<Integer> randomArr = new ArrayList<Integer>();
        for(int j = 0; j <= 10; j++) {
            int randomNum = r.nextInt(100 - 55) + 55;

            randomArr.add(randomNum);
            Collections.sort(randomArr);
        }

        int max = randomArr.get(0);
        int min = randomArr.get(0);

        for(int i = 0; i < randomArr.size(); i++) {

            if (randomArr.get(i) > max) {
                max = randomArr.get(i);
            }

            if (randomArr.get(i) < min) {
                min = randomArr.get(i);
            }
        }
        System.out.println(randomArr);
        System.out.println(max);
        System.out.println(min);
    }

    // public static void RandomString() {
    //     char[] text = new char[5];
    //     Random r = new Random();
    //     String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
    //     for (int i = 0; i <= 5; i++) {
    //         text[i] = characters.charAt(r.nextInt(characters.length()));
    //     }
    //     System.out.println(text);
    // }



////////////////////////////////TEST//////////////////////////////////////    

    public static void main(String[] args) {
        // Numbers();
        // Names();
        // Alphabet();
        // RandomTen();
        // SortedTen();
        // RandomString();
    }
}