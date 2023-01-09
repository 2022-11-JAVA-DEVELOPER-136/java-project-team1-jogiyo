package com.team1.jogiyo.ui.정유나;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CartListPanel_정유나 extends JPanel {

	/**
	 * Create the panel.
	 */
	public CartListPanel_정유나() {
		setLayout(null);
		
		JButton btnNewButton = new JButton("전체결제");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(82, 450, 97, 23);
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("선택결제");
		btnNewButton_1.setBounds(212, 450, 97, 23);
		add(btnNewButton_1);

	}

}
