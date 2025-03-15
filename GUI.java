import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class GUI implements ActionListener {
	//variables set
	boolean result;
	boolean playAgain;
	int currentPlayerNumber;
	int count;
	String playersAdded = "";
	
	
	//instantiating the classes
	Hosts Host = new Hosts("Bob", "Barker");
	Players[] currentPlayers = new Players[count+1];
	Turn playerTurn = new Turn();
	
	
	//setting up GUI components
	static JLabel currentPlayingPhrase = new JLabel();
	private JButton takeTurn;
	private  JLabel playerCurrent =  new JLabel();
	private JButton addPlayer;
	private JButton hostPhrase;
	private JFrame wordGame = new JFrame("Word Game");
	private JLabel currentHost = new JLabel("Host: " + Host.getFirst_name() + Host.getLast_name());
	//private JPanel panel = new JPanel();
	
	public void Gui() {
		wordGame.setSize(700,700);
		wordGame.setLayout(new FlowLayout());
		wordGame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//player_current = new JLabel("Current players: ");
		playerCurrent.setText("Current Players: ");
		
		
		//Testing panel
		//panel = new JPanel();
		//panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		//WordGame.add(panel);
		
		takeTurn = new JButton("Start Player Turn");
		takeTurn.addActionListener(this);
		takeTurn.setBounds(100, 100, 100, 100);
		
		
		hostPhrase = new JButton();
		hostPhrase.addActionListener(this);
		hostPhrase.setBounds(100, 100, 100, 100);
		hostPhrase.setText("add Host and Phrase?");
	
		
		addPlayer = new JButton();
		addPlayer.addActionListener(this);
		addPlayer.setBounds(100, 100, 100, 100);
		addPlayer.setText("add player?");
		
		//adding elements and seeing the window
		addPlayer.setVisible(true);
		wordGame.add(addPlayer);
		wordGame.add(hostPhrase);
		wordGame.add(takeTurn);
		wordGame.add(currentHost);
		wordGame.add(playerCurrent);
		//panel.add(player_current);
		//panel.add(addPlayer);
		playerCurrent.setVisible(true);
		//panel.add(addPlayer);
		//panel.add(player_current);
		wordGame.setVisible(true);
		
		
	}
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		if (source == addPlayer) {
			//Setting count and player in array
			String firstName = JOptionPane.showInputDialog("enter your first name");
			String lastName = JOptionPane.showInputDialog("enter your last name (leave blank if you don't want to add one)");
			if(lastName.equals(null)) {
				lastName = " ";
			}
			currentPlayers[count] = new Players(firstName, lastName);
			
			
			//expand the array
			if (count+1 == currentPlayers.length) {
				Players[] tempArray = new Players[currentPlayers.length+1];
				for (int i =0; i < currentPlayers.length; i++) {
					tempArray[i] = currentPlayers[i];
				}
				currentPlayers = tempArray;
			}
			
			
			//Setting the JLabel and iterating the string (W.I.P)
			//System.out.println(currentPlayers[count]);
			if(count == 0 ) {
				this.playersAdded = this.playersAdded + currentPlayers[count];
			}
			else {
				this.playersAdded = this.playersAdded + " " + currentPlayers[count];
			}
			//System.out.println(this.playersAdded);
			this.playerCurrent.setText("Current Players: " + this.playersAdded);
			
			
			//Iterate player number
			wordGame.revalidate();
			wordGame.repaint();
			count++;
			
		}
		
	
	if(source == hostPhrase) {
		//setting up host
		String firstName = JOptionPane.showInputDialog("enter the hosts first name");
		String lastName = JOptionPane.showInputDialog("enter the hosts last name (leave blank if you don't want to add one)");
		if(lastName.equals(null)) {
			lastName = " ";
		}
		
		//setting new host name
		Host.setFirst_name(firstName);
		Host.setLast_name(lastName);
		currentHost.setText("Host:" + Host.getFirst_name() + " " + Host.getLast_name());
		
		//setting up new Phrase
		String newPhrase = JOptionPane.showInputDialog("enter a phrase to guess");
		Host.Host_Phrase(newPhrase);
		
		
		//repainting the frame
		currentPlayingPhrase.setText("The phrase to guess is: " + Phrases.playingPhrase);
		currentPlayingPhrase.setVisible(true);
		wordGame.add(currentPlayingPhrase);
		wordGame.revalidate();
		wordGame.repaint();
	}
	
	if(source == takeTurn) {
		if (currentPlayerNumber < (currentPlayers.length-1)) {
			result = playerTurn.takeTurn(currentPlayers[currentPlayerNumber], Host);
		}
		else {
			currentPlayerNumber = 0;
			result = playerTurn.takeTurn(currentPlayers[currentPlayerNumber], Host);
		}
		
		if(result == true) {
			int playAgainAnswer = JOptionPane.showConfirmDialog(null, "Do you want to play again?", "Game Won!", JOptionPane.YES_NO_OPTION);
			if(playAgainAnswer == 1){
				playAgain = false;
				wordGame.dispose();
			}
			else {
				 currentPlayers = new Players[1];
				 currentPlayerNumber = -1;
				 count = 0;
				 playersAdded = "";
				 playerCurrent.setText("Current players: ");
				 currentPlayingPhrase.setText("");
			}
		}
		
		currentPlayerNumber++;
	}
	
	}
	
}
