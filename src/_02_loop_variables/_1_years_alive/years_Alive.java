package _02_loop_variables._1_years_alive;
import javax.swing.JOptionPane;
public class years_Alive {
public static void main(String[] args) {
String age = JOptionPane.showInputDialog("What year were you born?");
Integer birth_Year = Integer.parseInt(age);
for(;birth_Year < 2025; birth_Year++){
System.out.println(birth_Year);
}
}
}