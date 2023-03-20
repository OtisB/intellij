package streams;

import java.util.ArrayList;
import java.util.List;

public class Animal {
    private String name;
    private Integer age;
    private Double weight;
    private Integer numberOfLegs;

    public Animal() {
  }

    public Animal(String name, Integer age, Double weight, Integer numberOfLegs) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.numberOfLegs = numberOfLegs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Integer getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(Integer numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public static List<Animal> filterTwoLegs(List<Animal> animalList) {

        List<Animal> fileredList = new ArrayList<>();

        fileredList = animalList.stream()
                .filter(animal -> animal.getNumberOfLegs().equals(2))
                .toList();

        return fileredList;
    }

    public static List<Animal> filterAgeOverTen(List<Animal> animalList) {

        List<Animal> filteredList = new ArrayList<>();

        filteredList = animalList.stream()
                .filter(animal -> animal.getAge() > 10)
                .toList();

        return filteredList;
    }

    public static List<Animal> filterAgeBetweenFiveAndEight(List<Animal> animalList) {

        List<Animal> filteredList = new ArrayList<>();

        filteredList = animalList.stream()
                .filter(animal -> animal.getAge() > 5)
                .filter(animal -> animal.getAge() < 8)
                .toList();
        return filteredList;
    }

    public static List<Animal> filterWeightOver30AndYoungerThan20(List<Animal> animalList) {

        List<Animal> filteredList = new ArrayList<>();

        filteredList = animalList.stream()
                .filter(animal -> animal.getWeight() > 30)
                .filter(animal -> animal.getAge() < 20)
                .toList();
        return filteredList;
    }

    public static List<Animal> filterWithFourLegsAndOddAge(List<Animal> animalList) {

        List<Animal> filteredList = new ArrayList<>();

        filteredList = animalList.stream()
                .filter(animal -> animal.getNumberOfLegs().equals(4))
                .filter(animal -> animal.getAge() % 2 == 1)
                .toList();
        return filteredList;
    }


    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", numberOfLegs=" + numberOfLegs +
                '}';
    }
}
