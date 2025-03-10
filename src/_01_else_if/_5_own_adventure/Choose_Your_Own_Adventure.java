package _01_else_if._5_own_adventure;
import javax.swing.JOptionPane;
public class Choose_Your_Own_Adventure {
public static void main(String[] args){
JOptionPane.showMessageDialog(null, " ");
String one = JOptionPane.showInputDialog(null, "1?");
if (one.equalsIgnoreCase("yes")){
JOptionPane.showMessageDialog(null, "1 ");
String two = JOptionPane.showInputDialog(null, "1?");
if (one.equalsIgnoreCase("yes")){
}
JOptionPane.showMessageDialog(null, "11");
String three = JOptionPane.showInputDialog(null, "1?");
if (one.equalsIgnoreCase("yes")){
JOptionPane.showMessageDialog(null, "111");
}
else{
JOptionPane.showMessageDialog(null, "110");
}
}
else{
JOptionPane.showMessageDialog(null, "10");
}
}
else{
JOptionPane.showMessageDialog(null, "10");
}
}
}