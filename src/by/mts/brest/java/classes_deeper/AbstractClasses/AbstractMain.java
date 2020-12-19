package by.mts.brest.java.classes_deeper.AbstractClasses;

public class AbstractMain {
    
    public static void main(String[] args) {
        // Human human1 = new Human();
        SalesEmployee employeeOne = new SalesEmployee(1);
        employeeOne.doTraining();
        System.out.println("employeeOne = " + employeeOne);
        employeeOne.passCompliance();

        SalesEmployee sales2 = new SalesEmployee(2,2,"dsf");
        System.out.println("sales2 = " + sales2);
    }
    
}
