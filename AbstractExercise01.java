package com.hspedu.abstract_;

public class AbstractExercise01 {
    public static void main(String[] args) {
        Manager 王 = new Manager("王", "123", 5000, 1000);
        CommonEmployee tanaka = new CommonEmployee("tanaka", "234", 3000);
        王.work();
        tanaka.work();
    }

}
abstract class Employee{
    private String name;
    private String id;
    private double salary;

    public Employee(String name, String id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public abstract void work();
}
class Manager extends Employee{
    private double bonus;

    public Manager(String name, String id, double salary, double bonus) {
        super(name, id, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public void work(){
        System.out.println("经理："+getName()+"\tID："+getId()+"\t工资："+getSalary()+
                "\t奖金："+getBonus()+"\t工作中。。。");

    }
}
class CommonEmployee extends Employee{
    public CommonEmployee(String name, String id, double salary) {
        super(name, id, salary);
    }
    public void work(){
        System.out.println("普通员工："+getName()+"\tID："+getId()+"\t工资："+getSalary()+
                "\t工作中。。。");
    }
}
