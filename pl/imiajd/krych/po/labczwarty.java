package pl.edu.uwm.gkrych.pl.imiajd.krych.po;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.String;
import java.math.BigInteger;
import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;
import java.math.RoundingMode;

public class labczwarty {

    public static int countChar(String str, char c){
        int ilosc = 0;
        for(int i = 0; i < str.length(); i++){
            if (str.charAt(i) == c){
                ilosc += 1;
            }
        }
        return ilosc;
    }

    public static int countSubStr(String str, String substr){
        int count = 0;
        int i = 0;
        int a = str.indexOf(substr);
        int substr_length = substr.length();

        while (a != -1){
            a = str.indexOf(substr,a);
            if (a != -1 ){
                a += substr_length;
                count++;
            }
            else{
                return count;
            }
        }

        return count;
    }

    public static String middle(String str){
        int len = str.length();
        String return_value = "";
        String first_letter = "";


        if(len % 2 == 0){
            String first_letter_val = "0";
            String second_letter_val = "1";
            first_letter = String.valueOf(str.charAt((len/2)-1));
            String second_letter = "";
            second_letter = String.valueOf(str.charAt(len/2));

            String tempA = first_letter_val.replace("0",first_letter);
            String tempB = second_letter_val.replace("1", second_letter);
            return_value = tempA + tempB;
        }

        if(len % 2 != 0){
            String temp = "0";
            first_letter = String.valueOf(str.charAt(len/2));
            String tempA = temp.replace("0",first_letter);
            return_value = tempA;
        }

        return return_value;
    }

    public static String repeat(String str, int n){
        String return_value = "";

        while (n > 0){
            return_value = return_value + str;
            n--;
        }

        return return_value;
    }

    public static int[] where(String str, String subStr){
        int[] temp = new int[100];
        String tempA, tempB;
        int i, j, a, dlugosc, k, zawszeZero, pierwszy_pasujacy_index;
        dlugosc = k = zawszeZero = 0;

        for(i = 0; i < str.length(); i++){
            tempA = String.valueOf(str.charAt(i));
            tempB = String.valueOf(subStr.charAt(zawszeZero));
            a = i;

            if(tempA.equals(tempB)){
                pierwszy_pasujacy_index = i;
                for(j = 0; j < subStr.length(); j++){
                    tempA = String.valueOf(str.charAt(a));
                    tempB = String.valueOf(subStr.charAt(j));
                    if (tempA.equals(tempB)){
                        a++;
                        if(j + 1 == subStr.length()){
                            temp[k] = pierwszy_pasujacy_index;
                            k++;
                        }
                    }
                    else{
                        break;
                    }
                }
            }
        }

        i = 0;

        while(true){            //petla ktora pozwala zliczyc ilosc niezerowych indexow wpisanych do tablicy
            if(temp[i] == 0){
                break;
            }
            i++;
            dlugosc++;
        }

        i = 0;
        int[] return_value = new int[dlugosc];

        while(i < dlugosc){     //petla ktora przypisuje niezerowe wartosci indexow z tablicy temp do zwracanej tablicy
            return_value[i] = temp[i];
            i++;
        }

        return return_value;
    }

    public static String odwroc(String str){
        StringBuffer strbuff = new StringBuffer();
        char a;

        for(int i = str.length(); i > 0; i--){
            a = str.charAt(i-1);
            strbuff.append(a);
        }

        return strbuff.toString();
    }

    public static String change(String str){
        StringBuffer strbuff = new StringBuffer();
        char temp;
        String tempA;
        int i, j;
        i = j = 0;

        while(str.length() > i){
            temp = str.charAt(j);

            if(temp >= 97 && temp <= 127){
                tempA = String.valueOf(temp);
                strbuff.append(tempA.toUpperCase());
            }
            if(temp >= 65 && temp <= 90){
                tempA = String.valueOf(temp);
                strbuff.append(tempA.toLowerCase());
            }

            j++;
            i++;

        }

        return strbuff.toString();
    }

