package wyf.hxl;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.Timer;
import javax.swing.*;import java.awt.*;
import java.awt.event.*;import javax.swing.table.*;
import javax.swing.event.*;import java.sql.*;
import java.util.*;import java.util.Date;
import javax.swing.border.*;
   

import java.text.SimpleDateFormat; 



public class timenow1 extends JPanel implements ActionListener{
	JSplitPane jsp=new JSplitPane(JSplitPane.VERTICAL_SPLIT);
    private JPanel jp=new JPanel();
    JLabel time = new JLabel(); 
    //JLabel l=new JLabel();
	     
    public timenow1(){
	   jp.setLayout(null);
	   time.setBounds(300,600,600,35);
	   time.setForeground(java.awt.Color.green);
	   time.setFont(new Font("楷体",1,40));
	   Icon icon3=new ImageIcon("res/manage.jpg");
       time.setIcon(icon3);
       add(time);   
       
       this.setTimer(time);
       
      
       
       
   }
   private void setTimer(JLabel time){   
       final JLabel varTime = time;   
       Timer timeAction = new Timer(1000, new ActionListener() {          
 
           public void actionPerformed(ActionEvent e) {       
               long timemillis = System.currentTimeMillis();   
               //转换日期显示格式   
               SimpleDateFormat df = new SimpleDateFormat("当前时间：yyyy-MM-dd HH:mm:ss");   
               varTime.setText(df.format(new Date(timemillis)));   
           }      
       });            
       timeAction.start();        
   }   
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}