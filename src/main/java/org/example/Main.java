package org.example;

import org.example.salary.CalcSalary;
import org.example.salary.ContractWorker;
import org.example.salary.Freelancer;
import org.example.salary.PartTimer;
import org.example.vend.KoreanMsg;
import org.example.vend.ThaiMsg;
import org.example.vend.VendingMachine;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        VendingMachine machine = new VendingMachine(new ThaiMsg());

        machine.start();


//        File file = new File("list.txt");
//        Scanner scanner = new Scanner(file);
//
//        java.util.List<CalcSalary> empList = new ArrayList<CalcSalary>();
//
//        while (scanner.hasNextLine()) {
//            String line = scanner.nextLine();
//            System.out.println(line);
//
//            //split - 배열로
//            String[] arr = line.split(",");
//
//            if(arr[0].equals("A")){ //이 직원 파트타이머
//                empList.add(new PartTimer( arr[1], Integer.parseInt(arr[2]), Integer.parseInt(arr[3])));
//            }else if(arr[0].equals("C")){
//                empList.add(new ContractWorker( arr[1], Integer.parseInt(arr[2])));
//            }else if(arr[0].equals("F")){
//                empList.add(new Freelancer(arr[1], Integer.parseInt(arr[2])));
//            }
//
//        }//while true
//        scanner.close(); //파일 연결 끝
//
//        System.out.println("--------------------------------");
//
//        empList.forEach( emp -> System.out.println( emp.getName()+": " + emp.calcMonth()) );
//

    }
}