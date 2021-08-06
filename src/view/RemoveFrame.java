package view;

import java.awt.*;

import javax.swing.JFrame;

import controller.HRController;
import controller.MyWindowListener;
import controller.RemoveController;

public class RemoveFrame extends JFrame{
	
	Button btSearch, btBack;
	TextField txtId;
	Label lbId;
	
	public RemoveFrame()
	{
		btSearch=new Button("Remove");
		btBack=new Button("Back");
		txtId=new TextField(20);
		lbId=new Label("Please Enter Id");
		
		this.setTitle("Remove Employee");
		this.setVisible(true);
		this.setBounds(250, 50, 320, 350);
		this.setLayout(null);
		this.setResizable(false);
		
		lbId.setBounds(25, 40, 100, 25);
		txtId.setBounds(130, 40, 150, 25);
		btSearch.setBounds(80, 90, 60, 30);
		btBack.setBounds(170, 90, 60, 30);
		
		add(lbId);
		add(txtId);
		add(btSearch);
		add(btBack);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		RemoveController remc= new RemoveController(this);
		btSearch.addActionListener(remc);
		btBack.addActionListener(remc);
		
		
		
	}

	public Button getBtSearch() {
		return btSearch;
	}

	public void setBtSearch(Button btSearch) {
		this.btSearch = btSearch;
	}

	public Button getBtBack() {
		return btBack;
	}

	public void setBtBack(Button btBack) {
		this.btBack = btBack;
	}

	public TextField getTxtId() {
		return txtId;
	}

	public void setTxtId(TextField txtId) {
		this.txtId = txtId;
	}

	public Label getLbId() {
		return lbId;
	}

	public void setLbId(Label lbId) {
		this.lbId = lbId;
	}
}
