package visitor;

public interface Visitor {
    void visit(Student element);

    void visit(Teacher element);
}
