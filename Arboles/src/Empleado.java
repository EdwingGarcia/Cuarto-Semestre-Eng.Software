public class Empleado {
    private int code;
    private String name;
    private  float salary;
    private String department;

    public Empleado(){
    }

    public Empleado(int code, String name, float salary, String department) {
        this.code = code;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "\nEmpleado" +
                "\tcode" + code +
                "\tname" + name +
                "\tsalary" + salary +
                "\tdepartment=" + department;
    }
}
