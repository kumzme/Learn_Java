package tests;

import java.io.Serializable;

public class EmployeeClass implements Serializable {

    private String EmpName;
    private int Salary;
    private String DeptName;

    public EmployeeClass(String EmpName, int Salary, String DeptName){
        this.EmpName = EmpName;
        this.Salary = Salary;
        this.DeptName = DeptName;
     }
     public String getEmpName(){
        return EmpName;
     }
     public void setEmpName(String EmpName){
     }
    public Integer getSalary(){
        return Salary;
    }
    public void SetSalary(int Salary){
    }
    public String getDeptName(){
        return DeptName;
    }
    public void SetDeptName(String DeptName){
    }
}
