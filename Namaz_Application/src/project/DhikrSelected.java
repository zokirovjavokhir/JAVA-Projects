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

public class DhikrSelected {

	private JFrame DhikrSelectedFrame;
	private JLabel prayerSelectedPictureLbl;
	private JButton tasbeehBtn;
	private JButton salavatBtn;
	private JButton shahadaBtn;
	private JButton adhanBtn;
	private JButton iqamahBtn;
	private JButton goBackBtn;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DhikrSelected window = new DhikrSelected();
					window.DhikrSelectedFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public DhikrSelected() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	//below this code i have every component, i will be commenting them briefly
	//all this code down below is for gui
	private void initialize() {
		DhikrSelectedFrame = new JFrame();
		DhikrSelectedFrame.getContentPane().setBackground(new Color(0xA9C7AC));
		DhikrSelectedFrame.setBounds(100, 100, 600, 600);
		DhikrSelectedFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		DhikrSelectedFrame.setTitle("Namaz Application");
		DhikrSelectedFrame.getContentPane().setLayout(null);
		
		prayerSelectedPictureLbl = new JLabel("");
		prayerSelectedPictureLbl.setIcon(new ImageIcon(PrayerSelected.class.getResource("/project/wudu/360_F_327494106_Xc4crNChvNzceySBzEDTHnouaRdfj0B6.jpg")));
		prayerSelectedPictureLbl.setHorizontalAlignment(SwingConstants.CENTER);
		prayerSelectedPictureLbl.setBounds(150, 25, 290, 236);
		DhikrSelectedFrame.getContentPane().add(prayerSelectedPictureLbl);
		
		tasbeehBtn = new JButton("Tasbeeh");
		tasbeehBtn.setFont(new Font("Arial", Font.BOLD, 15));
		tasbeehBtn.setBounds(230, 282, 130, 40);
		DhikrSelectedFrame.getContentPane().add(tasbeehBtn);
		
		//when user mouse is on top of the button it's gonna change it's border color
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
                openTasbeehSelectedPage();
            }
        });
		

		salavatBtn = new JButton("Salavat");
		salavatBtn.setFont(new Font("Arial", Font.BOLD, 15));
		salavatBtn.setBounds(230, 334, 130, 40);
		DhikrSelectedFrame.getContentPane().add(salavatBtn);
		
		//when user mouse is on top of the button it's gonna change it's border color
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
                openSalavatSelectedPage();
            }
        });
		
		
		shahadaBtn = new JButton("Shahada");
		shahadaBtn.setFont(new Font("Arial", Font.BOLD, 15));
		shahadaBtn.setBounds(230, 386, 130, 40);
		DhikrSelectedFrame.getContentPane().add(shahadaBtn);
		
		//when user mouse is on top of the button it's gonna change it's border color
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
                openShahadaSelectedPage();
            }
        });
		
		
		adhanBtn = new JButton("Adhan");
		adhanBtn.setFont(new Font("Arial", Font.BOLD, 15));
		adhanBtn.setBounds(230, 438, 130, 40);
		DhikrSelectedFrame.getContentPane().add(adhanBtn);
		
		//when user mouse is on top of the button it's gonna change it's border color
		adhanBtn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
            	adhanBtn.setContentAreaFilled(true);
            	adhanBtn.setBackground(new Color(0x315245)); // Green color using hex code
            }

            @Override
            public void mouseExited(MouseEvent e) {
            	adhanBtn.setContentAreaFilled(false); // Reset to default color
            }
        });
		adhanBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                openAdhanSelectedPage();
            }
        });
		
		
		iqamahBtn = new JButton("Iqamah");
		iqamahBtn.setFont(new Font("Arial", Font.BOLD, 15));
		iqamahBtn.setBounds(230, 490, 130, 40);
		DhikrSelectedFrame.getContentPane().add(iqamahBtn);
		
		//when user mouse is on top of the button it's gonna change it's border color
		iqamahBtn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
            	iqamahBtn.setContentAreaFilled(true);
            	iqamahBtn.setBackground(new Color(0x315245)); // Green color using hex code
            }

            @Override
            public void mouseExited(MouseEvent e) {
            	iqamahBtn.setContentAreaFilled(false); // Reset to default color
            }
        });
		iqamahBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                openIqamahSelectedPage();
            }
        });
		
		
		goBackBtn = new JButton("Go Back");
		goBackBtn.setFont(new Font("Arial", Font.BOLD, 15));
		goBackBtn.setBounds(6, 526, 130, 40);
		DhikrSelectedFrame.getContentPane().add(goBackBtn);
		
		//when user mouse is on top of the button it's gonna change it's border color
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
	            goBackToManSelectedPage();
	        }
	    });
	}
	public JFrame getDhikrSelectedFrame() {
        return DhikrSelectedFrame;
    }
	private void goBackToManSelectedPage() {
        // Close the current frame
        DhikrSelectedFrame.dispose();

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
	
	private void openTasbeehSelectedPage() {
	    // Closes the current frame
	    DhikrSelectedFrame.dispose();

	    // Open the TasbeehSelected page
	    EventQueue.invokeLater(() -> {
	        try {
	            TasbeehSelected TasbeehSelectedWindow = new TasbeehSelected();
	            TasbeehSelectedWindow.getTasbeehSelectedFrame().setVisible(true);
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    });
	}
	private void openSalavatSelectedPage() {
	    // Close the current frame
	    DhikrSelectedFrame.dispose();

	    // Open the SalavatSelected page
	    EventQueue.invokeLater(() -> {
	        try {
	        	SalavatSelected SalavatSelectedWindow = new SalavatSelected();
	        	SalavatSelectedWindow.getSalavatSelectedFrame().setVisible(true);
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    });
	}
	private void openShahadaSelectedPage() {
	    // Close the current frame
	    DhikrSelectedFrame.dispose();

	    // Open the ShahadaSelected page
	    EventQueue.invokeLater(() -> {
	        try {
	        	ShahadaSelected ShahadaSelectedWindow = new ShahadaSelected();
	        	ShahadaSelectedWindow.getShahadaSelectedFrame().setVisible(true);
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    });
	}
	private void openAdhanSelectedPage() {
	    // Close the current frame
	    DhikrSelectedFrame.dispose();

	    // Open the AdhanSelected page
	    EventQueue.invokeLater(() -> {
	        try {
	        	AdhanSelected AdhanSelectedWindow = new AdhanSelected();
	        	AdhanSelectedWindow.getAdhanSelectedFrame().setVisible(true);
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    });
	}
	private void openIqamahSelectedPage() {
	    // Close the current frame
	    DhikrSelectedFrame.dispose();

	    // Open the IqamahSelected page
	    EventQueue.invokeLater(() -> {
	        try {
	        	IqamahSelected IqamahSelectedWindow = new IqamahSelected();
	        	IqamahSelectedWindow.getIqamahSelectedFrame().setVisible(true);
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    });
	}
}
