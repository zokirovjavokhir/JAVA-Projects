package project;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JButton;

public class AdhanSelected {

	private JFrame AdhanSelectedFrame;
	private JLabel mainTextLbl;
	private JLabel arabicLbl;
	private JLabel transliterationLbl;
	private JButton goBackBtn;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdhanSelected window = new AdhanSelected();
					window.AdhanSelectedFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AdhanSelected() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
    //from this point on only gui code is displayed
	private void initialize() {
		AdhanSelectedFrame = new JFrame();
		AdhanSelectedFrame.getContentPane().setBackground(new Color(0xA9C7AC));
		AdhanSelectedFrame.setBounds(100, 100, 600, 600);
		AdhanSelectedFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		AdhanSelectedFrame.setTitle("Namaz Application");
		AdhanSelectedFrame.getContentPane().setLayout(null);
		
		mainTextLbl = new JLabel("<html>\n<p>\n\tThe adhan is the call given to announce that it is time for a particular obligatory Salah (ritual Prayer). Five times a day the adhan is raised from mosques throughout the world. It is a Sunnah(optional duty) that brings its own reward from Allah (God). The person who gives the adhan is called a muadhdhin. (The English word “muezzin” is a mispronunciation of the Arabic term.)\n</p>\n</html>");
		mainTextLbl.setFont(new Font("Arial", Font.PLAIN, 15));
		mainTextLbl.setBounds(6, 6, 588, 90);
		AdhanSelectedFrame.getContentPane().add(mainTextLbl);
		
		arabicLbl = new JLabel("<html>\n<p>\n\tالله أكبر، الله أكبر<br>\n\tأشهد أن لا إله إلا الله<br>\n\tأشهد أن محمدًا رسول الله<br>\n\tحي على الصلاة، حي على الفلاح<br>\n\tالله أكبر، الله أكبر<br>\n\tلا إله إلا الله\n</p>\n</html>");
		arabicLbl.setFont(new Font("Arial", Font.BOLD, 18));
		arabicLbl.setBounds(204, 141, 196, 150);
		AdhanSelectedFrame.getContentPane().add(arabicLbl);
		
		transliterationLbl = new JLabel("<html>\n<p>\n\tAllahu Akbar, Allahu Akbar<br>\n\tAshhadu an la ilaha illallah<br>\n\tAshhadu anna Muhammadan rasulullah<br>\n\tHayya 'ala al-salah, hayya 'ala al-falah<br>\n\tAllahu Akbar, Allahu Akbar<br>\n\tLa ilaha illallah\n</p>\n</html>");
		transliterationLbl.setFont(new Font("Arial", Font.BOLD, 18));
		transliterationLbl.setBounds(188, 303, 234, 188);
		AdhanSelectedFrame.getContentPane().add(transliterationLbl);
		
		goBackBtn = new JButton("Go Back");
		goBackBtn.setBounds(6, 537, 117, 29);
		AdhanSelectedFrame.getContentPane().add(goBackBtn);
		goBackBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                goBackToDhikrSelectedPage();
            }
        });
    }
	public JFrame getAdhanSelectedFrame() {
        return AdhanSelectedFrame;
    }
	private void goBackToDhikrSelectedPage() {
        // Close the current frame
		AdhanSelectedFrame.dispose();

        // Open the PrayerSelected page
		EventQueue.invokeLater(() -> {
            try {
                DhikrSelected DhikrSelectedWindow = new DhikrSelected();
                DhikrSelectedWindow.getDhikrSelectedFrame().setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
		
		
	}

}
