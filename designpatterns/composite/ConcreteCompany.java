package composite;

import javax.swing.text.AsyncBoxView;
import java.util.ArrayList;
import java.util.List;

/**
 * 树枝结点
 */
public class ConcreteCompany extends Company {

    private List<Company> childrenCompany = new ArrayList<>();

    public ConcreteCompany(String name) {
        super(name);
    }

    @Override
    public void add(Company company) {
        childrenCompany.add(company);
    }

    @Override
    public void remove(Company company) {
        childrenCompany.remove(company);
    }

    @Override
    public void display(int depth) {
        System.out.println("第" + depth + "层的机构名为：" + name);
        for (Company c: childrenCompany)
            c.display(depth + 1);
    }

    @Override
    public void lineOfDuty() {
        for (Company c: childrenCompany)
            c.lineOfDuty();
    }
}
