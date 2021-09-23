package entities;

public class User {
    private String userid;
    private String userName;
    private String userAddress;
    private Integer userMobile;

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public Integer getUserMobile() {
        return userMobile;
    }

    public void setUserMobile(Integer userMobile) {
        this.userMobile = userMobile;
    }

    @Override
    public String toString() {
        return "User{" +
                "userid='" + userid + '\'' +
                ", userName='" + userName + '\'' +
                ", userAddress='" + userAddress + '\'' +
                ", userMobile=" + userMobile +
                '}';
    }
}
