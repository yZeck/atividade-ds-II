package VIEW;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Toolkit;

public class Menu extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
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
	public Menu() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Lucas\\Downloads\\imagem-backgrund.jpg"));
		setBackground(new Color(240, 240, 240));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JButton btnNewButton = new JButton("Alterar Dados de Frutas");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new AlterDadosFrutas().setVisible(true);
			}
		});
		contentPane.add(btnNewButton);
		
		JButton btnDeletarDadosDe_1 = new JButton("Deletar dados de Frutas");
		btnDeletarDadosDe_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new DeletarFrutas().setVisible(true);
			}
		});
		contentPane.add(btnDeletarDadosDe_1);
		
		JButton btnDeletarDadosDe = new JButton("Cadastrar Frutas");
		btnDeletarDadosDe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new CadastroFrutas().setVisible(true);
			}
		});
		contentPane.add(btnDeletarDadosDe);
		
		
	}

}
