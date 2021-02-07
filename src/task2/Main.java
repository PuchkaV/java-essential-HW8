package task2;


import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    static Worker [] list = new Worker[5];

    public static void main(String[] args) {

     for (int i = 0; i <list.length; i++){
         addWorkers();
     }
        for (Worker elem: list) {
            System.out.println(elem);
        }

        Arrays.sort(list, new Comparator<Worker>() {
            @Override
            public int compare(Worker o1, Worker o2) {
                return o1.getName().compareToIgnoreCase(o2.getName());
            }
        });

     for (Worker elem: list) {
        System.out.println(elem);
        }

     }

    public static void addWorkers() {

        for (int i = 0; i < list.length; i++) {
            if (list[i] != null) continue;
            if (list[i] != null && (list.length - 1) == i ) {
                System.out.println("Сисок повністю заповнений");
                break;
            }
            Scanner sc = new Scanner(System.in);
            System.out.println("Введіть прізвище та ініціали працівника: ");
            String nametmp = sc.nextLine();
            System.out.println("Введіть назву посади: ");
            String positiontmp = sc.nextLine();

            System.out.println("Введіть рік прийняття на роботу: ");
            int yearOFemploymentTmp;

            for (;;){
                try {
                    Scanner in = new Scanner(System.in);
                    int tmp;
                    if(in.hasNextInt())  {
                        tmp = in.nextInt();

                        if ( tmp < 2021 && tmp > 1900) {
                            yearOFemploymentTmp = tmp;
                            break;
                        } else {
                            throw new YearOfEmploymentExeption();
                        }
                    }
                    else throw new IllegalArgumentException();

                }catch (IllegalArgumentException | YearOfEmploymentExeption e ){
                    System.out.println("Введено помилковий формат року прийняття працівника на роботу! ");
                }
            }
            list[i] = new Worker(nametmp, positiontmp, yearOFemploymentTmp);
            break;
        }
    }
}
