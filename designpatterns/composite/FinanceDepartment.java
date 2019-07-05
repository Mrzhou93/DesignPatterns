package composite;

public class FinanceDepartment extends Company {
    public FinanceDepartment(String name) {
        super(name);
    }

    @Override
    public void add(Company company) {

    }

    @Override
    public void remove(Company company) {

    }

    @Override
    public void display(int depth) {
        System.out.println("第" + depth + "层的机构名为：" + name);
    }

    @Override
    public void lineOfDuty() {
        System.out.println(name + "负责员工财务管理");
    }
}
