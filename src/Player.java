
public class Player {
	
	private String PlayerName;
	private String PlayerClass;
	private int PlayerHealth = 30;
	private int PlayerStamina = 10;
	
	public String getPlayerClass() {
		return PlayerClass;
	}
	public void setPlayerClass(String playerClass) {
		PlayerClass = playerClass;
	}
	
	public int getPlayerStamina() {
		return PlayerStamina;
	}
	public void setPlayerStamina(int playerStamina) {
		PlayerStamina = playerStamina;
	}
	public String getPlayerName() {
		return PlayerName;
	}
	public void setPlayerName(String playerName) {
		PlayerName = playerName;
	}
	public int getPlayerHealth() {
		return PlayerHealth;
	}
	public void setPlayerHealth(int playerHealth) {
		PlayerHealth = playerHealth;
	}
	
}
