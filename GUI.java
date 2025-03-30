import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.net.URL;
import javax.swing.*;

public class GUI implements ActionListener {
	//variables set
	boolean result;
	boolean playAgain;
	int currentPlayerNumber;
	int count;
	String clearingText = "";
	String playersAdded = "";
	static String textAdded = "";
	static String currentText = "";
	
	
	//instantiating the classes
	Hosts Host = new Hosts("Bob", "Barker");
	Players[] currentPlayers = new Players[count+1];
	Turn playerTurn = new Turn();
	Sound Sounds = new Sound();
	
	
	//setting up GUI components
	private JMenuBar menuBar;
	private JMenu optionsMenu;
	private JMenu aboutGame;
	private JMenuItem creditsPhotos;
	private JMenuItem aboutGameOption;
	private JMenuItem addPlayerMenuItem;
	private JMenuItem addHostMenuItem;
	static JCheckBox checkBox;
	private JButton takeTurn;
	static JTextArea textArea;
	static JLabel currentPlayingPhrase = new JLabel();
	static JLabel totalText = new JLabel("Text");
	private  JLabel playerCurrent =  new JLabel();
	private JLabel currentHost = new JLabel("Host: " + Host.getFirst_name() + Host.getLast_name());
	private JScrollPane scrollPane;
	private JPanel panel;
	private JFrame wordGame = new JFrame("Word Game");
	
	
	
	public void Gui() {
		wordGame.setSize(800,1000);
		wordGame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		wordGame.setLayout(new BorderLayout());
		
		
		
		//player_current = new JLabel("Current players: ");
		playerCurrent.setText("Current Players: ");
		
		
		//setting up the menu and options
		menuBar = new JMenuBar();
				
		optionsMenu = new JMenu("Game");
		aboutGame = new JMenu("About");
				
		checkBox = new JCheckBox("Save Messages");
		addPlayerMenuItem = new JMenuItem("Add player");
		addHostMenuItem = new JMenuItem("Add host and phrase?");
		aboutGameOption = new JMenuItem("About");
		creditsPhotos = new JMenuItem("Attribution"); 
		addPlayerMenuItem.addActionListener(this);
		addHostMenuItem.addActionListener(this);
		aboutGameOption.addActionListener(this);
		creditsPhotos.addActionListener(this);
		checkBox.setFocusable(false);
		
		aboutGame.setMnemonic(KeyEvent.VK_A);
		optionsMenu.setMnemonic(KeyEvent.VK_G);
		aboutGame.add(aboutGameOption);
		aboutGame.add(creditsPhotos);
		optionsMenu.add(addPlayerMenuItem);
		optionsMenu.add(addHostMenuItem);
		optionsMenu.add(checkBox);
		menuBar.add(aboutGame);
		menuBar.add(optionsMenu);
		
		
		//Making Take Turn Button
		takeTurn = new JButton("Start Player Turn");
		takeTurn.addActionListener(this);
		takeTurn.setBounds(100, 100, 100, 100);
		
		
		//Setting up a proper text area
		textArea = new JTextArea(100,200);
		textArea.setLineWrap(true);
		textArea.setEditable(false);
		textArea.setVisible(true);
		textArea.setForeground(new Color(0x00A2E8));
		textArea.setBackground(Color.GRAY);
		textArea.setFont(new Font("Comfortaa", Font.PLAIN, 20));
		
		
		//Making panel
		panel = new JPanel();
		panel.setBounds(0, 0, 100, 100);
		panel.setBackground(Color.LIGHT_GRAY);
		panel.add(takeTurn);
		panel.add(currentHost);
		panel.add(playerCurrent);
		panel.add(currentPlayingPhrase);
		
		
		scrollPane = new JScrollPane(textArea);
		scrollPane.setBounds(100, 100, 300, 300);
		
		
		//adding elements and seeing the window
		wordGame.setJMenuBar(menuBar);
		wordGame.add(panel, BorderLayout.NORTH);
		wordGame.add(scrollPane, BorderLayout.WEST);
		scrollPane.setVisible(true);
		playerCurrent.setVisible(true);
		totalText.setVisible(true);
		
		
		wordGame.pack();
		wordGame.setVisible(true);
		
		Sounds.backgroundSound(2);
		
	}
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		
		if(source == creditsPhotos) {
			JOptionPane.showMessageDialog(null, "Credits for the photos and music used: " +"\n" + "https://pixabay.com/photos/buick-oldtimer-old-car-blue-car-1400243/" +"\n" + 
					"https://pixabay.com/photos/tv-android-tv-television-network-627876/" + "\n" + "https://pixabay.com/photos/video-game-console-video-game-play-2202663/" + "\n" + 
					"https://pixabay.com/photos/refrigerator-architecture-design-6703775/" + "\n" + "https://pixabay.com/photos/speed-boat-sea-water-speed-fun-1584136/" + "\n" +
					"success.wav by grunz -- https://freesound.org/s/109662/ -- License: Attribution 3.0" + "\n" + "Funk Lead Loop by ehohnke -- https://freesound.org/s/376416/ -- License: Creative Commons 0" + "\n" +
					"negative_beeps.wav by themusicalnomad -- https://freesound.org/s/253886/ -- License: Creative Commons 0");
		}
		
		if (source ==  aboutGameOption) {
			JOptionPane.showMessageDialog(null, "I chose the border layout manager because it is very easy to work with and can be resized nicely.");
		}
		
		if (source == addPlayerMenuItem) {
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
		
	
	if(source == addHostMenuItem) {
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
				 playersAdded = clearingText;
				 playerCurrent.setText("Current players: ");
				 currentPlayingPhrase.setText("The phrase to guess is :");
				 textArea.setText(clearingText);
			}
		}
		
		currentPlayerNumber++;
	}
	
	}
	
	
}
