package org.example;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Repos repos = new Repos();
        ArrayList<City> cities = new ArrayList<>();

        cities.add(new City(2, "Азов", 80000, 1));
        cities.add(new City(1, "Ростов-на-Дону", 1000000, 2));
        cities.add(new City(3, "Новочеркаск", 100000, 1));

        ArrayList<Park> parks = new ArrayList<>();
        parks.add(new Park(1, 1, 2500, 0, 1, "gfgf", "14.05.1978"));
        parks.add(new Park(1, 1, 2500, 0, 1, "fgfhb", "21.08.1978"));
        parks.add(new Park(2, 3, 500, 1, 2, "dfd", "15.10.1998"));
        parks.add(new Park(3, 2, 1500, 1, 1, "xvc", "27.03.2005"));

        repos.pr(cities,parks);

        Collections.sort(cities, new Comparator<City>() {
            public int compare(City o1, City o2) {
                int a = o1.getPop();
                int b = o2.getPop();
                return Integer.compare(b, a);
            }
        });
        System.out.println("\nСортированный массив");
        repos.pr(cities);
    }
}

