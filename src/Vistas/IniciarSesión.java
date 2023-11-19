package Vistas;

import Controladores.BaseDatos;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;

public class IniciarSesión extends JFrame {
	
	
	
	String usuario;
	String password;
	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		BaseDatos bd = new BaseDatos();
		bd.conectarbase();
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IniciarSesión frame = new IniciarSesión();
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
	public IniciarSesión() {
		setTitle("Inicio de sesión");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 304, 391);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 288, 352);
		contentPane.add(panel);
		panel.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(84, 65, 114, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Usuario");
		lblNewLabel.setBounds(84, 43, 114, 14);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Contraseña");
		lblNewLabel_1.setBounds(84, 96, 114, 14);
		panel.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(84, 117, 114, 20);
		panel.add(textField_1);
		
		JButton btnNewButton = new JButton("Entrar como usuario");
		btnNewButton.setBounds(65, 167, 147, 41);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Regristrarse");
		btnNewButton_1.setBounds(84, 271, 114, 41);
		panel.add(btnNewButton_1);
		
		JButton btnEntrarComoCliente = new JButton("Entrar como cliente");
		btnEntrarComoCliente.setBounds(65, 219, 147, 41);
		panel.add(btnEntrarComoCliente);
	}
}
