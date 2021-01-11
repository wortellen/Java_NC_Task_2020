package ru.ncedu.wortellen.InterfacesAndLambdaExpressions.Ex1Ex2;

public class Employee implements Measurable{
    private final int id;
    private final String firstName;
    private final String lastName;
    private int salary;

    public Employee(int id, String firstName,String lastName, int salary){
        this.id=id;
        this.firstName=firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getID() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return firstName+" "+lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String toString(){
        return "Employee[id="+id+",name="+firstName+" "+lastName+",salary="+salary+"]";
    }

    public double getMeasure(){
        return  salary;
    }
}
