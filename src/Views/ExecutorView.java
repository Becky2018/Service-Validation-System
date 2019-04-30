package Views;

import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JSeparator;
import javax.swing.JSlider;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;

public class ExecutorView extends JFrame {
	private JPanel contentPane;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ExecutorView frame = new ExecutorView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	/**
	 * Create the panel.
	 */
	public ExecutorView() {
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		JTextPane textPane = new JTextPane();
		textPane.setText("SERVICE VALIDATION SYSTEM");
		textPane.setBounds(144, 11, 192, 16);
		contentPane.add(textPane);
		
		JTextPane txtpnExecutor = new JTextPane();
		txtpnExecutor.setText("EXECUTOR");
		txtpnExecutor.setBounds(185, 30, 72, 16);
		contentPane.add(txtpnExecutor);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(23, 57, 417, 2);
		contentPane.add(separator);
		
		JSlider slider = new JSlider();
		slider.setBounds(33, 146, 387, 26);
		contentPane.add(slider);
		
		JLabel lblStart = new JLabel("Start");
		lblStart.setBounds(23, 171, 46, 14);
		contentPane.add(lblStart);
		
		JLabel lblComplete = new JLabel("Complete");
		lblComplete.setBounds(374, 183, 46, 14);
		contentPane.add(lblComplete);
		
		JLabel lblStatus = new JLabel("Status");
		lblStatus.setBounds(23, 135, 46, 14);
		contentPane.add(lblStatus);
		
		JLabel lblTask = new JLabel("Task");
		lblTask.setBounds(23, 75, 46, 14);
		contentPane.add(lblTask);
		
		JButton btnUploadEvidence = new JButton("Upload Evidence");
		btnUploadEvidence.setBounds(24, 224, 135, 23);
		contentPane.add(btnUploadEvidence);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(59, 72, 177, 20);
		contentPane.add(comboBox);
		
		JButton btnComplete = new JButton("Complete");
		btnComplete.setBounds(291, 224, 89, 23);
		contentPane.add(btnComplete);
		Preprocess getdata =new Preprocess();
		 ArrayList<Preprocess> executor_view_result=getdata.getTask();
	      String a; 
	          a=executor_view_result.get(0).task_type;
    	   comboBox.addItem(a);
//	    	  Evidence_type.setText(result.get(0).evidence);
//	    	 Executor.setText(result.get(0).task_executor);
//	    	 task_name.setText(result.get(0).task_type);
    	   btnComplete.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				setVisible(false); //you can't see me!
				dispose(); //Destroy the JFrame object 
			}
		});
			
   
	}	
}
