package person;

import java.util.Objects;

public class Person {
    private Integer age;
    private String lastName;
    private String firstName;
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

    @Override
    public boolean equals(Object o) {
        //exact same object(address ist the same)
        if (this == o) return true;
        // o is null || o ist not the same kind of class like this
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        //performance intensive
        return Objects.equals(age, person.age) &&
                Objects.equals(lastName, person.lastName) &&
                Objects.equals(firstName, person.firstName) &&
                Objects.equals(height, person.height) &&
                Objects.equals(weight, person.weight);
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
