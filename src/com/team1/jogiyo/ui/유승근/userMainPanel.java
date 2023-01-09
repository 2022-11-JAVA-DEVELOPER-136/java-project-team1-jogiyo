package com.team1.jogiyo.ui.유승근;

import javax.swing.JPanel;

import com.team1.jogiyo.user.User;
import com.team1.jogiyo.user.UserService;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingConstants;

public class userMainPanel extends JPanel   {
	

	
	
	
	

	/**
	 * Create the panel.
	 * @throws Exception 
	 */
	public userMainPanel() throws Exception {
		setBackground(new Color(128, 255, 255));
		setLayout(null);
		
		JLabel userMainLB = new JLabel("");
		userMainLB.setIcon(new ImageIcon(userMainPanel.class.getResource("/com/team1/jogiyo/ui/유승근/image/userMain.png")));
		userMainLB.addMouseListener(new MouseAdapter() {
	
		});
		userMainLB.setBackground(new Color(255, 255, 255));
		userMainLB.setForeground(new Color(255, 255, 255));
		userMainLB.setBounds(28, 44, 292, 406);
		add(userMainLB);

		
		

	}
	
}
