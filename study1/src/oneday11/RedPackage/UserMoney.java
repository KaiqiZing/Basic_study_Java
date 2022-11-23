package oneday11.RedPackage;

public class UserMoney {

    private String username;
    private  double leftMoney;

    public UserMoney() {

    }
    public UserMoney(String username, double leftMoney) {
    }



    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public double getLeftMoney() {
        return leftMoney;
    }

    public void setLeftMoney(double leftMoney) {
        this.leftMoney = leftMoney;
    }

    public void show(){
        System.out.println("用户名："+username+"余额："+leftMoney+"元");
    }
}
