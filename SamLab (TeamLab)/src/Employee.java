public abstract class Employee {
    Employee(String name){
        this.name=name;
        tax = 13;
    }
    private String name;
    private double tax;

    public void setTax(double tax) {
        this.tax = tax;
    }

    public double getTax() {
        return tax;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void printName(){
        System.out.println(name);
    }

    abstract double countSalary();
    public double countSalaryWithTax(){
        return countSalary()*(100-tax)/100;
    }

}
