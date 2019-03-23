package simpleCalculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Calculator {

	private JFrame frame;
	private JTextField calcDisplay;
	private String temp;
	private String opr;
	private Double num1;
	private Double num2;
	private Double ans;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
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
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 373, 496);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		calcDisplay = new JTextField();
		calcDisplay.setHorizontalAlignment(SwingConstants.RIGHT);
		calcDisplay.setBounds(10, 11, 334, 76);
		frame.getContentPane().add(calcDisplay);
		calcDisplay.setColumns(10);
		
		JButton btn_clear = new JButton("Clear");
		btn_clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcDisplay.setText("");
			}
		});
		btn_clear.setBounds(10, 109, 76, 58);
		frame.getContentPane().add(btn_clear);
		
		JButton btn_delete = new JButton("Del");
		btn_delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcDisplay.setText(calcDisplay.getText().substring(0, calcDisplay.getText().length() - 1));
			}
		});
		btn_delete.setBounds(96, 109, 76, 58);
		frame.getContentPane().add(btn_delete);
		
		JButton btn_sqrt = new JButton("\u221A");
		btn_sqrt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ans = Math.sqrt(Double.valueOf(calcDisplay.getText()));
				calcDisplay.setText(ans.toString());
			}
		});
		btn_sqrt.setBounds(182, 109, 76, 58);
		frame.getContentPane().add(btn_sqrt);
		
		JButton btn_divide = new JButton("\u00F7");
		btn_divide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Double.valueOf(calcDisplay.getText());
				opr = "divide";
				calcDisplay.setText("");
			}
		});
		btn_divide.setBounds(268, 109, 76, 58);
		frame.getContentPane().add(btn_divide);
		
		JButton btn_7 = new JButton("7");
		btn_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				temp = calcDisplay.getText() + btn_7.getText();
				calcDisplay.setText(temp);
			}
		});
		btn_7.setBounds(10, 178, 76, 58);
		frame.getContentPane().add(btn_7);
		
		JButton btn_8 = new JButton("8");
		btn_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				temp = calcDisplay.getText() + btn_8.getText();
				calcDisplay.setText(temp);
			}
		});
		btn_8.setBounds(96, 178, 76, 58);
		frame.getContentPane().add(btn_8);
		
		JButton btn_9 = new JButton("9");
		btn_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				temp = calcDisplay.getText() + btn_9.getText();
				calcDisplay.setText(temp);
			}
		});
		btn_9.setBounds(182, 178, 76, 58);
		frame.getContentPane().add(btn_9);
		
		JButton btn_multiply = new JButton("x");
		btn_multiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Double.valueOf(calcDisplay.getText());
				opr = "multiply";
				calcDisplay.setText("");
			}
		});
		btn_multiply.setBounds(268, 178, 76, 58);
		frame.getContentPane().add(btn_multiply);
		
		JButton btn_4 = new JButton("4");
		btn_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				temp = calcDisplay.getText() + btn_4.getText();
				calcDisplay.setText(temp);
			}
		});
		btn_4.setBounds(10, 247, 76, 58);
		frame.getContentPane().add(btn_4);
		
		JButton btn_5 = new JButton("5");
		btn_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				temp = calcDisplay.getText() + btn_5.getText();
				calcDisplay.setText(temp);
			}
		});
		btn_5.setBounds(96, 247, 76, 58);
		frame.getContentPane().add(btn_5);
		
		JButton btn_6 = new JButton("6");
		btn_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				temp = calcDisplay.getText() + btn_6.getText();
				calcDisplay.setText(temp);
			}
		});
		btn_6.setBounds(182, 247, 76, 58);
		frame.getContentPane().add(btn_6);
		
		JButton btn_minus = new JButton("-");
		btn_minus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Double.valueOf(calcDisplay.getText());
				opr = "minus";
				calcDisplay.setText("");
			}
		});
		btn_minus.setBounds(268, 247, 76, 58);
		frame.getContentPane().add(btn_minus);
		
		JButton btn_1 = new JButton("1");
		btn_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				temp = calcDisplay.getText() + btn_1.getText();
				calcDisplay.setText(temp);
			}
		});
		btn_1.setBounds(10, 316, 76, 58);
		frame.getContentPane().add(btn_1);
		
		JButton btn_2 = new JButton("2");
		btn_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				temp = calcDisplay.getText() + btn_2.getText();
				calcDisplay.setText(temp);
			}
		});
		btn_2.setBounds(96, 316, 76, 58);
		frame.getContentPane().add(btn_2);
		
		JButton btn_3 = new JButton("3");
		btn_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				temp = calcDisplay.getText() + btn_3.getText();
				calcDisplay.setText(temp);
			}
		});
		btn_3.setBounds(182, 316, 76, 58);
		frame.getContentPane().add(btn_3);
		
		JButton btn_plus = new JButton("+");
		btn_plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Double.valueOf(calcDisplay.getText());
				opr = "plus";
				calcDisplay.setText("");
			}
		});
		btn_plus.setBounds(268, 316, 76, 58);
		frame.getContentPane().add(btn_plus);
		
		JButton btn_0 = new JButton("0");
		btn_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				temp = calcDisplay.getText() + btn_0.getText();
				calcDisplay.setText(temp);
			}
		});
		btn_0.setBounds(10, 385, 76, 58);
		frame.getContentPane().add(btn_0);
		
		JButton btn_dot = new JButton(".");
		btn_dot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (calcDisplay.getText().contains(".")) {
					//do nothing
				}	else {
					temp = calcDisplay.getText() + ".";
					calcDisplay.setText(temp);
				}
					
			}
		});
		btn_dot.setBounds(96, 385, 76, 58);
		frame.getContentPane().add(btn_dot);
		
		JButton btn_neg = new JButton("+/-");
		btn_neg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (calcDisplay.getText().contains("-")) {
					temp = calcDisplay.getText().substring(1);
					calcDisplay.setText(temp);
				} else {
					temp = "-" + calcDisplay.getText();
					calcDisplay.setText(temp);
				}
					
			}
		});
		btn_neg.setBounds(182, 385, 76, 58);
		frame.getContentPane().add(btn_neg);
		
		JButton btn_equal = new JButton("=");
		btn_equal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num2 = Double.valueOf(calcDisplay.getText());
				if (opr == "") {
					//do nothing
				} else if (opr == "plus") {
					ans = num1 + num2;
					calcDisplay.setText(ans.toString());
				} else if (opr == "minus") {
					ans = num1 - num2;
					calcDisplay.setText(ans.toString());
				} else if (opr == "multiply") {
					ans = num1 * num2;
					calcDisplay.setText(ans.toString());
				} else if (opr == "divide") {
					ans = num1 / num2;
					calcDisplay.setText(ans.toString());
				}
						
			}
		});
		btn_equal.setBounds(268, 385, 76, 58);
		frame.getContentPane().add(btn_equal);
	}
}
