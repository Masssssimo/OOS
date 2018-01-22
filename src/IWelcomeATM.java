
public interface IWelcomeATM {

	void welcomePage(int acountNum, int PIN);
	void options(int option);
	void displayBalance(int acountNum, int PIN);
	void withdrawFunds(int widthDraw, int acountNum, int PIN);
	void depositFunds(int deposit, int acountNum, int PIN);

	
	
}
