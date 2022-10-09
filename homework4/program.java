package java_projects.homework4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;

public class program  {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String[]> name = new ArrayList<>();
        ArrayList<String> sex = new ArrayList<>();
        ArrayList<Integer> age = new ArrayList<>();
        LinkedList<Integer> ids = new LinkedList<>();

        boolean lr = true;
        while (lr) {
            System.out.println("Enter user name (Ivanov Ivan Ivanovich): ");
            name.add(scanner.nextLine().split(" "));

            System.out.println("Is user man or woman: ");
            sex.add(scanner.nextLine());

            System.out.println("Enter user age: ");
            age.add(scanner.nextInt());

            ids.add(name.size() - 1);

            System.out.println("User name: " +
                    name.get(name.size() - 1)[0] + " " +
                    name.get(name.size() - 1)[1].toUpperCase().charAt(0) + "." +
                    name.get(name.size() - 1)[2].toUpperCase().charAt(1) + ". " +
                    "User id: " + name.get(ids.size() - 1).hashCode());
            System.out.println("New user? Y/N ");
            String tmp = scanner.nextLine();
            if (tmp.toLowerCase().contains("n")) lr = false;
        }
        
        for (int i = 0; i < name.size(); i++) {
            ids.add(i);
        }
        for (int id : ids) {
            System.out.println("name: " + name.get(id) + " sex: " + sex.get(id) +" age: " + age.get(id) + " id: " + name.get(id).hashCode());
        }
        
        System.out.println("users below 20: ");
        int i = 0;
        while(i<name.size()) {
            int a = age.get(i);
            if (a<40) {
                System.out.println("name: " + name.get(i) + " sex: " + sex.get(i) +" age: " + age.get(i) + " id: " + name.get(i).hashCode());
            }
            i++;
        } 
    }
}