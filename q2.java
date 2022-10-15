import java.util.*;
class Employee 
{
private String name;
private double age;
private double salary;


public Employee(String name, double age, double salary) {
this.name = name;
this.age = age;
this.salary = salary;
}


public String getName() {
return name;
}


public void setName(String name) {
this.name = name;
}


public double getAge() {
return age;
}


public void setAge(double age) {
this.age = age;
}


public double getSalary() {
return salary;
}


public void setSalary(double salary) {
this.salary = salary;
}


}


class Quest2 {
public static void main(String[] args) {
Employee employee1 = new Employee("harshita Mishra", 22, 1000.0);
Employee employee2 = new Employee("harshita singh", 20, 805.0);
Employee employee3 = new Employee("Abhijit bala", 23, 900.0);
Employee employee4 = new Employee("Abhijit kala", 22, 1200.0);
Employee employee5 = new Employee("kapil rajoria", 20, 1000.0);
List<Employee> employeeList = new ArrayList<>();
employeeList.add(employee1);
employeeList.add(employee2);
employeeList.add(employee3);
employeeList.add(employee4);
employeeList.add(employee5);

Collections.sort(employeeList, new Comparator<Employee>() 
{
public int compare(Employee e1, Employee e2) 
{
    return e1.getName().compareTo(e2.getName());
}});
System.out.println("Sorted employees on the basis of their names..");
for (Employee e : employeeList) {
System.out.println(e.getName() + " " + e.getSalary());
}
//Collections.reverse(employeeList);
}
}
