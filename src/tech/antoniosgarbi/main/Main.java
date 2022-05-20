package tech.antoniosgarbi.main;

import tech.antoniosgarbi.EmployeeComposite;
import tech.antoniosgarbi.EmployeeLeaf;

public class Main {
    public static void main(String[] args) {

        EmployeeComposite CEO = new EmployeeComposite("Rich", "CEO");

        EmployeeComposite managerSales = new EmployeeComposite("Joao", "Head Sales");
        EmployeeComposite managerMarketing = new EmployeeComposite("Maria", "Head Marketing");

        CEO.add(managerSales);
        CEO.add(managerMarketing);

        EmployeeLeaf emp1 = new EmployeeLeaf("Jose", "Sales");
        EmployeeLeaf emp2 = new EmployeeLeaf("Pedro", "Sales");
        managerSales.add(emp1);
        managerSales.add(emp2);

        EmployeeLeaf emp3 = new EmployeeLeaf("Maycon", "Marketing");
        EmployeeLeaf emp4 = new EmployeeLeaf("Andre", "Marketing");
        managerMarketing.add(emp3);
        managerMarketing.add(emp4);

        CEO.showDetails();
        System.out.println("Count subordinates: " + CEO.getSubordinateCount());
        System.out.println("Count employees: " + CEO.getEmployeeCount());
    }

}