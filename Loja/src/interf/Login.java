package interf;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import principal.Principal;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
   
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 297, 206);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Login");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 20));
		lblNewLabel.setBounds(10, 76, 88, 23);
		contentPane.add(lblNewLabel);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setForeground(Color.RED);
		lblSenha.setFont(new Font("Arial", Font.PLAIN, 20));
		lblSenha.setBounds(10, 110, 88, 23);
		contentPane.add(lblSenha);
		
		textField = new JTextField();
		textField.setBounds(79, 76, 176, 24);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(79, 110, 176, 24);
		contentPane.add(textField_1);
		
		JLabel lblA = new JLabel("SEDEathX");
		lblA.setForeground(Color.RED);
		lblA.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblA.setBounds(20, 11, 176, 54);
		contentPane.add(lblA);
		
		JButton btnNewButton = new JButton("BORA");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if ((textField.getText().equals("") || (textField.getText().equals("")))){
					JOptionPane.showMessageDialog(null, "Informe TODOS OS DADOS");
				}else {
				Principal.login = Integer.valueOf(textField.getText());
				  Principal.senha = Integer.valueOf(textField_1.getText());
				}
			}
		});
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.setForeground(Color.RED);
		btnNewButton.setBounds(182, 11, 89, 45);
		contentPane.add(btnNewButton);
	 
	}
}


