package com.nit.p2;

import java.io.Console;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;

import com.nit.p1.Employee;

public class Company {
    public static void main(String[] args) throws IOException {

        Console cns = System.console(); // console class object creation

        System.out.print("Enter Username :");
        String un = cns.readLine();

        System.out.print("Enter Password :");
        String pass = new String(cns.readPassword());

        if (un.equalsIgnoreCase("HK") && pass.equals("NiT")) {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //BuffferdReader class object
            Scanner scn = new Scanner(System.in); //Scanner class object
            Employee emp = new Employee(); // Employee calss object

            //initialised Employee class variable

            //Using command line argument (We must pass values for there tho variables)
            emp.eno = Integer.parseInt(args[0]);
            emp.ename = args[1];

            //Using BufferedReader object
            System.out.print("Enter Dept no : ");
            emp.dept = br.readLine();
            System.out.print("Enter Sal : ");
            emp.sal = Double.parseDouble(br.readLine());

            //Using Scanner object
            System.out.print("Enter Mobile : ");
            emp.mobile = scn.nextLong();
            scn.nextLine(); // This is for reading enterkey from Scanner object
            System.out.print("Enter Email : ");
            emp.email = scn.nextLine();

            //Using System Propertis
            emp.gender = (System.getProperty("gender")).charAt(0);
            emp.workingStatus = Boolean.parseBoolean(System.getProperty("ws"));

            // displaying values
            System.out.println();
            System.out.println("Employee no :\t\t\t" + emp.eno);
            System.out.println("Employee name :\t\t\t" + emp.ename);
            System.out.println("Dept no :\t\t\t"+emp.dept);
            System.out.println("Sal :\t\t\t\t"+emp.sal);
            System.out.println("Mobile :\t\t\t"+emp.mobile);
            System.out.println("E-mail :\t\t\t"+emp.email);
            System.out.println("Gender :\t\t\t"+emp.gender);
            System.out.println("Working Status :\t\t"+emp.workingStatus);

        } else {
            System.err.println("Invalid username or password");
        }

    }
}

    /* For executing this program : > java -Dgender=male -Dws=true Company 10 Akshay */
