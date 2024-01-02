package project;

import java.awt.EventQueue;
import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
public class WomanSalavatSelected {

	private JFrame WomanSalavatSelectedFrame;
	private JLabel mainTextLbl;
	private JLabel subhanallahLbl;
	private JLabel subhanallahLbl1;
	private JLabel alhamdulillahLbl;
	private JLabel alhamdulillahLbl1;
	private JLabel allahuakbarLbl;
	private JLabel allahuakbarLbl1;
	private JLabel footerText;
	private JButton goBackBtn;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WomanSalavatSelected window = new WomanSalavatSelected();
					window.WomanSalavatSelectedFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public WomanSalavatSelected() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	//below code is for gui only
	private void initialize() {
		WomanSalavatSelectedFrame = new JFrame();
		WomanSalavatSelectedFrame.getContentPane().setBackground(new Color(0xA9C7AC));
		WomanSalavatSelectedFrame.setBounds(100, 100, 600, 600);
		WomanSalavatSelectedFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		WomanSalavatSelectedFrame.setTitle("Namaz Application");
		WomanSalavatSelectedFrame.getContentPane().setLayout(null);
		
		mainTextLbl = new JLabel("<html>\n<p>\n\tIslamic prayer beads are commonly known as Misbaha, Tasbih or Tasbeeh. They are used by Muslims as a guide during their prayer to the Almighty. Its name originated form the word ‘Supha’ which means to recite the glories of the one and only Allah. Thus Islamic Prayer beads are used all over world to pray to the Almighty.\n</p>\n</html>");
		mainTextLbl.setFont(new Font("Arial", Font.PLAIN, 15));
		mainTextLbl.setBounds(6, 6, 588, 80);
		WomanSalavatSelectedFrame.getContentPane().add(mainTextLbl);
		
		subhanallahLbl = new JLabel("سبحان الله");
		subhanallahLbl.setFont(new Font("Arial", Font.BOLD, 28));
		subhanallahLbl.setBounds(212, 121, 114, 46);
		WomanSalavatSelectedFrame.getContentPane().add(subhanallahLbl);
		
		subhanallahLbl1 = new JLabel("Alhamdulillah");
		subhanallahLbl1.setFont(new Font("Arial", Font.BOLD, 28));
		subhanallahLbl1.setBounds(190, 288, 185, 33);
		WomanSalavatSelectedFrame.getContentPane().add(subhanallahLbl1);
		
		alhamdulillahLbl = new JLabel("الحمد لله");
		alhamdulillahLbl.setFont(new Font("Arial", Font.BOLD, 28));
		alhamdulillahLbl.setBounds(212, 234, 114, 46);
		WomanSalavatSelectedFrame.getContentPane().add(alhamdulillahLbl);
		
		alhamdulillahLbl1 = new JLabel("Subhanallah");
		alhamdulillahLbl1.setFont(new Font("Arial", Font.BOLD, 28));
		alhamdulillahLbl1.setBounds(190, 179, 168, 33);
		WomanSalavatSelectedFrame.getContentPane().add(alhamdulillahLbl1);
		
		allahuakbarLbl = new JLabel("الله أكبر");
		allahuakbarLbl.setFont(new Font("Arial", Font.BOLD, 28));
		allahuakbarLbl.setBounds(218, 333, 76, 46);
		WomanSalavatSelectedFrame.getContentPane().add(allahuakbarLbl);
		
		allahuakbarLbl1 = new JLabel("Allahu Akbar");
		allahuakbarLbl1.setFont(new Font("Arial", Font.BOLD, 28));
		allahuakbarLbl1.setBounds(190, 391, 185, 33);
		WomanSalavatSelectedFrame.getContentPane().add(allahuakbarLbl1);
		
		footerText = new JLabel("<html>\n<p>\nA typical Dhikr prayer recitation with Islamic prayer beads may consist of reciting Allahu Akbar( Allah is the Greatest) 34 times followed by Al-Ahamdulilah (Praise be to Allah) 33 times and and Subhan Allah (Glory be to Allah) 33 times usually recited after one has completed all 5 daily ritual Namaz.\n</p>\n</html>");
		footerText.setFont(new Font("Arial", Font.PLAIN, 15));
		footerText.setBounds(6, 453, 588, 80);
		WomanSalavatSelectedFrame.getContentPane().add(footerText);
		
		goBackBtn = new JButton("Go Back");
		goBackBtn.setBounds(6, 537, 117, 29);
		WomanSalavatSelectedFrame.getContentPane().add(goBackBtn);
		goBackBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                goBackToWomanDhikrSelectedPage();
            }
        });
    }
	public JFrame getWomanSalavatSelectedFrame() {
        return WomanSalavatSelectedFrame;
    }
	private void goBackToWomanDhikrSelectedPage() {
        // Close the current frame
		WomanSalavatSelectedFrame.dispose();

        // Open the PrayerSelected page
        EventQueue.invokeLater(() -> {
            try {
                WomanDhikrSelected WomanDhikrSelectedWindow = new WomanDhikrSelected();
                WomanDhikrSelectedWindow.getWomanDhikrSelectedFrame().setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }
}