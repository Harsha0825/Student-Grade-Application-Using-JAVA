import java.awt.event.*;
import java.io.*;

import javax.swing.*;
class nframe extends JFrame{
	JLabel jl1,jl2,jl3,jl4,jl5,jl6,jl7,jl8,jl9,jl10,jl11,jl12,jl13,jl14,jl15,jl16,jl17;
	repn name11;
	sub1 ss1;
	sub2 sss1;
	sub3 ssss1;
	sub4 sssss1;
	double s1,s2,s3,s4,sum=0,per;
	String grad;
	nframe(){
		super("Report card");

		
			try {
				FileInputStream fis=new FileInputStream("roh.txt");
				ObjectInputStream ois=new ObjectInputStream(fis);
			name11=(repn)ois.readObject();
			ss1=(sub1)ois.readObject();
			sss1=(sub2)ois.readObject();
			ssss1=(sub3)ois.readObject();
			sssss1=(sub4)ois.readObject();
			ois.close();
			fis.close();
			}
		catch(Exception ae) {
			ae.getStackTrace();
		}
		
		
		
		
		
		 jl1=new JLabel("*   Report Card   *");
		jl1.setBounds(375,0,200,100);
		add(jl1);
		

		jl2=new JLabel("     Name  =>");
		jl2.setBounds(100,100,100,25);
		add(jl2);
		

		 jl3=new JLabel("Subject-1  =>");
		jl3.setBounds(100,200,100,25);
		add(jl3);
		

		 jl4=new JLabel("Subject-2  =>");
		jl4.setBounds(100,300,100,25);
		add(jl4);
		

		jl5=new JLabel("Subject-3  =>");
		jl5.setBounds(100,400,100,25);
		add(jl5);


		 jl6=new JLabel("Subject-4  =>");
		jl6.setBounds(100,500,100,25);
		add(jl6);

		jl7=new JLabel("Total Marks  =>");
		jl7.setBounds(100,600,100,25);
		add(jl7);


		jl8=new JLabel("Grade=>");
		jl8.setBounds(500,600,100,25);
		add(jl8);


		jl9=new JLabel("Percentage=>");
		jl9.setBounds(100,700,100,25);
		add(jl9);

		jl10=new JLabel(name11.name);
		
		jl10.setBounds(200,100,100,25);
		add(jl10);
		

		 jl11=new JLabel(ss1.s1);
		jl11.setBounds(200,200,100,25);
		add(jl11);
		

		jl12=new JLabel(sss1.s2);
		jl12.setBounds(200,300,100,25);
		add(jl12);
		

		 jl13=new JLabel(ssss1.s3);
		jl13.setBounds(200,400,100,25);
		add(jl13);


		jl14=new JLabel(sssss1.s4);
		jl14.setBounds(200,500,100,25);
		add(jl14);

		s1=Double.parseDouble(ss1.s1);
		s2=Double.parseDouble(sss1.s2);
		s3=Double.parseDouble(ssss1.s3);
		s4=Double.parseDouble(sssss1.s4);
		sum=s1+s2+s3+s4;
		 jl15=new JLabel(String.valueOf(sum));
		jl15.setBounds(200,600,100,25);
		add(jl15);
		
		if(sum<=400 && sum>300) {
			grad="A";
		}
		else if(sum<=300 && sum>200) {
			grad="B";
		}
		else if(sum<=200 && sum>100)
		{
			grad="C";
		}
		else
		{
			grad="D";
		}

		jl16=new JLabel(grad);
		jl16.setBounds(600,600,100,25);
		add(jl16);
		per=(sum/400)*100;

		jl17=new JLabel(String.valueOf(per)+"%");
		jl17.setBounds(200,700,100,25);
		add(jl17);
		
		setLayout(null);
		setSize(800,800);
		setVisible(true);

	}
}
class repn implements Serializable{
	String name;
	repn(String nam){
		name=nam;
	}
	public String toString() {
		return name;
	}
}
class sub1 implements Serializable{
	String s1;
	sub1(String sn1){
		s1=sn1;
	}
}
class sub2 implements Serializable{
	String s2;
	sub2(String sn2){
		s2=sn2;
	}
}
class sub3 implements Serializable{
	String s3;
	sub3(String sn3){
		s3=sn3;
	}
}
class sub4 implements Serializable{
	String s4;
	sub4(String sn4){
		s4=sn4;
	}
}
class report extends JFrame{
	JTextField jt1,jt2,jt3,jt4,jt5;
	JLabel jl0,jl1,jl2,jl3,jl4,jl5;
	JButton jb1,jb2;
	repn name1;
	sub1 ss;
	sub2 sss;
	sub3 ssss;
	sub4 sssss;
	report(){
		super("Report Card");
		jl0=new JLabel("Report Card");
		jl0.setBounds(300,0,100,100);
		add(jl0);
		jl1=new JLabel("Name");
		jl1.setBounds(100,100,100,25);
		add(jl1);
		
		jt1=new JTextField(20);
		jt1.setBounds(500,100,100,25);
		add(jt1);
		

		 jl2=new JLabel("Subject-1  =>");
		jl2.setBounds(100,200,100,25);
		add(jl2);
		
		 jt2=new JTextField(3);
		jt2.setBounds(500,200,100,25);
		add(jt2);
		
	 jl3=new JLabel("Subject-2  =>");
		jl3.setBounds(100,300,100,25);
		add(jl3);
		 jt3=new JTextField(3);
		jt3.setBounds(500,300,100,25);
		add(jt3);
		
		
		jl4=new JLabel("Subject-3  =>");
		jl4.setBounds(100,400,100,25);
		add(jl4);
		 jt4=new JTextField(3);
		jt4.setBounds(500,400,100,25);
		add(jt4);
		
		jl5=new JLabel("subject-4  =>");
		jl5.setBounds(100,500,100,25);
		add(jl5);
		
		jt5=new JTextField(3);
		jt5.setBounds(500,500,100,25);
		add(jt5);
		
		 jb1=new JButton("save");
		jb1.setBounds(200,600,80,30);
		add(jb1);
jb1.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
			name1=new repn(jt1.getText());
			ss=new sub1(jt2.getText());
			sss=new sub2(jt3.getText());
			ssss=new sub3(jt4.getText());
			sssss=new sub4(jt5.getText());
				try {
				FileOutputStream fos=new FileOutputStream("roh.txt");
				ObjectOutputStream oos=new ObjectOutputStream(fos);
				
				oos.writeObject(name1);
				oos.writeObject(ss);
				oos.writeObject(sss);
				oos.writeObject(ssss);
				oos.writeObject(sssss);
				oos.close();
				fos.close();

				}
				catch(Exception ae) {
					ae.getStackTrace();
				}
				try {
				JOptionPane.showMessageDialog(null,"Success");
    }
 catch(Exception ae){
            JOptionPane.showMessageDialog(null,"Error");
    }
	}
});
		jb2=new JButton("Display");
		jb2.setBounds(400,600,80,30);
		add(jb2);
		jb2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new nframe();
			}
		});
		
		setSize(800,700);
		setLayout(null);
		setVisible(true);
		
	}
}
public class StudentGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
new report();
	}

}
