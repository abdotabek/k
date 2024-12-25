import java.util.Objects;

public class Person {
    private String name;
    private Integer age;
    private StringBuffer surname;
    private StringBuilder lastName;

    public StringBuffer getSurname() {
        return surname;
    }

    public void setSurname(StringBuffer surname) {
        this.surname = surname;
    }

    public StringBuilder getLastName() {
        return lastName;
    }

    public void setLastName(StringBuilder lastName) {
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (Objects.equals(name, "Ali")) {
            throw new ClassCastException("ism Ali bolomedida aka");
        }
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        if (age < 0) {
            throw new IllegalArgumentException("yoshni manfiy qabul qilolmiman");
        }
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
