package com.project;


import java.sql.Connection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.project.Entity.User;

@SpringBootApplication
public class MainApp {
   public static void main(String[] args) {
	   User Us = new User("3","3");
	      Connection con = Us.GetConnectionToDB();
	      if (con==null)
	      {
	    	  System.out.println("really nigga??!!");
	      }
      SpringApplication.run(MainApp.class, args);
     
   }
}