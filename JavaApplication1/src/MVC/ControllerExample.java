/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC;

/**
 *
 * @author Alyssa
 */
public class ControllerExample {
    private ModelExample model;
    private ViewExample view;

    public ControllerExample(ModelExample model, ViewExample view){
        this.model = model;
        this.view = view;
    }

    public void setStudentName(String name){
        model.setName(name);		
    }

    public String getStudentName(){
        return model.getName();		
    }

    public void setStudentRollNo(String rollNo){
        model.setRollNo(rollNo);		
    }

    public String getStudentRollNo(){
         return model.getRollNo();		
    }

    public void updateView(){				
          view.printStudentDetails(model.getName(), model.getRollNo());
    }		
}
