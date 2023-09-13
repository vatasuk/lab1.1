package org.example;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        List<City> cities = new ArrayList<>();
        cities.add(new City(1,"Ростов-на-Дону",1000000, 2));
        cities.add(new City(2,"Азов",80000,1));
        cities.add(new City(3,"Новочеркаск", 100000,1));

        List<Park> parks = new ArrayList<>();
        parks.add(new Park(1,1,2500,0,1,"gfgf","14.05.1978"));
        parks.add(new Park(1,1,2500,0,1,"fgfhb","21.08.1978"));
        parks.add(new Park(2,3,500,1,2,"dfd","15.10.1998"));
        parks.add(new Park(3,2,1500,1,1,"xvc","27.03.2005"));

        for (int i = 0; i < cities.size(); i ++)
        {
            String st = status(cities.get(i).getStatus());
            System.out.printf("Название города - %s, население - %d, статус - %s \n", cities.get(i).getName(), cities.get(i).getPop(), st);
            for (int j = 0; j < parks.size(); j++)
            {
                if (cities.get(i).getId() == parks.get(i).getCityID())
                {

                }
            }
        }


    }

    private static String status(int id) {
        String stat = null;
        switch (id)
        {
            case 1: stat = "Город";
            break;
            case 2: stat = "Город-миллионик";
            break;
        }
        return stat;
    }
}