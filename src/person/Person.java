package person;

import csvParser.CSVEntity;
import csvParser.CSVField;

import java.util.Objects;

@CSVEntity
public class Person {
    private Integer age;
    @CSVField
    public String lastName;
    @CSVField
    public String firstName;
    private Double height;
    private Double weight;

    public Person() {
    }

    public Person(Integer age, String lastName, String firstName, Double height, Double weight) {
        this.age = age;
        this.lastName = lastName;
        this.firstName = firstName;
        this.height = height;
        this.weight = weight;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    //implement equals and hashCode always together!!
    // hash is definitely faster
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(age, person.age) &&
                Objects.equals(lastName, person.lastName) &&
                Objects.equals(firstName, person.firstName) &&
                Objects.equals(height, person.height) &&
                Objects.equals(weight, person.weight);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, lastName, firstName, height, weight);
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }
}
