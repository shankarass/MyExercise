package dao;

import model.Employee;

public class ProcessEmpDataV1 {
    Employee emp = new Employee();
    public void saveData(String name, int age ) {
        emp.setName(name);
        emp.setAge(age);

        System.out.println(emp.getName());
        System.out.println(emp.getAge());
    }
}
