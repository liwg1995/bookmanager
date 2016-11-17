package wyf.hxl;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import javax.swing.table.*;
import javax.swing.event.*;import java.sql.*;
import java.util.*;import java.util.Date;
import javax.swing.border.*;

public class introduce extends JPanel implements ActionListener{
	JSplitPane jsp=new JSplitPane(JSplitPane.VERTICAL_SPLIT);
    private JPanel jp=new JPanel();
    JLabel jianjie = new JLabel(); 
    public introduce(){
 	   jp.setLayout(null);
 	   jianjie.setBounds(100,50,600,35);
 	   jianjie.setForeground(java.awt.Color.red);
	   jianjie.setFont(new Font("楷体",4,13));
	   
	   jianjie.setText("<html><body>图书馆管理系统合运用了管理科学，系统科学，运筹学，统计学，计算机科学等学科的知识。可以通俗的简化的描述图书馆管理系统的三要素：系统的观点、数学的方法以及计算机的应用。<br>图书馆管理系统的界面特点：<br>在计算机软件技术中，人机界面已经发展成为一个重要的分支。MIS人机界面设计一般遵循以下一些基本原则:<br>1．以通信功能作为界面设计的核心<br>2．界面必须始终一致<br>3．界面必须使用户随时掌握任务的进展情况<br>4．界面必须能够提供帮助<br>5．界面友好、使用方便<br>6．输入画面尽可能接近实际<br>7．具有较强的容错功能<br><br><br><br><br><br><br>欢迎使用本系统！！！！<br></body></html>"
			   
			   );
	   add(jianjie); 
    }
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
