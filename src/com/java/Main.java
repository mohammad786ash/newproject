package com.java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {


    public static void main(String[] args) {

        Human human1 = new Human("Joe",25);
        Human human2 = new Human("Bob",32);

      human2.eat();
      human1.drink();
    }

}
