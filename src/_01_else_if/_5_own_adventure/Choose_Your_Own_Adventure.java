package _01_else_if._5_own_adventure;
import javax.swing.JOptionPane;
public class Choose_Your_Own_Adventure {
public static void main(String[] args){
JOptionPane.showMessageDialog(null, "One day you are walking along a trail.\n" + //
        "You are having a great day. \n" + //
        "Then, you come across a bridge!\n" + //
        "\n" + //
        "");
String one = JOptionPane.showInputDialog(null, "Do you cross it?\n" + //
        "");
if (one.equalsIgnoreCase("yes")){
JOptionPane.showMessageDialog(null, "You cross the bridge and walk through a nice forest.\n" + //
        "In the center there is a huge tree.\n" + //
        "\n" + //
        "");
String one_One = JOptionPane.showInputDialog(null, "Do you climb it?\n" + //
        "?");
if (one_One.equalsIgnoreCase("yes")){
JOptionPane.showMessageDialog(null, "You climb the tree, but then you fall!\n" + //
        "You think you are ok, so you start on the way home,\n" + //
        " but you have forgotten the way, and you get lost never to be seen again.\n" + //
        "\n" + //
        "");
}
else{
JOptionPane.showMessageDialog(null, "You turn around and head home.\n" + //
        "You come home just in time for juicy burgers for dinner.\n" + //
        "\n" + //
        "");
}
}
else{
JOptionPane.showMessageDialog(null, "You stay on the path until you reach a school.\n" + //
        "The children are out at recess during an after school program.\n" + //
        "They ask you to climb the fence and hangout with them.\n" + //
        "\n" + //
        "");
String one_Zero = JOptionPane.showInputDialog(null, "Do you?\n" + //
        "");
if (one_Zero.equalsIgnoreCase("yes")){
JOptionPane.showMessageDialog(null, "After you go over the fence you get into a fight with the children.\n" + //
        "You think you are ok, so you climb the tree and start on the way home,\n" + //
        " but you have forgotten the way, and you get lost never to be seen again.\n" + //
        "\n" + //
        "");
}
else{
JOptionPane.showMessageDialog(null, "You turn around and head home.\n" + //
        "You come home just in time for juicy burgers for dinner.\n" + //
        "\n" + //
        "\n" + //
        "\n" + //
        "");
}
}
}
}

