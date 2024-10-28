import java.io.File;
import java.util.*;
import java.awt.FlowLayout;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.net.URL;
import javax.sound.sampled.*;
import javax.swing.*;


public class DisplayImage {
    public static void main(String[] args) throws IOException {
        File file = new File("GradeReport.txt");
        Scanner scan = new Scanner(file);
        String FirstName = "";
        String LastName = "";
        int age = 0;

        Random rand = new Random();

        int LifeProbabilityOrSomeShit = 0;


        while(scan.hasNext()){
            FirstName = scan.next();
            LastName = scan.next();
            age = scan.nextInt();
            LifeProbabilityOrSomeShit = rand.nextInt();
            if(age != LifeProbabilityOrSomeShit){
                if(FirstName.equalsIgnoreCase("Chad")){
                    DisplayImage chad = new DisplayImage();
                    makeSound();
                    
                }
                System.out.println(FirstName + " " + LastName + " has been beheaded at age " + age + " Vive la revlocuein");
            }else if(age == LifeProbabilityOrSomeShit){
                System.out.println(FirstName + " " + LastName + " is going to elmos world at the age of: " + age + " Vive la Sesame Street");
            }

        }
    }

    public DisplayImage() throws IOException
    {
        BufferedImage img=ImageIO.read(new File("53y53i.jpg"));
        ImageIcon icon=new ImageIcon(img);
        JFrame frame=new JFrame();
        frame.setLayout(new FlowLayout());
        frame.setSize(200,300);
        JLabel lbl=new JLabel();
        lbl.setIcon(icon);
        frame.add(lbl);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public static void makeSound(){
        File lol = new File("1412271310.wav");
        
    
        try{
            Clip clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(lol));
            clip.start();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

}
