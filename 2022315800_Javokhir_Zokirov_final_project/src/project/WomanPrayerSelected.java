package project;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;

public class WomanPrayerSelected {

	private JFrame womanPrayerFrame;
	private JLabel prayerSelectedPictureLbl;
	private JButton womanFajrBtn;
	private JButton womanDhuhrBtn;
	private JButton womanAsrBtn;
	private JButton womanMaghribBtn;
	private JButton womanIshaBtn;
	private JButton goBackBtn;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WomanPrayerSelected window = new WomanPrayerSelected();
					window.womanPrayerFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	/**
	 * Create the application.
	 */
	public WomanPrayerSelected() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	//below code is for gui only
	private void initialize() {
		womanPrayerFrame = new JFrame();
		womanPrayerFrame.setBounds(100, 100, 600, 600);
		womanPrayerFrame.getContentPane().setBackground(new Color(0xA9C7AC));
		womanPrayerFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		womanPrayerFrame.setTitle("Namaz Application");
		womanPrayerFrame.getContentPane().setLayout(null);
		
		prayerSelectedPictureLbl = new JLabel("");
		prayerSelectedPictureLbl.setIcon(new ImageIcon(PrayerSelected.class.getResource("/project/wudu/360_F_327494106_Xc4crNChvNzceySBzEDTHnouaRdfj0B6.jpg")));
		prayerSelectedPictureLbl.setHorizontalAlignment(SwingConstants.CENTER);
		prayerSelectedPictureLbl.setBounds(150, 25, 290, 236);
		womanPrayerFrame.getContentPane().add(prayerSelectedPictureLbl);
		
		womanFajrBtn = new JButton("Fajr - Dawn");
		womanFajrBtn.setFont(new Font("Arial", Font.BOLD, 15));
		womanFajrBtn.setBounds(230, 282, 130, 40);
		womanPrayerFrame.getContentPane().add(womanFajrBtn);
		
		//when user's mouse is on top its gonna change its border color
		womanFajrBtn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
            	womanFajrBtn.setContentAreaFilled(true);
            	womanFajrBtn.setBackground(new Color(0x315245)); // Green color using hex code
            }

