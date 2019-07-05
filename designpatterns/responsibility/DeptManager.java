package responsibility;

public class DeptManager extends Handler {
    @Override
    public String handlerFeeRequest(String user, double fee) {
        String str = "";

        if (fee < 1000){
            if ("Bill".equals(user)){
                str = "成功：部门经理同意" + user + "的费用，金额为" + fee + "元";
            } else {
                str = "失败：部门经理不同意" + user + "的费用，金额为" + fee + "元";
            }
        } else {
            if (getSuccessor() != null){
                return getSuccessor().handlerFeeRequest(user, fee);
            }
        }

        return str;
    }
}
