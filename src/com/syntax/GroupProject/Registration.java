package com.syntax.GroupProject;

public class Registration {
    private String email;
    private String userName;
    private String password;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
       if(email.contains("yahoo")){
           this.email = email;
       }else {
           System.out.println("<< wrong email! >>\n");
       }
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        if(!userName.isEmpty()&&userName.length()>6){
            this.userName = userName;
        } else {
            System.out.println("<< username does not meet the requirements! >>\n");
        }

    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if(!password.contains(this.userName)) {
            this.password = password;
        } else if(password.equals(null)|| password.contains(userName)) {
            System.out.println("<< Password cannot contain username! >>\n");
        }
    }
}
