package com.xworkz.passportapp.passportseva;

import com.xworkz.passportapp.user.PassportUser;

public class PassportSeva {

    PassportUser passportUser;

    public boolean createPassportUser(PassportUser passportUser){
        boolean passportUserCreated = false;
        boolean cpvLocationValid = false;
        boolean dcdrLocationValid = false;
        boolean givenNameValid = false;
        boolean surNameValid = false;
        boolean dobValid = false;
        boolean emailValid = false;
        boolean isEmailLoginSameValid = false;
        boolean loginIdValid = false;
        boolean pwdValid = false;
        boolean conformPwdValid = false;
        boolean hintQuestionValid = false;
        boolean hintAnswerValid = false;
        boolean captchaValid = false;

        if(passportUser.getCpvLocation() != null){
            cpvLocationValid = true;
        }
        else {
            System.out.println("CPV Location is not valid");
        }
        if (passportUser.getDcdrLocation() != null){
            dcdrLocationValid = true;
        }
        else {
            System.out.println("Dcdr location is not valid");
        }
        if(passportUser.getGivenName() != null){
            givenNameValid = true;
        }
        else{
            System.out.println("Given name is not valid");
        }
        if(passportUser.getSurName() != null){
            surNameValid = true;
        }
        else {
            System.out.println("Sur name is not valid");
        }
        if(passportUser.getDob() != null){
            dobValid = true;
        }
        else {
            System.out.println("Date of birth is not valid");
        }
        if(passportUser.getEmail() != null){
            emailValid = true;
        }
        else {
            System.out.println("Email id is not valid");
        }
        if (passportUser.getIsEmailLoginSame() != false){
            isEmailLoginSameValid = true;
        }
        else {
            System.out.println("Is email login same is not valid");
        }
        if(passportUser.getLoginId() != null){
            loginIdValid = true;
        }
        else {
            System.out.println("Login id is not valid");
        }
        if (passportUser.getPwd() != null){
            pwdValid = true;
        }
        else {
            System.out.println("Password is not valid");
        }
        if (passportUser.getConformPwd() != null){
            conformPwdValid = true;
        }
        else {
            System.out.println("Conform password is not valid");
        }
        if (passportUser.getHintQuestion() != null){
            hintQuestionValid = true;
        }
        else {
            System.out.println("Hint question is not valid");
        }
        if(passportUser.getHintAnswer() != null){
            hintAnswerValid = true;
        }
        else {
            System.out.println("Hint answer is not valid");
        }
        if(passportUser.getCaptcha() != null){
            captchaValid = true;
        }
        else {
            System.out.println("Captcha is not valid");
        }
        if(cpvLocationValid && dcdrLocationValid && givenNameValid && surNameValid && dobValid && emailValid && isEmailLoginSameValid && loginIdValid && pwdValid && conformPwdValid && hintQuestionValid && hintAnswerValid && captchaValid){
            passportUserCreated = true;
            this.passportUser = passportUser;
        }
    return passportUserCreated;
    }
    public void getUserDetails(){
        System.out.println("CpvLocation: "+passportUser.getCpvLocation());
        System.out.println("DcdrLocation: "+passportUser.getDcdrLocation());
        System.out.println("GivenName: "+passportUser.getGivenName());
        System.out.println("SurName: "+passportUser.getSurName());
        System.out.println("DOB: "+passportUser.getDob());
        System.out.println("Email: "+passportUser.getEmail());
        System.out.println("IsEmailloginSame: "+passportUser.getIsEmailLoginSame());
        System.out.println("LoginId : "+passportUser.getLoginId());
        System.out.println("Password: "+passportUser.getPwd());
        System.out.println("Conform password: "+passportUser.getConformPwd());
        System.out.println("HintQuestion: "+passportUser.getHintQuestion());
        System.out.println("HintAnswer: "+passportUser.getHintAnswer());
        System.out.println("Captcha: "+passportUser.getCaptcha());
    }
}
