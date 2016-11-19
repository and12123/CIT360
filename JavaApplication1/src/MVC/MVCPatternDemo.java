/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC;

import MVC.ControllerExample;

/**
 *
 * @author Alyssa
 */
public class MVCPatternDemo {
   public static void main(String[] args) {

      //fetch student record based on his roll no from the database
      ModelExample model  = retriveStudentFromDatabase();

      //Create a view : to write student details on console
      ViewExample view = new ViewExample();

      ControllerExample controller = new ControllerExample(model, view);

      controller.updateView();

      //update model data
      controller.setStudentName("John");

      controller.updateView();
   }

   private static ModelExample retriveStudentFromDatabase(){
      ModelExample student = new ModelExample();
      student.setName("Robert");
      student.setRollNo("10");
      return student;
   }
}