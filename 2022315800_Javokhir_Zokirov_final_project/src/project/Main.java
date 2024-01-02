package project;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;
import java.awt.Color;

public class Main {

    //private JFrame frame;
    JFrame mainFrame;
    private JLabel picLogoMain;
    private JButton manBtn;
    private JButton womanBtn;
    private JButton aboutBtn;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Main window = new Main();
                    window.mainFrame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public Main() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    
    //this is the main part of the program. you should run this file to start from the beginning
    private void initialize() {
        //frame = new JFrame();
        mainFrame = new JFrame();
        mainFrame.getContentPane().setBackground(new Color(0xA9C7AC));
        mainFrame.setBounds(100, 100, 600, 600);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setTitle("Namaz Application");
        mainFrame.getContentPane().setLayout(null);
        
        picLogoMain = new JLabel("");
        picLogoMain.setHorizontalAlignment(SwingConstants.CENTER);
        picLogoMain.setIcon(new ImageIcon(Main.class.getResource("/project/wudu/360_F_327494106_Xc4crNChvNzceySBzEDTHnouaRdfj0B6.jpg")));
        picLogoMain.setBounds(150, 25, 290, 236);
        mainFrame.getContentPane().add(picLogoMain);
        
        manBtn = new JButton("<html>\n<p>\n\tMan\n</p>\n<html>");
        manBtn.setFont(new Font("Arial", Font.BOLD, 15));
        manBtn.setBounds(228, 324, 130, 40);
        mainFrame.getContentPane().add(manBtn);
        
      //when the user mouse is on top its gonna change border color
        manBtn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
            	manBtn.setContentAreaFilled(true);
                manBtn.setBackground(new Color(0x315245)); // Green color using hex code
            }

            @Override
            public void mouseExited(MouseEvent e) {
            	manBtn.setContentAreaFilled(false); // Reset to default color
            }
        });
        
        womanBtn = new JButton("Woman");
        womanBtn.setFont(new Font("Arial", Font.BOLD, 15));
        womanBtn.setBounds(228, 376, 130, 40);
        mainFrame.getContentPane().add(womanBtn);  
        
      //when the user mouse is on top its gonna change border color
        womanBtn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
            	womanBtn.setContentAreaFilled(true);
            	womanBtn.setBackground(new Color(0x315245)); // Green color using hex code
            }

            @Override
            public void mouseExited(MouseEvent e) {
            	womanBtn.setContentAreaFilled(false); // Reset to default color
            }
        });
        
        aboutBtn = new JButton("About Us");
        aboutBtn.setFont(new Font("Arial", Font.BOLD, 15));
        aboutBtn.setBounds(228, 428, 130, 40);
        mainFrame.getContentPane().add(aboutBtn);

      //when the user mouse is on top its gonna change border color
        aboutBtn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
            	aboutBtn.setContentAreaFilled(true);
            	aboutBtn.setBackground(new Color(0x315245)); // Green color using hex code
            }

            @Override
            public void mouseExited(MouseEvent e) {
            	aboutBtn.setContentAreaFilled(false); // Reset to default color
            }
        });
        mainFrame.setVisible(true);
        manBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                showManSelectedPage();
            }
        });
        womanBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                showWomanSelectedPage();
            }
        });
        aboutBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                showAboutSelectedPage();
            }
        });

    }
    
    //below code is for opening windows when buttons are pressed
    private void showManSelectedPage() {
    	mainFrame.dispose();
        EventQueue.invokeLater(() -> {
            try {
                ManSelected window = new ManSelected();
                window.getManFrame().setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }
        private void showWomanSelectedPage() {
        	mainFrame.dispose();
            EventQueue.invokeLater(() -> {
                try {
                    WomanSelected window = new WomanSelected();
                    window.getWomanFrame().setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            });
    }
        private void showAboutSelectedPage() {
        	mainFrame.dispose();
            EventQueue.invokeLater(() -> {
                try {
                	ApplicationSelected window = new ApplicationSelected();
                    window.ApplicationSelectedFrame().setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            });
    }
}

