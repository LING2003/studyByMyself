package study.byMyself.oopFinal.学生管理系统;

public class User {
    private String username;
    private String password;
    private String idNumber;
    private String phoneNumber;

    public User() {
    }

    public User(String username, String password, String idNumber, String phoneNumber) {
        this.username = username;
        this.password = password;
        this.idNumber = idNumber;
        this.phoneNumber = phoneNumber;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
