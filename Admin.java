package edu.java.side;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;

public class Admin extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Admin frame = new Admin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Admin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 527, 478);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = 
				new JScrollPane();
		scrollPane.setBounds(29, 57, 454, 195);
		contentPane.add(scrollPane);
		
		textField =  new JTextField();
		scrollPane.setViewportView(textField);
		
		textField.setColumns(10);
	
		
		JLabel lblAssignInfo = new JLabel("회원정보");
		lblAssignInfo.setFont(new Font("굴림", Font.PLAIN, 20));
		lblAssignInfo.setBounds(192, 262, 170, 76);
		contentPane.add(lblAssignInfo);
	}
}
