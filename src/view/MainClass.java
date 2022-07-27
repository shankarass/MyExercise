package view;

import dao.ProcessEmpDataV1;
import java.util.Scanner;

class UserInterface {

    public void getUserInput(String name, int age) {

        ProcessEmpDataV1 processEmpDataV1 = new ProcessEmpDataV1();
        processEmpDataV1.saveData(name,age);
    }
}

public class MainClass {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the employee name");
        String name = scan.nextLine();

        System.out.println("Enter the employee age");
        int age = scan.nextInt();

        UserInterface ui = new UserInterface();
        ui.getUserInput(name, age);
    }
}
