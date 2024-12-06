package pekan8;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class Quiz {

	private JFrame frame;
	private JTextField Name;
	private JTextField Age;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Quiz window = new Quiz();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Quiz() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Aplikasi Razia Motor Online");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblNewLabel.setBounds(109, 11, 219, 51);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nama");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(50, 60, 49, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Umur");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(50, 85, 49, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("SIM C");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(50, 110, 49, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		Name = new JTextField();
		Name.setBounds(119, 58, 96, 20);
		frame.getContentPane().add(Name);
		Name.setColumns(10);
		
		Age = new JTextField();
		Age.setBounds(119, 83, 96, 20);
		frame.getContentPane().add(Age);
		Age.setColumns(10);
		
		JComboBox Simc = new JComboBox();
		Simc.setFont(new Font("Times New Roman", Font.BOLD, 13));
		Simc.setModel(new DefaultComboBoxModel(new String[] {"Pilih", "Have", "Haven't"}));
		Simc.setBounds(119, 107, 83, 22);
		frame.getContentPane().add(Simc);
		
		JTextArea Output = new JTextArea();
		Output.setFont(new Font("Times New Roman", Font.BOLD, 14));
		Output.setBounds(10, 190, 416, 62);
		frame.getContentPane().add(Output);
		
		JButton BProses = new JButton("Proses");
		BProses.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String A = Name.getText();
				int B = Integer.parseInt(Age.getText());
				int Sim = Simc.getSelectedIndex();
				
				if(Sim==1) {
					if(B>=17) {
						Output.setText(A+", kamu SUDAH resmi untuk mengendarai motor.");
					}
					if(B<17) {
						Output.setText(A+", kamu BELUM resmi untuk mengendarai motor.\nBagaimana bisa kamu mengurus SIM?");
					}
				}
				if(Sim==2) {
					if(B>=17) {
						Output.setText(A+", kamu BELUM resmi untuk mengendarai motor.\nTapi kamu sudah cukup umur, silahkan urus SIM nya ya "+A);
					}
					if(B<17) {
						Output.setText(A+", kamu BELUM resmi untuk mengendarai motor.");
					}
				}
			}
		});
		BProses.setFont(new Font("Times New Roman", Font.BOLD, 16));
		BProses.setBounds(55, 156, 89, 23);
		frame.getContentPane().add(BProses);
		
		JButton BReset = new JButton("Reset");
		BReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Name.setText("");
				Age.setText("");
				Output.setText("");
				Simc.setSelectedIndex(0);
			}
		});
		BReset.setFont(new Font("Times New Roman", Font.BOLD, 16));
		BReset.setBounds(191, 157, 89, 23);
		frame.getContentPane().add(BReset);
		
		
		
		
	}
}
