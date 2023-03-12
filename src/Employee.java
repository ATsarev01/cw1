public class Employee {

    private static int idCounter = 1;
    private String fullName;
    private int department;
    private int salary;
    private int id;

    public Employee(String fullName, int department, int salary) {
        this.id = idCounter++;
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
    }

    public String getFullName() {
        return fullName;
    }

    public int getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Сотрудник. " +
                "ФИО - " + fullName +
                ". Отдел " + department +
                ". Зарплата: " + salary +
                ". id: " + id;
    }
}
