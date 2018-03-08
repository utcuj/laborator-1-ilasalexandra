package gui;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;

import raw.Tren;
import utility.Test;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextArea;

public class GUI {

	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private static Test test=new Test();

	/**
	 * @wbp.parser.entryPoint
	 */
	
	public GUI(){
		 JFrame frame=new JFrame("Train station");
		 frame.getContentPane().setLayout(null);
		 
		 JLabel lblCodTren = new JLabel("Cod Tren");
		 lblCodTren.setBounds(22, 23, 56, 16);
		 frame.getContentPane().add(lblCodTren);
		 
		 textField = new JTextField();
		 textField.setBounds(98, 20, 116, 22);
		 frame.getContentPane().add(textField);
		 textField.setColumns(10);
		 
		 JTextArea textArea = new JTextArea();
		 textArea.setBounds(55, 86, 300, 89);
		 frame.getContentPane().add(textArea);
		 
		 JButton btnAfisareTren = new JButton("Afisare Tren");
		 btnAfisareTren.setBounds(264, 19, 133, 25);
		 frame.getContentPane().add(btnAfisareTren);
		 btnAfisareTren.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String aux=textField.getText();
				boolean flag= false;
					for(Tren t:test.getGara().getTrenuri())
						if(t.getId().equals(aux))
							{
								textArea.setText(aux+" "+t.getDestinatie()+" "+t.getOraPlecare());
								flag=true;
							}
					if(flag==false){
						textArea.setText("Nu exista trenul cu ID-ul "+aux+"!");
					}
			}
		 });
		 frame.setSize(600, 250);
		 frame.setVisible(true);
	}
	public static void main(String[] args) {
		test.initialize();
		GUI gui=new GUI();
		System.out.println("Lista trenuri nesortate:");

		for(Tren t:test.getGara().getTrenuri())
			System.out.println("Cod:"+t.getId()+" Destinatie:"+t.getDestinatie()+" Ora Plecare:"+t.getOraPlecare());
		
		System.out.println("\n"+"Lista trenuri sortate dupa ora:");
		test.sortare();
		for(Tren t:test.getGara().getTrenuri())
			System.out.println("Cod:"+t.getId()+" Destinatie:"+t.getDestinatie()+" Ora Plecare:"+t.getOraPlecare());
		
	
	}

}
