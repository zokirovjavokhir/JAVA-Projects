package project;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class FajrSelected {

	private JFrame fajrSelectedFrame;
	private JLabel lblNewLabel;
	private JLabel intentionDescLbl;
	private JLabel takbeerLbl;
	private JLabel takbeerDescLbl;
	private JLabel takbeerPicture;
	private JLabel handsLbl;
	private JLabel qoyimPicture;
	private JLabel qoyimDescLbl;
	private JLabel reciteLbl;
	private JLabel fotihaLbl;
	private JLabel fotihaDescLbl;
	private JLabel rukuLbl;
	private JLabel rukuDescLbl;
	private JLabel rukuPicture;
	private JLabel rukuDesc2Lbl;
	private JLabel standUpLbl;
	private JLabel standUpDescLbl;
	private JLabel qoyim2Picture;
	private JLabel sujudLbl;
	private JLabel sujudDescLbl;
	private JLabel sujudDesc2Lbl;
	private JLabel sujudPicture;
	private JLabel sujud2Lbl;
	private JLabel sujudDesc3Lbl;
	private JLabel sujud2Picture;
	private JLabel quoodLbl;
	private JLabel quoodDescLbl;
	private JLabel quoodPicture;
	private JLabel sujud5Lbl;
	private JLabel sujud5DescLbl;
	private JLabel sujud5Picture;
	private JLabel quood2Lbl;
	private JLabel quood2DescLbl;
	private JLabel quood2Desc2Lbl;
	private JLabel tashahudLbl;
	private JLabel tashahudDesc1Lbl;
	private JLabel tashahudDesc2Lbl;
	private JLabel tashahudDesc3Lbl;
	private JLabel tashahudDesc4Lbl;
	private JLabel tasleemLbl;
	private JLabel tasleemDescLbl;
	private JLabel tasleemDesc2Lbl;
	private JLabel tasleemDesc3Lbl;
	private JButton goBackBtn;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FajrSelected window = new FajrSelected();
					window.fajrSelectedFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public FajrSelected() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	//below this code i have every component, i will be commenting them briefly
	//all this code down below is for gui
	private void initialize() {
		fajrSelectedFrame = new JFrame();
		fajrSelectedFrame.setBounds(100, 100, 600, 600);
		fajrSelectedFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fajrSelectedFrame.getContentPane().setLayout(new BorderLayout());
		fajrSelectedFrame.setTitle("Namaz Application");
		
		JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        lblNewLabel = new JLabel("<html>\n<div style = \"width: 450px;\">\n  <p style=\"margin-left: 5px; background-color: #3498db; color: #F9F6EE;\">\n        Intention before the prayer\n  </p>\n</div>\n</html>\n");
        lblNewLabel.setFont(new Font("Arial", Font.BOLD, 20));
        lblNewLabel.setBounds(6, 6, 571, 36);
        panel.add(lblNewLabel);

        intentionDescLbl = new JLabel("<html>\n<div style='width: 450px;'>\n\t<p style=\"background-color: #C0C0C0; margin: 10px;\">After performing wudu', stand straight on your feet, turn to the qiblah, and make the following intention: <br>\n<i>\"For the sake of Allah, I intend o pray the fard of Salatul-Fajr - obligatory morning prayer, consisting of 2 raka't sunnah and 2 raka't fard.\"</i>\n</p>\n</div>\n</html>");
        intentionDescLbl.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        intentionDescLbl.setBounds(6, 54, 588, 75);
        panel.add(intentionDescLbl);

        takbeerLbl = new JLabel("<html>\n<div style = \"width: 450px;\">\n<p style=\"margin-left: 5px; background-color: #3498db; color: #F9F6EE;\">Raise your hands to your ears and say ‘Allahu Akbar”\n</p></div></html>\n");
        takbeerLbl.setFont(new Font("Arial", Font.BOLD, 20));
        takbeerLbl.setBounds(6, 141, 571, 24);
        panel.add(takbeerLbl);

        takbeerDescLbl = new JLabel("<html>\n<div style='width: 450px;'>\n<p style =\"background-color: #C0C0C0; margin: 10px;\">The moment you say “Allahu Akbar” the prayer will officially begin. From this point forward you should focus wholeheartedly on the prayer and do your best to ignore all distractions.\n</div>\n</p>\n</html>");
        takbeerDescLbl.setFont(new Font("Times New Roman", Font.PLAIN, 14));
    	takbeerDescLbl.setBounds(6, 177, 588, 57);
        panel.add(takbeerDescLbl);

        takbeerPicture = new JLabel("");
        takbeerPicture.setIcon(new ImageIcon(FajrSelected.class.getResource("/project/wudu/takbir.png")));
        takbeerPicture.setBounds(143, 246, 173, 400);
        panel.add(takbeerPicture);
        
        handsLbl = new JLabel("<html>\n<div style = \"width: 450px;\">\n<p style = \"margin-left: 5px; background-color: #3498db; color: #F9F6EE;\">\n\tLower your hands and place them over your naval. Your right hand should be placed over your left hand\n</p>\n</div>\n</html>");
        handsLbl.setFont(new Font("Arial", Font.BOLD, 20));
        panel.add(handsLbl);
        
        qoyimPicture = new JLabel("");
        qoyimPicture.setIcon(new ImageIcon(FajrSelected.class.getResource("/project/wudu/qoyim.png")));
        panel.add(qoyimPicture);
        
        qoyimDescLbl = new JLabel("<html>\n<div style = \"width:570;\">\n<p style = \"background-color:C0C0C0; margin-left: 10px;\">\nKeep your eyes focused on the ground in front of you.\n<i>Prophet Muhammad (peace be upon him) said that while you praying your eyes should always look to where you will prostrate.</i>\n<tr>\n<tr>\n</p>\n</div>\n</html>");
        qoyimDescLbl.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        panel.add(qoyimDescLbl);
        
        JScrollPane scrollPane = new JScrollPane(panel, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        
        reciteLbl = new JLabel("<html>\n<div style = \"width:450px;\">\n<p style = \"margin-left: 5px; background-color: #3498db; color: #F9F6EE\">\n\tRecite the opening chapter of Qur'an\n</p>\n</div>\n</html>");
        reciteLbl.setFont(new Font("Arial", Font.BOLD, 20));
        panel.add(reciteLbl);
        
        fotihaLbl = new JLabel("<html>\n<div style = \"width: 450px;\">\n<p style = \"margin-left: 10px; margin-top: 8px; background-color: #C0C0C0;\">\nThe first chapter of the Qur’an is called Surah Fatihah. You will begin by saying this Arabic phrase:\n<br>\n<i><b>A’auodu billaahi minash-shaytaanir rajeem</b></i>\n<br>\n<i>\"I seek refuge in Allah from the accursed Shaytan (devil).\"</i>\n<br>\nAnd then begin to recite the chapter verse by verse in Arabic:\n<br>\n<i><b>Bismillaahir ar-Rahmani ar-Raheem<br>\nAl hamdu lillaahi rabbil ‘alameen<br>\nAr-Rahmani ar-Raheem<br>\nMaaliki yawmid deen<br>\nIyyaaka na’aboodu wa iyyaaka nasta’een<br>\nIhdeenas siraatal mustaqeem<br>\nSiraatal ladheena an ‘amta’ alayhim<br>\nGhayril maghduubi’ alayhim waladawleen</b></i>\n</p>\n</div>\n</html>");
        fotihaLbl.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        panel.add(fotihaLbl);
        
        fotihaDescLbl = new JLabel("<html>\n<div style = \"width: 450px;\">\n<p style = \"margin-left: 10px; background-color: #C0C0C0; margin-top:4px;\">\nAfter reciting Surah Fatihah, you can recite another chapter from the Qur’an. However, at a minimum you must recite Surah Fatihah in every raka’at of prayer.\n</p>\n</div>\n</html>");
        fotihaDescLbl.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        panel.add(fotihaDescLbl);
        
        rukuLbl = new JLabel("<html>\n<div style = \"width: 450 px;\">\n<p style = \"margin-left: 5px; margin-top:10px; background-color: #3498db; color: #F9F6EE\">\n\tBow down. This is known as the <i>‘ruku’</i>\n</p>\n</div>\n</html>");
        rukuLbl.setFont(new Font("Arial", Font.BOLD, 20));
        panel.add(rukuLbl);
        
        rukuDescLbl = new JLabel("<html>\n<div style = \"width: 450px;\">\n<p style = \"margin: 10px; background-color: #C0C0C0;\">\n\tAs you are bowing down say ‘Allahu Akbar’. Make sure to keep your back straight, your hands on your knees, and your eyes focused on the ground where you will be prostrating.\n</p>\n</div>\n</html>");
        rukuDescLbl.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        panel.add(rukuDescLbl);
        
        rukuPicture = new JLabel("");
        rukuPicture.setIcon(new ImageIcon(FajrSelected.class.getResource("/project/wudu/ruku.png")));
        panel.add(rukuPicture);
        
        rukuDesc2Lbl = new JLabel("<html>\n<div style = \"width: 450px;\">\n<p style = \"margin: 10px; background-color: #C0C0C0;\">\n\tWhen you are in this position you will say this sentence three times:<br>\n\n\t<i><b>Subhanna rabbeeyal adheem</b></i>\n</p>\n</div>\n</html>");
        rukuDesc2Lbl.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        panel.add(rukuDesc2Lbl);
        
        standUpLbl = new JLabel("<html>\n<div style = \"width: 450px;\">\n<p style = \"background-color: #3498db; margin: 5px; color: #F9F6EE;\">\n\tReturn to standing up again\n</p>\n</div>\n</html>");
        standUpLbl.setFont(new Font("Arial", Font.BOLD, 20));
        panel.add(standUpLbl);
        
        standUpDescLbl = new JLabel("<html>\n<div style = \"width: 450px;\">\n<p style = \"margin: 10px; background-color: #C0C0C0\">\n\tAs you are rising up from the ruku position to a standing position you will bring your hands to your ears and will say:<br>\n\n<i><b>Samee Allahu leeman hameeda</b></i>\n</p>\n</div>\n</html>");
        standUpDescLbl.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        panel.add(standUpDescLbl);
        
        qoyim2Picture = new JLabel("");
        qoyim2Picture.setIcon(new ImageIcon(FajrSelected.class.getResource("/project/wudu/qoyim1.png")));
        panel.add(qoyim2Picture);
        
        sujudLbl = new JLabel("<html>\n<div style = \"width: 450px;\">\n<p style = \"margin-left:5px; background-color: #3498db; color: 3F9F6EE;\">\n\tGo down to perform prostration. This is known as <i>‘sujud’</i>\n</p>\n</div>\n</html>");
        sujudLbl.setFont(new Font("Arial", Font.BOLD, 20));
        panel.add(sujudLbl);
        
        sujudDescLbl = new JLabel("<html>\n<div style = \"width: 450px;\">\n<p style = \"margin: 10px; background-color: #C0C0C0;\">\n\tAs you are moving into this position say <i><b>Allahu Akbar.</b></i>\n</p>\n</div>\n</html>");
        panel.add(sujudDescLbl);
        
        sujudDesc2Lbl = new JLabel("<html>\n<div style = \"width: 450px;\">\n<p style= \"margin-left:10px; background-color: #C0C0C0;\">\n\tAnd also make sure your forehead, nose, palms of both hands, knees, and both toes are touching the ground.\n</p>\n</div>\n</html>");
        panel.add(sujudDesc2Lbl);
        
        sujudPicture = new JLabel("");
        sujudPicture.setIcon(new ImageIcon(FajrSelected.class.getResource("/project/wudu/sajda.png")));
        panel.add(sujudPicture);
        
        sujud2Lbl = new JLabel("<html>\n<div style =\"width: 450px;\">\n<p style =\"margin: 5px; background-color: #3498db; color: #F9F6EE;\">\n\tSay this phrase 3 times while in sujud\n</p>\n</div>\n</html");
        sujud2Lbl.setFont(new Font("Arial", Font.BOLD, 20));
        panel.add(sujud2Lbl);
        
        sujudDesc3Lbl = new JLabel("<html>\n<div style = \"width: 450px;\">\n<p style = \"margin: 10px; background-color: #C0C0C0;\">\n\t<i><b>Subhanna rabbeeyal ‘alaa</b></i>\n</p>\n</div>\n</html>");
        sujudDesc3Lbl.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        panel.add(sujudDesc3Lbl);
        
        sujud2Picture = new JLabel("");
        sujud2Picture.setIcon(new ImageIcon(FajrSelected.class.getResource("/project/wudu/sajda.png")));
        panel.add(sujud2Picture);
        
        quoodLbl = new JLabel("<html>\n<div style = \"width: 450px;\">\n<p style = \"margin:5px; background-color: #3498db; color: #F9F6EE;\">\n\tRise up from sujud and sit for a moment\n</p>\n</div>\n</html>");
        quoodLbl.setFont(new Font("Arial", Font.BOLD, 20));
        panel.add(quoodLbl);
        
        quoodDescLbl = new JLabel("<html>\n<div style = \"width: 450px;\">\n<p style = \"margin: 10px; background-color: #C0C0C0;\">\n\tSay Allahu akbar as you rise from sujud and then sit on your left leg. Your left foot will rest on \tthe floor while your right foot is upright. Place your hands on your knees.<br>\n\n\tWhen you are in this position it is recommended to ask Allah for forgiveness. A simple and \teasy dua you can say is:<br>\n\n\t<i><b>Rabbigh-fir lee</b></i>\n</p>\n</div>\n</html>");
        quoodDescLbl.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        panel.add(quoodDescLbl);
        
        quoodPicture = new JLabel("");
        quoodPicture.setIcon(new ImageIcon(FajrSelected.class.getResource("/project/wudu/quood.png")));
        panel.add(quoodPicture);
        
        sujud5Lbl = new JLabel("<html>\n<div style = \"width: 450px;\">\n<p style =  \"margin:5px; background-color: #3498db; color: F9F6EE;\">\n\tReturn to the position of sujud\n</p>\n</div>\n</html>");
        sujud5Lbl.setFont(new Font("Arial", Font.BOLD, 20));
        panel.add(sujud5Lbl);
        
        sujud5DescLbl = new JLabel("<html>\n<div style = \"width: 450px;\">\n<p style =  \"margin:10px; background-color: #C0C0C0;\">\n\tPerform a second sujud and say <i><b>subhanna rabbeeyal ‘alaa</b></i> three times again.\n</p>\n</div>\n</html>");
        sujud5DescLbl.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        panel.add(sujud5DescLbl);
        
        sujud5Picture = new JLabel("");
        sujud5Picture.setIcon(new ImageIcon(FajrSelected.class.getResource("/project/wudu/sajda.png")));
        panel.add(sujud5Picture);
        
        quood2Lbl = new JLabel("<html>\n<div style = \"width: 450px;\">\n<p style =  \"margin:5px; background-color: #3498db; color: F9F6EE;\">\n\tArise from the sujud to return to the standing position and say <i><b>Allahu Akbar</b></i>\n</p>\n</div>\n</html>");
        quood2Lbl.setFont(new Font("Arial", Font.BOLD, 20));
        panel.add(quood2Lbl);
        
        quood2DescLbl = new JLabel("<html>\n<div style = \"width: 450px;\">\n<p style =  \"margin:10px; background-color: #C0C0C0;\">\n\tCongratulations, you have just completed one full rakah! The first rakah of every prayer is performed with these steps.\n\n\n</p>\n</div>\n</html>");
        quood2DescLbl.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        panel.add(quood2DescLbl);
        
        quood2Desc2Lbl = new JLabel("<html>\n<div style = \"width: 450px;\">\n<p style =  \"margin-left:10px; margin-top: 0px; background-color: #C0C0C0;\">\n\tWhen you reach the end of the second rakah you will perform the <i><b>tashahud</b></i>\n</p>\n</div>\n</html>");
        quood2Desc2Lbl.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        panel.add(quood2Desc2Lbl);
        
        tashahudLbl = new JLabel("<html>\n<div style = \"width: 450px;\">\n<p style =  \"margin:5px; background-color: #3498db; color: F9F6EE;\">\n\tPerform the tashahud at the end of every two rakah\n</p>\n</div>\n</html>");
        tashahudLbl.setFont(new Font("Arial", Font.BOLD, 20));
        panel.add(tashahudLbl);
        
        tashahudDesc1Lbl = new JLabel("<html>\n<div style = \"width: 450px;\">\n<p style =  \"margin:10px; background-color: #C0C0C0;\">\n\tInstead of standing up after the two sujud, this time around you will sit on your legs and knees again. You will raise your right index finger and say:\n</p>\n</div>\n</html>");
        tashahudDesc1Lbl.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        panel.add(tashahudDesc1Lbl);
        
        tashahudDesc2Lbl = new JLabel("<html>\n<div style = \"width: 450px;\">\n<p style =  \"margin-left:10px; margin-top: 0px; background-color: #C0C0C0;\">\n\t<i><b>At Tahiyyaatu lilaahi was Salawaatu wat tayibaatu<br>\n\tAssalaamu ‘alaika ayyuhan nabiyyu wa rahmatu Allahi wa barakaatuh<br>\n\tAssalaamu ‘alaynaa wa ‘alaa ‘ebaadillaahis saaliheen,<br>\n\tAsh hadu allaa ilaha illa Allah Wa ash hadu anna Muhammadan ‘abduhuu wa rasuuluh</b><i>\n</p>\n</div>\n</html>");
        tashahudDesc2Lbl.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        panel.add(tashahudDesc2Lbl);
        
        tashahudDesc3Lbl = new JLabel("<html>\n<div style = \"width: 450px;\">\n<p style =  \"margin:10px; background-color: #C0C0C0;\">\n\tIf this is the <b><u>final rakah</u></b> in the prayer then you will add this part to the tashahud:\n</p>\n</div>\n</html>");
        tashahudDesc3Lbl.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        panel.add(tashahudDesc3Lbl);
        
        tashahudDesc4Lbl = new JLabel("<html>\n<div style = \"width: 450px;\">\n<p style =  \"margin-left:10px; margin-top:3px; background-color: #C0C0C0;\">\n\t<i><b>Allahumma salli ‘ala Muhammadin wa ‘ala aali Muhammad<br>\n\tKamaa salayta ‘ala Ibraaheem wa ‘ala aali Ibrahim<br>\n\tInnaka Hameedun Majeed<br>\n\tWa baarik ‘ala Muhammadin wa ‘ala aali Muhammad<br>\n\tKamaa baarakta ‘ala Ibraaheem wa ‘ala aali Ibrahim<br>\n\tInnaka Hameedun Majeed</b></i>\n</p>\n</div>\n</html>");
        tashahudDesc4Lbl.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        panel.add(tashahudDesc4Lbl);
        
        tasleemLbl = new JLabel("<html>\n<div style = \"width: 450px;\">\n<p style =  \"margin:5px; background-color: #3498db; color: F9F6EE;\">\n\tTasleem\n</p>\n</div>\n</html>");
        tasleemLbl.setFont(new Font("Arial", Font.BOLD, 20));
        panel.add(tasleemLbl);
        
        tasleemDescLbl = new JLabel("<html>\n<div style = \"width: 450px;\">\n<p style =  \"margin:10px; background-color: #C0C0C0;\">\n\tThe ‘tasleem’: after reciting the second part of the tashahud, you will say the “tasleem.”<br>\n\n\tThe tasleem is to look to your right and say:<br>\n\n\t<i><b>Assalamu alaykum wa rahmatu Allah</b></i><br>\n\n\tAnd then to look to the left and say it again:<br>\n\n\t<i><b>Assalamu alaykum wa rahmatu Allah</b></i><br>\n</p>\n</div>\n</html>");
        tasleemDescLbl.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        panel.add(tasleemDescLbl);
        
        tasleemDesc2Lbl = new JLabel("<html>\n<div style = \"width: 450px;\">\n<p style =  \"margin:10px; background-color: #C0C0C0;\">\n\t<b>Upon saying the tasleem the prayer will have come to an end.<b>\n</p>\n</div>\n</html>");
        tasleemDesc2Lbl.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        panel.add(tasleemDesc2Lbl);
        
        tasleemDesc3Lbl = new JLabel("<html>\n<div style = \"width: 450px;\">\n<p style =  \"margin:10px; background-color: #C0C0C0;\">\n\t<b>Fajr Prayer consists of  2 Rakat Sunnah and 2 Rakat Fard<b>\n</p>\n</div>\n</html>");
        tasleemDesc3Lbl.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        panel.add(tasleemDesc3Lbl);
        
        goBackBtn = new JButton("Go Back");
        panel.add(goBackBtn);
        fajrSelectedFrame.getContentPane().add(scrollPane, BorderLayout.EAST);
        goBackBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                goBackToPrayerSelectedPage();
            }
        });
    }
	public JFrame getFajrSelectedFrame() {
        return fajrSelectedFrame;
    }
	private void goBackToPrayerSelectedPage() {
        // Close the current frame
        fajrSelectedFrame.dispose();

        // Open the PrayerSelected page
        EventQueue.invokeLater(() -> {
            try {
                PrayerSelected prayerSelectedWindow = new PrayerSelected();
                prayerSelectedWindow.getPrayerSelectedFrame().setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }
}