/*	Apple MacOS Compatibility 
	========================================
  
	  @author 	Thomas J Birmingham
	  @email	birmingham4@southernct.edu
	  @since    1.1.0
	  
	========================================  */

import java.awt.Font;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;


public class MacCompatibility
{
	public static void setLookAndFeel()
	{
		// Set JVM Look & Feel to cross-platform Java L&F (also called Metal)
        try {
        	UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        }
        catch (ClassNotFoundException ex) {}
        catch (InstantiationException ex) {}
        catch (IllegalAccessException ex) {}
        catch (UnsupportedLookAndFeelException ex) {}
        
        // Set font style and size
        String fontStyle = "Monospaced"; // Lucida Console also support: Serif, SansSerif, Monospaced, Dialog, and DialogInput
        int fontSize = 14;    
		UIManager.put("OptionPane.buttonFont", new Font(fontStyle, Font.PLAIN, fontSize));
		UIManager.put("Label.font", new Font(fontStyle, Font.PLAIN, fontSize));
		UIManager.put("TextField.font", new Font(fontStyle, Font.PLAIN, fontSize));
		UIManager.put("TextPane.font", new Font(fontStyle, Font.PLAIN, fontSize));
	}	
}
