package com.team1.jogiyo.ui.유승근;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JButton;

public class userLoginMainPanel extends JPanel {
	private JPasswordField passwordField;
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public userLoginMainPanel() {
		setBackground(new Color(204, 255, 204));
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(52, 136, 112, 31);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(52, 216, 57, 15);
		add(lblNewLabel_1);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(181, 213, 163, 21);
		add(passwordField);
		
		textField = new JTextField();
		textField.setBounds(176, 141, 168, 21);
		add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(32, 393, 97, 23);
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(151, 393, 97, 23);
		add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.setBounds(273, 393, 97, 23);
		add(btnNewButton_2);

	}
}
