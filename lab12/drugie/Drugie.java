import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;
import java.util.Scanner;

public class Drugie {

    public static void main(String... args) {
        // klucz -> nazwisko, wartosc -> ocena z egzaminu
        HashMap<String, String> hashMap = new HashMap<>();
        Scanner scan = new Scanner(System.in);

        while(true){
            System.out.println("Wybierz co chcesz zrobic:");
            System.out.println("Wpisz 'dodaj' aby dodac studenta do mapy.");
            System.out.println("Wpisz 'usun' aby usunac studenta z mapy.");
            System.out.println("Wpisz 'zmien' aby zmienic ocene studentowi");
            System.out.println("Wpisz 'wypisz' aby wyswietlic liste wszystkich studentow");
            System.out.println("Wpisz 'zakoncz' aby zamknac program.");

            String value = scan.nextLine();

            if(Objects.equals(value, "dodaj")){
                addStudent(hashMap);
            }
            else if(Objects.equals(value, "usun")){
                deleteStudent(hashMap);
            }
            else if(Objects.equals(value, "zmien")){
                changeGrade(hashMap);
            }
            else if(Objects.equals(value, "wypisz")){
                printAllStudents(hashMap);
            }
            else if(Objects.equals(value, "zakoncz")){
                System.exit(0);
            }
            else{
                System.out.println("Sprobuj jeszcze raz");
            }
        }

    }

    public static String setStudentSecondName(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Prosze podac nazwisko studenta: ");
        return scanner.next();
    }

    public static String setStudentGrade(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Prosze podac ocene studenta: ");
        return scanner.next();
    }

    public static void addStudent(HashMap<String, String> hashMap) {
        String name = setStudentSecondName();
        hashMap.put(name, "-");
    }

    public static void deleteStudent(HashMap<String, String> hashMap) {
        String name = setStudentSecondName();
        hashMap.remove(name);
    }

    public static void changeGrade(HashMap<String, String> hashMap) {
        String name = setStudentSecondName();
        String grade = setStudentGrade();
        hashMap.replace(name, grade);
    }

    public static void printAllStudents(HashMap<String, String> hashMap){
        HashSet<String> keys = new HashSet<>(hashMap.keySet());
        for (String key : keys) {
            System.out.println(key + ": " + hashMap.get(key));
        }
    }


}