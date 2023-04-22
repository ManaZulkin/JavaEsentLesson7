package Task2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Workers[] workers = new Workers[5];
        short years;
        CreateWorkers(workers);
        Arrays.sort(workers, new Comparator<Workers>() {
            @Override
            public int compare(Workers o1, Workers o2) {
                return o1.workerName.compareTo(o2.workerName);
            }
        });
        System.out.println("Workers list:");
        for (int i = 0; i < workers.length; i++){
            System.out.println(workers[i].workerName + " " + workers[i].workerPosition);
            Workers.CheckYear(workers[i]);
        }
        years = NewData();
        System.out.println("Workers which satisfied your request:");
        for (int i = 0; i < workers.length; i++){
            Workers.CheckExp(workers[i], years);
        }
    }

    public static void CreateWorkers(Workers[] workers){
        Scanner in = new Scanner(System.in);
        String name, position;
        int year;
        for (int i = 0; i < workers.length; i++){
            System.out.println("Enter name of worker");
            name = in.nextLine();
            System.out.println("Enter position of this worker");
            position = in.nextLine();
            System.out.println("In which year this worker start to work with us?");
            year = in.nextInt();
            in.nextLine();
            workers[i] = new Workers(name, position, year);
        }


    }
    public static short NewData(){
        System.out.println("Enter minimum years of experience for workers which you want to see");
        Scanner in = new Scanner(System.in);
        short years;
        years = in.nextShort();
        in.nextLine();
        return years;
    }

}
