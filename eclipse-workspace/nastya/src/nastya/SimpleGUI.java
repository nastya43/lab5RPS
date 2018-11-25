package nastya;
import java.awt.*;
import java.awt.event.*;

import javax.print.attribute.AttributeSet;
import javax.swing.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.border.EmptyBorder;
import javax.swing.text.BadLocationException;

public class SimpleGUI extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public JPanel contentPane;
	public static JTextField textField;
	public static JTextField textField2;
	public static JTextField textField3;
	public static String str = "Ответ:  ";
	public static boolean k = true;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SimpleGUI frame = new SimpleGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}
	
public SimpleGUI() {
		setResizable(false);
		setTitle("\u041A\u0430\u043B\u044C\u043A\u0443\u043B\u044F\u0442\u043E\u0440 \u0434\u0440\u043E\u0431\u043D\u043E\u0439 \u0434\u043B\u0438\u043D\u043D\u043E\u0439 \u0430\u0440\u0438\u0444\u043C\u0435\u0442\u0438\u043A\u0438");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(Color.WHITE);
		setContentPane(contentPane);
		
		textField = new JTextField();
		textField.setBorder(BorderFactory.createLineBorder (new Color (0, 0, 0, 0), 2));
		textField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setBackground(Color.WHITE);
		textField.setEditable(false);
		textField.setColumns(100);
		
		textField2 = new JTextField(5);
		textField2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField2.setBorder(BorderFactory.createLineBorder (new Color (0, 0, 0, 0), 2));
		textField2.setHorizontalAlignment(SwingConstants.LEFT);
		textField2.setBackground(Color.WHITE);
		textField2.setEditable(false);
		textField2.setColumns(100);		
		
		
		JButton button5 = new JButton("OK");
		button5.setVisible(false);
		button5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (k==true) {
				int k = Integer.parseInt(textField2.getText());
				str = "Следующее за ним простое число: " + Integer.toString(prost.getNext(k));}
				else
				{
					int k = Integer.parseInt(textField2.getText());
					boolean pr = prost.isPrime(k);
	                if (pr == true) {
	                	str = "Число простое." ;
	                } else {
	                	str = "Число не простое." ;
	                }
									
				}
				textField.setText(str);
				textField.requestFocus();
			}
		});
		button5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		
		JButton button1 = new JButton("Случайное простое число");
		button1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				button5.setVisible(false);
				textField2.setBorder(BorderFactory.createLineBorder (new Color (0, 0, 0, 0), 2));
				textField2.setText("");
				str = "Ответ:  ";
				str = str + Integer.toString(prost.getRandomPrime());
				textField.setText(str);
				textField.requestFocus();
			}
		});
		button1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JButton button2 = new JButton("Массив простых чисел");
		button2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				button5.setVisible(false);
				textField2.setBorder(BorderFactory.createLineBorder (new Color (0, 0, 0, 0), 2));
				textField2.setText("");
				str = "Ответ:  ";
				int g = (int) (4 + (Math.random() * 5));
				int arr[] = prost.getRandomArray(g);
                for (int d = 0; d < g; d++) {
                	str = str + Integer.toString(arr[d]) + "  ";          
                };
                textField.setText(str);
				textField.requestFocus();
			}
		});
		button2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JButton button3 = new JButton("Следующее простое число");
		button3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				k=true;
				button5.setVisible(true);
				textField2.setBorder(BorderFactory.createLineBorder (Color.BLACK, 1));
				textField2.setEditable(true);
			}
		});
		
		button3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JButton button4 = new JButton("Является ли число простым");
		button4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				k=false;
				button5.setVisible(true);
				textField2.setBorder(BorderFactory.createLineBorder (Color.BLACK, 1));
				textField2.setEditable(true);
			}
		});
		
		button4.setFont(new Font("Tahoma", Font.PLAIN, 15));
				
		GroupLayout gl_panel = new GroupLayout(contentPane);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)	
				.addGroup(gl_panel.createSequentialGroup()	
						.addGap(150)
						.addComponent(textField2, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
						.addGap(25)
						.addComponent(button5, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel.createSequentialGroup()	
						.addGap(15)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, 800, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel.createSequentialGroup()
						.addGap(150)	
						.addComponent(button1, GroupLayout.PREFERRED_SIZE, 500, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel.createSequentialGroup()
						.addGap(150)
						.addComponent(button2, GroupLayout.PREFERRED_SIZE, 500, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel.createSequentialGroup()
						.addGap(150)
						.addComponent(button3, GroupLayout.PREFERRED_SIZE, 500, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel.createSequentialGroup()
						.addGap(150)
						.addComponent(button4, GroupLayout.PREFERRED_SIZE, 500, GroupLayout.PREFERRED_SIZE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
						.addGap(15)
						.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(textField2, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(button5, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
						
						.addGap(25)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addGap(25)
						.addComponent(button1, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addGap(15)
						.addComponent(button2, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addGap(15)
						.addComponent(button3, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addGap(15)
						.addComponent(button4, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
			
		);	
		
		contentPane.setLayout(gl_panel);
		
		
}
}


