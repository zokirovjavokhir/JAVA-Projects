package project;

import java.awt.EventQueue;
import java.awt.Font;
import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;

public class PrayerSelected {

	private JFrame prayerSelectedFrame;
	private JLabel prayerSelectedPictureLbl;
	private JButton fajrBtn;
	private JButton dhuhrBtn;
	private JButton asrBtn;
	private JButton maghribBtn;
	private JButton ishaBtn;
	private JButton goBackBtn;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrayerSelected window = new PrayerSelected();
					window.prayerSelectedFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public PrayerSelected() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	//this code is only for gui
	private void initialize() {
		prayerSelectedFrame = new JFrame();
		prayerSelectedFrame.getContentPane().setBackground(new Color(0xA9C7AC));
		prayerSelectedFrame.setBounds(100, 100, 600, 600);
		prayerSelectedFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		prayerSelectedFrame.setTitle("Namaz Application");
		prayerSelectedFrame.getContentPane().setLayout(null);
		
		prayerSelectedPictureLbl = new JLabel("");
		prayerSelectedPictureLbl.setIcon(new ImageIcon(PrayerSelected.class.getResource("/project/wudu/360_F_327494106_Xc4crNChvNzceySBzEDTHnouaRdfj0B6.jpg")));
		prayerSelectedPictureLbl.setHorizontalAlignment(SwingConstants.CENTER);
		prayerSelectedPictureLbl.setBounds(150, 25, 290, 236);
		prayerSelectedFrame.getContentPane().add(prayerSelectedPictureLbl);
		
		fajrBtn = new JButton("Fajr - Dawn");
		fajrBtn.setFont(new Font("Arial", Font.BOLD, 15));
		fajrBtn.setBounds(230, 282, 130, 40);
		prayerSelectedFrame.getContentPane().add(fajrBtn);
		
		//when the user mouse is on top it's gonna change its border color
		fajrBtn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
            	fajrBtn.setContentAreaFilled(true);
            	fajrBtn.setBackground(new Color(0x315245)); // Green color using hex code
            }

