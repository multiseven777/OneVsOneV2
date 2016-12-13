import java.util.Scanner;

public class OneVsOneV2 {
	
	private static Scanner in;

	public static void main(String[] args) {
		
		Player player1 = new Player();
		Player player2 = new Player();
		
		System.out.println("Please enter Player1 name:");
		in = new Scanner(System.in);
		player1.setPlayerName(in.next());
		
		System.out.println("Please choose class for Player1: Warrior, Mage or Archer");
		in = new Scanner(System.in);
		player1.setPlayerClass(in.next());
		
		System.out.println("Please enter Player2 name:");
		in = new Scanner(System.in);
		player2.setPlayerName(in.next());
		
		System.out.println("Please choose class for Player1: Warrior, Mage or Archer");
		in = new Scanner(System.in);
		player2.setPlayerClass(in.next());
		
		while (player1.getPlayerHealth() > 0 && player2.getPlayerHealth() > 0) {
		
			System.out.println(player1.getPlayerName() + "'s turn");
			System.out.println("Enter attack, defend, heal or special");
			in = new Scanner(System.in);
			String i = in.next();
			switch(i) {
			case "attack":
				player1.setPlayerStamina(player1.getPlayerStamina() - 1);
				player2.setPlayerHealth(player2.getPlayerHealth() - 5);
				System.out.println(player1.getPlayerName() + "'s health is: " + player1.getPlayerHealth() + " their stamina is: " + player1.getPlayerStamina());
				System.out.println(player2.getPlayerName() + "'s health is: " + player2.getPlayerHealth() + " their stamina is: " + player2.getPlayerStamina());
				break;
			case "defend":
				player1.setPlayerStamina(player1.getPlayerStamina() - 2);
				System.out.println(player2.getPlayerName() + "'s health is: " + player2.getPlayerHealth() + " their stamina is: " + player2.getPlayerStamina());
				System.out.println(player1.getPlayerName() + "'s health is: " + player1.getPlayerHealth() + " their stamina is: " + player1.getPlayerStamina());
				break;
			case "heal":
				player1.setPlayerStamina(player1.getPlayerStamina() - 2);
				player1.setPlayerHealth(player1.getPlayerHealth() + 3);
				System.out.println(player2.getPlayerName() + "'s health is: " + player2.getPlayerHealth() + " their stamina is: " + player2.getPlayerStamina());
				System.out.println(player1.getPlayerName() + "'s health is: " + player1.getPlayerHealth() + " their stamina is: " + player1.getPlayerStamina());
				break;
			case "special":
				switch(player1.getPlayerClass()) {
				case "Warrior":
					System.out.println(player1.getPlayerName() + " used Charge!");
					player1.setPlayerStamina(player1.getPlayerStamina() - 2);
					player2.setPlayerHealth(player2.getPlayerHealth() - 3);
					break;
				case "Mage":
					System.out.println(player1.getPlayerName() + " used Fireball!");
					player1.setPlayerStamina(player1.getPlayerStamina() - 3);
					player2.setPlayerHealth(player2.getPlayerHealth() - 5);
					break;
				case "Archer":
					System.out.println(player1.getPlayerName() + " used Cheapshot!");
					player1.setPlayerStamina(player1.getPlayerStamina() - 1);
					player2.setPlayerHealth(player2.getPlayerHealth() - 2);
					break;	
				}
				System.out.println(player2.getPlayerName() + "'s health is: " + player2.getPlayerHealth() + " their stamina is: " + player2.getPlayerStamina());
				System.out.println(player1.getPlayerName() + "'s health is: " + player1.getPlayerHealth() + " their stamina is: " + player1.getPlayerStamina());
				break;
			}
			
			System.out.println(player2.getPlayerName() + "'s turn");
			System.out.println("Enter attack, defend, heal or special");
			in = new Scanner(System.in);
			String n = in.next();
			switch(n) {
			case "attack":
				player2.setPlayerStamina(player1.getPlayerStamina() - 1);
				player1.setPlayerHealth(player1.getPlayerHealth() - 5);
				System.out.println(player1.getPlayerName() + "'s health is: " + player1.getPlayerHealth() + " their stamina is: " + player1.getPlayerStamina());
				System.out.println(player2.getPlayerName() + "'s health is: " + player2.getPlayerHealth() + " their stamina is: " + player2.getPlayerStamina());
				break;
			case "defend":
				player2.setPlayerStamina(player2.getPlayerStamina() - 2);
				System.out.println(player2.getPlayerName() + "'s health is: " + player2.getPlayerHealth() + " their stamina is: " + player2.getPlayerStamina());
				System.out.println(player1.getPlayerName() + "'s health is: " + player1.getPlayerHealth() + " their stamina is: " + player1.getPlayerStamina());
				break;
			case "heal":
				player2.setPlayerStamina(player2.getPlayerStamina() - 2);
				player2.setPlayerHealth(player2.getPlayerHealth() + 3);
				System.out.println(player2.getPlayerName() + "'s health is: " + player2.getPlayerHealth() + " their stamina is: " + player2.getPlayerStamina());
				System.out.println(player1.getPlayerName() + "'s health is: " + player1.getPlayerHealth() + " their stamina is: " + player1.getPlayerStamina());
				break;
			case "special":
				switch(player2.getPlayerClass()) {
				case "Warrior":
					System.out.println(player2.getPlayerName() + " used Charge!");
					player2.setPlayerStamina(player2.getPlayerStamina() - 2);
					player1.setPlayerHealth(player1.getPlayerHealth() - 3);
					break;
				case "Mage":
					System.out.println(player2.getPlayerName() + " used Fireball!");
					player2.setPlayerStamina(player2.getPlayerStamina() - 3);
					player1.setPlayerHealth(player1.getPlayerHealth() - 5);
					break;
				case "Archer":
					System.out.println(player2.getPlayerName() + " used Cheapshot!");
					player2.setPlayerStamina(player2.getPlayerStamina() - 1);
					player1.setPlayerHealth(player1.getPlayerHealth() - 2);
					break;	
				}
				System.out.println(player2.getPlayerName() + "'s health is: " + player2.getPlayerHealth() + " their stamina is: " + player2.getPlayerStamina());
				System.out.println(player1.getPlayerName() + "'s health is: " + player1.getPlayerHealth() + " their stamina is: " + player1.getPlayerStamina());
				break;
			}
			
		} 
		
		if(player1.getPlayerHealth() <= 0 && player2.getPlayerHealth() > 0) {
			System.out.println(player1.getPlayerName() + " lost!");
		}
		else {
			System.out.println(player2.getPlayerName() + " lost!");
		}
		
	}

}
