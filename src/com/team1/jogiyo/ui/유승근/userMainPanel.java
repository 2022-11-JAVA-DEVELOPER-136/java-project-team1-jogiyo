package com.team1.jogiyo.ui.유승근;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class userMainPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public userMainPanel() {
		setBackground(new Color(255, 255, 255));
		setLayout(null);
		
		JLabel userMainLB = new JLabel("New label");
		userMainLB.setIcon(new ImageIcon(userMainPanel.class.getResource("/com/team1/jogiyo/ui/유승근/image/userMain.png")));
		userMainLB.setBounds(12, 10, 376, 480);
		add(userMainLB);

	}

}
