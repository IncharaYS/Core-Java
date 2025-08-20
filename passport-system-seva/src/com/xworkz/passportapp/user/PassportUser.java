package com.xworkz.passportapp.user;

public class PassportUser {

    private String cpvLocation;
    public String getCpvLocation(){
        return cpvLocation;
    }
    public void setCpvLocation(String cpvLocation){
        this.cpvLocation = cpvLocation;
    }

    private String dcdrLocation;
    public String getDcdrLocation()
    {
        return dcdrLocation;
    }
    public void setDcdrLocation(String dcdrLocation){
        this.dcdrLocation = dcdrLocation;
    }

    private String givenName;
    public String getGivenName(){
        return givenName;
    }
    public void setGivenName(String givenName){
        this.givenName = givenName;
    }

    private String surName;
    public String getSurName(){
        return surName;
    }
    public void setSurName(String surName){
        this.surName = surName;
    }

    private String dob;
    public String getDob(){
        return dob;
    }
    public void setDob(String dob){
        this.dob = dob;
    }

    private String email;
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }

    private boolean isEmailLoginSame;
    public boolean getIsEmailLoginSame(){
        return isEmailLoginSame;
    }
    public void setIsEmailLoginSame(boolean isEmailLoginSame){
        this.isEmailLoginSame = isEmailLoginSame;
    }

    private  String loginId;
    public String getLoginId(){
        return loginId;
    }
    public void setLoginId(String loginId){
        this.loginId = loginId;
    }

    private  String pwd;
    public String getPwd(){
        return pwd;
    }
    public void setPwd(String pwd){
        this.pwd = pwd;
    }

    private String conformPwd;
    public String getConformPwd(){
        return conformPwd;
    }
    public void setConformPwd(String conformPwd){
        this.conformPwd = conformPwd;
    }

    private String hintQuestion;
    public String getHintQuestion(){
        return hintQuestion;
    }
    public void setHintQuestion(String hintQuestion){
        this.hintQuestion =hintQuestion;
    }

    private String hintAnswer;
    public String getHintAnswer(){
        return hintAnswer;
    }
    public void setHintAnswer(String hintAnswer){
        this.hintAnswer = hintAnswer;
    }

    private String captcha;
    public String getCaptcha(){
        return captcha;
    }
    public void setCaptcha(String captcha){
        this.captcha = captcha;
    }
}
