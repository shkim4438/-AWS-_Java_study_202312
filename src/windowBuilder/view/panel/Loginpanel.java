package windowBuilder.view.panel;

import javax.swing.JPanel;

public class Loginpanel extends InitPanel {
	
public Loginpanel() {
	MainPanel mainpanel = MainPanel.getInstance();
	setSize(mainpanel.getSize().width, mainpanel.getSize().height);
	setLayout(null);
	setBorder(null);
	
}

}