            @Override
            public void mouseExited(MouseEvent e) {
            	womanFajrBtn.setContentAreaFilled(false); // Reset to default color
            }
        });
		womanFajrBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                openWomanFajrSelectedPage();
            }
        });
		
		womanDhuhrBtn = new JButton("Dhuhr - Noon");
		womanDhuhrBtn.setFont(new Font("Arial", Font.BOLD, 15));
		womanDhuhrBtn.setBounds(230, 334, 130, 40);
		womanPrayerFrame.getContentPane().add(womanDhuhrBtn);
		
		//when user's mouse is on top its gonna change its border color
		womanDhuhrBtn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
            	womanDhuhrBtn.setContentAreaFilled(true);
            	womanDhuhrBtn.setBackground(new Color(0x315245)); // Green color using hex code
            }

            @Override
            public void mouseExited(MouseEvent e) {
            	womanDhuhrBtn.setContentAreaFilled(false); // Reset to default color
            }
        });
		womanDhuhrBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                openWomanDhuhrSelectedPage();
            }
        });
		
		womanAsrBtn = new JButton("'Asr - Afternoon");
		womanAsrBtn.setFont(new Font("Arial", Font.BOLD, 15));
		womanAsrBtn.setBounds(230, 386, 130, 40);
		womanPrayerFrame.getContentPane().add(womanAsrBtn);
		
		//when user's mouse is on top its gonna change its border color
		womanAsrBtn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
            	womanAsrBtn.setContentAreaFilled(true);
            	womanAsrBtn.setBackground(new Color(0x315245)); // Green color using hex code
            }

            @Override
            public void mouseExited(MouseEvent e) {
            	womanAsrBtn.setContentAreaFilled(false); // Reset to default color
            }
        });
		womanAsrBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                openWomanAsrSelectedPage();
            }
        });
		
		womanMaghribBtn = new JButton("Maghrib - Sunset");
		womanMaghribBtn.setFont(new Font("Arial", Font.BOLD, 15));
		womanMaghribBtn.setBounds(230, 438, 130, 40);
		womanPrayerFrame.getContentPane().add(womanMaghribBtn);
		
		//when user's mouse is on top its gonna change its border color
		womanMaghribBtn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
            	womanMaghribBtn.setContentAreaFilled(true);
            	womanMaghribBtn.setBackground(new Color(0x315245)); // Green color using hex code
            }

            @Override
            public void mouseExited(MouseEvent e) {
            	womanMaghribBtn.setContentAreaFilled(false); // Reset to default color
            }
        });
		womanMaghribBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                openWomanMaghribSelectedPage();
            }
        });
		
		womanIshaBtn = new JButton("'Isha - Night");
		womanIshaBtn.setFont(new Font("Arial", Font.BOLD, 15));
		womanIshaBtn.setBounds(230, 490, 130, 40);
		womanPrayerFrame.getContentPane().add(womanIshaBtn);
		
		//when user's mouse is on top its gonna change its border color
		womanIshaBtn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
            	womanIshaBtn.setContentAreaFilled(true);
            	womanIshaBtn.setBackground(new Color(0x315245)); // Green color using hex code
            }

            @Override
            public void mouseExited(MouseEvent e) {
            	womanIshaBtn.setContentAreaFilled(false); // Reset to default color
            }
        });
		womanIshaBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                openWomanIshaSelectedPage();
            }
        });
		
		goBackBtn = new JButton("Go Back");
		goBackBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				goBackToWomanSelectedPage();
			}
		});
		goBackBtn.setFont(new Font("Arial", Font.BOLD, 15));
		goBackBtn.setBounds(6, 537, 117, 29);
		womanPrayerFrame.getContentPane().add(goBackBtn);
		
		//when user's mouse is on top its gonna change its border color
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
	
	
	public JFrame getWomanPrayerSelectedFrame() {
        return womanPrayerFrame;
	}
	
	//from this point, the code is for only opening new windows
	private void goBackToWomanSelectedPage(){
        // Close the current frame
        womanPrayerFrame.dispose();

        // Open the ManSelected page
        EventQueue.invokeLater(() -> {
            try {
                WomanSelected womanSelectedWindow = new WomanSelected();
                womanSelectedWindow.getWomanFrame().setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
	}
        private void openWomanFajrSelectedPage() {
    	    // Close the current frame
        	womanPrayerFrame.dispose();

    	    // Open the FajrSelected page
    	    EventQueue.invokeLater(() -> {
    	        try {
    	            WomanFajrSelected WomanFajrSelectedWindow = new WomanFajrSelected();
    	            WomanFajrSelectedWindow.getWomanFajrSelectedFrame().setVisible(true);
    	        } catch (Exception e) {
    	            e.printStackTrace();
    	        }
    	    });
    	}
        private void openWomanDhuhrSelectedPage() {
    	    // Close the current frame
        	womanPrayerFrame.dispose();

    	    // Open the FajrSelected page
    	    EventQueue.invokeLater(() -> {
    	        try {
    	            WomanDhuhrSelected WomanDhuhrSelectedWindow = new WomanDhuhrSelected();
    	            WomanDhuhrSelectedWindow.getWomanDhuhrSelectedFrame().setVisible(true);
    	        } catch (Exception e) {
    	            e.printStackTrace();
    	        }
    	    });
        }
        private void openWomanAsrSelectedPage() {
    	    // Close the current frame
        	womanPrayerFrame.dispose();

    	    // Open the FajrSelected page
    	    EventQueue.invokeLater(() -> {
    	        try {
    	            WomanAsrSelected WomanAsrSelectedWindow = new WomanAsrSelected();
    	            WomanAsrSelectedWindow.getWomanAsrSelectedFrame().setVisible(true);
    	        } catch (Exception e) {
    	            e.printStackTrace();
    	        }
    	    });
        }
        private void openWomanMaghribSelectedPage() {
    	    // Close the current frame
        	womanPrayerFrame.dispose();

    	    // Open the FajrSelected page
    	    EventQueue.invokeLater(() -> {
    	        try {
    	            WomanMaghribSelected WomanMaghribSelectedWindow = new WomanMaghribSelected();
    	            WomanMaghribSelectedWindow.getWomanMaghribSelectedFrame().setVisible(true);
    	        } catch (Exception e) {
    	            e.printStackTrace();
    	        }
    	    });
        }
        private void openWomanIshaSelectedPage() {
    	    // Close the current frame
        	womanPrayerFrame.dispose();

    	    // Open the FajrSelected page
    	    EventQueue.invokeLater(() -> {
    	        try {
    	            WomanIshaSelected WomanIshaSelectedWindow = new WomanIshaSelected();
    	            WomanIshaSelectedWindow.getWomanIshaSelectedFrame().setVisible(true);
    	        } catch (Exception e) {
    	            e.printStackTrace();
    	        }
    	    });
        }
	
	}
