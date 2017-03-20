/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.hu.codeanalyzer.jr;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionRegistration;
import org.openide.util.NbBundle.Messages;

@ActionID(
        category = "Tools",
        id = "nl.hu.codeanalyzer.jr.SpotifyAction"
)
@ActionRegistration(
        iconBase = "nl/hu/codeanalyzer/jr/Capture.PNG",
        displayName = "#CTL_SpotifyAction"
)
@ActionReference(path = "Menu/Tools", position = 1800, separatorBefore = 1750, separatorAfter = 1850)
@Messages("CTL_SpotifyAction=Read file")
public final class SpotifyAction extends JPanel implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        JFileChooser jFileChooser = new JFileChooser();
        jFileChooser.setCurrentDirectory(new File("."));
        jFileChooser.setDialogTitle("Select a file you wish to read");
        jFileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        jFileChooser.setAcceptAllFileFilterUsed(false);
        
        if(jFileChooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION){
            int response = JOptionPane.showConfirmDialog(null, "You selected: " + jFileChooser.getSelectedFile() + "\nAre you sure you want to read this file", "Confirm",
                    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if(response == JOptionPane.YES_OPTION){
                try {
			FileReader fileReader = new FileReader(jFileChooser.getSelectedFile());
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			StringBuffer stringBuffer = new StringBuffer();
			String line;
			while ((line = bufferedReader.readLine()) != null) {
				stringBuffer.append(line);
				stringBuffer.append("\n");
			}
			fileReader.close();
			JOptionPane.showMessageDialog(this, stringBuffer.toString());
		} catch (IOException ex) {
			ex.printStackTrace();
		}              
            }
        }
    }
}
