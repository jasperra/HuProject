/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.hu.codeanalyzer.jr;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
@Messages("CTL_SpotifyAction=Spotify")
public final class SpotifyAction implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO implement action body
    }
}
