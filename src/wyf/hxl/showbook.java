package wyf.hxl;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import javax.swing.table.*;
import javax.swing.event.*;import java.sql.*;
import java.util.*;import java.util.Date;
import javax.swing.border.*;

public class showbook extends JPanel implements ActionListener{
	JSplitPane jsp=new JSplitPane(JSplitPane.VERTICAL_SPLIT);
    private JPanel jp=new JPanel();
    JLabel jianjie = new JLabel(); 
    public showbook(){
 	   jp.setLayout(null);
 	   jianjie.setBounds(100,50,600,35);
 	   jianjie.setForeground(java.awt.Color.black);
	   jianjie.setFont(new Font("楷体",4,15));
	   
	   jianjie.setText("<html><body>注意！！！！！<br>请点击查询数据<br>选择简单查询<br>复选框选择购进日期<br>在之后的文本框内输入：<br><br><br><br>2016.6.26<br><br><br>因为：<br><br><br><br><br><br><br><br>购入的书籍是在同一天购入的<br><br><br><br><br><br><br><br>欢迎使用本系统！！！！<br></body></html>"
			   
			   );
	   add(jianjie); 
    }
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
