import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class UTextField extends JComponent{

	/**
	 * Generated Serial Versions
	 */
	private static final long serialVersionUID = -639215136774539251L;
	
//	public UTextField(){
//		super();
//
//	}
	
	public UTextField(String text){
		
		this.setPreferredSize(new Dimension(500,30));
		this.setLayout(new BorderLayout());
		
		JPanel pnl = new JPanel(new GridBagLayout());
		pnl.setBackground(Color.white);
		
		GridBagConstraints c = new GridBagConstraints();
		
		JTextField txt = new JTextField("hello");
		txt.setBorder(null);
		c.fill = GridBagConstraints.HORIZONTAL;
		c.weightx = 0.5;
		c.gridx = 0;
		c.gridy = 0;

		pnl.add(txt ,c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.weightx = 0.0;
		c.gridx = 1;
		c.gridy = 0;
		
		JButton btn = new JButton("x");
		btn.setBorderPainted(false);  
		btn.setContentAreaFilled(false);  
		btn.setFocusPainted(false);  
		btn.setOpaque(false);
		btn.setBackground(Color.white);
		pnl.add(btn,c);
		
		this.add(pnl,BorderLayout.CENTER);
	}
	
	

}
