public class Person {
    private String name;
    private String responsibility;
    private String workplace;
    private int age;
    private double salary;

    public Person(String name, String responsibility, String workplace, Integer age, Double salary) {
        this.name = name;
        this.responsibility = responsibility;
        this.workplace = workplace;
        this.age = age;
        this.salary = salary;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public String getResponsibility() {
        return responsibility;
    }

    public String getWorkplace() {
        return workplace;
    }

    public Integer getAge() {
        return age;
    }

    public Double getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setResponsibility(String responsibility) {
        this.responsibility = responsibility;
    }

    public void setWorkplace(String workplace) {
        this.workplace = workplace;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}
