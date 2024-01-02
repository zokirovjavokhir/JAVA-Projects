package javaAssignment3;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import java.util.List;

public class aProject3 {

    private JFrame frmSkkuNewStudents;
    private JLabel bigPicture;
    private JLabel smallPicture;
    private JLabel applicantName;
    private JTextField applicantTextField;
    private JLabel birthDate;
    private JTextField birthTextField;
    private JLabel eMail;
    private JTextField eMailTextField;
    private JLabel dEgree;
    private JTextField dEgreetextField;
    private JLabel attendedUniversity;
    private JTextField attendedTextField;
    private JLabel gpa;
    private JTextField gpaTextField;
    private JLabel major;
    private JComboBox<String> comboBox;
    private JLabel phoneNumber;
    private JTextField numberTextField;
    private JButton submitButton;
    private JLabel homeAddress;
    private JTextField addressTextField;
    private JLabel personalStatement;
    private JTextArea statementTextArea;

    
    
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    aProject3 window = new aProject3();
                    window.frmSkkuNewStudents.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public aProject3() {
        initialize();
    }

    private void initialize() {
        frmSkkuNewStudents = new JFrame();
        frmSkkuNewStudents.getContentPane().setBackground(new Color(175, 225, 175));
        frmSkkuNewStudents.setTitle("SKKU New Students Enrollment");
        frmSkkuNewStudents.setBounds(100, 100, 850, 550);
        frmSkkuNewStudents.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frmSkkuNewStudents.getContentPane().setLayout(null);

        bigPicture = new JLabel("");
        bigPicture.setIcon(new ImageIcon(aProject3.class.getResource("/javaAssignment3/images/skku_wallpaper.png")));
        bigPicture.setHorizontalAlignment(SwingConstants.CENTER);
        bigPicture.setBounds(0, 0, 191, 522);
        frmSkkuNewStudents.getContentPane().add(bigPicture);

        smallPicture = new JLabel("");
        smallPicture.setHorizontalAlignment(SwingConstants.CENTER);
        smallPicture.setIcon(new ImageIcon(aProject3.class.getResource("/javaAssignment3/images/title_label.png")));
        smallPicture.setBounds(203, 6, 641, 58);
        frmSkkuNewStudents.getContentPane().add(smallPicture);

        applicantName = new JLabel("Applicant Name:");
        applicantName.setFont(new Font("Arial", Font.PLAIN, 14));
        applicantName.setBounds(319, 85, 104, 16);
        frmSkkuNewStudents.getContentPane().add(applicantName);

        applicantTextField = new JTextField();
        applicantTextField.setBounds(435, 80, 380, 25);
        frmSkkuNewStudents.getContentPane().add(applicantTextField);
        applicantTextField.setColumns(10);

        birthDate = new JLabel("Birth Date:");
        birthDate.setFont(new Font("Arial", Font.PLAIN, 14));
        birthDate.setBounds(356, 117, 67, 16);
        frmSkkuNewStudents.getContentPane().add(birthDate);

        birthTextField = new JTextField();
        birthTextField.setBounds(435, 112, 380, 25);
        frmSkkuNewStudents.getContentPane().add(birthTextField);
        birthTextField.setColumns(10);

        eMailTextField = new JTextField();
        eMailTextField.setBounds(435, 140, 380, 25);
        frmSkkuNewStudents.getContentPane().add(eMailTextField);
        eMailTextField.setColumns(10);

        eMail = new JLabel("Email:");
        eMail.setFont(new Font("Arial", Font.PLAIN, 14));
        eMail.setBounds(384, 145, 39, 16);
        frmSkkuNewStudents.getContentPane().add(eMail);

        dEgree = new JLabel("Degree:");
        dEgree.setFont(new Font("Arial", Font.PLAIN, 14));
        dEgree.setBounds(372, 173, 51, 16);
        frmSkkuNewStudents.getContentPane().add(dEgree);

        dEgreetextField = new JTextField();
        dEgreetextField.setBounds(435, 168, 380, 25);
        frmSkkuNewStudents.getContentPane().add(dEgreetextField);
        dEgreetextField.setColumns(10);

        attendedUniversity = new JLabel("Attended University(for Graduates):");
        dEgree.setFont(new Font("Arial", Font.PLAIN, 14));
        attendedUniversity.setBounds(202, 204, 221, 16);
        frmSkkuNewStudents.getContentPane().add(attendedUniversity);

        attendedTextField = new JTextField();
        attendedTextField.setBounds(435, 199, 380, 25);
        frmSkkuNewStudents.getContentPane().add(attendedTextField);
        attendedTextField.setColumns(10);

        gpa = new JLabel("GPA(for Graduates):");
        dEgree.setFont(new Font("Arial", Font.PLAIN, 14));
        gpa.setBounds(300, 235, 123, 16);
        frmSkkuNewStudents.getContentPane().add(gpa);

        gpaTextField = new JTextField();
        gpaTextField.setBounds(435, 230, 380, 25);
        frmSkkuNewStudents.getContentPane().add(gpaTextField);
        gpaTextField.setColumns(10);

        major = new JLabel("Major:");
        dEgree.setFont(new Font("Arial", Font.PLAIN, 14));
        major.setBounds(384, 268, 39, 16);
        frmSkkuNewStudents.getContentPane().add(major);

        comboBox = new JComboBox<String>();
        comboBox.setBackground(new Color(255, 255, 255));
        comboBox.setToolTipText("");
        comboBox.setBounds(435, 262, 380, 30);
        frmSkkuNewStudents.getContentPane().add(comboBox);
        comboBox.addItem("");
        comboBox.addItem("Agriculture Science");
        comboBox.addItem("Architecture");
        comboBox.addItem("Biomedical Engineering");
        comboBox.addItem("Business Administration");
        comboBox.addItem("Chemical Engineering");
        comboBox.addItem("Civil Engineering");
        comboBox.addItem("Computer Science");
        comboBox.addItem("Electrical Engineering");
        comboBox.addItem("Environmental Science");
        comboBox.addItem("Finance");
        comboBox.addItem("History");
        comboBox.addItem("Marketing");
        comboBox.addItem("Mathematics");
        comboBox.addItem("Mechanical Engineering");
        comboBox.addItem("Physics");
        comboBox.addItem("Psychology");
        comboBox.addItem("Sociology");
        comboBox.addItem("Statistics");

        phoneNumber = new JLabel("Phone Number:");
        dEgree.setFont(new Font("Arial", Font.PLAIN, 14));
        phoneNumber.setBounds(327, 302, 96, 16);
        frmSkkuNewStudents.getContentPane().add(phoneNumber);

        numberTextField = new JTextField();
        numberTextField.setBounds(435, 297, 380, 25);
        frmSkkuNewStudents.getContentPane().add(numberTextField);
        numberTextField.setColumns(10);

        homeAddress = new JLabel("Home Address:");
        dEgree.setFont(new Font("Arial", Font.PLAIN, 14));
        homeAddress.setBounds(327, 335, 96, 16);
        frmSkkuNewStudents.getContentPane().add(homeAddress);

        addressTextField = new JTextField();
        addressTextField.setBounds(435, 330, 380, 25);
        frmSkkuNewStudents.getContentPane().add(addressTextField);
        addressTextField.setColumns(10);

        personalStatement = new JLabel("Personal Statement");
        personalStatement.setFont(new Font("Arial", Font.PLAIN, 15));
        dEgree.setFont(new Font("Arial", Font.PLAIN, 14));
        personalStatement.setBounds(436, 362, 131, 16);
        frmSkkuNewStudents.getContentPane().add(personalStatement);

        statementTextArea = new JTextArea();
        statementTextArea.setLineWrap(true);
        statementTextArea.setRows(4);
        statementTextArea.setTabSize(4);
        statementTextArea.setBounds(266, 390, 500, 65);
        frmSkkuNewStudents.getContentPane().add(statementTextArea);
       
        submitButton = new JButton("Submit Application");
        submitButton.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	validateAndHandleFields();
            }
        });
        submitButton.setBackground(new Color(145, 201, 24));
        submitButton.setBounds(424, 467, 170, 40);
        frmSkkuNewStudents.getContentPane().add(submitButton);
 
        //i used document listener to degree , attended university and gpa fields,
        // so when i enter bachelor or undergraduate i won't be able to in those 2 fields
        dEgreetextField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                handleDegreeChange();
            }

			@Override
            public void removeUpdate(DocumentEvent e) {
                handleDegreeChange();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                handleDegreeChange();
            }
                   private void handleDegreeChange() {
          String degree = dEgreetextField.getText().toLowerCase();
          boolean isBachelorOrUndergraduate = degree.equals("bachelor") || degree.equals("undergraduate");

          // Set the editable property of GPA and university fields based on degree
          gpaTextField.setEditable(!isBachelorOrUndergraduate);
          attendedTextField.setEditable(!isBachelorOrUndergraduate);
      }
            
        });
    }
    
    private void validateAndHandleFields() {
        List<String> errors = new ArrayList<>();
        int errorNumber = 1;
        String degree = dEgreetextField.getText().toLowerCase();
        String gpa = gpaTextField.getText();
        String university = attendedTextField.getText();
        
        handleDegreeChange();
        

        if (!validateName(applicantTextField.getText())) {
            errors.add(errorNumber + ". Invalid Input. Enter your name and surname");
            errorNumber++;
        }

        if (!validateBirthDate(birthTextField.getText())) {
            errors.add(errorNumber + ". Invalid Date. Enter a valid date 'dd/mm/yyyy'");
            errorNumber++;
        }

        if (!validateEmail(eMailTextField.getText())) {
            errors.add(errorNumber + ". Invalid Email. Enter a valid email address(name@name.name)");
            errorNumber++;
        }
                if (!validateDegree(degree)) {
            errors.add(errorNumber + ". Invalid Degree. Enter only letters");
            errorNumber++;
        }
                
                if (degree.equals("bachelor") || degree.equals("undergraduate")) {
                    // If degree is bachelor or undergraduate, GPA and university fields should be empty
                    if (!gpa.isEmpty() || !university.isEmpty()) {
                        errors.add(errorNumber + ". If the degree is bachelor or undergraduate, both Attended University and GPA fields should be empty.");
                        errorNumber++;
                    }
                } else {
                    // For other degrees, both GPA and university fields should not be empty
                    if (gpa.isEmpty() || university.isEmpty()) {
                        errors.add(errorNumber + ". For other degrees, both Attended University and GPA fields should not be empty.");
                        errorNumber++;
                    }
                }
                
        String selectedMajor = (String) comboBox.getSelectedItem();
        if (!validateComboBox(selectedMajor)) {
            errors.add(errorNumber + ". Select a major from the menu");
            errorNumber++;
        }

        if (!validateUniversity(attendedTextField.getText())) {
            errorNumber++;
        }

        if (!validateGPA(gpa)) {
            errorNumber++;
        }

        if (!validateNumber(numberTextField.getText())) {
            errors.add(errorNumber + ". Invalid Number. Enter number only(01030084056)");
            errorNumber++;
        }
        
        if (!validateStatement(statementTextArea.getText())) {
            errors.add(errorNumber + ". Enter at least 100 characters");
            errorNumber++;
        }
        
        if (!validateAddress(addressTextField.getText())) {
            errors.add(errorNumber + ". Address format should be Number,Country,City");
            errorNumber++;
        }

        if (!errors.isEmpty()) {
            showErrorMessages(errors);
        } else {
            // If all validations pass, show success message
            showSuccessMessage();
        }
        
  }
    private void handleDegreeChange() {
		// TODO Auto-generated method stub
		
	}

	private void showErrorMessages(List<String> errors) {
        StringBuilder errorMessage = new StringBuilder("Please fix the following errors:\n");
        for (String error : errors) {
            errorMessage.append("- ").append(error).append("\n");
        }
        JOptionPane.showMessageDialog(frmSkkuNewStudents, errorMessage.toString(), "Input Errors", JOptionPane.ERROR_MESSAGE);
    }

    private boolean validateName(String fullName) {
        String[] nameParts = fullName.split(" ");
        return nameParts.length >= 2 && fullName.matches("^[a-zA-Z ]+$");
    }

    private boolean validateBirthDate(String birthDate) {
        return birthDate.matches("^\\d{2}/\\d{2}/\\d{4}$");
    }

    private boolean validateEmail(String email) {
        return email.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$");
    }

    private boolean validateDegree(String degree) {
        return degree.matches("^[a-zA-Z ]+$");
    }

    private boolean validateUniversity(String university) {
        return university.matches("^[a-zA-Z ]+$");
    }

    private boolean validateGPA(String gpa) {
        try {
            double gpaValue = Double.parseDouble(gpa);
            if (gpa.matches("^\\d+\\.\\d{1,2}$") && gpaValue >= 0.0 && gpaValue <= 4.5) {
                return true;
            } else {
                return false;
            }
        } catch (NumberFormatException e) {
            return false;
        }
    }
    
    private boolean validateComboBox(String selectedItem) {
       
        return !selectedItem.equals("");
    }
    
    private boolean validateNumber(String number) {
        return number.matches("^[0-9]+$");
    }
    
    private boolean validateStatement(String statement) {
        if (statement.length() < 100) {
            return false;
        }
        return true;
    }
    
    private boolean validateAddress(String address) {
        if (address.length() < 15) {
            return false;
        }
        return true;
    }


    private void showSuccessMessage() {
    
     ImageIcon greenTickIcon = new ImageIcon(getClass().getResource("/javaAssignment3/images/green_tick.png"));

     // Get the image from the icon
     Image img = greenTickIcon.getImage();

     // Scale the image to your desired size (e.g., 80x80 pixels)
     Image scaledImg = img.getScaledInstance(70, 70, Image.SCALE_SMOOTH);

     // Create a new ImageIcon with the scaled image
     ImageIcon scaledIcon = new ImageIcon(scaledImg);

     JOptionPane.showMessageDialog(frmSkkuNewStudents, "Successfully submitted!", "Success", JOptionPane.INFORMATION_MESSAGE, scaledIcon);

     // Clear the text field or perform other actions if needed
     applicantTextField.setText("");
     birthTextField.setText("");
     eMailTextField.setText("");
     dEgreetextField.setText("");
     attendedTextField.setText("");
     gpaTextField.setText("");
     comboBox.setSelectedIndex(0);
     numberTextField.setText("");
     addressTextField.setText("");
     statementTextArea.setText("");
    }
}