package com.xworkz.countryapp;

import com.xworkz.countryapp.dto.CountryDto;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CountryRunner {
    public static void main(String[] args) {
        List<CountryDto> countries=new ArrayList<>();
        countries.add(new CountryDto(1,"India",1430000000,"Narendra Modi",28,3287469,"Asia",true,"Kannada"));
        countries.add(new CountryDto(10,"Sri Lanka",2200000,"Ranil Wickremesinghe",9, 65610, "Asia", true, "Sinhala"));
        countries.add(new CountryDto(8,"Nepal",30000000,"Pushpa Kamal Dahal",7, 147516, "Asia", true, "Nepali"));
        countries.add(new CountryDto(4,"Pakistan",241000000,"Shehbaz Sharif",4, 881913, "Asia", true, "Urdu"));
        countries.add(new CountryDto(5,"Japan",125000000,"Fumio Kishida",47, 377975, "Asia", true, "Japanese"));
        countries.add(new CountryDto(6,"South Korea",52000000,"Yoon Suk Yeol",17, 100210, "Asia", true, "Korean"));
        countries.add(new CountryDto(7,"England",56000000,"Rishi Sunak",9,130279, "Europe", true, "English"));
        countries.add(new CountryDto(3,"North Korea",26600000,"Pak Thae-song",9,120540,"Asia",false,"Korea"));
        countries.add(new CountryDto(9,"Canada",41000000,"Mark Carney",13,9984670,"North America",false,"English"));
        countries.add(new CountryDto(2,"Germany",28000000,"Friedrich Merz",23,120540,"Asia",false,"Korea"));

        System.out.println("List of countries:");
        countries.forEach(System.out::println);

        System.out.println("Countries sorted by ID:");
        countries.stream().
                sorted((o1,o2)-> o1.getCountryId()-o2.getCountryId())
                .collect(Collectors.toList()).
                forEach(System.out::println);
        System.out.println();

        System.out.println("Countries sorted by name:");
        countries.stream().
                sorted((o1,o2)-> o1.getCountryName().compareTo(o2.getCountryName()))
                .collect(Collectors.toList()).
                forEach(System.out::println);
        System.out.println();

        System.out.println("Countries sorted by population:");
        countries.stream().
                sorted((o1,o2)-> (int)(o1.getPopulation()-o2.getPopulation()))
                .collect(Collectors.toList()).
                forEach(System.out::println);
        System.out.println();

        System.out.println("Countries sorted by prime minister:");
        countries.stream().
                sorted((o1,o2)-> o1.getPrimaMinisterName().compareTo(o2.getPrimaMinisterName()))
                .collect(Collectors.toList()).
                forEach(System.out::println);
        System.out.println();

        System.out.println("Countries sorted by number of states:");
        countries.stream().
                sorted((o1,o2)-> o1.getNoOfStates()-o2.getNoOfStates())
                .collect(Collectors.toList()).
                forEach(System.out::println);
        System.out.println();

        System.out.println("Countries sorted by area:");
        countries.stream().
                sorted((o1,o2)-> (int)(o1.getArea()-o2.getArea()))
                .collect(Collectors.toList()).
                forEach(System.out::println);
        System.out.println();

        System.out.println("Countries sorted by continent:");
        countries.stream().
                sorted((o1,o2)-> o1.getContinent().compareTo(o2.getContinent()))
                .collect(Collectors.toList()).
                forEach(System.out::println);
        System.out.println();

        System.out.println("Countries sorted by if it's democratic:");
        countries.stream().
                sorted((o1,o2)->(int)(Boolean.compare(o1.isDemocratic(),o2.isDemocratic())))
                .collect(Collectors.toList()).
                forEach(System.out::println);
        System.out.println();

        System.out.println("Countries sorted by language:");
        countries.stream().
                sorted(Comparator.comparing(CountryDto::getLanguage))
                .collect(Collectors.toList()).
                forEach(System.out::println);
        System.out.println();


        System.out.println("Countries in Asia:");
        countries.stream().
                filter(countryDto->countryDto.getContinent().equals("Asia"))
                .collect(Collectors.toList()).
                forEach(System.out::println);
        System.out.println();

        System.out.println("Countries which are democratic:");
        countries.stream().
                filter(CountryDto::isDemocratic)
                .collect(Collectors.toList()).
                forEach(System.out::println);
        System.out.println();

        System.out.println("Countries that start with I:");
        countries.stream().
                filter(countryDto->countryDto.getCountryName().startsWith("I"))
                .collect(Collectors.toList()).
                forEach(System.out::println);
        System.out.println();

        System.out.println("Countries that starts with S and enda with a:");
        countries.stream().
                filter(countryDto->countryDto.getCountryName().startsWith("S")&&countryDto.getCountryName().endsWith("a"))
                .collect(Collectors.toList()).
                forEach(System.out::println);
        System.out.println();

        System.out.println("Countries that are in asia and sorted by population:");
        countries.stream().
                filter(countryDto->countryDto.getContinent().equals("Asia")).
                sorted((o1,o2)->(int)(o1.getPopulation()-o2.getPopulation()))
                .collect(Collectors.toList()).
                forEach(System.out::println);
        System.out.println();

        System.out.println("Country with max population:");
        System.out.println(countries.stream().
                max((o1, o2) -> (int) (o1.getPopulation() - o2.getPopulation())).get());

        System.out.println();

        System.out.println("Country in asia with 2nd max population:");
        System.out.println(countries.stream().
                filter(countryDto -> countryDto.getContinent().equals("Asia"))
                .sorted(Comparator.comparing(CountryDto::getPopulation).reversed())
                .skip(1)
                .findFirst());
        System.out.println();

        System.out.println("Country in asia with 2nd least population:");
        System.out.println(countries.stream().
                filter(countryDto -> countryDto.getContinent().equals("Asia"))
                .sorted(Comparator.comparing(CountryDto::getPopulation))
                .skip(1)
                .findFirst());
        System.out.println();

        System.out.println("Country with max number of states:");
        System.out.println(countries.stream()
                .sorted(Comparator.comparing(CountryDto::getNoOfStates).reversed())
                .findFirst());
        System.out.println();

        System.out.println("Country with distinct continents:");
        System.out.println(countries.stream()
                .collect(Collectors.groupingBy(CountryDto::getContinent, Collectors.counting())));
        System.out.println();


        System.out.println("Country with distinct continents:");
        System.out.println(countries.stream()
                .map(CountryDto::getContinent)
                .collect(Collectors.toSet()));

        System.out.println("Countries that are in asia and area is between 30000000 and 2000000000:");
        countries.stream().
                filter(countryDto->countryDto.getContinent().equals("Asia")&&countryDto.getPopulation()>3000000&&countryDto.getPopulation()<2000000000)
                .collect(Collectors.toList()).
                forEach(System.out::println);
        System.out.println();



    }
}
