////////////////////////////////////////////////////////////////////////////////////
//
//  C212
//
//  Lab8
//  @Author Brady Anderson 
//  Explain: 
//  	Main application for random shape generator app
//  	NOTE: You are encouraged to experiment and try out various approaches
//  	The comments given here are just guidelines to get you started 
//  	Possibly, this problem can be completed in many ways.
///////////////////////////////////////////////////////////////////////////////////

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.Random;

/*
 * Main application for random shape generator app
 * NOTE: You are encouraged to experiment and try out various approaches
 * The comments given here are just guidelines to get you started 
 * Possibly, this problem can be completed in many ways.
 */
public class ShapeWindow extends JFrame{
	
	 /**
	   * added serial UID due to error w/o
	   */
	private static final long serialVersionUID = 1L;
    JPanel shapeDriver;

    public ShapeWindow() {
        super();
		/*
		Create a ShapeDriver object here (which is a JPanel)
		and add it to ShapeWindow (which is a JFrame). Don't forget to setSize,
		setVisible and any other required attributes (you might want to add the ShapeDriver
		object to the ContentPane (using this.getContentPane()) instead of directly adding
		to ShapeWindow.
		
		You can initialize a Timer here (with appropriate milliseconds and your 
		ShapeDriver obj created above as params). Use the timer.start() method to start Timer.
		However, you would also want to do Thread.sleep(<Appropriate milliseconds here>) afterwards
		It should be within a try-catch block. You can leave the catch block empty or provide some sysout msg
		You can stop your timer object after the try-catch block
		
		*/
        // initialize stuff here
        ShapeDriver panel = new ShapeDriver();
        
        // shape driver setup -> must be same name as class name
        panel.addKeyListener(new ShapeDriver());
        getContentPane().add(panel);
        
        Random myColor = new Random();
        
        // frame properties
        setVisible(true);
        setSize(600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBackground(new Color(myColor.nextInt(255), myColor.nextInt(255), myColor.nextInt(255)));
        
        
        Timer timer = new Timer(100, (ActionListener) shapeDriver);
        
        timer.start();  // start timer
        
        try {
        	Thread.sleep(20000);
        } catch(Exception e) {
        	System.out.println("Something didn't work");
        }
        timer.stop();   // stop timer
    }

    public static void main(String[] args) {
        // Create a JFrame and invoke the constructor
        @SuppressWarnings("unused")
		JFrame shapeWindow = new ShapeWindow();
    }
}
