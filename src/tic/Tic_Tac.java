package tic;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.border.Border;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import java.awt.FlowLayout;

public class Tic_Tac extends JFrame implements ActionListener
{
	private JPanel contentPane;
	private Random rnd = new Random();
	private JButton bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9,reset;
	private JLabel plyturn,plysc1,plysc2;
	private int turn = rnd.nextInt(2);
	private int sc1=0,sc2=0;
	private Color dkgreen = new Color(44,169,97);
	private Color dkblue = new Color(0,128,192);
	public Tic_Tac() 
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 514, 346);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(255, 255, 255));
		contentPane.setBackground(new Color(37, 207, 190));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setForeground(new Color(255, 255, 255));
		panel.setBackground(new Color(37, 207, 190));
		contentPane.add(panel, BorderLayout.NORTH);
		panel.setMinimumSize(getMinimumSize());
		panel.setPreferredSize(new Dimension(300, 60));
		panel.setLayout(new BorderLayout(0, 0));
		
		JLabel title = new JLabel("Tic - Tac - Toe");
		title.setForeground(new Color(255, 255, 255));
		title.setBackground(new Color(37, 207, 190));
		title.setFont(new Font("Lucida Handwriting", Font.BOLD, 35));
		title.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(title);
		
		JPanel panel_1 = new JPanel();
		panel_1.setForeground(new Color(255, 255, 255));
		panel_1.setBackground(new Color(37, 207, 190));
		panel_1.setPreferredSize(new Dimension(300,300));
		contentPane.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(10, 11, 277, 216);
		panel_2.setForeground(new Color(242, 242, 242));
		panel_2.setBackground(new Color(37, 207, 190));
		panel_1.add(panel_2);
		panel_2.setLayout(new GridLayout(3, 3, 2, 2));
		
		bt1 = new JButton("");
		bt1.setForeground(new Color(48, 169, 141));
		bt1.setFont(new Font("Lucida Handwriting", Font.BOLD | Font.ITALIC, 40));
		panel_2.add(bt1);
		bt1.setFocusable(false);
		bt1.setBackground(new Color(218, 218, 218));
		bt1.addActionListener(this);
		
		bt2 = new JButton("");
		bt2.setForeground(new Color(48, 169, 141));
		bt2.setFont(new Font("Lucida Handwriting", Font.BOLD | Font.ITALIC, 40));
		bt2.setBackground(new Color(218, 218, 218));
		panel_2.add(bt2);
		bt2.setFocusable(false);
		bt2.addActionListener(this);

		
		bt3 = new JButton("");
		bt3.setForeground(new Color(48, 169, 141));
		bt3.setFont(new Font("Lucida Handwriting", Font.BOLD | Font.ITALIC, 40));
		bt3.setBackground(new Color(218, 218, 218));
		panel_2.add(bt3);
		bt3.setFocusable(false);
		bt3.addActionListener(this);

		
		bt4 = new JButton("");
		bt4.setForeground(new Color(48, 169, 141));
		bt4.setFont(new Font("Lucida Handwriting", Font.BOLD | Font.ITALIC, 40));
		bt4.setBackground(new Color(218, 218, 218));
		panel_2.add(bt4);
		bt4.setFocusable(false);
		bt4.addActionListener(this);

		
		bt5 = new JButton("");
		bt5.setForeground(new Color(48, 169, 141));
		bt5.setFont(new Font("Lucida Handwriting", Font.BOLD | Font.ITALIC, 40));
		bt5.setBackground(new Color(218, 218, 218));
		panel_2.add(bt5);
		bt5.setFocusable(false);
		bt5.addActionListener(this);

		
		bt6 = new JButton("");
		bt6.setForeground(new Color(48, 169, 141));
		bt6.setFont(new Font("Lucida Handwriting", Font.BOLD | Font.ITALIC, 40));
		bt6.setBackground(new Color(218, 218, 218));
		panel_2.add(bt6);
		bt6.setFocusable(false);
		bt6.addActionListener(this);
		
		bt7 = new JButton("");
		bt7.setForeground(new Color(48, 169, 141));
		bt7.setFont(new Font("Lucida Handwriting", Font.BOLD | Font.ITALIC, 40));
		bt7.setBackground(new Color(218, 218, 218));
		panel_2.add(bt7);
		bt7.setFocusable(false);
		bt7.addActionListener(this);

		
		bt8 = new JButton("");
		bt8.setForeground(new Color(48, 169, 141));
		bt8.setFont(new Font("Lucida Handwriting", Font.BOLD | Font.ITALIC, 40));
		bt8.setBackground(new Color(218, 218, 218));
		panel_2.add(bt8);
		bt8.setFocusable(false);
		bt8.addActionListener(this);

		
		bt9 = new JButton("");
		bt9.setForeground(new Color(48, 169, 141));
		bt9.setFont(new Font("Lucida Handwriting", Font.BOLD | Font.ITALIC, 40));
		bt9.setBackground(new Color(218, 218, 218));
		panel_2.add(bt9);
		bt9.setFocusable(false);
		bt9.addActionListener(this);

		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(297, 67, 181, 101);
		panel_4.setForeground(new Color(255, 255, 255));
		panel_4.setBackground(new Color(37, 207, 190));
		panel_1.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel scores = new JLabel("Scores");
		scores.setForeground(new Color(242, 242, 242));
		scores.setBackground(new Color(37, 207, 190));
		scores.setFont(new Font("Tahoma", Font.BOLD, 20));
		scores.setHorizontalAlignment(SwingConstants.CENTER);
		scores.setBounds(0, 0,170, 34);
