package org.example;
import java.awt.*;
import java.util.List;
public class Repos {

    public void pr(List<City> cities, List<Park> parks) {
        int S = 0;
        for (int i = 0; i < cities.size(); i++) {
            String st = status(cities.get(i).getStatus());
            System.out.printf("Название города - %s, население - %d, статус - %s \n", cities.get(i).getName(), cities.get(i).getPop(), st);
            System.out.println("Парки в этом городе:");
            for (int j = 0; j < parks.size(); j++) {
                if (cities.get(i).getId() == parks.get(j).getCityID()) {
                    System.out.printf("Название парка - %s, Площадь - %d, наличие водоемов - %s, тип парка - %s, дата основания - %s \n ", parks.get(j).getName(),
                            parks.get(j).getS(), water(parks.get(j).getWater()), type(parks.get(j).getType()), parks.get(j).getDate());
                    S += countS.count(parks.get(j).getS());
                }
            }
            System.out.println("Общая площадь парков - " + S);
            S=0;
        }
    }

    Lambda countS = (x) -> {
        int S = 0;
        S +=x;
        return S;
    };

    public void pr(List<City> cities) {
        for (int i = 0; i < cities.size(); i++) {
            String st = status(cities.get(i).getStatus());
            System.out.printf("Название города - %s, население - %d, статус - %s \n", cities.get(i).getName(), cities.get(i).getPop(), st);

        }
    }
    private  String status(int id) {
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
    private  String water(int id)
    {
        String wt = null;
        switch (id) {
            case 0: wt = "Есть";
                break;
            case 1: wt = "Нет";
                break;
        }
        return wt;
    }
    private  String type(int id)
    {
        String t = null;
        switch (id) {
            case 1: t = "vb";
                break;
            case 2: t = "ghg";
                break;
        }
        return t;
    }
}