package project;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.JButton;

public class ShahadaSelected {

	private JFrame ShahadaSelectedFrame;
	private JLabel mainTextLbl;
	private JLabel arabicLbl;
	private JLabel transliterationLbl;
	private JLabel footerLbl;
	private JButton goBackBtn;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ShahadaSelected window = new ShahadaSelected();
					window.ShahadaSelectedFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ShahadaSelected() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	//this code is only for gui
	private void initialize() {
		ShahadaSelectedFrame = new JFrame();
		ShahadaSelectedFrame.getContentPane().setBackground(new Color(0xA9C7AC));
		ShahadaSelectedFrame.setBounds(100, 100, 600, 600);
		ShahadaSelectedFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ShahadaSelectedFrame.setTitle("Namaz Application");
		ShahadaSelectedFrame.getContentPane().setLayout(null);
		
		mainTextLbl = new JLabel("<html>\n<p>\n\tShahādah, (Arabic: “testimony”) the Muslim profession of faith: “There is no god but God; Muhammad is the Prophet of God.” The shahādah is the first of the five Pillars of Islam (arkān al-Islām). It must be recited by every Muslim at least once in a lifetime, aloud, correctly, and purposively, with a full understanding of its meaning and with an assent of the heart.\n</p>\n</html>");
		mainTextLbl.setFont(new Font("Arial", Font.PLAIN, 15));
		mainTextLbl.setBounds(6, 6, 588, 90);
		ShahadaSelectedFrame.getContentPane().add(mainTextLbl);
		
		arabicLbl = new JLabel("أشهد أن لا إله إلا الله وأشهد أن محمدًا رسول الله");
		arabicLbl.setHorizontalAlignment(SwingConstants.CENTER);
		arabicLbl.setFont(new Font("Arial", Font.BOLD, 22));
		arabicLbl.setBounds(0, 167, 594, 26);
		ShahadaSelectedFrame.getContentPane().add(arabicLbl);
		
		transliterationLbl = new JLabel("<html>\n<p>\n\tAshhadu an la ilaha illallah, wa ashhadu anna Muhammadan rasulullah.\n</p>\n</html>");
		transliterationLbl.setFont(new Font("Arial", Font.BOLD, 22));
		transliterationLbl.setBounds(74, 239, 520, 52);
		ShahadaSelectedFrame.getContentPane().add(transliterationLbl);
		
		footerLbl = new JLabel("<html>\n<p>\n\tThe belief in one Allah is the central tenet of the Islamic faith, around which all else revolves. Muslims are continuously reminded of this foundational belief, in the recital of the Shahada (shahadah) during each of the five daily prayers, as well as many more pivotal moments of a Muslim’s life.\n</p>\n</html>");
		footerLbl.setFont(new Font("Arial", Font.PLAIN, 15));
		footerLbl.setBounds(16, 363, 578, 72);
		ShahadaSelectedFrame.getContentPane().add(footerLbl);
		
		goBackBtn = new JButton("Go Back");
		goBackBtn.setBounds(6, 537, 117, 29);
		ShahadaSelectedFrame.getContentPane().add(goBackBtn);
		goBackBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                goBackToDhikrSelectedPage();
            }
        });
    }
	public JFrame getShahadaSelectedFrame() {
        return ShahadaSelectedFrame;
    }
	private void goBackToDhikrSelectedPage() {
        // Close the current frame
		ShahadaSelectedFrame.dispose();

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
