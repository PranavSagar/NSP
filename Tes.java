/*
<applet code="Tes.class" width=600 height=400></applet>
*/
import java.awt.*;
public class Tes extends java.applet.Applet 
{
    public void init() 
    {
        
        setLayout(new FlowLayout(FlowLayout.LEFT));
        
        add(new Label("Name          :"));
        add(new TextField(50));

        add(new Label("Address       :"));
        add(new TextField(10));
        
        add(new Label("Birthday      :"));
        add(new TextField(10)); 
        

        add(new Label("Gender        :"));
        Choice gender = new Choice(); 
        gender.addItem("Male"); 
        gender.addItem("Female"); 
        Component add = add(gender); 

        add(new Label("Job            :"));
        CheckboxGroup job = new CheckboxGroup();
        add(new Checkbox("Student", job, false));
        add(new Checkbox("Teacher", job, false));
                
        add(new Button("Register"));
        add(new Button("Exit"));
        }
}
