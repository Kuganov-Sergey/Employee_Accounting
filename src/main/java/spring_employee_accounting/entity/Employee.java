package spring_employee_accounting.entity;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "employeesData")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "fullName")
    private String fullName;

    @Column(name = "dateOfBirth")
    private Date dateOfBirth;

    @Column(name = "state")
    private String state;

    @Column(name = "dateOfEmployment")
    private Date dateOfEmployment;

    @Column(name = "phone")
    private String phone;

    @Column(name = "salary")
    private double salary;

    @Column(name = "department")
    private String department;

    @Column(name = "post")
    private String post;

    @Column(name = "chefsId")
    private int chefsId;

    public Employee() {
    }

    public Employee(String fullName, Date dateOfBirth, String state, Date dateOfEmployment,
                    String phone, double salary, String department, String post, int chefsId) {
        this.id = id;
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.state = state;
        this.dateOfEmployment = dateOfEmployment;
        this.phone = phone;
        this.salary = salary;
        this.department = department;
        this.post = post;
        this.chefsId = chefsId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Date getDateOfEmployment() {
        return dateOfEmployment;
    }

    public void setDateOfEmployment(Date dateOfEmployment) {
        this.dateOfEmployment = dateOfEmployment;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public int getChefsId() {
        return chefsId;
    }

    public void setChefsId(int chefsId) {
        this.chefsId = chefsId;
    }
}
