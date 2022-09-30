package oops.Encapsulation;
class Employee{
    private String name;
    private int empId;
    private double salary;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getEmpId() {
        return empId;
    }
    public void setEmpId(int empId) {
        this.empId = empId;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    @Override
    public String toString(){
        return "Name: "+this.name+"\nId: "+this.empId+"\nSalary: "+this.salary;
    }
    
}
public class Encapsulation {
    public static void main(String[] args) {
        Employee e=new Employee();
        e.setEmpId(1);
        e.setName("Deepak");
        e.setSalary(32828);
        System.out.println( e.toString());
    }
}
