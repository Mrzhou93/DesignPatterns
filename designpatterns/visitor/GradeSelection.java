package visitor;

import strategy.Strategy;

public class GradeSelection implements Visitor {

    private String awardWords = "[%s]的分数是%d，荣获了成绩优秀奖";

    @Override
    public void visit(Student element) {
        if (element.getGrade() >= 90){
            System.out.println(String.format(awardWords, element.getName(), element.getGrade()));
        }
    }

    @Override
    public void visit(Teacher element) {
        if (element.getScore() >= 85){
            System.out.println(String.format(awardWords, element.getName(), element.getScore()));
        }
    }
}
