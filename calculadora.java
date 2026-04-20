package cacular;

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;


public class calculadora extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculadora frame = new calculadora();
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
	public calculadora() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"2");
			}
		});
		btn2.setBounds(119, 173, 75, 33);
		contentPane.add(btn2);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"1");
			}
		});
		btn1.setBounds(50, 173, 75, 33);
		contentPane.add(btn1);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"3");
			}
		});
		btn3.setBounds(185, 173, 75, 33);
		contentPane.add(btn3);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"0");
			}
		});
		btn0.setBounds(119, 202, 75, 33);
		contentPane.add(btn0);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"4");
			}
		});
		btn4.setBounds(50, 140, 75, 33);
		contentPane.add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"5");
			}
		});
		btn5.setBounds(119, 140, 75, 33);
		contentPane.add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"6");
			}
		});
		btn6.setBounds(185, 140, 75, 33);
		contentPane.add(btn6);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"7");
			}
		});
		btn7.setBounds(50, 110, 75, 33);
		contentPane.add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"8");
			}
		});
		btn8.setBounds(119, 110, 75, 33);
		contentPane.add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"9");
			}
		});
		btn9.setBounds(185, 110, 75, 33);
		contentPane.add(btn9);
		
		JButton btnD = new JButton("÷");
		btnD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"÷");
			}
		});
		btnD.setBounds(260, 110, 75, 33);
		contentPane.add(btnD);
		
		JButton btnX = new JButton("x");
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"x");
			}
		});
		btnX.setBounds(260, 140, 75, 33);
		contentPane.add(btnX);
		
		JButton btnA = new JButton("+");
		btnA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"+");
			}
		});
		btnA.setBounds(260, 173, 75, 33);
		contentPane.add(btnA);
		
		JButton btnR = new JButton("-");
		btnR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"-");
			}
		});
		btnR.setBounds(270, 202, 75, 33);
		contentPane.add(btnR);
		
		JButton btnI = new JButton("=");
		btnI.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ScriptEngine engine = new ScriptEngineManager().getEngineByName("Javascript");
				Object resultado;
				 String expresion;
				 Expression e1 = new ExpressionBuilder(expresion).build();
			        double resultado1 = e1.evaluate();
				try {
					resultado1 = (double) engine.eval(textField.getText());
					textField.setText((double) resultado1);

				} catch (ScriptException e11) {
					// TODO Auto-generated catch block
					e11.printStackTrace();
				}

			}
		});
		btnI.setBounds(195, 202, 75, 33);
		contentPane.add(btnI);
		
		textField = new JTextField();
		textField.setBounds(42, 46, 293, 65);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnB = new JButton("borrar");
		btnB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"");
			}
		});
		btnB.setBounds(50, 202, 75, 33);
		contentPane.add(btnB);

	}
}
