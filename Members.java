public class Members {
    String name;
    int age;
    String phone;
    String address;
    double salary;

    void printSalary() {
        System.out.println(salary);
    }
}

public class Employee extends Members {
    String specialization;
}

public class Manager extends Employee {
    String department;
}

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.name = "Rahul";
        emp.age = 19;
        emp.phone = "12334";
        emp.address = "vizag";
        emp.salary = 1000000;
        emp.specialization = "pilot";

        Manager mgr = new Manager();
        mgr.name = "anishvl";
        mgr.age = 40;
        mgr.phone = "9876543210";
        mgr.address = "456 Elm St.";
        mgr.salary = 80000;
        mgr.department = "IT";

        System.out.println("Employee Details:");
        System.out.println("Name: " + emp.name);
        System.out.println("Age: " + emp.age);
        System.out.println("Phone Number: " + emp.phone);
        System.out.println("Address: " + emp.address);
        emp.printSalary();
        System.out.println("Specialization: " + emp.specialization);

        System.out.println("\nManager Details:");
        System.out.println("Name: " + mgr.name);
        System.out.println("Age: " + mgr.age);
        System.out.println("Phone Number: " + mgr.phone);
        System.out.println("Address: " + mgr.address);
        mgr.printSalary();
        System.out.println("Department: " + mgr.department);
    }
}
