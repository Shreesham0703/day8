class Student {
    private String name;
    private int age;
    private double salary;

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }
}

private class Student {
    public static void main(String[] args) {
        Student s1 = new Student();

        s1.setName("Shree");
        s1.setAge(18);
        s1.setSalary(25000);

        System.out.println("Name: " + s1.getName());
        System.out.println("Age: " + s1.getAge());
        System.out.println("Salary: " + s1.getSalary());
    }
}