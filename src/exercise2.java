public class exercise2 {
    public static double EmpSalary(double hours, double wage_rate, double vac_days) {
        return (hours * wage_rate) - (vac_days * 8 * wage_rate);
    }
    public static void main(String[] args) {
        System.out.println("Gross Employee Salary is: " + EmpSalary(20,8, 1));
    }
}