//		scores.setPreferredSize(new Dimension(this.getWidth()-30,34));
		panel_4.add(scores);
		
		JLabel ply1 = new JLabel("Player O :  ");
		ply1.setHorizontalAlignment(SwingConstants.CENTER);
		ply1.setForeground(new Color(242, 242, 242));
		ply1.setFont(new Font("Verdana", Font.BOLD, 16));
		ply1.setBounds(23, 39, 96, 21);
		panel_4.add(ply1);
		
		plysc1 = new JLabel("0");
		plysc1.setForeground(new Color(242, 242, 242));
		plysc1.setFont(new Font("Verdana", Font.BOLD, 16));
		plysc1.setBounds(124, 39, 11, 21);
		panel_4.add(plysc1);
		
		JLabel ply2 = new JLabel("Player X :  ");
		ply2.setHorizontalAlignment(SwingConstants.CENTER);
		ply2.setForeground(new Color(242, 242, 242));
		ply2.setFont(new Font("Verdana", Font.BOLD, 16));
		ply2.setBounds(23, 69, 94, 21);
		panel_4.add(ply2);
		
		plysc2 = new JLabel("0");
		plysc2.setForeground(new Color(242, 242, 242));
		plysc2.setFont(new Font("Verdana", Font.BOLD, 16));
		plysc2.setBounds(122, 69, 11, 21);
		panel_4.add(plysc2);
		
		JLabel lblturn = new JLabel("Turn :");
		lblturn.setBounds(307, 24, 72, 19);
		lblturn.setBackground(new Color(37, 207, 190));
		lblturn.setHorizontalAlignment(SwingConstants.CENTER);
		lblturn.setForeground(new Color(242, 242, 242));
		lblturn.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel_1.add(lblturn);
		
		plyturn = new JLabel("");
		plyturn.setBounds(392, 24, 77, 19);
		plyturn.setBackground(new Color(37, 207, 190));
		if(turn==0) plyturn.setText("Player O");
		else plyturn.setText("Player X");
		plyturn.setHorizontalAlignment(SwingConstants.CENTER);
		plyturn.setForeground(new Color(242, 242, 242));
		plyturn.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel_1.add(plyturn);
		
		reset = new JButton("Reset");
		reset.setBounds(327, 179, 120, 34);
		reset.setForeground(new Color(255, 255, 255));
		reset.setFont(new Font("Verdana", Font.BOLD, 16));
		reset.setBackground(new Color(48, 146, 143));
		reset.addActionListener(this);
		reset.setFocusable(false);
		panel_1.add(reset);
	}
	public void clear()
	{
		bt1.setText("");
		bt2.setText("");
		bt3.setText("");
		bt4.setText("");
		bt5.setText("");
		bt6.setText("");
		bt7.setText("");
		bt8.setText("");
		bt9.setText("");
	}
	public void full()
	{
		if(bt1.getText()!=""  && bt2.getText()!="" && bt3.getText()!="" && bt4.getText()!="" && bt5.getText()!="" && bt6.getText()!="" && bt7.getText()!="" && bt8.getText()!="" && bt9.getText()!="")
		{
			clear();
		}
	}
	public void check()
	{
		if(bt1.getText()==bt2.getText() && bt2.getText()==bt3.getText() && bt1.getText()!="")
		{
			if(bt1.getText()=="O")
			{
				sc1++;
				plysc1.setText(Integer.toString(sc1));
				
				JOptionPane.showMessageDialog(this,"\tPlayer O Wins \nPlayer O : "+sc1+"\nPlayer X : "+sc2);
			}
			else
			{
				sc2++;
				plysc2.setText(Integer.toString(sc2));
				JOptionPane.showMessageDialog(this,"\tPlayer X Wins \nPlayer O : "+sc1+"\nPlayer X : "+sc2);
			}
			clear();
		}
		if(bt4.getText()==bt5.getText() && bt5.getText()==bt6.getText() && bt4.getText()!="")
		{
			if(bt4.getText()=="O")
			{
				sc1++;
				plysc1.setText(Integer.toString(sc1));
				JOptionPane.showMessageDialog(this,"\tPlayer O Wins \nPlayer O : "+sc1+"\nPlayer X : "+sc2);
			}
			else
			{
				sc2++;
				plysc2.setText(Integer.toString(sc2));
				JOptionPane.showMessageDialog(this,"\tPlayer X Wins \nPlayer O : "+sc1+"\nPlayer X : "+sc2);
			}
			clear();

		}
		if(bt7.getText()==bt8.getText() && bt8.getText()==bt9.getText() && bt7.getText()!="")
		{
			if(bt7.getText()=="O")
			{
				sc1++;
				plysc1.setText(Integer.toString(sc1));
				JOptionPane.showMessageDialog(this,"\tPlayer O Wins \nPlayer O : "+sc1+"\nPlayer X : "+sc2);
			}
			else
			{
				sc2++;
				plysc2.setText(Integer.toString(sc2));
				JOptionPane.showMessageDialog(this,"\tPlayer X Wins \nPlayer O : "+sc1+"\nPlayer X : "+sc2);
			}
			clear();

		}
		if(bt1.getText()==bt4.getText() && bt4.getText()==bt7.getText() && bt1.getText()!="")
		{
			if(bt1.getText()=="O")
			{
				sc1++;
				plysc1.setText(Integer.toString(sc1));
				JOptionPane.showMessageDialog(this,"\tPlayer O Wins \nPlayer O : "+sc1+"\nPlayer X : "+sc2);
			}
			else
			{
				sc2++;
				plysc2.setText(Integer.toString(sc2));
				JOptionPane.showMessageDialog(this,"\tPlayer X Wins \nPlayer O : "+sc1+"\nPlayer X : "+sc2);
			}
			clear();
		}
		if(bt2.getText()==bt5.getText() && bt5.getText()==bt8.getText() && bt2.getText()!="")
		{
			if(bt2.getText()=="O")
			{
				sc1++;
				plysc1.setText(Integer.toString(sc1));
				JOptionPane.showMessageDialog(this,"\tPlayer O Wins \nPlayer O : "+sc1+"\nPlayer X : "+sc2);
			}
			else
			{
				sc2++;
				plysc2.setText(Integer.toString(sc2));
				JOptionPane.showMessageDialog(this,"\tPlayer X Wins \nPlayer O : "+sc1+"\nPlayer X : "+sc2);
			}
			clear();
		}
		if(bt3.getText()==bt6.getText() && bt6.getText()==bt9.getText() && bt3.getText()!="")
		{
			if(bt3.getText()=="O")
			{
				sc1++;
				plysc1.setText(Integer.toString(sc1));
				JOptionPane.showMessageDialog(this,"\tPlayer O Wins \nPlayer O : "+sc1+"\nPlayer X : "+sc2);
			}
			else
			{
				sc2++;
				plysc2.setText(Integer.toString(sc2));
				JOptionPane.showMessageDialog(this,"\tPlayer X Wins \nPlayer O : "+sc1+"\nPlayer X : "+sc2);
			}
			clear();
		}
		if(bt1.getText()==bt5.getText() && bt5.getText()==bt9.getText() && bt1.getText()!="")
		{
			if(bt1.getText()=="O")
			{
				sc1++;
				plysc1.setText(Integer.toString(sc1));
				JOptionPane.showMessageDialog(this,"\tPlayer O Wins \nPlayer O : "+sc1+"\nPlayer X : "+sc2);
			}
			else
			{
				sc2++;
				plysc2.setText(Integer.toString(sc2));
				JOptionPane.showMessageDialog(this,"\tPlayer X Wins \nPlayer O : "+sc1+"\nPlayer X : "+sc2);
			}
			clear();
		}
		if(bt3.getText()==bt5.getText() && bt5.getText()==bt7.getText() && bt3.getText()!="")
		{
			if(bt3.getText()=="X")
			{
				sc1++;
				plysc1.setText(Integer.toString(sc1));
				JOptionPane.showMessageDialog(this,"\tPlayer O Wins \nPlayer O : "+sc1+"\nPlayer X : "+sc2);
			}
			else
			{
				sc2++;
				plysc2.setText(Integer.toString(sc2));
				JOptionPane.showMessageDialog(this,"\tPlayer X Wins \nPlayer O : "+sc1+"\nPlayer X : "+sc2);
			}
			clear();
		}
	}
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource()==bt1 && bt1.getText()=="")
		{
			if(turn==0)
			{
				bt1.setText("O");
				bt1.setForeground(dkblue);
				check();
				turn = 1;
				plyturn.setText("Player X");
			}
			else
			{
				bt1.setText("X");
				bt1.setForeground(dkgreen);
				check();
				turn = 0;
				plyturn.setText("Player O");

			}
			
		}
		else if(e.getSource()==bt2 && bt2.getText()=="")
		{
			if(turn==0)
			{
				bt2.setText("O");
				bt2.setForeground(dkblue);
				check();
				turn =1;
				plyturn.setText("Player X");

			}
			else
			{
				bt2.setText("X");
				bt2.setForeground(dkgreen);
				check();
				turn =0;
				plyturn.setText("Player O");

			}
		}
		else if(e.getSource()==bt3 && bt3.getText()=="")
		{
			if(turn==0)
			{
				bt3.setText("O");
				bt3.setForeground(dkblue);
				check();
				turn =1;
				plyturn.setText("Player X");

			}
			else
			{
				bt3.setText("X");
				bt3.setForeground(dkgreen);
				check();
				turn=0;
				plyturn.setText("Player O");

			}
		}
		else if(e.getSource()==bt4 && bt4.getText()=="")
		{
			if(turn==0)
			{
				bt4.setText("O");
				bt4.setForeground(dkblue);
				check();
				turn =1;
				plyturn.setText("Player X");

			}
			else
			{
				bt4.setText("X");
				bt4.setForeground(dkgreen);
				check();
				turn =0;
				plyturn.setText("Player O");

			}
		}
		else if(e.getSource()==bt5 && bt5.getText()=="")
		{
			if(turn==0)
			{
				bt5.setText("O");
				bt5.setForeground(dkblue);
				check();
				turn=1;
				plyturn.setText("Player X");

			}
			else
			{
				bt5.setText("X");
				bt5.setForeground(dkgreen);
				check();
				turn= 0;
				plyturn.setText("Player O");

			}
		}
		else if(e.getSource()==bt6 && bt6.getText()=="")
		{
			if(turn==0)
			{
				bt6.setText("O");
				bt6.setForeground(dkblue);
				check();
				turn=1;
				plyturn.setText("Player X");


			}
			else
			{
				bt6.setText("X");
				bt6.setForeground(dkgreen);
				check();
				turn= 0;
				plyturn.setText("Player O");

			}
		}
		else if(e.getSource()==bt7 && bt7.getText()=="")
		{
			if(turn==0)
			{
				bt7.setText("O");
				bt7.setForeground(dkblue);
				check();
				turn=1;
				plyturn.setText("Player X");
				


			}
			else
			{
				bt7.setText("X");
				bt7.setForeground(dkgreen);
				check();
				turn= 0;
				plyturn.setText("Player O");
			}
		}
		else if(e.getSource()==bt8 && bt8.getText()=="")
		{
			if(turn==0)
			{
				bt8.setText("O");
				bt8.setForeground(dkblue);
				check();
				turn=1;
				plyturn.setText("Player X");
			}
			else
			{
				bt8.setText("X");
				bt8.setForeground(dkgreen);
				check();
				turn= 0;
				plyturn.setText("Player O");
			}
		}
		else if(e.getSource()==bt9 && bt9.getText()=="")
		{
			if(turn==0)
			{
				bt9.setText("O");
				bt9.setForeground(dkblue);
				check();
				turn=1;
				plyturn.setText("Player X");

			}
			else
			{
				bt9.setText("X");
				bt9.setForeground(dkgreen);
				check();
				turn= 0;
				plyturn.setText("Player O");
			}
		}
		else if(e.getSource()==reset)
		{
			this.dispose();
			main(null);
		}
		full();
	}
	public static void main(String[] args) 
	{
		Tic_Tac t = new Tic_Tac();
		t.setVisible(true);
	}
}
