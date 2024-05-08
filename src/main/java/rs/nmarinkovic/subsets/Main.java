package rs.nmarinkovic.subsets;

import java.util.Scanner;

public class Main
{
    static ELSK[] generateNextSubset(ELSK[] el) {
        int n = el.length;
        for(int i = 0; i < n; i++) {
            if(el[i].isMember() == true) el[i].setMember(false);
            else if(el[i].isMember() == false) {
                el[i].setMember(true);
                return el;
            }
        }
        return el;
    }

    static void printMemberElements(ELSK[] el) {
        int n = el.length - 1;
        for (int i = 0; i < n; i++)
        {
            if (el[i].isMember() == true)
            {
                System.out.print(el[i].getValue() + " ");
            }
        }
        System.out.println();
    }

    static void subsets(int n)
    {
        System.out.println("Insert names of all elements: ");
        Scanner scanner = new Scanner(System.in);
        if (n == 1)
        {
            String ns123 = scanner.nextLine();
            System.out.println("List of all subsets:");
            System.out.println(ns123);
        } else
        {
            ELSK[] elements = new ELSK[n + 1];
            for (int i = 0; i < n; i++)
            {
                String ns = scanner.nextLine();
                elements[i] = new ELSK(ns);
            }
            elements[n] = new ELSK("last one");

            System.out.println("List of all subsets:");
            Boolean notDone = true;
            while (notDone.equals(true))
            {
                elements = generateNextSubset(elements);
                if (elements[n].isMember() == true)
                    notDone = false;
                else
                    printMemberElements(elements);
            }
        }
    }

    public static void main(String[] args)
    {
        System.out.print("Provide the number of elements your set has: ");
        Scanner scanner = new Scanner(System.in);
        String ns = scanner.next();
        int n = 0;
        try
        {
            n = Integer.parseInt(ns);
        } catch (NumberFormatException e)
        {
            n = 4;
        }

        if (n == 0) return;
        if (n < 0) n = n * -1;

        subsets(n);

        System.out.println("Hello world!");
    }
}