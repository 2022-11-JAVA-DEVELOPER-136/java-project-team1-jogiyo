package com.team1.jogiyo.ui.손요셉;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTabbedPane;

public class UserPane extends JPanel {

	/**
	 * Create the panel.
	 */
	public UserPane() {
		setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(12, 10, 376, 590);
		add(tabbedPane);
		
		UserMainPane_손요셉 userMainPane_손요셉 = new UserMainPane_손요셉();
		tabbedPane.addTab("메인", null, userMainPane_손요셉, null);
		
		UserSignupPane_손요셉 userSignupPane_손요셉 = new UserSignupPane_손요셉();
		tabbedPane.addTab("로그인", null, userSignupPane_손요셉, null);
		
		UserSignupPane_손요셉 userSignupPane_손요셉_1 = new UserSignupPane_손요셉();
		tabbedPane.addTab("회원가입", null, userSignupPane_손요셉_1, null);
		
		UserViewDetail_손요셉 userViewDetail_손요셉 = new UserViewDetail_손요셉();
		tabbedPane.addTab("회원정보", null, userViewDetail_손요셉, null);

	}
}
