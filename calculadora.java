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
