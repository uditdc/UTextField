import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class UTextFieldApp {
	
	public static void main(String args[]) {
		String testingText = "Udit";
		
		JFrame frm = new JFrame("UTextField Testing");

		
		JPanel mainPnl = new JPanel();
		
		UTextField txtFld = new UTextField(testingText);
		mainPnl.add(txtFld);
		
		JTextField txtFld1 = new JTextField("udit",5);
		mainPnl.add(txtFld1);
		
		frm.setContentPane(mainPnl);
		frm.setVisible(true);
		frm.pack();
	}

}
