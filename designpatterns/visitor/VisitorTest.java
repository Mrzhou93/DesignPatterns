package visitor;

import java.nio.file.FileVisitOption;

public class VisitorTest {
    public static void main(String[] args) {
        Element stu1 = new Student("Student Bill", 92, 3);
        Element stu2 = new Student("Student Tom", 89, 1);
        Element t1 = new Teacher("Teacher Mike", 83, 10);
        Element t2 = new Teacher("Teacher Lee", 90, 7);

        ObjectStructure objectStructure = new ObjectStructure();
        objectStructure.addElement(stu1);
        objectStructure.addElement(stu2);
        objectStructure.addElement(t1);
        objectStructure.addElement(t2);

        Visitor gradeSelection = new GradeSelection();
        objectStructure.accept(gradeSelection);

        System.out.println();

        Visitor researcherSelection = new ReseacherSelection();
        objectStructure.accept(researcherSelection);
    }
}
