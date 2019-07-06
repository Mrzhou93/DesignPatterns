package visitor;

public class Student implements Element {

    private String name;
    private int grade;
    private int paperCount;

    public Student(String name, int grade, int paperCount){
        this.name = name;
        this.grade = grade;
        this.paperCount = paperCount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void setPaperCount(int paperCount) {
        this.paperCount = paperCount;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public int getPaperCount() {
        return paperCount;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
