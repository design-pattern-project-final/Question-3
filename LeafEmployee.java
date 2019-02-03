

package dpproject;

/**
 *
 * @author misge
 */
public class LeafEmployee implements Employee {
    private String name;
    private double salary;
    public LeafEmployee(String name,double salary){
        this.name = name;
        this.salary = salary;
    }

    @Override
    public void add(Employee employee) {
        
       
    }

    @Override
    public void remove(Employee employee) {
        
    }

    @Override
    public Employee getChild(int i) {
        return null;
        
    }

    @Override
    public String getName() {
        return name;
       
    }

    @Override
    public double getSalary() {
        return salary;
     
    }

    @Override
    public void print() {
        System.out.println("-------------");
        System.out.println("Name ="+getName());
        System.out.println("Salary ="+getSalary());
        System.out.println("-------------");
      
    }
    
}
