package _01_else_if._4_are_you_happy;
import javax.print.attribute.standard.JobHoldUntil;
import javax.swing.JOptionPane;
public class are_You_Happy {
 public static void main(String[] args){
String happy = JOptionPane.showInputDialog("Are you happy?");
if(happy.equalsIgnoreCase("no")){
String want = JOptionPane.showInputDialog("Do you want to be happy?");
if(want.equalsIgnoreCase("yes")){
JOptionPane.showMessageDialog(null,"Change something");
}
else{
JOptionPane.showMessageDialog(null,"Keep doing what you are doing.");
}
}
else{
JOptionPane.showMessageDialog(null, "Keep doing what you are doing.");
}
} 
}
