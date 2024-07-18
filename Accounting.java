public class Accounting {
    int bonus;
    int seniority;
    int tax;
    int salary = 0;

    Employee employee;

    Accounting(Employee employee){
        this.employee = employee;
    }

    int getTotalSalary(Employee employee) {
        int salary = 0;

        if (this.employee.workHours > 40) {
            salary = (this.employee.hourlyWage * this.employee.workHours) + (this.employee.workHours * 30);
        } else if (salary <= 40) {
            salary = this.employee.workHours * this.employee.hourlyWage;
        }

        int tempSalary = salary;

        if (2024 - this.employee.hireYear < 10 && 2024 - this.employee.hireYear >= 0) {
            salary += (tempSalary / 100) * 5;
        } else if (2024 - this.employee.hireYear >= 10 && 2024 - this.employee.hireYear < 20) {
            salary += (tempSalary / 100) * 10;
        } else if (2024 - this.employee.hireYear >= 20) {
            salary += (tempSalary / 100) * 15;
        }

        int taxAfter = salary;

        if (salary < 1000) {
            System.out.println(salary);
            return salary;
        } else {
            salary -= (salary / 100) * 3;
            System.out.println("3 percent after-tax earnings : " + salary);
            return salary;

        }
    }


    void toString1(Employee employee){
        System.out.print("Name : " + employee.name + "\n" + "Hourly rate : " + employee.hourlyWage + "\n" + "Total working hours with mounth : " +
                employee.workHours + "\n" + "Employement date : " + employee.hireYear + "\n" + "Total earnings : " + getTotalSalary(employee));
    }
}
