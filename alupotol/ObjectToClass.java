package alupotol;

class Student {
    int reg;
    String name;
    String dept;
    Course [] courses;

    public Student(int reg, String name, String dept) {
        this.reg = reg;
        this.name = name;
        this.dept = dept;
    }

    public Student() {
        reg = 0;
        name = "N/A";
        dept = "N/A";
    }

    public int getReg() {
        return reg;
    }

    public void setReg(int reg) {
        this.reg = reg;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public double getAvgMarks() {
        double sum = 0;
        for(Course c : courses){
            sum+=c.getMark();
        }
        return sum/courses.length;
    }

    public void setCourses(Course[] courses) {
        this.courses = courses;
    }

    public String getInfo() {
        return "Name: " + name + ", REG: " + reg + ", DEPT: " + dept;
    }

    public double getCGPA() {
        double sum = 0;
        for(Course c : courses){
            sum+=c.getGpa();
        }
        return sum/courses.length;
    }
}


class Course{
    String Code;
    double mark;
    double gpa;
    double credit;

    public Course(String name, double mark, double gpa , double credit){
        this.gpa = gpa;
        this.credit = credit;
        this.Code = name;
        this.mark = mark;
    }

    public String getCode() {
        return Code;
    }

    public double getMark() {
        return mark;
    }

    public double getGpa() {
        return gpa;
    }

    public double getCredit() {
        return credit;
    }

}

public class ObjectToClass {
    public static void main(String[] args) {
        Course j = new Course("CSE233", 76.5, 3.75, 3.0);
        System.out.println("Code: " + j.getCode() + ", Mark: " + j.getMark() + ", GPA: " + j.getGpa() + ", Credit: " + j.getCredit());

        Course c = new Course("CSE133", 72.5, 3.5, 2.0);
        Student std = new Student(2012331001, "A", "CSE");
        Course[] courses = new Course[2];
        courses[0] = j;
        courses[1] = c;
        std.setCourses(courses);
        System.out.println("NAME: " + std.getName() + ", REG: " + std.getReg() + ", DEPT: " + std.getDept() +
                "\nAVG Marks: " + std.getAvgMarks() + ", CGPA: " + std.getCGPA());

        std.setName("B");
        std.setReg(1999213001);
        std.setDept("EEE");
        System.out.println(std.getInfo());

        std = new Student();
        System.out.println(std.getInfo());
    }
}