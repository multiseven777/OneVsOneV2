
public class Moves {
	
	public void attackP1 (Player player1, Player player2) {
		player1.setPlayerStamina(player1.getPlayerStamina() - 1);
		player2.setPlayerHealth(player2.getPlayerHealth() - 5);
		System.out.println(player1.getPlayerName() + "'s health is: " + player1.getPlayerHealth() + " their stamina is: " + player1.getPlayerStamina());
		System.out.println(player2.getPlayerName() + "'s health is: " + player2.getPlayerHealth() + " their stamina is: " + player2.getPlayerStamina());
	}
	
	public void attackP2 (Player player1, Player player2) {
		player2.setPlayerStamina(player1.getPlayerStamina() - 1);
		player1.setPlayerHealth(player1.getPlayerHealth() - 5);
		System.out.println(player1.getPlayerName() + "'s health is: " + player1.getPlayerHealth() + " their stamina is: " + player1.getPlayerStamina());
		System.out.println(player2.getPlayerName() + "'s health is: " + player2.getPlayerHealth() + " their stamina is: " + player2.getPlayerStamina());
	}
	
	public void defendP1 (Player player1, Player player2) {
		player1.setPlayerStamina(player1.getPlayerStamina() - 2);
		System.out.println(player2.getPlayerName() + "'s health is: " + player2.getPlayerHealth() + " their stamina is: " + player2.getPlayerStamina());
		System.out.println(player1.getPlayerName() + "'s health is: " + player1.getPlayerHealth() + " their stamina is: " + player1.getPlayerStamina());
	}
	
	public void defendP2 (Player player1, Player player2) {
		player2.setPlayerStamina(player2.getPlayerStamina() - 2);
		System.out.println(player2.getPlayerName() + "'s health is: " + player2.getPlayerHealth() + " their stamina is: " + player2.getPlayerStamina());
		System.out.println(player1.getPlayerName() + "'s health is: " + player1.getPlayerHealth() + " their stamina is: " + player1.getPlayerStamina());
	}
	
	public void healP1 (Player player1, Player player2) {
		player1.setPlayerStamina(player1.getPlayerStamina() - 2);
		player1.setPlayerHealth(player1.getPlayerHealth() + 3);
		System.out.println(player2.getPlayerName() + "'s health is: " + player2.getPlayerHealth() + " their stamina is: " + player2.getPlayerStamina());
		System.out.println(player1.getPlayerName() + "'s health is: " + player1.getPlayerHealth() + " their stamina is: " + player1.getPlayerStamina());
	}
	
	public void healP2 (Player player1, Player player2) {
		player2.setPlayerStamina(player2.getPlayerStamina() - 2);
		player2.setPlayerHealth(player2.getPlayerHealth() + 3);
		System.out.println(player2.getPlayerName() + "'s health is: " + player2.getPlayerHealth() + " their stamina is: " + player2.getPlayerStamina());
		System.out.println(player1.getPlayerName() + "'s health is: " + player1.getPlayerHealth() + " their stamina is: " + player1.getPlayerStamina());
	}
	
	public void chargeP1 (Player player1, Player player2) {
		System.out.println(player1.getPlayerName() + " used Charge!");
		player1.setPlayerStamina(player1.getPlayerStamina() - 2);
		player2.setPlayerHealth(player2.getPlayerHealth() - 3);
		System.out.println(player2.getPlayerName() + "'s health is: " + player2.getPlayerHealth() + " their stamina is: " + player2.getPlayerStamina());
		System.out.println(player1.getPlayerName() + "'s health is: " + player1.getPlayerHealth() + " their stamina is: " + player1.getPlayerStamina());
	}
	
	public void chargeP2 (Player player1, Player player2) {
		System.out.println(player2.getPlayerName() + " used Charge!");
		player2.setPlayerStamina(player2.getPlayerStamina() - 2);
		player1.setPlayerHealth(player1.getPlayerHealth() - 3);
		System.out.println(player2.getPlayerName() + "'s health is: " + player2.getPlayerHealth() + " their stamina is: " + player2.getPlayerStamina());
		System.out.println(player1.getPlayerName() + "'s health is: " + player1.getPlayerHealth() + " their stamina is: " + player1.getPlayerStamina());
	}
	
	public void fireballP1 (Player player1, Player player2) {
		System.out.println(player1.getPlayerName() + " used Fireball!");
		player1.setPlayerStamina(player1.getPlayerStamina() - 3);
		player2.setPlayerHealth(player2.getPlayerHealth() - 5);
		System.out.println(player2.getPlayerName() + "'s health is: " + player2.getPlayerHealth() + " their stamina is: " + player2.getPlayerStamina());
		System.out.println(player1.getPlayerName() + "'s health is: " + player1.getPlayerHealth() + " their stamina is: " + player1.getPlayerStamina());
	}
	
	public void fireballP2 (Player player1, Player player2) {
		System.out.println(player2.getPlayerName() + " used Fireball!");
		player2.setPlayerStamina(player2.getPlayerStamina() - 3);
		player1.setPlayerHealth(player1.getPlayerHealth() - 5);
		System.out.println(player2.getPlayerName() + "'s health is: " + player2.getPlayerHealth() + " their stamina is: " + player2.getPlayerStamina());
		System.out.println(player1.getPlayerName() + "'s health is: " + player1.getPlayerHealth() + " their stamina is: " + player1.getPlayerStamina());
	}
	
	public void cheapshotP1 (Player player1, Player player2) {
		System.out.println(player1.getPlayerName() + " used Cheapshot!");
		player1.setPlayerStamina(player1.getPlayerStamina() - 1);
		player2.setPlayerHealth(player2.getPlayerHealth() - 2);
		System.out.println(player2.getPlayerName() + "'s health is: " + player2.getPlayerHealth() + " their stamina is: " + player2.getPlayerStamina());
		System.out.println(player1.getPlayerName() + "'s health is: " + player1.getPlayerHealth() + " their stamina is: " + player1.getPlayerStamina());
	}
	
	public void cheapshotP2 (Player player1, Player player2) {
		System.out.println(player2.getPlayerName() + " used Cheapshot!");
		player2.setPlayerStamina(player2.getPlayerStamina() - 1);
		player1.setPlayerHealth(player1.getPlayerHealth() - 2);
		System.out.println(player2.getPlayerName() + "'s health is: " + player2.getPlayerHealth() + " their stamina is: " + player2.getPlayerStamina());
		System.out.println(player1.getPlayerName() + "'s health is: " + player1.getPlayerHealth() + " their stamina is: " + player1.getPlayerStamina());
	}
}
