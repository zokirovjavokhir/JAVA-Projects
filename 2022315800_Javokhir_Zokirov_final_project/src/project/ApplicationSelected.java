package project;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Component;

public class ApplicationSelected {

	private JFrame ApplicationSelectedFrame;
	private JLabel nameLbl;
	private JTextField nameText;
	private JLabel emailLbl;
	private JTextField emailText;
	private JLabel numberLbl;
	private JTextField numberText;
	private JLabel countryLbl;
	private JTextField countryText;
	private JLabel aboutLbl;
	private JLabel descLbl;
	private JButton goBackBtn;
	private JTextArea insightArea;
	private JLabel insightLbl;
	private JButton submitBtn;
	 
	    
	    

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ApplicationSelected window = new ApplicationSelected();
					window.ApplicationSelectedFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ApplicationSelected() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	//below this code i have every component, i will be commenting them briefly
	//all this code down below is for gui
	private void initialize() {
		ApplicationSelectedFrame = new JFrame();
		ApplicationSelectedFrame.getContentPane().setBackground(new Color(0xA9C7AC));
		ApplicationSelectedFrame.setBounds(100, 100, 600, 600);
		ApplicationSelectedFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ApplicationSelectedFrame.setTitle("Namaz Application");
		ApplicationSelectedFrame.getContentPane().setLayout(null);
		
		nameLbl = new JLabel("Name:");
		nameLbl.setFont(new Font("Arial", Font.BOLD, 15));
		nameLbl.setBounds(93, 151, 60, 30);
		ApplicationSelectedFrame.getContentPane().add(nameLbl);
		
		nameText = new JTextField();
		nameText.setFont(new Font("Arial", Font.PLAIN, 14));
		nameText.setBounds(256, 151, 200, 26);
		ApplicationSelectedFrame.getContentPane().add(nameText);
		nameText.setColumns(10);
		
        //when user mouse is on top it's gonna change its border color
		nameText.setBorder(new CompoundBorder(new LineBorder(Color.BLACK), new EmptyBorder(0, 5, 0, 5)));
		 nameText.addFocusListener(new FocusAdapter() {
	            @Override
	            public void focusGained(FocusEvent e) {
	                // Change the border color when the JTextField gains focus
	                nameText.setBorder(new CompoundBorder(new LineBorder(new Color(0x87CEFA)), new EmptyBorder(0, 5, 0, 5)));
	            }

	            @Override
	            public void focusLost(FocusEvent e) {
	                // Reset the border color when the JTextField loses focus
	                nameText.setBorder(new CompoundBorder(new LineBorder(Color.BLACK), new EmptyBorder(0, 5, 0, 5)));
	            }
	        });

		
		emailLbl = new JLabel("Email:");
		emailLbl.setFont(new Font("Arial", Font.BOLD, 15));
		emailLbl.setBounds(93, 191, 60, 30);
		ApplicationSelectedFrame.getContentPane().add(emailLbl);
		
		emailText = new JTextField();
		emailText.setFont(new Font("Arial", Font.PLAIN, 14));
		emailText.setBounds(256, 191, 200, 26);
		ApplicationSelectedFrame.getContentPane().add(emailText);
		emailText.setColumns(10);
        //when user mouse is on top it's gonna change its border color

		emailText.setBorder(new CompoundBorder(new LineBorder(Color.BLACK), new EmptyBorder(0, 5, 0, 5)));
		emailText.addFocusListener(new FocusAdapter() {
	            @Override
	            public void focusGained(FocusEvent e) {
	                // Change the border color when the JTextField gains focus
	            	emailText.setBorder(new CompoundBorder(new LineBorder(new Color(0x87CEFA)), new EmptyBorder(0, 5, 0, 5)));
	            }

	            @Override
	            public void focusLost(FocusEvent e) {
	                // Reset the border color when the JTextField loses focus
	            	emailText.setBorder(new CompoundBorder(new LineBorder(Color.BLACK), new EmptyBorder(0, 5, 0, 5)));
	            }
	        });
		
		numberLbl = new JLabel("Phone Number:");
		numberLbl.setFont(new Font("Arial", Font.BOLD, 15));
		numberLbl.setBounds(93, 236, 110, 16);
		ApplicationSelectedFrame.getContentPane().add(numberLbl);
		
		numberText = new JTextField();
		numberText.setFont(new Font("Arial", Font.PLAIN, 14));
		numberText.setBounds(256, 231, 200, 26);
		ApplicationSelectedFrame.getContentPane().add(numberText);
		numberText.setColumns(10);
        //when user mouse is on top it's gonna change its border color

		numberText.setBorder(new CompoundBorder(new LineBorder(Color.BLACK), new EmptyBorder(0, 5, 0, 5)));
		numberText.addFocusListener(new FocusAdapter() {
	            @Override
	            public void focusGained(FocusEvent e) {
	                // Change the border color when the JTextField gains focus
	            	numberText.setBorder(new CompoundBorder(new LineBorder(new Color(0x87CEFA)), new EmptyBorder(0, 5, 0, 5)));
	            }

	            @Override
	            public void focusLost(FocusEvent e) {
	                // Reset the border color when the JTextField loses focus
	            	numberText.setBorder(new CompoundBorder(new LineBorder(Color.BLACK), new EmptyBorder(0, 5, 0, 5)));
	            }
	        });
		
		countryLbl = new JLabel("Country, City");
		countryLbl.setFont(new Font("Arial", Font.BOLD, 15));
		countryLbl.setBounds(93, 276, 110, 16);
		ApplicationSelectedFrame.getContentPane().add(countryLbl);
		
		countryText = new JTextField();
		countryText.setFont(new Font("Arial", Font.PLAIN, 14));
		countryText.setBounds(256, 271, 200, 26);
		ApplicationSelectedFrame.getContentPane().add(countryText);
		countryText.setColumns(10);
        //when user mouse is on top it's gonna change its border color

		countryText.setBorder(new CompoundBorder(new LineBorder(Color.BLACK), new EmptyBorder(0, 5, 0, 5)));
		countryText.addFocusListener(new FocusAdapter() {
	            @Override
	            public void focusGained(FocusEvent e) {
	                // Change the border color when the JTextField gains focus
	            	countryText.setBorder(new CompoundBorder(new LineBorder(new Color(0x87CEFA)), new EmptyBorder(0, 5, 0, 5)));
	            }

	            @Override
	            public void focusLost(FocusEvent e) {
	                // Reset the border color when the JTextField loses focus
	            	countryText.setBorder(new CompoundBorder(new LineBorder(Color.BLACK), new EmptyBorder(0, 5, 0, 5)));
	            }
	        });
		
		aboutLbl = new JLabel("About Us:");
		aboutLbl.setFont(new Font("Times New Roman", Font.BOLD, 20));
		aboutLbl.setBounds(248, 8, 88, 16);
		ApplicationSelectedFrame.getContentPane().add(aboutLbl);
		
		descLbl = new JLabel("<html>\n<p>\n\tWelcome to our programming journey with a purpose! We are a team of passionate programmers with a shared mission — to bridge the worlds of technology and education to spread knowledge about Islam.<tr>\nDriven by our love for Islam, we have embarked on a unique journey to integrate technology into the realm of religious education. Through our coding expertise, we aim to create accessible and engaging platforms that facilitate learning about the rich teachings of Islam.\n</p>\n</html>");
		descLbl.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		descLbl.setBounds(6, 36, 588, 101);
		ApplicationSelectedFrame.getContentPane().add(descLbl);
		
		descLbl.setBorder(new CompoundBorder(new LineBorder(Color.BLACK), new EmptyBorder(0, 5, 0, 5)));


		goBackBtn = new JButton("Go Back");
		goBackBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				goBackToMainPage();
			}
		});
		goBackBtn.setFont(new Font("Arial", Font.BOLD, 15));
		goBackBtn.setBounds(6, 526, 130, 40);
		ApplicationSelectedFrame.getContentPane().add(goBackBtn);
        //when user mouse is on top it's gonna change its border color

		goBackBtn.addMouseListener(new MouseAdapter() {
	            @Override
	            public void mouseEntered(MouseEvent e) {
	            	goBackBtn.setContentAreaFilled(true);
	            	goBackBtn.setBackground(new Color(0x315245)); // Green color using hex code
	            }

	            @Override
	            public void mouseExited(MouseEvent e) {
	            	goBackBtn.setContentAreaFilled(false); // Reset to default color
	            }
	        });
				
		
		insightArea = new JTextArea();
		insightArea.setColumns(3);
		insightArea.setRows(3);
		insightArea.setLineWrap(true);
		insightArea.setBounds(19, 373, 562, 50);
		ApplicationSelectedFrame.getContentPane().add(insightArea);
		
		insightLbl = new JLabel("Insights about program");
		insightLbl.setFont(new Font("Arial", Font.PLAIN, 17));
		insightLbl.setBounds(223, 335, 172, 26);
		ApplicationSelectedFrame.getContentPane().add(insightLbl);
        //when user mouse is on top it's gonna change its border color

		insightArea.setBorder(new CompoundBorder(new LineBorder(Color.BLACK), new EmptyBorder(0, 5, 0, 5)));
		insightArea.addFocusListener(new FocusAdapter() {
	            @Override
	            public void focusGained(FocusEvent e) {
	                // Change the border color when the JTextField gains focus
	            	insightArea.setBorder(new CompoundBorder(new LineBorder(new Color(0x87CEFA)), new EmptyBorder(0, 5, 0, 5)));
	            }

	            @Override
	            public void focusLost(FocusEvent e) {
	                // Reset the border color when the JTextField loses focus
	            	insightArea.setBorder(new CompoundBorder(new LineBorder(Color.BLACK), new EmptyBorder(0, 5, 0, 5)));
	            }
	        });
		
		submitBtn = new JButton("Submit");
		submitBtn.setFont(new Font("Arial", Font.BOLD, 15));
		submitBtn.setBounds(248, 435, 125, 35);
		ApplicationSelectedFrame.getContentPane().add(submitBtn);
        //when user mouse is on top it's gonna change its border color

		submitBtn.addMouseListener(new MouseAdapter() {
	            @Override
	            public void mouseEntered(MouseEvent e) {
	            	submitBtn.setContentAreaFilled(true);
	            	submitBtn.setBackground(new Color(0x315245)); // Green color using hex code
	            }

	            @Override
	            public void mouseExited(MouseEvent e) {
	            	submitBtn.setContentAreaFilled(false); // Reset to default color
	            }
	        });
		submitBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	validateAndHandleFields();
            }
        });	
	}
	public JFrame ApplicationSelectedFrame() {
        return ApplicationSelectedFrame;
    }
	
	 private void goBackToMainPage() {
		 ApplicationSelectedFrame.dispose(); // Close the current frame
	        EventQueue.invokeLater(() -> {
	            try {
	                Main window = new Main();
	                window.mainFrame.setVisible(true);
	            } catch (Exception e) {
	                e.printStackTrace();
	            }
	        });
	    }
	
	//in this code we'll hande wrong input
	 //when user enter wrong input it's gonna open a window and show a message and what the problem is
	 private void validateAndHandleFields() {
	        List<String> errors = new ArrayList<>();
	        int errorNumber = 1;
	       
	        if (!validateName(nameText.getText())) {
	            errors.add(errorNumber + ". Invalid Input. Enter your name and surname");
	            errorNumber++;
	        }

	        if (!validateEmail(emailText.getText())) {
	            errors.add(errorNumber + ". Invalid Email. Enter a valid email address(name@name.name)");
	            errorNumber++;
	        }
	    
	        if (!validateNumber(numberText.getText())) {
	            errors.add(errorNumber + ". Invalid Number. Enter number only(01030084056)");
	            errorNumber++;
	        }
	        
	        if (!validateAddress(countryText.getText())) {
	            errors.add(errorNumber + ". Country format should be: Country, City");
	            errorNumber++;
	        }
	        
	        if (!validateStatement(insightArea.getText())) {
	            errors.add(errorNumber + ". Enter at least 50 characters");
	            errorNumber++;
	        }
	        
	        

	        //based on error it shows how many errors user made
	        if (!errors.isEmpty()) {
	            showErrorMessages(errors);
	        } else {
	            // if none, shows success message
	            showSuccessMessage();
	        }
	        
	  }
	    //this part of the code checks if user is entering correct input or not.
		private void showErrorMessages(List<String> errors) {
	        StringBuilder errorMessage = new StringBuilder("Please fix the following errors:\n");
	        for (String error : errors) {
	            errorMessage.append("- ").append(error).append("\n");
	        }
	        JOptionPane.showMessageDialog(getApplicationSelectedFrame(), errorMessage.toString(), "Input Errors", JOptionPane.ERROR_MESSAGE);
	    }

	    private Component getApplicationSelectedFrame() {
			// TODO Auto-generated method stub
			return null;
		}
		private boolean validateName(String fullName) {
	        String[] nameParts = fullName.split(" ");
	        return nameParts.length >= 2 && fullName.matches("^[a-zA-Z ]+$");
	    }
	    private boolean validateEmail(String email) {
	        return email.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$");
	    }
	    private boolean validateNumber(String number) {
	        return number.matches("^[0-9]+$");
	    }
	    private boolean validateAddress(String address) {
	        if (address.length() < 5) {
	            return false;
	        }
	        return true;
	    }
	    private boolean validateStatement(String statement) {
	        if (statement.length() < 50) {
	            return false;
	        }
	        return true;
	    }
	    
	    private void showSuccessMessage() {
	    
	     JOptionPane.showMessageDialog(getApplicationSelectedFrame(), "Successfully submitted!", "Success", JOptionPane.INFORMATION_MESSAGE);
	     // clears the text field or perform other actions if needed
	     nameText.setText("");
	     emailText.setText("");
	     numberText.setText("");
	     countryText.setText("");
	     insightArea.setText("");
	    }
}
