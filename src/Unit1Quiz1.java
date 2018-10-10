import javax.swing.JOptionPane;
public class Unit1Quiz1 {

	public static void main(String[] args) {
		int computerWins = 0;
		int humanWins = 0;
		JOptionPane.showMessageDialog(null, "Welcome to the Dice Game!");
		JOptionPane.showMessageDialog(null, "Let's Play!");
		for(int i = 1; i<=10; i++) {
			int computerDieRoll = (int)(Math.random() * 6) + 1;
			int humanDieRoll = (int)(Math.random() * 6) + 1;
			JOptionPane.showMessageDialog(null, "The computer rolled: "+computerDieRoll+"\nYou rolled: "+humanDieRoll);
			if(computerDieRoll > humanDieRoll) {
				JOptionPane.showMessageDialog(null, "The computer wins this round!");
				computerWins+=1;
			}
			else if(humanDieRoll > computerDieRoll) {
				JOptionPane.showMessageDialog(null, "You win this round!");
				humanWins+=1;
			}
			else if(humanDieRoll == computerDieRoll) {
				JOptionPane.showMessageDialog(null, "Nobody wins!");
			}
		}
		if(computerWins > humanWins) {
			JOptionPane.showMessageDialog(null, "The computer won the game! \n"+computerWins+"-"+humanWins);
		}
		else if(humanWins > computerWins) {
			JOptionPane.showMessageDialog(null, "You won the game! \n"+humanWins+"-"+computerWins);
		}
		else if(humanWins == computerWins) {
			JOptionPane.showMessageDialog(null, "It's a tie! \n"+computerWins+"-"+humanWins);
		}
		JOptionPane.showMessageDialog(null, "Thanks for Playing!");

	}

}
