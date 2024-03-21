package org.example;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[] ClockBrand = new String[] {"Casio", "Seiko", "Omega", "Cartier"};
        String[][] ClockName = new String[][] {
                {ClockBrand[0],"G-Shok"},
                {ClockBrand[1], "Baby-G"},
                {ClockBrand[2],"Astron0"},
                {ClockBrand[3],  "Premier9"}};
        ArrayList<Object> Buyer = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        System.out.println("Добро пожаловать в магазин часов.");
        while (true)
            {
                System.out.println("Введите ваше ФИО: ");
                String name = in.nextLine();

                System.out.println("Введите ваш email: ");
                String email = in.nextLine();

                System.out.println("Ввведите ваш номер телефона: ");
                String phone = in.nextLine();

                for (int i = 0; i < ClockName.length; i++)
                {
                    System.out.println((i + 1) + ". " + ClockName[i][0] + " - " + ClockName[i][1]);
                }

                System.out.println("Введите номер выбранных часов: ");
                int clock = in.nextInt();
                in.nextLine();

                System.out.println("Ввведите количество товара: ");
                int amount = in.nextInt();
                in.nextLine();

                Object[] order = {name, email, phone, ClockName[clock - 1], amount};
                Buyer.add(Arrays.asList(order));

                System.out.println("Заказ создан.");
                System.out.println( order[0] + " " + order[1] + " " + order[2] +
                        " " + ((String[]) order[3])[0] + " " + ((String[]) order[3])[1] + " " + order[4]);
            }
    }
}