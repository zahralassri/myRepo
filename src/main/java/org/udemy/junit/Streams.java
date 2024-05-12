package org.udemy.junit;

import org.junit.jupiter.api.parallel.Resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class Streams {

    private List<String> mylist = new ArrayList<String>();
    private String[] tab = new String[3];
    private String[] tab2 = new String[]{"AAAA", "Bhhh"};
    private String[] tab3 = {"gh", "gho"};


    public static void main(String[] args) {
//        Streams stream = new Streams();
//        System.out.println("affichage tab 3 "+stream.tab3[0]);
//        System.out.println("affichage "+stream.tab3[1]);

        List<Person> persons = new ArrayList<>();
        Person A = new Person();
        A.setAge(24);
        A.setName("zahrae");
        A.setGender(Gender.FEMALE);
        A.setSalary(100000);
        Person AB = new Person();
        AB.setAge(30);
        AB.setName("yahya");
        AB.setGender(Gender.MALE);
        AB.setSalary(10000);
        Person AC = new Person();
        AC.setAge(24);
        AC.setName("Bilal");
        AC.setGender(Gender.MALE);
        AC.setSalary(12000);
        Person AD = new Person();
        AD.setAge(40);
        AD.setName("zahrae");
        AD.setSalary(120000);
        AD.setGender(Gender.FEMALE);
        persons.add(A);
        persons.add(AB);
        persons.add(AC);
        persons.add(AD);

        List<String> names = persons.stream().map(e -> e.getName()).
                sorted().collect(Collectors.toList());

        List<String> namesfiltred = persons.stream().map(e -> e.getName()).filter(e -> e.startsWith("z")).
                collect(Collectors.toList());
        for (String n : names) {

            System.out.println(" names : " + n);
        }

        for (String n : namesfiltred) {

            System.out.println(" filtred names : " + n);
        }
        List<Person> personbyname = persons.stream().filter(e -> e.getName().startsWith("z")).
                collect(Collectors.toList());
        personbyname.forEach(person -> {
            System.out.println("person " + person);
        });
        //print data in by stream
        persons.stream().filter(m -> m.getGender().equals(Gender.MALE)).forEach(System.out::println);
        persons.stream().filter(a -> a.getGender().equals(Gender.MALE) && a.getAge() > 24).forEach(System.out::println);
        //map transforme chaque element  dans le stream a une autre valeur.
        // map transforme un stream of object T to another type R
        // maptoint transform un element de stream a un int
        persons.stream().mapToInt(e -> e.getAge()).forEach(age -> System.out.print(age + "-"));

        //use upper for strings

        persons.stream().map(e -> e.getName().toUpperCase()).forEach(System.out::println);
        //sorted : sorts by natural order
        persons.stream().sorted().forEach(p -> System.out.println(p));
        //sorted by comparator
        persons.stream()
                .sorted((p1, p2) -> p1.getName().compareTo(p2.getName())).forEach(System.out::println);

        // distinct
        persons.stream().map(e->e.getName()).distinct().sorted().forEach(System.out::println);
        int[] tab4 ={1,3,56,89};
        int sum =Arrays.stream(tab4).sum();
        System.out.println(sum);
        //calcul sum
        double salary= persons.stream().mapToDouble(e->e.getSalary()).sum();
        System.out.println(salary);
        double averagesalary= persons.stream().mapToDouble(e->e.getSalary()).average().getAsDouble();
        System.out.println(averagesalary);

    }





}






