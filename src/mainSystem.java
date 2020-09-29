
public class mainSystem {

	static Integer option;

	public void runSystem() {
		
			do {
				mainMenu.clearScreen();
				mainMenu.menuMain(); //display main menu options
				option = neckMatching.sc.nextInt();
				
				switch(option) {
				  case 1:
					  mainCalc.checkNeckMatch();
					  break;
				  case 2: 
					  mainCalc.checkNeckRepeat();
					  break;
				  case 3: 
					  mainCalc.checkNeckList();
					break;
				  case 4:
					  System.out.println("Have a lovely day!");
					  break;
				  default:
					  System.out.println("Wrong Option!");
					  break;
				}
			}while (option!=4);
	}
}
