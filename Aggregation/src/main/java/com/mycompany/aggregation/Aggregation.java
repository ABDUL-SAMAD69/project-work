

package com.mycompany.aggregation;
class Department {
    private final String name;

    public Department(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class University {
    private final Department[] departments;

    public University(Department[] departments) {
        this.departments = departments;
    }

    public Department[] getDepartments() {
        return departments;
    }
}

public class Aggregation {

    public static void main(String[] args) {
        Department mathDepartment = new Department("Mathematics");
        Department physicsDepartment = new Department("Physics");

        Department[] departments = { mathDepartment, physicsDepartment };
        
        University university = new University(departments);

        Department[] universityDepartments = university.getDepartments();
        
        for (Department department : universityDepartments) {
            System.out.println("University has a department: " + department.getName());
       
    }
}
}
