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

public class SalavatSelected {

	private JFrame SalavatSelectedFrame;
	private JLabel mainTextLbl;
	private JLabel sharifLbl;
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
					SalavatSelected window = new SalavatSelected();
					window.SalavatSelectedFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SalavatSelected() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	//this code is only for gui
	private void initialize() {
		SalavatSelectedFrame = new JFrame();
		SalavatSelectedFrame.getContentPane().setBackground(new Color(0xA9C7AC));
		SalavatSelectedFrame.getContentPane().setLayout(null);
		SalavatSelectedFrame.setBounds(100, 100, 600, 600);
		SalavatSelectedFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SalavatSelectedFrame.setTitle("Namaz Application");
		
		mainTextLbl = new JLabel("<html>\n<p>\n\tDurood Shareef is an Arabic word meaning <i>“pure peace“</i>. It is used in mystic and religious statements, which is very common in the Islamic world. The revelation of <i>“Durood Shareef”</i>, i.e., its existence, dates back to the time of Prophet Muhammad (PBUH). During his lifetime, The Messenger of Islam taught his friends to teach <i>“Durood Sharif”</i> in addition to <i>“Salam“.</i>\n</p>\n</html>");
		mainTextLbl.setFont(new Font("Arial", Font.PLAIN, 14));
		mainTextLbl.setBounds(6, 6, 588, 68);
		SalavatSelectedFrame.getContentPane().add(mainTextLbl);
		
		sharifLbl = new JLabel("<html>\n<p>\n\tاللَّهُمَّ صَلِّ عَلَى مُحَمَّدٍ وَعَلَى آلِ مُحَمَّدٍ، كَمَا صَلَّيْتَ عَلَى إِبْرَاهِيمَ وَعَلَى آلِ إِبْرَاهِيمَ، إِنَّكَ حَمِيدٌ مَجِيدٌ</p>\n</html>");
		sharifLbl.setFont(new Font("Arial", Font.BOLD, 22));
		sharifLbl.setHorizontalAlignment(SwingConstants.CENTER);
		sharifLbl.setBounds(6, 117, 588, 97);
		SalavatSelectedFrame.getContentPane().add(sharifLbl);
		
		transliterationLbl = new JLabel("<html><p>Allahumma salli ala Muhammadin wa ala ali Muhammadin, kama sallaita ala Ibrahim wa ala ali Ibrahim, innaka hamidun majid.</p></html>");
		transliterationLbl.setFont(new Font("Arial", Font.BOLD, 22));
		transliterationLbl.setBounds(6, 226, 588, 105);
		SalavatSelectedFrame.getContentPane().add(transliterationLbl);
		
		footerLbl = new JLabel("<html>\n<p>\n\tReciting Darood Sharif makes a person feel extremely relaxed. In consequence, he gets rid of the problems of his heart. It is a spiritual force that strengthens a person’s spirituality. Despite being troubled by the abundance and difficulties of human life, it does not affect a person’s spirituality. Therefore, reading Durood Sharif can be a great way for a person’s spiritual development.<br>\n\n\tThis prayer is one of the greatest, most rewarding, and best prayers that are offered to Muhammad (SAW). Many hadiths and Qur’anic verses have been narrated about his blessings. The recitation of this prayer is a religious practice throughout the Islamic world for many years.\n</p>\n</html>");
		footerLbl.setFont(new Font("Arial", Font.PLAIN, 15));
		footerLbl.setBounds(6, 370, 588, 162);
		SalavatSelectedFrame.getContentPane().add(footerLbl);
		
		goBackBtn = new JButton("Go Back");
		goBackBtn.setBounds(6, 537, 117, 29);
		SalavatSelectedFrame.getContentPane().add(goBackBtn);
		goBackBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                goBackToDhikrSelectedPage();
            }
        });
    }
	public JFrame getSalavatSelectedFrame() {
        return SalavatSelectedFrame;
    }
	private void goBackToDhikrSelectedPage() {
        // Close the current frame
		SalavatSelectedFrame.dispose();

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