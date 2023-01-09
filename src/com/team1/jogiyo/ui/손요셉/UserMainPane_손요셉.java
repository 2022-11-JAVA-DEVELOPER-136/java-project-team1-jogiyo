package com.team1.jogiyo.ui.손요셉;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;

public class UserMainPane_손요셉 extends JPanel {

	/**
	 * Create the panel.
	 */
	public UserMainPane_손요셉() {
		setBackground(Color.WHITE);
		setLayout(null);
		
		JLabel lblNewLabelMainLogo = new JLabel("");
		lblNewLabelMainLogo.setIcon(new ImageIcon(UserMainPane_손요셉.class.getResource("/com/team1/jogiyo/ui/손요셉/image/1 (1) (2).png")));
		lblNewLabelMainLogo.setBounds(93, 99, 199, 241);
		add(lblNewLabelMainLogo);

	}

}
