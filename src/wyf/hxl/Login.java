package wyf.hxl;

import javax.swing.*;import java.awt.*;
import java.awt.event.*;import javax.swing.table.*;
import javax.swing.event.*;import java.sql.*;
import java.util.*;import java.util.Date;
import javax.swing.border.*;
   
import javax.swing.Timer;
import java.text.SimpleDateFormat; 


public class Login extends JFrame implements ActionListener{
    private JPanel jp=new JPanel();//创建JPanel对象
    private JLabel []jlArray={//创建标签组
    	   new JLabel("用户IP:"),new JLabel("端口号："),new JLabel("用户名:"),
    	   new JLabel("密   码:"),new JLabel("")
    };
    private JButton[] jbArray={//创建按钮数组
    	new JButton(""),new JButton(""),new JButton("")
    };
    private JTextField[] jtxtArray={ //创建文本框
    	   new JTextField("127.0.0.1"),new JTextField("3306"),new JTextField(""),
    }; 
    private JPasswordField jpassword=new JPasswordField(""); //创建密码框
    String sql;
    DataBase db;
    public Login(){
    	  jp.setLayout(null); //设置JPanel的布局管理器
    	  
    	  for(int i=0;i<4;i++){ //对标签与按钮控件循环处理		
	          jlArray[i].setBounds(30,20+i*50,80,25);//设置标签与按钮的大小和位置	
	          jlArray[i].setFont(new Font("华文行楷",1,13));//字体大小
	          jlArray[i].setForeground(Color.BLUE);
	          
	          jlArray[4].setForeground(Color.RED);
	          jp.add(jlArray[i]);//将标签和按钮添加进JPanel容器中
          }
          for(int i=0;i<3;i++){//设置按钮的大小位置并为其添加事件监听器
	          jbArray[i].setBounds(10+i*120,230,100,25);
	          
	    
	          
	          jbArray[0].setText("学生登录");
	          jbArray[1].setText("清除");
	          jbArray[2].setText("管理员登陆");
	          
	          
	          
	          /*jbArray[i].setOpaque(false);

	          jlArray[i].setForeground(new Color(2,2,2));  //此颜色值随便设置，只起占位作用，但是必须加上此句，否则不会出现透明背景效果。

	          jbArray[i].setIcon(new ImageIcon("res/button.jpg"));*/
	         
	          
	          
	          /*Icon icon=new ImageIcon("res/button.jpg");
	          jbArray[i].setIcon(icon);
	          jbArray[0].setText("学生登录");
	          jbArray[1].setText("清除");
	          jbArray[2].setText("管理员登陆");*/
	          
	          
	          Icon icon1=new ImageIcon("res/button1.jpg");
	          jbArray[0].setIcon(icon1);
	          
	          
	          Icon icon2=new ImageIcon("res/button2.jpg");
	          jbArray[2].setIcon(icon2);
	          
	          
	          Icon icon3=new ImageIcon("res/button3.jpg");
	          jbArray[1].setIcon(icon3);
	          
	          
	          
	        
	          
	          jbArray[i].setBorder(BorderFactory.createRaisedBevelBorder());
	          
	          
	          jbArray[i].setBorderPainted(false);
	        
	          /*jbArray[i] .setFont(new java.awt.Font("华文行楷", 1, 15));
	          jbArray[i].setBackground(Color.green);
	          jbArray[i].setForeground(java.awt.Color.red);*/
	          jbArray[i].setMargin(new Insets(0,0,0,0));
	          
	          
	          

	          
	         
           
	          
	          
	          
	       
	          jbArray[i].setBorder(BorderFactory.createRaisedBevelBorder());
	          jp.add(jbArray[i]);	
	          jbArray[i].addActionListener(this);      
          }
          for(int i=0;i<3;i++){//设置文本框的大小位置并为其添加事件监听器
	          jtxtArray[i].setBounds(80,20+50*i,180,25);
	          jtxtArray[0].setEditable(false);
	          jtxtArray[1].setEditable(false);
	          jp.add(jtxtArray[i]);
	          jtxtArray[i].addActionListener(this);
          }
          jpassword.setBounds(80,170,180,25);//设置密码框的大小位置
          jp.add(jpassword);//将密码框添加进JPanel容器
          jpassword.setEchoChar('*');//设置密码框的回显字符
          jpassword.addActionListener(this);//为密码框注册监听器
          jlArray[4].setBounds(10,280,300,25);//设置用于显示登录状态的标签的大小位置
          jp.add(jlArray[4]); //将标签添加进JPanel容器
          this.add(jp);	
 	      Image image=new ImageIcon("res/ico.gif").getImage();//对logo图片进行初始化  
 	      this.setIconImage(image);
          //设置窗体的大小位置及可见性
 	      
 	      
 	      
 	    
 	      
 	     JLabel time = new JLabel(); 
 	     time.setBounds(100,260,600,35);
 	     time.setForeground(java.awt.Color.green);
         add(time);   
         this.setTimer(time);   
 	      
 	      
 	      
 	      
 	      
 	      
 	      
 	      
 	      
 	      
 	      
 	      
 	     JLabel l=new JLabel();
   	     Icon icon=new ImageIcon("res/books.jpg");     //在此直接创建对象
   	     l.setIcon(icon);
   	     l.setBounds(0, 0, icon.getIconWidth(),icon.getIconHeight());
   	     jp.add(l,new Integer(Integer.MIN_VALUE));
   	     getContentPane().add(jp);
         pack();             //窗口适应组件大小
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   //用来关闭窗口的
   	     setVisible(true);
         /*JLabel jlCimg = new JLabel();
         ImageIcon img = new ImageIcon("res/book.jpg");
         jlCimg.setIcon(img);
         Container c = this.getContentPane();
         c.add(jlCimg); */
          this.setTitle("Welcome！欢迎登录图书管理系统");
          this.setResizable(false);
          this.setBounds(100,100,400,350);
          this.setVisible(true);
    }
    //实现ActionListener接口中的方法
    public void actionPerformed(ActionEvent e)
    {//事件源为文本框
    	String mgno=jtxtArray[2].getText().trim();
    	String mgIP=jtxtArray[0].getText().trim();
	    String port=jtxtArray[1].getText().trim();
        String message=mgIP+":"+port;
	    DataBase.message=message;//将本方法椎谋淞孔魑问持蹈鳧ataBase方法的私有变量
	    DataBase.log=this;
          if(e.getSource()==jtxtArray[0]){
	         jtxtArray[1].requestFocus();//切换输入焦点到密码框
    	    }
    	    if(e.getSource()==jtxtArray[1]){
    		   jtxtArray[2].requestFocus();//切换输入焦点到密码框
    	    }
    	    if(e.getSource()==jtxtArray[2])	{	   
    		   jpassword.requestFocus();//切换输入焦点到密码框
    	    }
    	    else if(e.getSource()==jbArray[1]){//事件源为清空按钮
    	        //清空所有信息
    		    jlArray[4].setText("");
    		    jtxtArray[2].setText("");
    		    jpassword.setText("");
    		    //将输入焦点设置到文本框
    		    jtxtArray[2].requestFocus();
    	    }
    	    else if(e.getSource()==jbArray[2]){//事件源为管理员登录按钮
    	        //判断用户名和密码是否匹配
    	        if(!mgno.matches("\\d+"))
    	        {//如果用户名格式输入有误
	    	    	JOptionPane.showMessageDialog(this,"用户名格式错误！！！","信息",
	    	    						JOptionPane.INFORMATION_MESSAGE);
	    	    	return;
	    	    }
	    	    if(jtxtArray[0].getText().trim().equals(""))
	    	    {//如果"用户IP"文本框为空，提示
	    	    	JOptionPane.showMessageDialog(this,"用户IP不能为空！！！","信息",
	    	    	                                JOptionPane.INFORMATION_MESSAGE);
	    	    	return;
	    	    }
	    	    if(jtxtArray[1].getText().trim().equals(""))
	    	    {//如果"端口号"文本框为空，提示
	    	     	    JOptionPane.showMessageDialog(this,"用户端口号不能为空！！！","信息",
	    	     	    						JOptionPane.INFORMATION_MESSAGE);
	    	    	    return;
		    	}
	    	    sql="select mgNo,password from manager where mgNo="+Integer.parseInt(mgno);
	            db=new DataBase();
		        db.selectDb(sql);//以上三行是对用户名和密码进行查询，验证身份
		        try{
					String mgNo="";
					String password="";
					while(db.rs.next()){//取出结果集中数据并赋值
						mgNo=db.rs.getString(1).trim();
				        password=db.rs.getString(2).trim();					
				    }
			        if(jtxtArray[2].getText().trim().equals(mgNo)&&
		    		    String.valueOf(jpassword.getPassword()).equals(password)){//登录成功
		    			jlArray[4].setText("恭喜您，登录成功！！！");
		    			new Root(mgNo);
		    			this.dispose();   			
		    	    }
			    	else{//登录失败
			    		jlArray[4].setText("对不起，登录失败！请检查用户名或密码是否正确！");    
			    	}
		        }
	            catch(Exception e1){e1.printStackTrace();}
		        db.dbClose();//关闭数据库链接
            }
	    	else if(e.getSource()==jbArray[0]){//事件源为学生登录按钮
	    	     if(!jtxtArray[2].getText().trim().matches("\\d+")){
					//若学号格式错误，输出提示对话框
					JOptionPane.showMessageDialog(this,"输入有误,学号只能为数字!!!",
									"消息", JOptionPane.INFORMATION_MESSAGE);
		    		return;
	    	     }
	    	     if(jtxtArray[0].getText().trim().equals("")){//若"用户IP"文本框输入为空，提示
			    	JOptionPane.showMessageDialog(this,"用户IP不能为空！！！","信息",
			    						JOptionPane.INFORMATION_MESSAGE);
			    	return;
	    	     }
	    	     if(jtxtArray[1].getText().trim().equals("")){//若"端口号"文本框输入为空，提示
		    	    	JOptionPane.showMessageDialog(this,"用户端口号不能为空！！！",
		    	    				"信息",JOptionPane.INFORMATION_MESSAGE);
		    	    	return;
	    	     }
	    	     //查询学号文本中所输学号是否存在于STUDENT表中
	             sql="select StuNO,Password from STUDENT where StuNO="
	           				+Integer.parseInt(jtxtArray[2].getText().trim());
	             db=new DataBase();
		         db.selectDb(sql);
			     try{
					if(!(db.rs.next())){//若学号错误，输出提示对话框
						JOptionPane.showMessageDialog(this,"输入了错误的学号！！",
								"消息", JOptionPane.INFORMATION_MESSAGE);
					}
					else{//得到输入学号的学生的姓名和班级
						String stuNO=db.rs.getString(1).trim(),
						       password=db.rs.getString(2).trim();
						if(jtxtArray[2].getText().trim().equals(stuNO)&&
				    		String.valueOf(jpassword.getPassword()).equals(password)){//登录成功
			    			jlArray[4].setText("恭喜您，登录成功！！！");
			    			new StudentSystem();
			    			this.dispose();
			    		}
			    		else{//登录失败
			    			jlArray[4].setText("对不起，登录失败！请检查用户名或密码是否正确！");    
			    		}
					}
		    	}
				catch(Exception ex) { ex.printStackTrace();}
		    	db.dbClose(); //关闭数据库链接	
	      }
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
    
    
    
    
    
    
    
    public static void main(String[]args)
    {
    	new Login();
    	
    }
    }

