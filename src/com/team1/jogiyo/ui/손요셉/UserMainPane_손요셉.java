package com.team1.jogiyo.ui.손요셉;

import javax.swing.JPanel;
import javax.swing.JTabbedPane;

import com.team1.jogiyo.order.OrderService;
import com.team1.jogiyo.ui.JogiyoMainFrame;
import com.team1.jogiyo.user.User;
import com.team1.jogiyo.user.UserService;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Cursor;

public class UserMainPane_손요셉 extends JPanel {
	JogiyoMainFrame frame;
	User loginUser=null;
	public void setFrame(JogiyoMainFrame frame) {
		this.frame = frame;
	}
	public void setUser(User loginUser) {
		this.loginUser=loginUser;
	}
	
	private int selected_index;
	private JTabbedPane userTabbedPane;
	private JLabel mainLogo;
	/**
	 * Create the panel.
	 */
	public UserMainPane_손요셉() {
		setBackground(Color.WHITE);
		setLayout(null);
		
		mainLogo = new JLabel("");
		mainLogo.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		mainLogo.setIcon(new ImageIcon(UserMainPane_손요셉.class.getResource("/com/team1/jogiyo/ui/손요셉/image/1 (1) (2).png")));
		mainLogo.setBounds(93, 99, 199, 241);
		add(mainLogo);

	}

}
