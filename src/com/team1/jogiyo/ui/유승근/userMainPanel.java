package com.team1.jogiyo.ui.유승근;

import javax.swing.JPanel;

import com.team1.jogiyo.user.User;
import com.team1.jogiyo.user.UserService;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class userMainPanel extends JPanel   {
	

	
	
	
	

	/**
	 * Create the panel.
	 * @throws Exception 
	 */
	public userMainPanel() throws Exception {
		setBackground(new Color(255, 255, 255));
		setLayout(null);
		
		JLabel userMainLB = new JLabel("");
		userMainLB.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		userMainLB.setBackground(new Color(255, 0, 0));
		userMainLB.setForeground(new Color(255, 255, 255));
		userMainLB.setIcon(new ImageIcon(userMainPanel.class.getResource("/com/team1/jogiyo/ui/유승근/image/userMain.png")));
		userMainLB.setBounds(12, 29, 326, 445);
		add(userMainLB);

		
		

	}
	
}
