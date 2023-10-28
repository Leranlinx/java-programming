package StoreStudentDetails;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Arrays;
import java.util.Scanner;

public class RunnerClass {
    public static Scanner inp = new Scanner(System.in);
    static Student_[] student = new Student_[3];
    public void runThis(){
        int ind = 2;
        String path = "D:\\java-programming\\oop in java\\StoreStudentDetails\\StudentDataStore.txt";
        try{
                BufferedWriter bw = new BufferedWriter(new FileWriter(path, true));
                for(int i=0; i<ind; i++){
                    Student_ st = RunnerClass.takeInput();
                    String all = st.getName() +","+st.getId()+","+st.getContact();
                    bw.write(all);
                    bw.newLine();
                    student[i] = st;
                }
                bw.close();
            }catch(Exception e){
                System.out.println(e);
            }

        System.out.println(Arrays.toString(student));

        for(int i=0; i<ind; i++){
            System.out.println(student[i].getName());
        }

        for(int i=0; i<ind; i++){
            System.out.println(student[i].getContact());
        }

        for(int i=0; i<ind; i++){
            System.out.println(student[i].getId());
        }
    }
    public static Student_ takeInput(){
        System.out.print("Enter Your Name: ");
        String name = inp.nextLine();
        System.out.print("\nEnter Your Contact: ");
        String contact = inp.nextLine();
        System.out.print("\nEnter Your Id: ");
        int id = inp.nextInt();
        inp.nextLine();

        Student_ st = new Student_(name, id, contact);
        return st;
    }
}
