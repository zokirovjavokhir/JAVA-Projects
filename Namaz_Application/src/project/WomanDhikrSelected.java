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

public class WomanDhikrSelected {

	private JFrame WomanDhikrSelectedFrame;
	private JLabel prayerSelectedPictureLbl;
	private JButton tasbeehBtn;
	private JButton salavatBtn;
	private JButton shahadaBtn;
	private JButton goBackBtn;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WomanDhikrSelected window = new WomanDhikrSelected();
					window.WomanDhikrSelectedFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public WomanDhikrSelected() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		WomanDhikrSelectedFrame = new JFrame();
		WomanDhikrSelectedFrame.getContentPane().setBackground(new Color(0xA9C7AC));
		WomanDhikrSelectedFrame.setBounds(100, 100, 600, 600);
		WomanDhikrSelectedFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		WomanDhikrSelectedFrame.setTitle("Namaz Application");
		WomanDhikrSelectedFrame.getContentPane().setLayout(null);
		
		prayerSelectedPictureLbl = new JLabel("");
		prayerSelectedPictureLbl.setIcon(new ImageIcon(PrayerSelected.class.getResource("/project/wudu/360_F_327494106_Xc4crNChvNzceySBzEDTHnouaRdfj0B6.jpg")));
		prayerSelectedPictureLbl.setHorizontalAlignment(SwingConstants.CENTER);
		prayerSelectedPictureLbl.setBounds(150, 25, 290, 236);
		WomanDhikrSelectedFrame.getContentPane().add(prayerSelectedPictureLbl);
		
		tasbeehBtn = new JButton("Tasbeeh");
		tasbeehBtn.setFont(new Font("Arial", Font.BOLD, 15));
		tasbeehBtn.setBounds(230, 282, 130, 40);
		WomanDhikrSelectedFrame.getContentPane().add(tasbeehBtn);
		
		//when user's mouse is on top its gonna change its border color
		tasbeehBtn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
            	tasbeehBtn.setContentAreaFilled(true);
            	tasbeehBtn.setBackground(new Color(0x315245)); // Green color using hex code
            }

            @Override
            public void mouseExited(MouseEvent e) {
            	tasbeehBtn.setContentAreaFilled(false); // Reset to default color
            }
        });
		tasbeehBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                openWomanTasbeehSelectedPage();
            }
        });
		

		salavatBtn = new JButton("Salavat");
		salavatBtn.setFont(new Font("Arial", Font.BOLD, 15));
		salavatBtn.setBounds(230, 334, 130, 40);
		WomanDhikrSelectedFrame.getContentPane().add(salavatBtn);
		
		//when user's mouse is on top its gonna change its border color
		salavatBtn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
            	salavatBtn.setContentAreaFilled(true);
            	salavatBtn.setBackground(new Color(0x315245)); // Green color using hex code
            }

            @Override
            public void mouseExited(MouseEvent e) {
            	salavatBtn.setContentAreaFilled(false); // Reset to default color
            }
        });
		salavatBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                openWomanSalavatSelectedPage();
            }
        });
		
		
		shahadaBtn = new JButton("Shahada");
		shahadaBtn.setFont(new Font("Arial", Font.BOLD, 15));
		shahadaBtn.setBounds(230, 386, 130, 40);
		WomanDhikrSelectedFrame.getContentPane().add(shahadaBtn);
		
		//when user's mouse is on top its gonna change its border color
		shahadaBtn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
            	shahadaBtn.setContentAreaFilled(true);
            	shahadaBtn.setBackground(new Color(0x315245)); // Green color using hex code
            }

            @Override
            public void mouseExited(MouseEvent e) {
            	shahadaBtn.setContentAreaFilled(false); // Reset to default color
            }
        });
		shahadaBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                openWomanShahadaSelectedPage();
            }
        });
		
		
		goBackBtn = new JButton("Go Back");
		goBackBtn.setFont(new Font("Arial", Font.BOLD, 15));
		goBackBtn.setBounds(6, 526, 130, 40);
		WomanDhikrSelectedFrame.getContentPane().add(goBackBtn);
		
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
		goBackBtn.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	            goBackToWomanSelectedPage();
	        }
	    });
	}
	public JFrame getWomanDhikrSelectedFrame() {
        return WomanDhikrSelectedFrame;
    }
	private void goBackToWomanSelectedPage() {
        // Close the current frame
    	WomanDhikrSelectedFrame.dispose();

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
	
	private void openWomanTasbeehSelectedPage() {
	    // Close the current frame
		WomanDhikrSelectedFrame.dispose();

	    // Open the FajrSelected page
	    EventQueue.invokeLater(() -> {
	        try {
	        	WomanTasbeehSelected WomanTasbeehSelectedWindow = new WomanTasbeehSelected();
	        	WomanTasbeehSelectedWindow.getWomanTasbeehSelectedFrame().setVisible(true);
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    });
	}
	private void openWomanSalavatSelectedPage() {
	    // Close the current frame
		WomanDhikrSelectedFrame.dispose();

	    // Open the FajrSelected page
	    EventQueue.invokeLater(() -> {
	        try {
	        	WomanSalavatSelected WomanSalavatSelectedWindow = new WomanSalavatSelected();
	        	WomanSalavatSelectedWindow.getWomanSalavatSelectedFrame().setVisible(true);
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    });
	}
	private void openWomanShahadaSelectedPage() {
	    // Close the current frame
		WomanDhikrSelectedFrame.dispose();

	    // Open the FajrSelected page
	    EventQueue.invokeLater(() -> {
	        try {
	        	WomanShahadaSelected WomanShahadaSelectedWindow = new WomanShahadaSelected();
	        	WomanShahadaSelectedWindow.getWomanShahadaSelectedFrame().setVisible(true);
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    });
	}

}