import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;

import taskComponent.Employee;
import taskComponent.ListItems;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class MainWindow {
	public ArrayList<String> employees = new ArrayList<String>();
	public ArrayList<Employee> employeevals = new ArrayList<Employee>();
	public ArrayList<String> tasklist = new ArrayList<String>();
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow window = new MainWindow();
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
	public MainWindow() {
		employees.add("Bob");
		employees.add("Steve");
		employees.add("De Dog");
		tasklist.add("punch");
		tasklist.add("kick");
		tasklist.add("suck it");
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnEmployee = new JButton("Select Employee");
		btnEmployee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame frame = new JFrame("Testing");
	            frame.getContentPane().add(new ListItems("Employee", employees));
	            frame.pack();
	            frame.setLocationRelativeTo(null);
	            frame.setVisible(true);
			}
		});
		btnEmployee.setBounds(266, 17, 142, 25);
		frame.getContentPane().add(btnEmployee);
		
		JButton btnTask = new JButton("Select Task");
		btnTask.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame frame = new JFrame("Testing");
	            frame.getContentPane().add(new ListItems("Task", tasklist));
	            frame.pack();
	            frame.setLocationRelativeTo(null);
	            frame.setVisible(true);
			}
		});
		btnTask.setBounds(266, 54, 142, 25);
		frame.getContentPane().add(btnTask);
		
		JLabel lblSelectedEmployee = new JLabel("Selected Employee");
		lblSelectedEmployee.setBounds(12, 17, 134, 15);
		frame.getContentPane().add(lblSelectedEmployee);
	}
}
