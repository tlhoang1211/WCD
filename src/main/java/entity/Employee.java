package entity;

import annotation.Column;
import annotation.Entity;
import annotation.Id;

import java.util.Date;

@Entity(tableName = "employee")
public class Employee {
    @Id
    @Column(columnName = "ID", columnType = "varchar(200)")
    private String id;
    @Column(columnName = "FullName", columnType = "varchar(200)")
    private String fullName;
    @Column(columnName = "Birthday", columnType = "date")
    private Date birthday;
    @Column(columnName = "Address", columnType = "varchar(200)")
    private String address;
    @Column(columnName = "Position", columnType = "varchar(200)")
    private String position;
    @Column(columnName = "Department.", columnType = "varchar(200)")
    private String department;

    public Employee() {
    }

    public Employee(String id, String fullName, Date birthday, String address, String position, String department) {
        this.id = id;
        this.fullName = fullName;
        this.birthday = birthday;
        this.address = address;
        this.position = position;
        this.department = department;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
