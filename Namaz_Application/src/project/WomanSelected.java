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
	
	public class WomanSelected {
	
		private JFrame womanFrame;
		private JLabel picLogoManSelected;
		private JButton womanWuduBtn;
		private JButton womanPrayerBtn;
		private JButton womanNameBtn;
		private JButton womanDhikrBtn;
		private JButton goBackBtnMain;
		
		
	
		/**
		 * Launch the application.
		 */
		public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				
				public void run() {
					try {
						WomanSelected window = new WomanSelected();
						window.womanFrame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		}
	
		/**
		 * Create the application.
		 */
		public WomanSelected() {
			initialize();
		}
	
		/**
		 * Initialize the contents of the frame.
		 */
		private void initialize() {
			womanFrame = new JFrame();
			womanFrame.getContentPane().setBackground(new Color(0xA9C7AC));
			womanFrame.setBounds(100, 100, 600, 600);
			womanFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			womanFrame.setTitle("Namaz Application");
			womanFrame.getContentPane().setLayout(null);
			
			picLogoManSelected = new JLabel("");
			picLogoManSelected.setHorizontalAlignment(SwingConstants.CENTER);
			picLogoManSelected.setIcon(new ImageIcon(ManSelected.class.getResource("/project/wudu/360_F_327494106_Xc4crNChvNzceySBzEDTHnouaRdfj0B6.jpg")));
			picLogoManSelected.setBounds(150, 25, 290, 236);
			womanFrame.getContentPane().add(picLogoManSelected);
			
			womanWuduBtn = new JButton("Wudu");
			womanWuduBtn.addActionListener(new ActionListener() {
			    public void actionPerformed(ActionEvent e) {
			        openWomanWuduSelectedPage();
			    }
			});

			womanWuduBtn.setFont(new Font("Arial", Font.BOLD, 15));
			womanWuduBtn.setBounds(231, 285, 130, 40);
			womanFrame.getContentPane().add(womanWuduBtn);

			//when user's mouse is on top its gonna change its border color
			womanWuduBtn.addMouseListener(new MouseAdapter() {
	            @Override
	            public void mouseEntered(MouseEvent e) {
	            	womanWuduBtn.setContentAreaFilled(true);
	            	womanWuduBtn.setBackground(new Color(0x315245)); // Green color using hex code
	            }

	            @Override
	            public void mouseExited(MouseEvent e) {
	            	womanWuduBtn.setContentAreaFilled(false); // Reset to default color
	            }
	        });
			
			
			womanPrayerBtn = new JButton("5 Prayers");
			womanPrayerBtn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					openWomanPrayerSelectedPage();
				}
			});
			womanPrayerBtn.setFont(new Font("Arial", Font.BOLD, 15));
			womanPrayerBtn.setBounds(231, 337, 130, 40);
			womanFrame.getContentPane().add(womanPrayerBtn);
			
			//when user's mouse is on top its gonna change its border color
			womanPrayerBtn.addMouseListener(new MouseAdapter() {
	            @Override
	            public void mouseEntered(MouseEvent e) {
	            	womanPrayerBtn.setContentAreaFilled(true);
	            	womanPrayerBtn.setBackground(new Color(0x315245)); // Green color using hex code
	            }

	            @Override
	            public void mouseExited(MouseEvent e) {
	            	womanPrayerBtn.setContentAreaFilled(false); // Reset to default color
	            }
	        });
			
			womanNameBtn = new JButton("99 Names");
			womanNameBtn.setFont(new Font("Arial", Font.BOLD, 15));
			womanNameBtn.setBounds(231, 389, 130, 40);
			womanFrame.getContentPane().add(womanNameBtn);
			
			//when user's mouse is on top its gonna change its border color
			womanNameBtn.addMouseListener(new MouseAdapter() {
	            @Override
	            public void mouseEntered(MouseEvent e) {
	            	womanNameBtn.setContentAreaFilled(true);
	            	womanNameBtn.setBackground(new Color(0x315245)); // Green color using hex code
	            }

	            @Override
	            public void mouseExited(MouseEvent e) {
	            	womanNameBtn.setContentAreaFilled(false); // Reset to default color
	            }
	        });
			womanNameBtn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					openWomanNamesSelectedPage();
				}
			});
			
			womanDhikrBtn = new JButton("Dhikr");
			womanDhikrBtn.setFont(new Font("Arial", Font.BOLD, 15));
			womanDhikrBtn.setBounds(231, 441, 130, 40);
			womanFrame.getContentPane().add(womanDhikrBtn);
			
			//when user's mouse is on top its gonna change its border color
			womanDhikrBtn.addMouseListener(new MouseAdapter() {
	            @Override
	            public void mouseEntered(MouseEvent e) {
	            	womanDhikrBtn.setContentAreaFilled(true);
	            	womanDhikrBtn.setBackground(new Color(0x315245)); // Green color using hex code
	            }

	            @Override
	            public void mouseExited(MouseEvent e) {
	            	womanDhikrBtn.setContentAreaFilled(false); // Reset to default color
	            }
	        });
			womanDhikrBtn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					openWomanDhikrSelectedPage();
				}
			});
			
			
			goBackBtnMain = new JButton("Go Back");
			goBackBtnMain.setFont(new Font("Arial", Font.BOLD, 15));
			goBackBtnMain.setBounds(40, 500, 130, 40);
			womanFrame.getContentPane().add(goBackBtnMain);
			
			//when user's mouse is on top its gonna change its border color
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
			// Add this method to get the JFrame object
			public JFrame getWomanFrame() {
			    return womanFrame;
			}
			
			//the code below is for switching between windows
			private void goBackToMainPage() {
			    womanFrame.dispose(); // Close the current frame
			    EventQueue.invokeLater(() -> {
			        try {
			            Main window = new Main();
			            window.mainFrame.setVisible(true);
			        } catch (Exception e) {
			            e.printStackTrace();
			        }
			    });
			}
			private void openWomanWuduSelectedPage() {
			    
				womanFrame.dispose();
				
			    EventQueue.invokeLater(() -> {
			        try {
			            WomanWuduSelected window = new WomanWuduSelected();
			            window.getWomanWuduFrame().setVisible(true);
			        } catch (Exception e) {
			            e.printStackTrace();
			        }
			    });
			}
			private void openWomanPrayerSelectedPage() {
			    womanFrame.dispose();

			    EventQueue.invokeLater(() -> {
			        try {
			            WomanPrayerSelected womanPrayerWindow = new WomanPrayerSelected();
			            womanPrayerWindow.getWomanPrayerSelectedFrame().setVisible(true);
			        } catch (Exception e) {
			            e.printStackTrace();
			        }
			    });   
			}	
			private void openWomanNamesSelectedPage() {
	            // Close the current frame
	            womanFrame.dispose();
	            
	            // Open the WuduSelected page
	            EventQueue.invokeLater(() -> {
	                try {
	                    WomanNamesSelected WomanNamesSelectedWindow = new WomanNamesSelected();
	                    WomanNamesSelectedWindow.getWomanNamesSelectedFrame().setVisible(true);
	                } catch (Exception e) {
	                    e.printStackTrace();
	                }
	            });
			}
			private void openWomanDhikrSelectedPage() {
	            // Close the current frame
	            womanFrame.dispose();
	            
	            // Open the WuduSelected page
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