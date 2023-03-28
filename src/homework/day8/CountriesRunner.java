package homework.day8;

import java.util.stream.Stream;

public class CountriesRunner {
    public static void main(String[] args) {
        Stream<String> countriesStream = Stream.of("Андора", "Португалия", "Англия", "Замбия");
        countriesStream
                .filter(country -> country.matches(".*[aeiouAEIOU].*"))
                .filter(country -> country.length()<7)
                .map(String::toUpperCase)
                .map(country -> "\"" + country + "\"")
                .forEach(System.out::println);
    }
}

//Создать поток данных стрингов countries из 4 стран (Андора, Португалия, Англия, Замбия) (через Stream.of())
//Отфильтровать страны, которые содержат в себе хотя бы одну гласную букву
//Отфильтровать страны, в названии которых меньше 7 букв
//Перевести все страны в верхний регистр
//Добавить к каждому названию кавычки
//Отпечатать в консоль с новой строки
