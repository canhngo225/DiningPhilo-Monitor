package diningPhiloMonitor;

import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Gui extends JFrame{
	private static final long serialVersionUID = 1L;
	JPanel pane;
	static JFrame frame;
	ArrayList<JLabel> listPhilo = new ArrayList<>();
	ArrayList<JLabel> listChop = new ArrayList<>();
	public static void main(String[] args) {
		//frame = new Gui();
		//frame.setVisible(true);
		//new Gui();
	}
	public Gui() {
		this.setTitle("Dining_monitor");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(100, 100, 969, 660);
		this.setSize(800,500);
		
		pane = new JPanel();
		pane.setBackground(Color.white);
		pane.setBorder(new EmptyBorder(5, 5, 5, 5));
		pane.setLayout(null);
		setContentPane(pane);
		
		
		JLabel philo1=new JLabel("Philosopher 1");
		philo1.setOpaque(true);
		philo1.setBounds(350,55 , 100, 70);
		philo1.setForeground(Color.WHITE);
		philo1.setBackground(Color.BLACK);
		philo1.setHorizontalAlignment(SwingConstants.CENTER);
		philo1.setFont(new Font("Arial", Font.BOLD, 12));
		listPhilo.add(philo1);
		pane.add(philo1);
		
		JLabel philo2=new JLabel("Philosopher 2");
		philo2.setOpaque(true);
		philo2.setBounds(150,180 , 100, 70);
		philo2.setForeground(Color.WHITE);
		philo2.setBackground(Color.BLACK);
		philo2.setHorizontalAlignment(SwingConstants.CENTER);
		philo2.setFont(new Font("Arial", Font.BOLD, 12));
		listPhilo.add(philo2);
		pane.add(philo2);
		
		JLabel philo3=new JLabel("Philosopher 3");
		philo3.setOpaque(true);
		philo3.setBounds(250, 315 , 100, 70);
		philo3.setForeground(Color.WHITE);
		philo3.setBackground(Color.BLACK);
		philo3.setHorizontalAlignment(SwingConstants.CENTER);
		philo3.setFont(new Font("Arial", Font.BOLD, 12));
		listPhilo.add(philo3);
		pane.add(philo3);
		
		JLabel philo4=new JLabel("Philosopher 4");
		philo4.setOpaque(true);
		philo4.setBounds(450, 315 , 100, 70);
		philo4.setForeground(Color.WHITE);
		philo4.setBackground(Color.BLACK);
		philo4.setHorizontalAlignment(SwingConstants.CENTER);
		philo4.setFont(new Font("Arial", Font.BOLD, 12));
		listPhilo.add(philo4);
		pane.add(philo4);
		
		JLabel philo5=new JLabel("Philosopher 5");
		philo5.setOpaque(true);
		philo5.setBounds(550, 180 , 100, 70);
		philo5.setForeground(Color.WHITE);
		philo5.setBackground(Color.BLACK);
		philo5.setHorizontalAlignment(SwingConstants.CENTER);
		philo5.setFont(new Font("Arial", Font.BOLD, 12));
		listPhilo.add(philo5);
		pane.add(philo5);
		
		JLabel chop1 = new JLabel("Chopstick 1");
		chop1.setBackground(Color.pink);
		chop1.setOpaque(true);
		chop1.setHorizontalAlignment(SwingConstants.CENTER);
		chop1.setBounds(200, 145, 66, 27);
		listChop.add(chop1);
		pane.add(chop1);
		
		JLabel chop2 = new JLabel("Chopstick 2");
		chop2.setBackground(Color.pink);
		chop2.setOpaque(true);
		chop2.setHorizontalAlignment(SwingConstants.CENTER);
		chop2.setBounds(200, 270, 66, 27);
		listChop.add(chop2);
		pane.add(chop2);
		
		JLabel chop3 = new JLabel("Chopstick 3");
		chop3.setBackground(Color.pink);
		chop3.setOpaque(true);
		chop3.setHorizontalAlignment(SwingConstants.CENTER);
		chop3.setBounds(360, 331, 66, 27);
		listChop.add(chop3);
		pane.add(chop3);
		
		JLabel chop4 = new JLabel("Chopstick 4");
		chop4.setBackground(Color.pink);
		chop4.setOpaque(true);
		chop4.setHorizontalAlignment(SwingConstants.CENTER);
		chop4.setBounds(500, 270, 66, 27);
		listChop.add(chop4);
		pane.add(chop4);
		
		JLabel chop5 = new JLabel("Chopstick 5");
		chop5.setBackground(Color.pink);
		chop5.setOpaque(true);
		chop5.setHorizontalAlignment(SwingConstants.CENTER);
		chop5.setBounds(500, 145, 66, 27);
		listChop.add(chop5);
		pane.add(chop5);
		
		
		
		JLabel sign = new JLabel("HUNGRY: ");
		sign.setBackground(Color.white);
		sign.setOpaque(true);
		sign.setBounds(10, 10,60, 15);
		pane.add(sign);
		
		JLabel color = new JLabel();
		color.setBackground(Color.BLUE);
		color.setOpaque(true);
		color.setBounds(70, 10,30, 15);
		pane.add(color);
		
		JLabel sign1 = new JLabel("EATING: ");
		sign1.setBackground(Color.white);
		sign1.setOpaque(true);
		sign1.setBounds(105, 10,57, 15);
		pane.add(sign1);
		
		JLabel color1 = new JLabel();
		color1.setBackground(Color.red);
		color1.setOpaque(true);
		color1.setBounds(165, 10,30, 15);
		pane.add(color1);
		
		JLabel sign2 = new JLabel("THINKING: ");
		sign2.setBackground(Color.white);
		sign2.setOpaque(true);
		sign2.setBounds(200, 10,66, 15);
		pane.add(sign2);
		
		JLabel color2 = new JLabel();
		color2.setBackground(Color.BLACK);
		color2.setOpaque(true);
		color2.setBounds(260, 10,30, 15);
		pane.add(color2);
		
		
		
	}
	public void changeColourToRed (int i) {
		switch (i) {
		case 1:
			listPhilo.get(0).setBackground(Color.red);
			break;
		case 2:
			listPhilo.get(1).setBackground(Color.red);
			break;
		case 3:
			listPhilo.get(2).setBackground(Color.red);
			break;
		case 4:
			listPhilo.get(3).setBackground(Color.red);
			break;
		case 5:
			listPhilo.get(4).setBackground(Color.red);
			break;
		default:
			break;
		}
	}
	
	public void changeColourToBlack (int i) {
		switch (i) {
		case 1:
			listPhilo.get(0).setBackground(Color.black);
			break;
		case 2:
			listPhilo.get(1).setBackground(Color.black);
			break;
		case 3:
			listPhilo.get(2).setBackground(Color.black);
			break;
		case 4:
			listPhilo.get(3).setBackground(Color.black);
			break;
		case 5:
			listPhilo.get(4).setBackground(Color.black);
			break;
		default:
			break;
		}
	}
	
	public void changeColourToBlue (int i) {
		switch (i) {
		case 1:
			listPhilo.get(0).setBackground(Color.blue);
			break;
		case 2:
			listPhilo.get(1).setBackground(Color.blue);
			break;
		case 3:
			listPhilo.get(2).setBackground(Color.blue);
			break;
		case 4:
			listPhilo.get(3).setBackground(Color.blue);
			break;
		case 5:
			listPhilo.get(4).setBackground(Color.blue);
			break;
		default:
			break;
		}
	}
	
	public void changeColourToRed_Chop (int i) {
		switch (i) {
		case 1:
			listChop.get(0).setBackground(Color.red);
			listChop.get(4).setBackground(Color.red);
			break;
		case 2:
			listChop.get(1).setBackground(Color.red);
			listChop.get(0).setBackground(Color.red);
			break;
		case 3:
			listChop.get(2).setBackground(Color.red);
			listChop.get(1).setBackground(Color.red);
			break;
		case 4:
			listChop.get(3).setBackground(Color.red);
			listChop.get(2).setBackground(Color.red);
			break;
		case 5:
			listChop.get(4).setBackground(Color.red);
			listChop.get(3).setBackground(Color.red);
			break;
		default:
			break;
		}
	}
	
	public void changeColourToPink_Chop (int i) {
		switch (i) {
		case 1:
			listChop.get(0).setBackground(Color.pink);
			listChop.get(4).setBackground(Color.pink);
			break;
		case 2:
			listChop.get(1).setBackground(Color.pink);
			listChop.get(0).setBackground(Color.pink);
			break;
		case 3:
			listChop.get(2).setBackground(Color.pink);
			listChop.get(1).setBackground(Color.pink);
			break;
		case 4:
			listChop.get(3).setBackground(Color.pink);
			listChop.get(2).setBackground(Color.pink);
			break;
		case 5:
			listChop.get(4).setBackground(Color.pink);
			listChop.get(3).setBackground(Color.pink);
			break;
		default:
			break;
		}
	}
}
