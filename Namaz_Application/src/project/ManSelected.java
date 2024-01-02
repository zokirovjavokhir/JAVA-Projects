package project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ManSelected {

	private JFrame manFrame;
	private JLabel picLogoManSelected;
	private JButton wuduBtn;
	private JButton prayerBtn;
	private JButton nameBtn;
	private JButton dhikrBtn;
	private JButton goBackBtnMain;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ManSelected window = new ManSelected();
					window.manFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	
	//below code is only for the gui
	public ManSelected() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		manFrame = new JFrame();
		manFrame.getContentPane().setBackground(new Color(0xA9C7AC));
		manFrame.setBounds(100, 100, 600, 600);
		manFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		manFrame.setTitle("Namaz Application");
		manFrame.getContentPane().setLayout(null);
		
		picLogoManSelected = new JLabel("");
		picLogoManSelected.setHorizontalAlignment(SwingConstants.CENTER);
		picLogoManSelected.setIcon(new ImageIcon(ManSelected.class.getResource("/project/wudu/360_F_327494106_Xc4crNChvNzceySBzEDTHnouaRdfj0B6.jpg")));
		picLogoManSelected.setBounds(150, 25, 290, 236);
		manFrame.getContentPane().add(picLogoManSelected);
		
		wuduBtn = new JButton("Wudu");
		wuduBtn.setFont(new Font("Arial", Font.BOLD, 15));
		wuduBtn.setBounds(231, 285, 130, 40);
		manFrame.getContentPane().add(wuduBtn);
		
		//when the user mouse is on top its gonna change border color
		wuduBtn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
            	wuduBtn.setContentAreaFilled(true);
            	wuduBtn.setBackground(new Color(0x315245)); // Green color using hex code
            }

            @Override
            public void mouseExited(MouseEvent e) {
            	wuduBtn.setContentAreaFilled(false); // Reset to default color
            }
        });
		wuduBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                openWuduSelectedPage();
            }
        });
		
		prayerBtn = new JButton("5 Prayers");
		prayerBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				openPrayerSelectedPage();
			}
		});
		prayerBtn.setFont(new Font("Arial", Font.BOLD, 15));
		prayerBtn.setBounds(231, 337, 130, 40);
		manFrame.getContentPane().add(prayerBtn);
		
		//when the user mouse is on top its gonna change border color
		prayerBtn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
            	prayerBtn.setContentAreaFilled(true);
            	prayerBtn.setBackground(new Color(0x315245)); // Green color using hex code
            }

            @Override
            public void mouseExited(MouseEvent e) {
            	prayerBtn.setContentAreaFilled(false); // Reset to default color
            }
        });
		
		nameBtn = new JButton("99 Names");
		nameBtn.setFont(new Font("Arial", Font.BOLD, 15));
		nameBtn.setBounds(231, 389, 130, 40);
		manFrame.getContentPane().add(nameBtn);
		
		//when the user mouse is on top its gonna change border color
		nameBtn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
            	nameBtn.setContentAreaFilled(true);
            	nameBtn.setBackground(new Color(0x315245)); // Green color using hex code
            }

            @Override
            public void mouseExited(MouseEvent e) {
            	nameBtn.setContentAreaFilled(false); // Reset to default color
            }
        });
		nameBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				openNamesSelectedPage();
			}
		});
		
		dhikrBtn = new JButton("Dhikr");
		dhikrBtn.setFont(new Font("Arial", Font.BOLD, 15));
		dhikrBtn.setBounds(231, 441, 130, 40);
		manFrame.getContentPane().add(dhikrBtn);
		
		//when the user mouse is on top its gonna change border color
		dhikrBtn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
            	dhikrBtn.setContentAreaFilled(true);
            	dhikrBtn.setBackground(new Color(0x315245)); // Green color using hex code
            }

            @Override
            public void mouseExited(MouseEvent e) {
            	dhikrBtn.setContentAreaFilled(false); // Reset to default color
            }
        });
		dhikrBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				openDhikrSelectedPage();
			}
		});
		
		goBackBtnMain = new JButton("Go Back");
		goBackBtnMain.setFont(new Font("Arial", Font.BOLD, 15));
		goBackBtnMain.setBounds(40, 500, 130, 40);
		manFrame.getContentPane().add(goBackBtnMain);
		
		//when the user mouse is on top its gonna change border color
		goBackBtnMain.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
            	goBackBtnMain.setContentAreaFilled(true);
            	goBackBtnMain.setBackground(new Color(0x315245)); // Green color using hex code
            }

            @Override
            public void mouseExited(MouseEvent e) {
            	goBackBtnMain.setContentAreaFilled(false); // Reset to default color
            }
        });
		
		goBackBtnMain.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                goBackToMainPage();
            }
        });
		
		
    }

    public JFrame getManFrame() {
        return manFrame;
    }

    
    //below code is for opening windows when button are pressed
    private void goBackToMainPage() {
        manFrame.dispose(); // Close the current frame
        EventQueue.invokeLater(() -> {
            try {
                Main window = new Main();
                window.mainFrame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }
        private void openWuduSelectedPage() {
            // Close the current frame
            manFrame.dispose();
            
            // Open the WuduSelected page
            EventQueue.invokeLater(() -> {
                try {
                    WuduSelected wuduSelectedWindow = new WuduSelected();
                    wuduSelectedWindow.getWuduFrame().setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            });
        }	
        
        private void openPrayerSelectedPage() {
            // Close the current frame
            manFrame.dispose();
            
            // Open the WuduSelected page
            EventQueue.invokeLater(() -> {
                try {
                    PrayerSelected prayerSelectedWindow = new PrayerSelected();
                    prayerSelectedWindow.getPrayerSelectedFrame().setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            });
        }
        private void openNamesSelectedPage() {
            // Close the current frame
            manFrame.dispose();
            
            // Open the WuduSelected page
            EventQueue.invokeLater(() -> {
                try {
                    NamesSelected NamesSelectedWindow = new NamesSelected();
                    NamesSelectedWindow.getnamesSelectedFrame().setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            });
        }
        private void openDhikrSelectedPage() {
            // Close the current frame
            manFrame.dispose();
            
            // Open the WuduSelected page
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