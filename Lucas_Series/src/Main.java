
import java.awt.EventQueue;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JProgressBar;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingWorker;
import javax.swing.JButton;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.awt.Color;

public class Main {

	private JFrame frame;
    private JTextArea bigTextArea;
    private JProgressBar progressBar;
    private JLabel numberOfRows;
    private JTextField textField;
    private JButton getSumButton;
    private JButton cancelButton;
    private LucasSeriesWorker worker;
    private JLabel sumEquals;
    private JTextArea smallTextArea;
    private JLabel percentageLabel;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frame.setVisible(true);
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
	private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 850, 450);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        bigTextArea = new JTextArea();
        bigTextArea.setBackground(new Color(255, 255, 255));
        bigTextArea.setEditable(false);
        bigTextArea.setBounds(2, 2, 820, 382);
        frame.getContentPane().add(bigTextArea);

        JScrollPane scrollPane = new JScrollPane(bigTextArea);
        scrollPane.setBounds(0, 53, 824, 340);
        frame.getContentPane().add(scrollPane);

        progressBar = new JProgressBar();
        progressBar.setBounds(0, 392, 541, 30);
        frame.getContentPane().add(progressBar);
        
        percentageLabel = new JLabel("0%");
        percentageLabel.setBounds(553, 396, 50, 20);
        frame.getContentPane().add(percentageLabel);

        numberOfRows = new JLabel("Number of rows in Lucas Series:");
        numberOfRows.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
        numberOfRows.setBounds(52, 12, 233, 30);
        frame.getContentPane().add(numberOfRows);

        textField = new JTextField();
        textField.setBounds(297, 12, 80, 30);
        frame.getContentPane().add(textField);
        textField.setColumns(10);

        getSumButton = new JButton("Get Sum of Lucas Series");
        getSumButton.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
        getSumButton.setBounds(389, 7, 190, 41);
        frame.getContentPane().add(getSumButton);

        cancelButton = new JButton("Cancel");
        cancelButton.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
        cancelButton.setBounds(579, 7, 115, 41);
        frame.getContentPane().add(cancelButton);
        
        sumEquals = new JLabel("Sum =");
        sumEquals.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
        sumEquals.setBounds(591, 392, 50, 29);
        frame.getContentPane().add(sumEquals);
        
        smallTextArea = new JTextArea();
        smallTextArea.setEditable(false);
        smallTextArea.setBounds(641, 398, 78, 16);
        frame.getContentPane().add(smallTextArea);

        addEventListeners();
    }

private void addEventListeners() {
    getSumButton.addActionListener(e -> {
        // Disable Get Sum button
        getSumButton.setEnabled(false);
        // Enable Cancel button
        cancelButton.setEnabled(true);

      
        try {
            int n = Integer.parseInt(textField.getText());
            if (n <= 0) {
                throw new IllegalArgumentException("Invalid Input");
            }
            worker = new LucasSeriesWorker(n);
            worker.addPropertyChangeListener(new PropertyChangeListener() {
                @Override
                public void propertyChange(PropertyChangeEvent evt) {
                    if ("progress" == evt.getPropertyName()) {
                        // Update the percentage label
                        percentageLabel.setText(evt.getNewValue() + "%");
                    } else if ("sum" == evt.getPropertyName()) {
                        sumEquals.setText("Sum = " + evt.getNewValue());
                    }
                }
            });
            worker.execute();
        } catch (IllegalArgumentException ex) {
            // Handle the case where the input is not a valid integer
            JOptionPane.showMessageDialog(frame,"Invalid Input", "Error", JOptionPane.ERROR_MESSAGE);

            // Clear the input field
            textField.setText("");

            // Cancel the background task if it's running
            if (worker != null && !worker.isDone() && !worker.isCancelled()) {
                worker.cancel(true);
            }

            // Re-enable the Get Sum button
            getSumButton.setEnabled(true);
            // Disable the Cancel button
            cancelButton.setEnabled(false);
        }
    });

        cancelButton.addActionListener(e -> {
            // Cancel the background task
            if (worker != null && !worker.isDone() && !worker.isCancelled()) {
                worker.cancel(true);
            }

            // Re-enable the Get Sum button
            getSumButton.setEnabled(true);
            // Disable the Cancel button
            cancelButton.setEnabled(false);
        });
    }

    public class LucasSeriesWorker extends SwingWorker<Integer, Integer> {
    private final int N;
    private int partialSum;

    public LucasSeriesWorker(int N) {
        this.N = N;
        this.partialSum = 0;
    }

    @Override
protected Integer doInBackground() throws Exception {
    smallTextArea.setText("");
    
    int lucas1 = 2;
    int lucas2 = 1;

    try (FileWriter fileWriter = new FileWriter("Data.txt")) {
        int sum = lucas1 + lucas2;

        // Write the initial Lucas numbers to the file
        fileWriter.write(lucas1 + System.lineSeparator());
        fileWriter.write(lucas2 + System.lineSeparator());

        // Clear the bigTextArea after writing the initial Lucas numbers
        bigTextArea.setText("");

        // Publish the initial Lucas numbers
        publish(lucas1);
        publish(lucas2);

        for (int i = 0; i < N - 2 && !isCancelled(); i++) {
            // Calculate the next Lucas number
            int temp = lucas1 + lucas2;
            lucas1 = lucas2;
            lucas2 = temp;

            // Delay to slow down the calculation (simulating real work)
            Thread.sleep(150); // Adjust this delay according to your requirements

            // Publish current Lucas number
            publish(lucas2);

            // Write the current Lucas number to the file
            fileWriter.write(lucas2 + System.lineSeparator());

            // Add the current Lucas number to the sum
            sum += lucas2;
            partialSum = sum;

            // Update the progress bar
            int progress = (int) ((double) (i + 1) / (N - 2) * 100);
            setProgress(progress);
        }

        return sum;
    } catch (IOException e) {
        e.printStackTrace();
        return 0;
    }
}
@Override
protected void process(List<Integer> chunks) {
    for (int lucas : chunks) {

        // Update the text area with the current Lucas number
        bigTextArea.append(lucas + "\n");

        // Update the progress bar
        int progress = getProgress();
        progressBar.setValue(progress);
        progressBar.setString(String.format("%d%%", progress));
    }
    
}

@Override
    protected void done() {
        try {
            int sum = get();
            smallTextArea.setText(Integer.toString(sum));
        } catch (Exception e) {
            e.printStackTrace();
            // Display the partial sum in smallTextArea
            smallTextArea.setText(Integer.toString(partialSum));
        } finally {
            // Disable the "Cancel" button after completion
            cancelButton.setEnabled(false);
            // Enable the "Get Sum of Lucas Series" button after completion
            getSumButton.setEnabled(true);
        }
    }
    }
}
