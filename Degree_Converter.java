import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Exec3 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JButton buttonCalculate;
	private JLabel lblNewLabelResult;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exec3 frame = new Exec3();
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
	public Exec3() {
		setTitle("Fahrenheit to Celsius");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 149);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(2, 2, 0, 0));
		
		lblNewLabel = new JLabel("Fahrenheit");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel);
		
		buttonCalculate = new JButton("Calculate");
		buttonCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
				String input = textField.getText();
				double dInput = Double.parseDouble(input);
				double cDegree = (dInput-32) * (5.0/9);
				lblNewLabelResult.setText(String.format("%.2f C", cDegree));
				}
				catch(NumberFormatException ex) {
					
					JOptionPane.showMessageDialog(null, "Please insert a number", "error", JOptionPane.ERROR_MESSAGE);		
				}			
			}
		});
		
		textField = new JTextField();
		contentPane.add(textField);
		textField.setColumns(10);
		contentPane.add(buttonCalculate);
		
		lblNewLabelResult = new JLabel("");
		contentPane.add(lblNewLabelResult);
		
		
		
		
	}
}
