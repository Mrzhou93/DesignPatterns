package responsibility;

public class ProjectManager extends Handler {
    @Override
    public String handlerFeeRequest(String user, double fee) {
        String str = "";

        if (fee < 500){
            if ("Bill".equals(user)){
                str = "成功：项目经理同意" + user + "的费用，金额为" + fee + "元";
            } else {
                str = "失败：项目经理不同意" + user + "的费用，金额为" + fee + "元";
            }
        } else {
            if (getSuccessor() != null){
                return getSuccessor().handlerFeeRequest(user, fee);
            }
        }

        return str;
    }
}
