package project;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NamesSelected{

    private JFrame namesSelectedFrame;
    private JTable namesTable;
    private JButton goBackBtn;
    

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                try {
                    NamesSelected window = new NamesSelected();
                    window.namesSelectedFrame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public NamesSelected() {
        initialize();
        initializeNamesTable();
    }

    /**
     * Initialize the contents of the frame.
     */
    
    //below code is for the gui only
    private void initialize() {
    	namesSelectedFrame = new JFrame();
        namesSelectedFrame.setBounds(100, 100, 600, 600);
        namesSelectedFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        namesSelectedFrame.getContentPane().setLayout(null);
        namesSelectedFrame.setTitle("Namaz Application");
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(1, 5, 599, 520);
        namesSelectedFrame.getContentPane().add(scrollPane);
        namesTable = new JTable();
        namesTable.setEnabled(false);
        namesTable.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        namesTable.setShowHorizontalLines(true);
        namesTable.setGridColor(Color.BLACK);
        scrollPane.setViewportView(namesTable);
        namesTable.setRowHeight(30);
        namesTable.setPreferredScrollableViewportSize(new Dimension(580, 500));
        namesTable.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 10, 0, 10));
        
        goBackBtn = new JButton("Go Back");
        goBackBtn.setFont(new Font("Arial", Font.BOLD, 14));
        goBackBtn.setBounds(1, 537, 117, 29);
        namesSelectedFrame.getContentPane().add(goBackBtn);
        goBackBtn.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	            goBackToManSelectedPage();
	        }
	    });
    }
        
    
    
    

    private void initializeNamesTable() {
        // Column names
        String[] columnNames = {"#", "Name", "Translation", "Meaning"};

        // Data
        Object[][] data = {
        		{1, "ٱلْرَّحْمَـانُ", "AR-RAHMAAN", "The Most or Entirely Merciful"},
                {2, "ٱلْرَّحِيْمُ", "AR-RAHEEM", "The Bestower of Mercy"},
                {3, "ٱلْمَلِكُ", "AL-MALIK", "The King and Owner of Dominion"},
                {4, "ٱلْقُدُّوسُ", "AL-QUDDUS", "The Absolutely Pure"},
                {5, "ٱلْسَّلَامُ", "AS-SALAM", "The Perfection and Giver of Peace"},
                {6, "ٱلْمُؤْمِنُ", "AL-MU’MIN", "The One Who gives Emaan and Security"},
                {7, "ٱلْمُهَيْمِنُ", "AL-MUHAYMIN", "The Guardian, The Witness, The Overseer"},
                {8, "ٱلْعَزِيزُ", "AL-AZEEZ", "The All Mighty"},
                {9, "ٱلْجَبَّارُ", "AL-JABBAR", "The Compeller, The Restorer"},
                {10, "ٱلْمُتَكَبِّرُ", "AL-MUTAKABBIR", "The Supreme, The Majestic"},
                {11, "ٱلْخَالِقُ", "AL-KHAALIQ", "The Creator, The Maker"},
                {12, "ٱلْبَارِئُ", "AL-BAARI’", "The Originator"},
                {13, "ٱلْمُصَوِّرُ", "AL-MUSAWWIR", "The Fashioner"},
                {14, "ٱلْغَفَّارُ", "AL-GHAFFAR", "The All- and Oft-Forgiving"},
                {15, "ٱلْقَهَّارُ", "AL-QAHHAR", "The Subduer, The Dominant"},
                {16, "ٱلْوَهَّابُ", "AL-WAHHAAB", "The Bestower"},
                {17, "ٱلْرَّزَّاقُ", "AR-RAZZAAQ", "The Provider"},
                {18, "ٱلْفَتَّاحُ", "AL-FATTAH", "The Opener, The Victory Giver"},
                {19, "ٱلْعَلِيمُ", "AL-‘ALEEM", "The All-Knowing, The Omniscient"},
                {20, "ٱلْقَابِضُ", "AL-QAABID", "The Restrainer, The Withholder"},
                {21, "ٱلْبَاسِطُ", "AL-BAASIT", "The Extender, The Expander"},
                {22, "ٱلْخَافِضُ", "AL-KHAAFID", "The Abaser"},
                {23, "ٱلْرَّافِعُ", "AR-RAAFI‘", "The Exalter, The Elevator"},
                {24, "ٱلْمُعِزُّ", "AL-MU‘IZZ", "The Bestower of Honor"},
                {25, "ٱلْمُذِلُّ", "AL-MUZIL", "The Dishonorer, The Humiliator"},
                {26, "ٱلْسَّمِيعُ", "AS-SAMEE‘", "The All-Hearing"},
                {27, "ٱلْبَصِيرُ", "AL-BASEER", "The All-Seeing"},
                {28, "ٱلْحَكَمُ", "AL-HAKAM", "The Judge, The Giver of Justice"},
                {29, "ٱلْعَدْلُ", "AL-‘ADL", "The Just, The Equitable"},
                {30, "ٱلْلَّطِيفُ", "AL-LATEEF", "The Gentle, The Subtly Kind"},
                {31, "ٱلْخَبِيرُ", "AL-KHABEER", "The All-Aware"},
                {32, "ٱلْحَلِيمُ", "AL-HALEEM", "The Forbearing, The Clement"},
                {33, "ٱلْعَظِيمُ", "AL-‘ATHEEM", "The Magnificent"},
                {34, "ٱلْغَفُورُ", "AL-GHAFOOR", "The Forgiver and Hider of Faults"},
                {35, "ٱلْشَّكُورُ", "ASH-SHAKOOR", "The Rewarder of Thankfulness"},
                {36, "ٱلْعَلِيُّ", "AL-‘ALIYY", "The Highest, The Sublime"},
                {37, "ٱلْكَبِيرُ", "AL-KABEER", "The Great"},
                {38, "ٱلْحَفِيظُ", "AL-HAFEEDH", "The Guardian, The Preserver"},
                {39, "ٱلْمُقِيتُ", "AL-MUQEET", "The Sustainer"},
                {40, "ٱلْحَسِيبُ", "AL-HASEEB", "The Reckoner, The Sufficient"},
                {41, "ٱلْجَلِيلُ", "AL-JALEEL", "The Majestic"},
                {42, "ٱلْكَرِيمُ", "AL-KAREEM", "The Generous"},
                {43, "ٱلْرَّقِيبُ", "AR-RAQEEB", "The Watchful"},
                {44, "ٱلْمُجِيبُ", "AL-MUJEEB", "The Responder to Prayer"},
                {45, "ٱلْوَاسِعُ", "AL-WAASI‘", "The All-Comprehending"},
                {46, "ٱلْحَكِيمُ", "AL-HAKEEM", "The All-Wise"},
                {47, "ٱلْوَدُودُ", "AL-WADOOD", "The Loving"},
                {48, "ٱلْمَجِيدُ", "AL-MAJEED", "The Glorious"},
                {49, "ٱلْبَاعِثُ", "AL-BA‘ITH", "The Resurrector"},
                {50, "ٱلْشَّهِيدُ", "ASH-SHAHEED", "The Witness"},
                {51, "ٱلْحَقُّ", "AL-HAQQ", "The Truth"},
                {52, "ٱلْوَكِيلُ", "AL-WAKEEL", "The Trustee"},
                {53, "ٱلْقَوِيُّ", "AL-QAWIYY", "The Possessor of All Strength"},
                {54, "ٱلْمَتِينُ", "AL-MATIN", "The Firm"},
                {55, "ٱلْوَلِيُّ", "AL-WALIYY", "The Protecting Friend, Patron, and Supporter"},
                {56, "ٱلْحَمِيدُ", "AL-HAMEED", "The Praiseworthy"},
                {57, "ٱلْمُحْصِيُ", "AL-MUHSEE", "The All-Enumerating"},
                {58, "ٱلْمُبْدِئُ", "AL-MUBDI‘", "The Originator"},
                {59, "ٱلْمُعِيدُ", "AL-MUEED", "The Restorer"},
                {60, "ٱلْمُحْيِي", "AL-MUHYI", "The Giver of Life"},
                {61, "ٱلْمُمِيتُ", "AL-MUMEET", "The Taker of Life"},
                {62, "ٱلْحَيُّ", "AL-HAYY", "The Ever-Living"},
                {63, "ٱلْقَيُّومُ", "AL-QAYYOOM", "The Sustainer of Existence"},
                {64, "ٱلْوَاجِدُ", "AL-WAAJID", "The Perceiver"},
                {65, "ٱلْمَاجِدُ", "AL-MAAJID", "The Illustrious"},
                {66, "ٱلْوَاحِدُ", "AL-WAAHID", "The One"},
                {67, "ٱلْأَحَدُ", "AL-AHAD", "The Unique"},
                {68, "ٱلْصَّمَدُ", "AS-SAMAD", "The Eternal, The Absolute"},
                {69, "ٱلْقَادِرُ", "AL-QADIR", "The All-Capable, The All-Powerful"},
                {70, "ٱلْمُقْتَدِرُ", "AL-MUQTADIR", "The All-Determiner, The Dominant"},
                {71, "ٱلْمُقَدِّمُ", "AL-MUQADDIM", "The Expediter, The Promoter"},
                {72, "ٱلْمُؤَخِّرُ", "AL-MU’AKHKHIR", "The Delayer, The Retarder"},
                {73, "ٱلْأَوَّلُ", "AL-AWWAL", "The First"},
                {74, "ٱلْآخِرُ", "AL-AAKHIR", "The Last"},
                {75, "ٱلْظَّاهِرُ", "AZ-ZAAHIR", "The Manifest"},
                {76, "ٱلْبَاطِنُ", "AL-BAATIN", "The Hidden"},
                {77, "ٱلْوَالِي", "AL-WAALI", "The Governor, The Patron"},
                {78, "ٱلْمُتَعَالِي", "AL-MUTA‘ALI", "The Self-Exalted"},
                {79, "ٱلْبَرُّ", "AL-BARR", "The Most Kind and Righteous"},
                {80, "ٱلْتَّوَّابُ", "AT-TAWWAB", "The Ever-Returning, Ever-Relenting"},
                {81, "ٱلْمُنتَقِمُ", "AL-MUNTAQIM", "The Avenger"},
                {82, "ٱلْعَفُوُّ", "AL-‘AFUWW", "The Pardoner, The Effacer of Sins"},
                {83, "ٱلْرَّءُوفُ", "AR-RA’OOF", "The Compassionate, The All-Pitying"},
                {84, "ٱلْمَالِكُ", "MAALIK-UL-MULK", "Master of the Kingdom, Owner of the Dominion"},
                {85, "ذُوالْجَلاَلِ وَالإكْرَامِ", "DHUL-JALAALI WAL-IKRAAM", "Lord of Glory and Honour, Lord of Majesty and Generosity"},
                {86, "الْمُقْسِطُُ", "AL-MUQSIT", "The Just One"},
                {87, "الْجَامِعُ", "AL-JAAMI’", "The Gatherer, the Uniter"},
                {88, "ٱلْغَنيُّ", "AL-GHANIYY’", "The Self-Sufficient, The Wealthy"},
                {89, "ٱلْمُغْنِيُّ", "AL-MUGHNI", "The Enricher"},
                {90, "اَلْمَانِعُ", "AL-MANI’", "The Withholder"},
                {91, "الضَّارَ", "AD-DHARR", "The Distresser"},
                {92, "النَّافِعُ", "AN-NAFI’", "The Propitious, the Benefactor"},
                {93, "النُّورُ", "AN-NUR", "The Light, The Illuminator"},
                {94, "الْهَادِي", "AL-HAADI", "The Guide"},
                {95, "الْبَدِيعُ", "AL-BADEE’", "The Incomparable Originator"},
                {96, "اَلْبَاقِي", "AL-BAAQI", "The Everlasting"},
                {97, "الْوَارِثُ", "AL-WAARITH", "The Inheritor, The Heir"},
                {98, "الرَّشِيدُ", "AR-RASHEED", "The Guide, Infallible Teacher"},
                {99, "الصَّبُورُ", "AS-SABOOR", "The Forbearing, The Patient"} };  
        	
        
        DefaultTableModel model = new DefaultTableModel(data, columnNames);

        // Set the model to the JTable
        namesTable.setModel(model);

        // Set the background color for odd rows to gray
        namesTable.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
            private static final long serialVersionUID = 1L;

			@Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                Component component = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

                // Check if the row is odd
                if (row % 2 == 0) {
                    component.setBackground(Color.LIGHT_GRAY);
                } else {
                    // Reset the background color for even rows
                    component.setBackground(table.getBackground());
                }

                return component;
            }
        });
       
        namesTable.getColumnModel().getColumn(0).setPreferredWidth(10);  // #
        namesTable.getColumnModel().getColumn(1).setPreferredWidth(50);  // Arabic
        namesTable.getColumnModel().getColumn(2).setPreferredWidth(150);  // Name
        namesTable.getColumnModel().getColumn(3).setPreferredWidth(220); // Meaning
    }
    public JFrame getnamesSelectedFrame() {
        return namesSelectedFrame;
    }
    
    private void goBackToManSelectedPage() {
        // Close the current frame
        namesSelectedFrame.dispose();

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
