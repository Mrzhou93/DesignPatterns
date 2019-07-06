package visitor;

import java.util.ArrayList;

public class ObjectStructure {
    private ArrayList<Element> elements = new ArrayList<>();

    public void accept(Visitor visitor){
        for (Element element: elements){
            element.accept(visitor);
        }
    }

    public void addElement(Element element){
        elements.add(element);
    }

    public void removeElement(Element element){
        elements.remove(element);
    }
}
