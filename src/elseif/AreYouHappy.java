package elseif;

import javax.swing.JOptionPane;

public class AreYouHappy {
public static void main(String[] args) {
	
	String ayh = JOptionPane.showInputDialog("Are you happy?");
	
	if (ayh.equalsIgnoreCase("yes")) {
		JOptionPane.showMessageDialog(null, "Keep doing what you are doing");
	}else if (ayh.equalsIgnoreCase("no")) {
		String change = JOptionPane.showInputDialog("Do you want to be happy?");
	
	
	if (change.equalsIgnoreCase("yes")) {
		JOptionPane.showMessageDialog(null, "Change something");
	}else if (change.equalsIgnoreCase("no")) {
		JOptionPane.showMessageDialog(null, "Keep doing what you are doing");
	}
	}
}
}
