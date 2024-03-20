
import javax.swing.*;
import java.awt.event.*;
import java.lang.Math;

class MyGui extends JFrame implements ActionListener {

    JTextField falas = new JTextField(10);
    JLabel lalas = new JLabel("Alas");
    JTextField ftinggi = new JTextField(10);
    JLabel ltinggi = new JLabel("Tinggi");
    JLabel lsimiring = new JLabel("");
    JButton tombol;

    public MyGui(){
        setTitle("Alas");
        setSize(300,200);
        setDefaultCloseOperation(3);
        setVisible(true);

        tombol = new JButton("Hitung"); 
    setLayout(null);
	add(lalas);
	add(falas);
    add(ltinggi);
	add(ftinggi);
    add(tombol);
    add(lsimiring);
   
    lalas.setBounds(10,10,120,20);
	falas.setBounds(130,10,150,20);
    ltinggi.setBounds(10,40,120,20);
    ftinggi.setBounds(130,40,150,20);
    tombol.setBounds(80,90,100,20);
    lsimiring.setBounds(30,65,200,20);
   
    tombol.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource()==tombol){
            double a = Double.parseDouble(falas.getText()); 
            double b = Double.parseDouble(ftinggi.getText());
           
           double hasil = sisimiring(a, b);

            lsimiring.setText("Sisi Miring = "+ hasil);}
        }

    private double sisimiring(double a, double b) {
        double s = a*a +b*b;
        double k = Math.sqrt(s);
        return k;
    };

    }



public class ProgramHitungSiku {
    public static void main(String[] args) {
        new MyGui ();
    }
}