            @Override
            public void mouseExited(MouseEvent e) {
            	fajrBtn.setContentAreaFilled(false); // Reset to default color
            }
        });
		fajrBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                openFajrSelectedPage();
            }
        });

		dhuhrBtn = new JButton("Dhuhr - Noon");
		dhuhrBtn.setFont(new Font("Arial", Font.BOLD, 15));
		dhuhrBtn.setBounds(230, 334, 130, 40);
		prayerSelectedFrame.getContentPane().add(dhuhrBtn);
		
		//when the user mouse is on top it's gonna change its border color
		dhuhrBtn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
            	dhuhrBtn.setContentAreaFilled(true);
            	dhuhrBtn.setBackground(new Color(0x315245)); // Green color using hex code
            }

            @Override
            public void mouseExited(MouseEvent e) {
            	dhuhrBtn.setContentAreaFilled(false); // Reset to default color
            }
        });
		dhuhrBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                openDhuhrSelectedPage();
            }
        });
		
		asrBtn = new JButton("'Asr - Afternoon");
		asrBtn.setFont(new Font("Arial", Font.BOLD, 15));
		asrBtn.setBounds(230, 386, 130, 40);
		prayerSelectedFrame.getContentPane().add(asrBtn);
		
		//when the user mouse is on top it's gonna change its border color
		asrBtn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
            	asrBtn.setContentAreaFilled(true);
            	asrBtn.setBackground(new Color(0x315245)); // Green color using hex code
            }

            @Override
            public void mouseExited(MouseEvent e) {
            	asrBtn.setContentAreaFilled(false); // Reset to default color
            }
        });
		asrBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                openAsrSelectedPage();
            }
        });
		
		maghribBtn = new JButton("Maghrib - Sunset");
		maghribBtn.setFont(new Font("Arial", Font.BOLD, 15));
		maghribBtn.setBounds(230, 438, 130, 40);
		prayerSelectedFrame.getContentPane().add(maghribBtn);
		
		//when the user mouse is on top it's gonna change its border color
		maghribBtn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
            	maghribBtn.setContentAreaFilled(true);
            	maghribBtn.setBackground(new Color(0x315245)); // Green color using hex code
            }

            @Override
            public void mouseExited(MouseEvent e) {
            	maghribBtn.setContentAreaFilled(false); // Reset to default color
            }
        });
		maghribBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                openMaghribSelectedPage();
            }
        });
		
		ishaBtn = new JButton("'Isha - Night");
		ishaBtn.setFont(new Font("Arial", Font.BOLD, 15));
		ishaBtn.setBounds(230, 490, 130, 40);
		prayerSelectedFrame.getContentPane().add(ishaBtn);
		
		//when the user mouse is on top it's gonna change its border color
		ishaBtn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
            	ishaBtn.setContentAreaFilled(true);
            	ishaBtn.setBackground(new Color(0x315245)); // Green color using hex code
            }

            @Override
            public void mouseExited(MouseEvent e) {
            	ishaBtn.setContentAreaFilled(false); // Reset to default color
            }
        });
		ishaBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                openIshaSelectedPage();
            }
        });
		
		goBackBtn = new JButton("Go Back");
		goBackBtn.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	            goBackToManSelectedPage();
	        }
	    });
		
		goBackBtn.setFont(new Font("Arial", Font.BOLD, 15));
		goBackBtn.setBounds(6, 526, 130, 40);
		prayerSelectedFrame.getContentPane().add(goBackBtn);
		
		//when the user mouse is on top it's gonna change its border color
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
	}

	public JFrame getPrayerSelectedFrame() {
        return prayerSelectedFrame;
    }
	
	//below code is for opening windows when buttons are peressed
	private void goBackToManSelectedPage() {
        // Close the current frame
        prayerSelectedFrame.dispose();

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
	private void openFajrSelectedPage() {
	    // Close the current frame
	    prayerSelectedFrame.dispose();

	    // Open the FajrSelected page
	    EventQueue.invokeLater(() -> {
	        try {
	            FajrSelected fajrSelectedWindow = new FajrSelected();
	            fajrSelectedWindow.getFajrSelectedFrame().setVisible(true);
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    });
	}
	    private void openDhuhrSelectedPage() {
		    // Close the current frame
		    prayerSelectedFrame.dispose();

		    // Open the FajrSelected page
		    EventQueue.invokeLater(() -> {
		        try {
		            DhuhrSelected DhuhrSelectedWindow = new DhuhrSelected();
		            DhuhrSelectedWindow.getDhuhrSelectedFrame().setVisible(true);
		        } catch (Exception e) {
		            e.printStackTrace();
		        }
		    });
	    }
	    private void openAsrSelectedPage() {
		    // Close the current frame
		    prayerSelectedFrame.dispose();

		    // Open the FajrSelected page
		    EventQueue.invokeLater(() -> {
		        try {
		            AsrSelected AsrSelectedWindow = new AsrSelected();
		            AsrSelectedWindow.getAsrSelectedFrame().setVisible(true);
		        } catch (Exception e) {
		            e.printStackTrace();
		        }
		    });
	    }
	    private void openMaghribSelectedPage() {
		    // Close the current frame
		    prayerSelectedFrame.dispose();

		    // Open the FajrSelected page
		    EventQueue.invokeLater(() -> {
		        try {
		            MaghribSelected MaghribSelectedWindow = new MaghribSelected();
		            MaghribSelectedWindow.getMaghribSelectedFrame().setVisible(true);
		        } catch (Exception e) {
		            e.printStackTrace();
		        }
		    });
	    }
	    private void openIshaSelectedPage() {
		    // Close the current frame
		    prayerSelectedFrame.dispose();

		    // Open the FajrSelected page
		    EventQueue.invokeLater(() -> {
		        try {
		            IshaSelected IshaSelectedWindow = new IshaSelected();
		            IshaSelectedWindow.getIshaSelectedFrame().setVisible(true);
		        } catch (Exception e) {
		            e.printStackTrace();
		        }
		    });
	}
	
}