import java.util.Scanner;

public class OneVsOneV2 {
	
	private static Scanner in;

	public static void main(String[] args) {
		
		//Player.java(PlayerName, PlayerClass, PlayerHealth)
		Player player1 = new Player();
		Player player2 = new Player();
		
		//player1 name
		System.out.println("Please enter Player1 name:");
		in = new Scanner(System.in);
		player1.setPlayerName(in.next());
		
		//Choose Class loop -- player1
		do {	
		System.out.println("Please choose class for Player1: warrior, mage or archer");
		in = new Scanner(System.in);
		player1.setPlayerClass(in.next());
		} while (!player1.getPlayerClass().equals("warrior") && !player1.getPlayerClass().equals("mage") && !player1.getPlayerClass().equals("archer"));
			
		//player2 name
		System.out.println("Please enter Player2 name:");
		in = new Scanner(System.in);
		player2.setPlayerName(in.next());
		
		//Choose Class loop -- player2
		do {
		System.out.println("Please choose class for Player2: warrior, mage or archer");
		in = new Scanner(System.in);
		player2.setPlayerClass(in.next());
		} while (!player2.getPlayerClass().equals("warrior") && !player2.getPlayerClass().equals("mage") && !player2.getPlayerClass().equals("archer"));
		
		//Round loop
		round(player1, player2); 
		
		//End-game notification
		if(player1.getPlayerHealth() <= 0 || player1.getPlayerStamina() <= 0) {
			System.out.println(player1.getPlayerName() + " lost!");
		}
		else if(player2.getPlayerHealth() <= 0 || player2.getPlayerStamina() <= 0) {
			System.out.println(player2.getPlayerName() + " lost!");
		}
		
	}
	
	//instead of nested switch
	public static void special2(Player player1, Player player2) {
		switch(player2.getPlayerClass()) {
		case "warrior":
			Moves charge2 = new Moves();
			charge2.chargeP2(player1, player2);
			break;
		case "mage":
			Moves fireball2 = new Moves();
			fireball2.fireballP2(player1, player2);
			break;
		case "archer":
			Moves cheapshot2 = new Moves();
			cheapshot2.cheapshotP2(player1, player2);
			break;	
		}
	}
	
	public static void special1(Player player1, Player player2) {
		switch(player1.getPlayerClass()) {
		case "warrior":
			Moves charge1 = new Moves();
			charge1.chargeP1(player1, player2);
			break;
		case "mage":
			Moves fireball1 = new Moves();
			fireball1.fireballP1(player1, player2);
			break;
		case "archer":
			Moves cheapshot1 = new Moves();
			cheapshot1.cheapshotP1(player1, player2);
			break;	
		}
	}
	
	//Round loop
	public static void round(Player player1, Player player2) {
		while (player1.getPlayerHealth() > 0 && player2.getPlayerHealth() > 0 
				&& player1.getPlayerStamina() > 0 && player2.getPlayerStamina() > 0) {
			
				//player1's round
				System.out.println(player1.getPlayerName() + "'s turn");
				System.out.println("Enter attack, defend, heal or special"); //4 available moves
				in = new Scanner(System.in);
				String i = in.next();
				if(!i.equals("attack") && !i.equals("defend") && !i.equals("heal") && !i.equals("special")) {
					System.out.println("Balfasz vagy, kimaradsz a körbõl"); //Input error
				}
				//Moves.java, player1
				else {
					switch(i) {
					case "attack":
						Moves attack1 = new Moves();
						attack1.attackP1(player1, player2);
						break;
					case "defend":
						Moves defend1 = new Moves();
						defend1.defendP1(player1, player2);
						break;
					case "heal":
						Moves heal1 = new Moves();
						heal1.healP1(player1, player2);
						break;
					case "special":
						special1(player1, player2);
						break;
					}
				
				}
				
				//player2's round
				System.out.println(player2.getPlayerName() + "'s turn");
				System.out.println("Enter attack, defend, heal or special"); //4 available moves
				in = new Scanner(System.in);
				String n = in.next();
				if(!n.equals("attack") && !n.equals("defend") && !n.equals("heal") && !n.equals("special")) {
					System.out.println("Balfasz vagy, kimaradsz a körbõl"); //Input error
				}
				//Moves.java, player2
				else {
					switch(n) {
					case "attack":
						Moves attack2 = new Moves();
						attack2.attackP2(player1, player2);
						break;
					case "defend":
						Moves defend2 = new Moves();
						defend2.defendP2(player1, player2);
						break;
					case "heal":
						Moves heal2 = new Moves();
						heal2.healP2(player1, player2);
						break;
					case "special":
						special2(player1, player2);
						break;
					}
				}
				
			} 
	}
	
	public static void name(Player player1, Player player2) {
		System.out.println("Please enter " + (player1) +" name:");
		in = new Scanner(System.in);
		(player1).setPlayerName(in.next());
	}

}
