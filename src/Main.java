public class Main {

    static private Employee[] employees = new Employee[10];
    public static void main(String[] args) {
        employees[0] = new Employee("Галачиева Вероника Рамазановна", 4, 150000);
        employees[1] = new Employee("Калинова Юлия Александровна", 4, 160000);
        employees[2] = new Employee("Симаков Павел Олегович", 3, 10000);
        employees[3] = new Employee("Царев Антон Виталиевич", 4, 500000);
        employees[4] = new Employee("Маркин Максим Геннадьевич", 3, 56777);
        employees[5] = new Employee("Лисицын Дмитрий Владимирович", 3, 16000);
        employees[6] = new Employee("Ковалев Владимир Александрович", 2, 123000);
        employees[7] = new Employee("Маркова Вера Аркадьевна", 3, 125466);
        employees[8] = new Employee("Селезенева Марина Геннадьевна", 3, 9000);
        employees[9] = new Employee("Сергеев Сергей Сергеевич", 3, 160000);

        printAboutEmployees();
        System.out.println("Сумма ЗП: " + calculateAllSalary());
        System.out.println("Средняя ЗП: " + findAverageSalary());
        System.out.println("Минимальная ЗП: " + findMinSalary());
        System.out.println("Максимальная ЗП: " + findMaxSalary());
        printNameOfEmployees();
    }


    private static void printAboutEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee.toString());
        }
    }

    private static int calculateAllSalary() {
        int sum = 0;
        for (Employee employee : employees) {
            sum = sum + employee.getSalary();
        }
        return sum;
    }

    private static Employee findMinSalary() {
        Employee employee = null;
        int minSalary = Integer.MAX_VALUE;
        for (Employee emp : employees) {
            if (emp.getSalary() < minSalary) {
                minSalary = emp.getSalary();
                employee = emp;
            }
        } return employee;
    }
    private static Employee findMaxSalary() {
        Employee employee = null;
        int maxSalary = Integer.MIN_VALUE;
        for (Employee emp : employees) {
            if (emp.getSalary() > maxSalary) {
                maxSalary = emp.getSalary();
                employee = emp;
            }
        }
        return employee;
    }

    private static double findAverageSalary() {
        return calculateAllSalary() / employees.length;
    }

    private static void printNameOfEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee.getFullName());
        }
    }
}