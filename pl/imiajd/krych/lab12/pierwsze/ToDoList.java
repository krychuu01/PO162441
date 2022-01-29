import java.util.*;

public class ToDoList {

    public static void main(String... args) throws Exception {
        PriorityQueue<Task> priorityQueue = new PriorityQueue<>(10, Comparator.naturalOrder());
        Scanner scan = new Scanner(System.in);
        System.out.println("========TODO LIST========");

        while(true){

            System.out.println("Wybierz co chcesz zrobic:");
            System.out.println("Wpisz 'dodaj' aby dodac kolejne zadanie.");
            System.out.println("Wpisz 'nastepne' aby zdjac najwazniejsze zadanie z listy.");
            System.out.println("Wpisz 'wyswietl' aby wyswietlic zadania z listy.");
            System.out.println("Wpisz 'zakoncz' aby zamknac program.");

            String value = scan.nextLine();

            if(Objects.equals(value, "dodaj")){
                dodaj(priorityQueue);
            }
            else if(Objects.equals(value, "nastepne")){
                nastepne(priorityQueue);
            }
            else if(Objects.equals(value, "wyswietl")){
                wyswietlZadania(priorityQueue);
            }
            else if(Objects.equals(value, "zakoncz")){
                System.exit(0);
            }
            else{
                System.out.println("Sprobuj jeszcze raz");
            }
        }


    }

    public static void dodaj(PriorityQueue<Task> priorityQueue) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.println("Prosze podac priorytet: ");
        short priority = scan.nextShort();

        System.out.println("Prosze nazwac zadanie: ");
        String description = scan.next();

        Task taskToAdd = new Task(priority, description);
        priorityQueue.comparator();
        priorityQueue.add(taskToAdd);

    }

    public static void nastepne(PriorityQueue<Task> priorityQueue){
        priorityQueue.poll();
    }

    public static void wyswietlZadania(PriorityQueue<Task> priorityQueue){
        System.out.println(priorityQueue);
    }

}

class Task implements Comparable<Task> {

    private Short priority;
    private final String description;

    public Task(Short priority, String description) throws Exception {
        setPriority(priority);
        this.description = description;
    }

    public void setPriority(Short priority) throws Exception{
        if (priority > 9){
            throw new Exception("Priority must be a number from 0 to 9.");
        }
        this.priority = priority;
    }

    @Override
    public int compareTo(Task task) {
        return Short.compare(priority, task.priority);
    }

    @Override
    public String toString() {
        return priority + ". Task=" + description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return priority.equals(task.priority) && description.equals(task.description);
    }

    @Override
    public int hashCode() {
        return priority*11;
    }

}