    public static String nice(String str){
        StringBuffer strbuff = new StringBuffer();
        String apostrof = "'";
        char temp;
        int ilosc, i;
        ilosc = i = 0;
        str = odwroc(str);

        while(str.length() > i){
            temp = str.charAt(i);

            if(ilosc != 0 && ilosc % 3 == 0){
                strbuff.append(apostrof);
            }

            strbuff.append(temp);
            ilosc++;

            i++;
        }

        strbuff.reverse();

        return strbuff.toString();
    }

    public static String nice_version_two(String str, char c, int a){
        StringBuffer strbuff = new StringBuffer();
        String apostrof = String.valueOf(c);
        char temp;
        int ilosc, i;
        ilosc = i = 0;
        str = odwroc(str);

        while(str.length() > i){
            temp = str.charAt(i);

            if(ilosc != 0 && ilosc % a == 0){
                strbuff.append(apostrof);
            }

            strbuff.append(temp);
            ilosc++;

            i++;
        }

        strbuff.reverse();

        return strbuff.toString();
    }

    public static int drugie(char c) throws FileNotFoundException{
        int ile = 0;
        String temp;
        File file = new File("C:\\Users\\Grzegorz\\IdeaProjects\\pl.edu.uwm.gkrych.lab04\\src\\test.txt");
        Scanner scan = new Scanner(file);

        while (scan.hasNext()){
            temp = scan.next();
            int i = 0;
            while (i < temp.length()){
                if(temp.charAt(i) == c){
                    ile += 1;
                }
                i++;
            }
        }
        return ile;
    }

    public static int trzecie(File file, String str) throws IOException{
        String fileB = Files.readString(Path.of("C:\\Users\\Grzegorz\\IdeaProjects\\pl.edu.uwm.gkrych.lab04\\src\\test2.txt"), StandardCharsets.US_ASCII);
        int ile = 0;
        int i = 0;
        while(true){
            i = fileB.indexOf(str,i);
            if(i != -1){
                ile += 1;
                i += str.length();
            }
            else{
                return ile;
            }
        }


    }

    public static BigInteger czwarte(int n){
        BigInteger dwa = BigInteger.TWO;
        return dwa.pow((n*n)-1);
    }

    public static BigDecimal piate(int lata, float kapital_poczatkowy, float stopa_procentowa){
        BigDecimal return_val = BigDecimal.valueOf(kapital_poczatkowy);
        BigDecimal stopa_p = BigDecimal.valueOf(stopa_procentowa);


        for(int i = 0; i < lata; i++){
            return_val = return_val.add(return_val.multiply(stopa_p));
        }

        BigDecimal bd = new BigDecimal(String.valueOf(return_val)).setScale(2, RoundingMode.HALF_UP);

        return return_val;
    }

    public static void main(String[] args) throws IOException {

        // 1a)
//        String test_first = "Mama";
//        System.out.println(countChar(test_first, 'a'));

        // 1b)

//        String test_second = "BBaBBaBBaa";
//        String test_third = "a";
//
//        System.out.println(countSubStr(test_second,test_third));

        // 1c)

//        String mid = "middle";
//        System.out.println(middle(mid));

        // 1d)

//        String abc = "xDx";
//        System.out.println(repeat(abc,3));

        // 1e)

//          String str = "01a345a78a";
//          String subStr = "a";
//          System.out.println(Arrays.toString(where(str, subStr)));

        // 1f)

//            String str = "maAleDUzZE";
//            System.out.println(change(str));
//            change(str);

        //  1g)
//            String str = "1234567890";
//            System.out.println(nice(str));

        //  1h)

//            String str = "1234567890";
//            System.out.println(nice_version_two(str, '#', 4));

        //  2

//            char c = 'c';
//            System.out.println(drugie(c));

        // 3

//              String ab = "na";
//              File file = new File("C:\\Users\\Grzegorz\\IdeaProjects\\pl.edu.uwm.gkrych.lab04\\src\\test2.txt");
//              System.out.println(trzecie(file,ab));

        // 4

//                int a = 16;
//                System.out.println(czwarte(a));
        // 5

        int lata = 10;
        float kapital = 3000.50f;
        float stopy_p = 0.9f;
        System.out.println(piate(lata, kapital, stopy_p));

    }
}
