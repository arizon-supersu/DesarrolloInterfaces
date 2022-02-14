package DesarrolloInterfaces;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GridCalculadora {
	
	static JLabel Texto = new JLabel("PULSA EL BOTON ON/OFF PARA EMPEZAR");
	static boolean on = false;
	private static class EscuchadorInterno implements ActionListener{
		
		@Override
		public void actionPerformed(ActionEvent e) {
			if (on == true) {
				String comando = e.getActionCommand();
				System.out.println("Has pulsado el boton: " + comando);
				JButton obtenerTexto =  (JButton)e.getSource();
				Texto.setText(obtenerTexto.getText());
				String text = obtenerTexto.getText();
				if(text.equals("ON/OFF")) {
					on = false;
					Texto.setText("CALCULADORA APAGADA");
					}
			}else if(on == false){
				JButton obtenerTexto =  (JButton)e.getSource();
				String text = obtenerTexto.getText();
				if(text.equals("ON/OFF")) {
					on = true;
					Texto.setText("CALCULADORA ENCENDIDA");
				}
			}	
			
		}
	}

	public static void main(String[] args) {
		

		JFrame frame = new JFrame("Calculadora");
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		JPanel Calc = new JPanel();
		
		panel.setLayout(new BorderLayout());
		
		
		Calc.setLayout(new GridLayout(4,5));
		JButton Boton0 = new JButton("0");
		JButton Boton1 = new JButton("1");
		JButton Boton2 = new JButton("2");
		JButton Boton3 = new JButton("3");
		JButton Boton4 = new JButton("4");
		JButton Boton5 = new JButton("5");
		JButton Boton6 = new JButton("6");
		JButton Boton7 = new JButton("7");
		JButton Boton8 = new JButton("8");
		JButton Boton9 = new JButton("9");
		JButton BotonSuma = new JButton("+");
		JButton BotonResta = new JButton("-");
		JButton BotonMulti = new JButton("x");
		JButton BotonDivi = new JButton("/");
		JButton BotonIgual = new JButton("=");
		JButton BotonRetroceso = new JButton("-->");
		JButton BotonBorrar = new JButton("C");
		JButton BotonPunto = new JButton(".");
		JButton BotonMayorMenor = new JButton("+/-");
		JButton BotonOnOff = new JButton("ON/OFF");
		
		Texto.setBorder(BorderFactory.createEmptyBorder(10,130,10,10));
		
		Calc.add(Boton7);
		Calc.add(Boton8);
		Calc.add(Boton9);
		Calc.add(BotonOnOff);
		Calc.add(BotonRetroceso);
		Calc.add(Boton4);
		Calc.add(Boton5);
		Calc.add(Boton6);
		Calc.add(BotonMulti);
		Calc.add(BotonDivi);
		Calc.add(Boton1);
		Calc.add(Boton2);
		Calc.add(Boton3);
		Calc.add(BotonMayorMenor);
		Calc.add(BotonResta);
		Calc.add(BotonBorrar);
		Calc.add(Boton0);
		Calc.add(BotonPunto);
		Calc.add(BotonSuma);
		Calc.add(BotonIgual);
		
		EscuchadorInterno eb = new EscuchadorInterno();
		
		
		Boton0.addActionListener(eb);
		Boton1.addActionListener(eb);
		Boton2.addActionListener(eb);
		Boton3.addActionListener(eb);
		Boton4.addActionListener(eb);
		Boton5.addActionListener(eb);
		Boton6.addActionListener(eb);
		Boton7.addActionListener(eb);
		Boton8.addActionListener(eb);
		Boton9.addActionListener(eb);
		BotonSuma.addActionListener(eb);
		BotonResta.addActionListener(eb);
		BotonMulti.addActionListener(eb);
		BotonDivi.addActionListener(eb);
		BotonIgual.addActionListener(eb);
		BotonRetroceso.addActionListener(eb);
		BotonBorrar.addActionListener(eb);
		BotonPunto.addActionListener(eb);
		BotonMayorMenor.addActionListener(eb);
		BotonOnOff.addActionListener(eb);
		
		panel.add(Calc);
		panel.add(Texto, BorderLayout.BEFORE_FIRST_LINE);
		
		frame.add(panel,BorderLayout.CENTER);
		frame.pack();
		frame.setVisible(true);

	}

}
