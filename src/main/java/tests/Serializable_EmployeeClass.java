package tests;

import java.io.Serializable;

/**
 *
 */
public class Serializable_EmployeeClass implements Serializable {

    private String EmpName;
    private int Salary;
    private String DeptName;

    /*Getters*/
    public Serializable_EmployeeClass(String EmpName, int Salary, String DeptName) {
        this.EmpName = EmpName;
        this.Salary = Salary;
        this.DeptName = DeptName;
    }

    public String getEmpName() {
        return EmpName;
    }

    public String getDeptName() {
        return DeptName;
    }
    /*Setters*/
    public void setEmpName(String EmpName) {
    }

    public Integer getSalary() {
        return Salary;
    }

    public void SetSalary(int Salary) {
    }
    public void SetDeptName(String DeptName) {
    }
}
