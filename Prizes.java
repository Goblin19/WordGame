import java.net.URL;

public class Prizes {
	static URL prizesURL[] = new URL[6];

	Prizes() {
		
		prizesURL[0] = getClass().getResource("buick-1400243_640.jpg");
		prizesURL[1] = getClass().getResource("tv-627876_640.jpg");
		prizesURL[2] = getClass().getResource("video-game-console-2202663_640.jpg");
		prizesURL[3] = getClass().getResource("refrigerator-6703775_640.jpg");
		prizesURL[4] = getClass().getResource("speed-boat-1584136_640.jpg");
		prizesURL[5] = getClass().getResource("wrong-295503_640.png");
		
	}

	public static URL getPrize(int i) {
		return prizesURL[i];
	}
}
