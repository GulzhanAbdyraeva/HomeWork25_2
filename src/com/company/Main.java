package com.company;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Main {
/**City деген класс тузунуз. (code, name, ...)
 Эгерде code так сан болсо TreeSetke салыныз.
 Аларды чонунан кичинесине караган тартипте чыгарыныз.**/
    public static void main(String[] args) {
        City city1 = new City(762342,"Moscow");
        City city2 = new City(723459,"Bishkek");
        City city3 = new City(123536,"Naryn");
        City city4 = new City(235213,"Yssyk-Kul");

        Set<City> a = new HashSet<>(List.of (city1,city2,city3,city4));

        TreeSet<City> treeSet = new TreeSet<>();

        for (City c: a) {
            if(c.getCode()%2==1){
                treeSet.add(c);
            }
        }
        System.out.println(treeSet);

    }
}
