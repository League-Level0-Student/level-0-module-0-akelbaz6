import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class Checkpoint {
public static void main(String[] args) {
String fav = JOptionPane.showInputDialog("What Is Your Favorite Color");
JOptionPane.showConfirmDialog(null, fav + " is my favorite color to!");
Robot bob = new Robot ();
bob.hide();
bob.setPenColor(Color.CYAN);
bob.penDown();
bob.sparkle();
for (int i = 0; i < 3; i++) {
bob.turn(120);
bob.move(100);
}
}
}
