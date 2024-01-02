package project;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class IqamahSelected {

	private JFrame IqamahSelectedFrame;
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
					IqamahSelected window = new IqamahSelected();
					window.IqamahSelectedFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public IqamahSelected() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	//below this code i have every component, i will be commenting them briefly
	//all this code down below is for gui
	private void initialize() {
		IqamahSelectedFrame = new JFrame();
		IqamahSelectedFrame.getContentPane().setBackground(new Color(0xA9C7AC));
		IqamahSelectedFrame.setBounds(100, 100, 600, 600);
		IqamahSelectedFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		IqamahSelectedFrame.setTitle("Namaz Application");
		IqamahSelectedFrame.getContentPane().setLayout(null);
		
		mainTextLbl = new JLabel("<html>\n<p>\n\tThe Iqama or Iqamah (Arabic: إِقَامَة, ʾIqāmah) is the second call to Islamic Prayer, given immediately before prayer begins.[1] The iqama is given a more rapid and less sonorous rendering than the first call, the adhan, because it is intended merely to draw the attention of those already in the mosque, rather than to remind those outside the mosque to come in. The phrases of the iqama and the adhan are the same, though there are variations among sects in the preferred number of repetitions of the phrases.</p>\n</html>");
		mainTextLbl.setFont(new Font("Arial", Font.PLAIN, 15));
		mainTextLbl.setBounds(6, 6, 588, 123);
		IqamahSelectedFrame.getContentPane().add(mainTextLbl);
		
		arabicLbl = new JLabel("<html>\n<p>\n\tالله أكبر، الله أكبر<br>\nقَدْ قَامَتِ الصَّلَاةُ<br>\nقَدْ قَامَتِ الصَّلَاةُ<br>\nالله أكبر، الله أكبر<br>\nلا إله إلا الله\n</p>\n</html>");
		arabicLbl.setFont(new Font("Arial", Font.BOLD, 20));
		arabicLbl.setBounds(204, 163, 144, 128);
		IqamahSelectedFrame.getContentPane().add(arabicLbl);
		
		transliterationLbl = new JLabel("<html>\n<p>\n\tAllahu Akbar, Allahu Akbar<br>\nQad qāmatiṣ-ṣalāh<br>\nQad qāmatiṣ-ṣalāh<br>\nAllahu Akbar, Allahu Akbar<br>\nLā ilāha illallāh\n</p>\n</html>");
		transliterationLbl.setFont(new Font("Arial", Font.BOLD, 18));
		transliterationLbl.setBounds(188, 303, 256, 168);
		IqamahSelectedFrame.getContentPane().add(transliterationLbl);
		
		goBackBtn = new JButton("Go Back");
		goBackBtn.setBounds(6, 537, 117, 29);
		IqamahSelectedFrame.getContentPane().add(goBackBtn);
		goBackBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                goBackToDhikrSelectedPage();
            }
        });
    }
	public JFrame getIqamahSelectedFrame() {
        return IqamahSelectedFrame;
    }
	private void goBackToDhikrSelectedPage() {
        // Close the current frame
		IqamahSelectedFrame.dispose();

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
