package application;

import java.awt.*;

import javax.swing.*;

import views.Console;
import views.LoadView;
import views.MainView;

public class Main extends JFrame {
	
	private static final int WINDOW_WIDTH = 750;
    private static final int WINDOW_HEIGHT = 850;
    private static Main main;
    private int company_id;
   
	Console console;
    MainView mainview;
    JLabel status;
    LoadView rc;
	
	private Main() {
		console = new Console();
		mainview = new MainView();
		rc = new LoadView();
		setTitle("Empresa de Transporte");

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Dimension windowSize = new Dimension(WINDOW_WIDTH, WINDOW_HEIGHT);
        setMinimumSize(windowSize);
        setMaximumSize(windowSize);

        setLayout(new BorderLayout());
        add(mainview, BorderLayout.PAGE_START);
        add(console, BorderLayout.CENTER);
	}
	
	 public int getCompany_id() {
			return company_id;
		}
		public void setCompany_id(int company_id) {
			this.company_id = company_id;
		}

	private void openRegistroCompany() {
		
		Dimension windowSize = new Dimension(700, 200);
		rc.setMinimumSize(windowSize);
		rc.setMaximumSize(windowSize);
		rc.setBounds(500, 100, 500, 310);
		//rc.setDefaultCloseOperation(rc.DISPOSE_ON_CLOSE);
		rc.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EventQueue.invokeLater(() -> {
            main = new Main();
            main.setExtendedState(JFrame.MAXIMIZED_BOTH);
            main.openRegistroCompany();
            //main.setVisible(true);
            
        });

	}
	
	public static Main getMainInstance() {
        return main;
    }
	
	public void visiblepantalla(int company_id) {
		this.setCompany_id(company_id);
        main.setVisible(true);
    }

    public void clearConsole() {
        console.clear();
    }

}
