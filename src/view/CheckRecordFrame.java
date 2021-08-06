package view;

import java.awt.Button;
import java.awt.*;

import javax.swing.JFrame;

import controller.CheckRecordController;

public class CheckRecordFrame extends JFrame
{
	Button btSearch, btBack;
	TextField txtId;
	Label lbId;
	
	public CheckRecordFrame()
	{
		btSearch= new Button("Check");
		btBack= new Button("Back");
		txtId= new TextField(20);
		lbId= new Label("Enter Id");
		
		this.setTitle("Check Record");
		this.setVisible(true);
		this.setResizable(false);
		this.setLayout(null);
		this.setBounds(250, 50, 320, 350);
		
		lbId.setBounds(25, 40, 100, 25);
		txtId.setBounds(130, 40, 150, 25);
		btSearch.setBounds(80, 90, 60, 30);
		btBack.setBounds(170, 90, 60, 30);
		
		
		add(lbId);
		add(txtId);
		add(btSearch);
		add(btBack);
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		CheckRecordController crc= new CheckRecordController(this);
		btSearch.addActionListener(crc);
		btBack.addActionListener(crc);
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
