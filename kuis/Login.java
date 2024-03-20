
import javax.swing.*;
import java.awt.event.*;

class GUIde extends JFrame implements ActionListener {

    JTextField fnama = new JTextField(10);
    JLabel lnama = new JLabel(" Nama Lengkap ");
    JTextField fpassword = new JPasswordField(10);
    JLabel lpassword = new JLabel(" Password ");
    JLabel lstatus = new JLabel("");
    JButton tombol;

    public GUIde(){
        setTitle("Login");
        setSize(300,160);
        setDefaultCloseOperation(3);
        setVisible(true);

        tombol = new JButton("Masukkan"); 
    setLayout(null);
	add(lnama);
	add(fnama);
    add(lpassword);
	add(fpassword);
    add(tombol);
    add(lstatus);

    lnama.setBounds(10,10,120,20);
	fnama.setBounds(130,10,150,20);
    lpassword.setBounds(10,40,120,20);
    fpassword.setBounds(130,40,150,20);
    tombol.setBounds(80,90,100,20);
    lstatus.setBounds(30,65,200,20);
    tombol.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource()==tombol){
            String a = fnama.getText(); 
           if(a.equals("Tukang_107")&&fpassword.getText().equals("Tukang_107")){
            pack();
            setVisible(true);
            dispose();
           }else { lstatus.setText("Username atau Password Salah");}
        };

    }

    

    

}

public class Login {
    public static void main(String[] args) {
        new GUIde ();
    }
}