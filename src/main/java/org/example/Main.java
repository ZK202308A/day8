package org.example;

import org.example.pizza.CommonUI;
import org.example.pizza.CreateUI;
import org.example.pizza.ReadUI;
import org.example.pizza.TotalUI;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        CommonUI[] arr = {new CreateUI(in), new ReadUI(in)};

        TotalUI totalUI = new TotalUI(in, arr);

        totalUI.execute();



    }
}