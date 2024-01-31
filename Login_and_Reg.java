import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login_and_Reg {

public static void main(String[] args) {
	//signup
	JFrame signupframe = new JFrame("Registration");
	JTextField enterusername = new JTextField("");
	JTextField createpass = new JTextField("");

	//Have an account?

	JButton b = new JButton("Sign up");
	JButton b1 = new JButton("Login Here");


	//login
	JFrame loginframe = new JFrame("Login");
	JTextField username = new JTextField("");
	JTextField pass = new JTextField("");

	//dont have an acc

	JButton b4 = new JButton("Login");
	JButton b5 = new JButton("Sign up Here");

	// Sign up bg
        ImageIcon mnymttr = new ImageIcon("C:\\Users\\IT\\Desktop\\System kay vlad\\mmsignup.png");

        JLabel signupicon = new JLabel(mnymttr);
        signupicon.setBounds(0,0,600,400);

        // Login bg
        ImageIcon mnymttrs = new ImageIcon("C:\\Users\\IT\\Desktop\\System kay vlad\\mmlogin.png");

        JLabel loginicon = new JLabel(mnymttrs);
        loginicon.setBounds(0,0,600,400);











	b1.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
	if (!b1.isSelected()) {
		loginframe.setVisible(true);
		signupframe.setVisible(false);




}
}

	});
	b5.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
	if (!b1.isSelected()) {
		signupframe.setVisible(true);
		loginframe.setVisible(false);




}
}

	});


signupframe.add(signupicon);
signupframe.setLayout(null);
signupframe.setVisible(true);
signupframe.setBounds(450,100,610,440);
//reg

enterusername.setBounds(60,140,165,20);
createpass.setBounds(60,220,165,20);

b.setBounds(130,265,80,20);
b1.setBounds(150,355,80,20);

//login
username.setBounds(335,140,165,20);
pass.setBounds(335,215,165,20);

b4.setBounds(420,280,80,20);
b5.setBounds(450,335,80,20);


loginframe.setLayout(null);
loginframe.setVisible(false);
loginframe.setBounds(450,100,610,440);

//reg

signupframe.add(enterusername);
signupframe.add(createpass);

signupframe.add(b);
signupframe.add(b1);
//login
loginframe.add(username);
loginframe.add(pass);

loginframe.add(b4);
loginframe.add(b5);
signupframe.add(signupicon);
loginframe.add(loginicon);




}
}