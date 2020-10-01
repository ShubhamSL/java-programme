import java.awt.*;
import java.applet.*;

public class ScrollbarEx extends Frame
{
ScrollbarEx()
{
Scrollbar s=new Scrollbar(Scrollbar.HORIZONTAL);
Scrollbar s1=new Scrollbar();
setSize(500,500);
setVisible(true);
setLayout(new GridLayout(0,2));
//s.setBounds(40,40,50,50);
add(s);
add(s1);

System.out.println("current value of s is"+" "+(s.getValue()));
System.out.println("current value of s1 is"+" "+(s.getValue()));
s.setValues(1,1,10,30);
s1.setValues(5,5,50,60);
s.setValue(4);
System.out.println("min amd max values of scrollbar s are"+" "+(s.getMinimum())+" &"+(s.getMaximum())); 
System.out.println("min amd max values of scrollbar s1 are"+" "+(s1.getMinimum())+" &"+(s1.getMaximum())); 
}
public static void main(String args[])
{
ScrollbarEx s=new ScrollbarEx();
}
}