package com.example.demo.model;

/**
 * Lớp Employee đại diện cho một nhân viên.
 * @author:tranthanhthuan
 */
public class Employee{
    private String empNo;
    private String empName;
    private String position;

    public Employee() {

    }

    public Employee(String empNo, String empName, String position) {
        this.empNo = empNo;
        this.empName = empName;
        this.position = position;
    }

    /**
     * @return the position
     */
    public String getPosition() {
        return position;
    }

    /**
     * @param position the position to set
     */
    public void setPosition(String position) {
        this.position = position;
    }

    /**
     * @return the empName
     */
    public String getEmpName() {
        return empName;
    }

    /**
     * @param empName the empName to set
     */
    public void setEmpName(String empName) {
        this.empName = empName;
    }

    /**
     * @return the empNo
     */
    public String getEmpNo() {
        return empNo;
    }

    /**
     * @param empNo the empNo to set
     */
    public void setEmpNo(String empNo) {
        this.empNo = empNo;
    }

}