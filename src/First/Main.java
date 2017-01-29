package First;

import java.util.Arrays;

/**
 * Created by Jekaterina on 29.01.2017.
 */
public class Main {

    public static void main (String[] args) {
        int[] myIntArray = {100,31,26,48,52};
        /**int[] myIntArray = new int[3]; - for classes and objects
         * int[] myIntArray = {1,2,3};
         * int[] my IntArray = new int[]{1,2,3}; - for classes and objects
         */
        String[] m = {"olen", "lihtne", "ülesanne"};
        int index = 0;
        while (index < myIntArray.length) {
            System.out.print(myIntArray[index] + " ");
            index++;
        }
        System.out.println();
        for (int index1 = 0; index1 < myIntArray.length; index1++) {
            System.out.print(myIntArray[index1]  + " ");
        }
        System.out.println();
        for (int element : myIntArray) {            //Käia tsükliga läbi mõni andmete kogum (nt. massiiv)
            System.out.print(element + " ");      //Prindi välja väärtused massiivist
        }
        System.out.println();
        for (String s : m) {                //Käia tsükliga läbi mõni andmete kogum (nt. massiiv)
            System.out.print(s + " ");    //Prindi välja väärtused massiivist
            int sLength = s.length();
            System.out.print(sLength + ", ");
        }

        System.out.println(m[0].length() + m[1].length() + m[2].length());  //prinditakse välja ainult tähtede arv

        int mLength2 = Arrays.toString(m).length(); //muutuja mLength2 arvutab kui palju tähti sisaldab Array m
        System.out.println(mLength2);

        for (String s1 : m) {
            String s1Up = s1.toUpperCase();     //Uue muutuja loomine, et kirjutada sõnad suurte tähtedega
            System.out.println(s1Up.replace('E', 'Ä'));     //asendan sõnades E Ä-ga, ainult String jaoks
        }

    }
}

