package project;

import java.awt.EventQueue;
import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;
import javax.swing.JButton;

public class WuduSelected {

	private JFrame wuduFrame;
	private JLabel step1Lbl;
	private JLabel step1DescriptionLbl;
	private JLabel step2Lbl;
	private JLabel step2DescriptionLbl;
	private JLabel step3Lbl;
	private JLabel step3DescriptionLbl;
	private JLabel step3Picture;
	private JLabel step4Lbl;
	private JLabel step4DescriptionLbl;
	private JLabel step4Picture;
	private JLabel step5Lbl;
	private JLabel step5DescriptionLbl;
	private JLabel step5Picture;
	private JLabel step6Lbl;
	private JLabel step6DescriptionLbl;
	private JLabel step6Picture;
	private JLabel step7Lbl;
	private JLabel step7DescriptionLbl;
	private JLabel step7Picture;
	private JLabel step8Lbl;
	private JLabel step8DescriptionLbl;
	private JLabel step8Picture;
	private JLabel step9Lbl;
	private JLabel step9DescriptionLbl;
	private JLabel step9Picture;
	private JLabel step10Lbl;
	private JLabel step10DescriptionLbl;
	private JLabel step10Picture;
	private JLabel step11Lbl;
	private JLabel step11DescriptionLbl;
	private JButton goBackBtn;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WuduSelected window = new WuduSelected();
					window.wuduFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public WuduSelected() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	//this code below is only for the gui
	private void initialize() {
		wuduFrame = new JFrame();
		wuduFrame.getContentPane().setBackground(new Color(255, 255, 255));
		wuduFrame.setBounds(100, 100, 600, 600);
		wuduFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        wuduFrame.getContentPane().setLayout(new BorderLayout());
        wuduFrame.setTitle("Namaz Application");

        
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		
		step1Lbl = new JLabel("Step 1: Make your intention to perform wudu");
		step1Lbl.setForeground(new Color(0, 0, 0));
		step1Lbl.setBackground(new Color(0, 0, 0));
		step1Lbl.setFont(new Font("Times New Roman", Font.BOLD, 20));
		step1Lbl.setBounds(17, 20, 393, 24);
		panel.add(step1Lbl);
		
		step1DescriptionLbl = new JLabel("<html>The first step is to understand that you are about to begin the process of wudu so that you can<br> perform salah. There are no words or special statements that need to be said here.<br> Creating the intention is a matter of the heart and mind.\n<tr>\n</html>");
		step1DescriptionLbl.setBackground(new Color(0, 0, 0));
		step1DescriptionLbl.setFont(new Font("Arial", Font.PLAIN, 13));
		step1DescriptionLbl.setBounds(17, 56, 437, 82);
		panel.add(step1DescriptionLbl);
		
		step2Lbl = new JLabel("Step 2: Say Bismillah");
		step2Lbl.setFont(new Font("Times New Roman", Font.BOLD, 20));
		step2Lbl.setBounds(17, 150, 184, 24);
		panel.add(step2Lbl);
		
		step2DescriptionLbl = new JLabel("<html>This is a critical part of making wudu. Before we begin to our wash<br> ourselves we need to say Bismillah (In the Name of Allah). You can say it silently to yourself.\n<tr>\n</html>");
		step2DescriptionLbl.setFont(new Font("Arial", Font.PLAIN, 13));
		step2DescriptionLbl.setBounds(17, 186, 437, 61);
		panel.add(step2DescriptionLbl);
		
		step3Lbl = new JLabel("Step 3: Wash your hand 3 times");
		step3Lbl.setFont(new Font("Times New Roman", Font.BOLD, 20));
		step3Lbl.setBounds(17, 259, 274, 24);
		panel.add(step3Lbl);
		
		step3DescriptionLbl = new JLabel("<html>Prophet Muhammad (peace be upon him) taught us to begin with our<br> right side first. That means you will need to wash your right hand from the <br>fingertips to the wrist three times.<br>\n<tr>\nMake sure water touches every part of the hand. Afterwards perform the same actions with<br> your left hand three times.\n</html>");
		step3DescriptionLbl.setFont(new Font("Arial", Font.PLAIN, 13));
		step3DescriptionLbl.setBounds(17, 295, 437, 68);
		panel.add(step3DescriptionLbl);
		
	
		
		JScrollPane scrollPane = new JScrollPane(panel);
		
		step3Picture = new JLabel("");
		step3Picture.setIcon(new ImageIcon(WuduSelected.class.getResource("/project/wudu/wudu-wash-hands.png")));
		panel.add(step3Picture);
		
		step4Lbl = new JLabel("<html><tr>Step 4: Rinse your mouth 3 times</html>");
		step4Lbl.setFont(new Font("Times New Roman", Font.BOLD, 20));
		panel.add(step4Lbl);
		
		step4DescriptionLbl = new JLabel("<html>Take some water into your right hand and rinse your mouth three times. Do this <br>thoroughly to clean your mouth properly.<tr></html>\n");
		step4DescriptionLbl.setFont(new Font("Arial", Font.PLAIN, 13));
		panel.add(step4DescriptionLbl);
		
		step4Picture = new JLabel("");
		step4Picture.setIcon(new ImageIcon(WuduSelected.class.getResource("/project/wudu/wudu-rinse-mouth.png")));
		panel.add(step4Picture);
		
		step5Lbl = new JLabel("<html><tr>Step 5: Sniff water into your nostrils 3 times</html>");
		step5Lbl.setFont(new Font("Times New Roman", Font.BOLD, 20));
		panel.add(step5Lbl);
		
		step5DescriptionLbl = new JLabel("<html>Take some water in your right hand and sniff it into your nose.<br>\n<tr>\nWe used the word “sniff” here to give you an idea of what this means. You will need<br> to snort or inhale the water into your nose and then blow it out, three times. Try not to<br> take in too much water or you may hurt yourself.\n</html>");
		step5DescriptionLbl.setFont(new Font("Arial", Font.PLAIN, 13));
		panel.add(step5DescriptionLbl);
		
		step5Picture = new JLabel("");
		step5Picture.setIcon(new ImageIcon(WuduSelected.class.getResource("/project/wudu/wudu-into-nose.png")));
		panel.add(step5Picture);
		
		step6Lbl = new JLabel("<html><tr>Step 6: Wash your face 3 times</html>");
		step6Lbl.setFont(new Font("Times New Roman", Font.BOLD, 20));
		panel.add(step6Lbl);
		
		step6DescriptionLbl = new JLabel("<html>Every part of the face needs to be washed. That means from ear to ear and from the top<br> of your forehead to the bottom of your chin. Do this step three times.\n<tr>\nIf you have beard, take your wet hands and pass them through your beard, as you wash your face.<tr></html>");
		step6DescriptionLbl.setFont(new Font("Arial", Font.PLAIN, 13));
		panel.add(step6DescriptionLbl);
		
		step6Picture = new JLabel("");
		step6Picture.setIcon(new ImageIcon(WuduSelected.class.getResource("/project/wudu/wudu-wash-face.png")));
		step6Picture.setFont(new Font("Times New Roman", Font.BOLD, 20));
		panel.add(step6Picture);
		
		step7Lbl = new JLabel("<html><tr>Step 7: Wash your arms 3 times</html>");
		step7Lbl.setFont(new Font("Times New Roman", Font.BOLD, 20));
		panel.add(step7Lbl);
		
		step7DescriptionLbl = new JLabel("<html>Start from the fingertips and wash your right arm up to the elbow three times.<br> Make sure that no part is left dry. Afterwards, follow the same process for your left arm and<br> do it three times.<tr></html>");
		step7DescriptionLbl.setFont(new Font("Arial", Font.PLAIN, 13));
		panel.add(step7DescriptionLbl);
		
		step7Picture = new JLabel("");
		step7Picture.setIcon(new ImageIcon(WuduSelected.class.getResource("/project/wudu/wudu-wash-arms.png")));
		panel.add(step7Picture);
		
		step8Lbl = new JLabel("<html><tr>Step 8: Wipe your head once<html>");
		step8Lbl.setFont(new Font("Times New Roman", Font.BOLD, 20));
		panel.add(step8Lbl);
		
		step8DescriptionLbl = new JLabel("<html>\nDid you notice that step 8 says to “wipe” your head instead of “wash.”<br> The choice of words here was intentional. Move your wet hands from the top of the<br> forehead to the back of the head, and then from the back of the head to the forehead. <br>This is done only once. It doesn’t matter what type of hair you have.<tr>\n</html>");
		step8DescriptionLbl.setFont(new Font("Arial", Font.PLAIN, 13));
		panel.add(step8DescriptionLbl);
		
		step8Picture = new JLabel("");
		step8Picture.setIcon(new ImageIcon(WuduSelected.class.getResource("/project/wudu/wudu-wash-hair.png")));
		panel.add(step8Picture);
		
		step9Lbl = new JLabel("<html><tr>Step 9: Clean your ears once</html>");
		step9Lbl.setFont(new Font("Times New Roman", Font.BOLD, 20));
		panel.add(step9Lbl);
		
		step9DescriptionLbl = new JLabel("<html>\nThis step should be performed with the same water from step 8. Using your wet hands<br> you will use your index fingers to clean the inside of your ears and your thumb<br> to clean the area behind your ears.\n<tr>\n</html>");
		step9DescriptionLbl.setFont(new Font("Arial", Font.PLAIN, 13));
		panel.add(step9DescriptionLbl);
		
		step9Picture = new JLabel("");
		step9Picture.setIcon(new ImageIcon(WuduSelected.class.getResource("/project/wudu/wudu-clean-ears.png")));
		panel.add(step9Picture);
		
		step10Lbl = new JLabel("<html><tr>Step 10: Wash your feet 3 times<html>");
		step10Lbl.setFont(new Font("Times New Roman", Font.BOLD, 20));
		panel.add(step10Lbl);
		
		step10DescriptionLbl = new JLabel("<html>\nBegin from your toes on your right foot and wash up to and including your ankle.<br> Make sure water touches every area of the right foot, especially between the toes and<br> the back of the ankle. Do this three times with the right foot followed by three times<br> with the left foot.\n<tr>\n</html>");
		step10DescriptionLbl.setFont(new Font("Arial", Font.PLAIN, 13));
		panel.add(step10DescriptionLbl);
		
		step10Picture = new JLabel("");
		step10Picture.setIcon(new ImageIcon(WuduSelected.class.getResource("/project/wudu/wudu-wash-feet.png")));
		panel.add(step10Picture);
		
		step11Lbl = new JLabel("<html><tr><tr><tr>Step 11: Recite the Shahada and the Dua</html>");
		step11Lbl.setFont(new Font("Times New Roman", Font.BOLD, 20));
		panel.add(step11Lbl);
		
		step11DescriptionLbl = new JLabel("<html>When the Prophet (peace be upon him) would complete his wudu he would say the shahada:\n<br>\n<tr>\n<i><b>“Ash-hadu an la ilaha  illal lahu wa ash-hadu anna Muhammadan<br> ‘abduhu wa rasuluh.”</b></i>\n<br>\n<tr>\nThis means <i><b>“I testify that there is no god but Allah, and I also testify that Muhammad<br> is His servant and messenger.”</b></i>\n\nAfter this statement he would make the following dua:<br> <i><b>“Allahuma j‘alnee mina tawabeen waj-‘alnee minal mutatahireen”</b><i><br><tr>\n\nWhich means  <i><b>“O Allah, make me among those who seek repentance and make me<br> among those who purify themselves.”</b></i>\n<br>\n<tr>\nAt this point your wudu is complete and you can begin to pray.\n</html>");
		step11DescriptionLbl.setFont(new Font("Arial", Font.PLAIN, 13));
		panel.add(step11DescriptionLbl);
		
		goBackBtn = new JButton("Go Back");
		panel.add(goBackBtn);
        wuduFrame.getContentPane().add(scrollPane, BorderLayout.CENTER);
        
        goBackBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                goBackToManSelectedPage();
            }
        });
      
	}
	public JFrame getWuduFrame() {
        return wuduFrame;
    }
	private void goBackToManSelectedPage() {
        // Close the current frame
        wuduFrame.dispose();

        // Open the ManSelected page
        EventQueue.invokeLater(() -> {
            try {
                ManSelected manSelectedWindow = new ManSelected();
                manSelectedWindow.getManFrame().setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
}
	}