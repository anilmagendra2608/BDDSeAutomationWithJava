package main.java.pageObjects;

public interface LoginPageElements {
    String LoginPageLabel = "//h1[contains(text(),'Sign-In')]";
    String emailTextBox = "//input[@name ='email']";
    String continueButton = "//input[@type ='submit']";
}
