package VIEW;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import DAO.FrutasDAO;
import DTO.FrutasDTO;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AlterDadosFrutas extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfNome;
	private JTextField tfDescricao;
	private JTextField tfPreco;
	private JTextField tfQuantidade;
	private JTextField tfId;
	private JLabel lblNewLabel_3;
	private JButton btnNewButton;
	private JButton btnNewButton_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AlterDadosFrutas frame = new AlterDadosFrutas();
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
	public AlterDadosFrutas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JLabel lblNome = new JLabel("Nome");
		contentPane.add(lblNome);
		
		JLabel lblNewLabel_2 = new JLabel("Descricao");
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel("Preco");
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("quantidade");
		contentPane.add(lblNewLabel);
		
		lblNewLabel_3 = new JLabel("ID");
		contentPane.add(lblNewLabel_3);
		
		tfNome = new JTextField();
		tfNome.setColumns(10);
		contentPane.add(tfNome);
		
		tfDescricao = new JTextField();
		tfDescricao.setColumns(10);
		contentPane.add(tfDescricao);
		
		tfPreco = new JTextField();
		tfPreco.setColumns(10);
		contentPane.add(tfPreco);
		
		tfQuantidade = new JTextField();
		tfQuantidade.setColumns(10);
		contentPane.add(tfQuantidade);
		
		tfId = new JTextField();
		tfId.setColumns(10);
		contentPane.add(tfId);
		
		
		JButton btnAlterarProduto = new JButton("Alterar Produto");
		btnAlterarProduto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String nome, descricao, preco, quantidade,id;
				
				 nome = tfNome.getText();
			        descricao = tfDescricao.getText();
			        preco = tfPreco.getText();
			        quantidade = tfQuantidade.getText();
			        id = tfId.getText();
			        
			        FrutasDTO objfrutasdto = new FrutasDTO();
			        
			        objfrutasdto.setNome(nome);
			        objfrutasdto.setDescricao(descricao);
			        objfrutasdto.setPreco(preco);
			        objfrutasdto.setQuantidade(quantidade);
			        
			        
			        FrutasDAO objfrutasDAO = new FrutasDAO();
			        objfrutasDAO.alterarFrutas(id,objfrutasdto);
			        
			}
		});
		
		
		
		btnNewButton = new JButton("Voltar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new CadastroFrutas().setVisible(true);
			}
		});
		contentPane.add(btnNewButton);
		
		
		contentPane.add(btnAlterarProduto);
	}
	
	

}
