import java.util.*;
class Employee
{
    private String name, designation;
    private Integer age, salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    Employee(String name, String designation, Integer age, Integer salary)
    {
        this.name=name;
        this.designation=designation;
        this.age=age;
        this.salary=salary;
    }
}
public class Main {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Employee e[] = new Employee[2];
        for(int i=0;i<2;i++)
        {
            String name = sc.nextLine();
            String designation = sc.nextLine();
            Integer age = sc.nextInt();
            Integer salary = sc.nextInt();
            sc.nextLine();
            e[i]= new Employee(name,designation,age,salary);
        }
        HashMap<Employee, Integer> map = new HashMap<>();
        for(int i=0;i<2;i++)
        {
             map.put(e[i],e[i].getSalary());
        }
        System.out.println(map);
    }
}
