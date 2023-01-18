package windowBuilder.view.panel;

import java.awt.CardLayout;
import javax.swing.JPanel;

import lombok.Data;

@Data
public class MainPanel extends InitPanel {
	
	private static final long serialVersionUID = 1L;

	private CardLayout mainCard;
	
	private static MainPanel instance;
	
	public static MainPanel getInstance() {//메인페널을 어디서든 쓰기위해 싱글톤해줌.
		if(instance == null) {
			instance = new MainPanel();
		}
		return instance;
	}
	
	private MainPanel() {
		mainCard = new CardLayout();
		setLayout(mainCard);
		
	}
	
	public void init() {
		Loginpanel loginPanel = new Loginpanel();
		add(loginPanel, "loginPanel");
		
		RegisterPanel registerPanel = new RegisterPanel();
		add(registerPanel, "registerPanel");
	}
	
}
