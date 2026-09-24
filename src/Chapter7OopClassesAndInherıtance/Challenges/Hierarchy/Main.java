package Chapter7OopClassesAndInherıtance.Challenges.Hierarchy;

public class Main {
    public static void main(String[] args) {
        Employee ozan = new Employee("Ozan","26.05.1998","28.05.2026");

        System.out.println(ozan);
        System.out.println("Age = " + ozan.getAge());
        System.out.println("Pay = "+ ozan.collectPay());

        SalariedEmployee joe = new SalariedEmployee("joe","26.05.1998","28.05.2026",35000);

        System.out.println(joe);
        System.out.println("Age = " + joe.getAge());
        System.out.println("Pay = "+ joe.collectPay());

        joe.retire();
        System.out.println("Pay = "+ joe.collectPay());
    }
}
