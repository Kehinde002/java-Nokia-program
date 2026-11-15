import java.util.Scanner;

public class Nokia{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);

		boolean running = true;

		String mainMenu = """
		NOKIA MENU FUNCTION
 
		1. Phone book
		2. Messages
		3. Chat
		4. Call register
		5. Tones
		6. Settings
		7. Call divert
		8. Music
		9. Games
		10. Calculator
		11. Reminders
		12. Clock
		13. Profiles
		14. Services
		15. SIM services2
		0. Exit
		

		Pick a number :
		""";
		
		while(running == true){
		System.out.println(mainMenu);
		
		int userChoice = input.nextInt();


		switch(userChoice){
			case 1: System.out.println("Phone book");
			String phoneBookChoices = """
			1. Search
			2. Service Nos. 1
			3. Add name
			4. Erase
			5. Edit
			6. Copy
			7. Assign tone
			8. Send b’card
			9. Options
			10. Speed dials
			11. Voice tags
			99. Back to Main Menu

			Pick a number :
			""";

			System.out.println(phoneBookChoices);
			int phoneBookEntry = input.nextInt();

			switch(phoneBookEntry){	
				case 1: System.out.println("Search");
				break;
				case 2: System.out.println("Service Nos. 1");
				break;
				case 3: System.out.println("Add name");
				break;
				case 4: System.out.println("Erase");
				break;
				case 5: System.out.println("Edit");
				break;
				case 6: System.out.println("Copy");
				break;
				case 7: System.out.println("Assign tone");
				break;
				case 8: System.out.println("Send b’card");
				break;
				case 9: System.out.println("Options");
					String optionsMenu = """
					1. Memory in use
					2. Type of view
					3. Memory status

					Pick a number :
					""";

					System.out.println(optionsMenu);
					int optionsMenuChoice = input.nextInt();

					switch(optionsMenuChoice){
					case 1: System.out.println("Memory in use");
					break;
					case 2: System.out.println("Type of view");
					break;
					case 3: System.out.println("Memory status");
					break;
					default:System.out.println("Invalid Number");
					break;
					}
				
				
				break;
				case 10: System.out.println("Speed dials");
				break;
				case 11: System.out.println("Voice tags");
				break;
				case 99: break;
				default:System.out.println("Invalid Number");
				break;

			}
					
			
			

			
			break;
			case 2: System.out.println("Messages");
			String messagesMenu = """
			1. Write messages
			2. Inbox
			3. Outbox
			4. Picture messages
			5. Templates
			6. Smileys
			7. Message settings
			8. Info service
			9. Voice mailbox number 4
			10. Service command editor
			99. Back to Main Menu

			Pick a number :
			""";
			
			System.out.println(messagesMenu);
			int messageEntry = input.nextInt();

			switch(messageEntry){
				case 1: System.out.println("Write messages");
				break;
				case 2: System.out.println("Inbox");
				break;
				case 3: System.out.println("Outbox");
				break;
				case 4: System.out.println("Picture messages");
				break;
				case 5: System.out.println("Templates");
				break;
				case 6: System.out.println("Smileys");
				break;
				case 7: System.out.println("Message settings");
				String MessageSettingsMenu = """
				1. Set 12
				2. Common 3

				Pick a number :
				""";

				System.out.println(MessageSettingsMenu);
				int messageSettingsEntry = input.nextInt();

				switch(messageSettingsEntry){
					case 1: System.out.println("Set 12");
					String set12Menu = """
					1. Message centre number
					2. Messages sent as
					3. Message validity
					99. Back to Main Menu

					Pick a number :
					""";

					System.out.println(set12Menu);
					int set12Entry = input.nextInt();

					switch(set12Entry){
						case 1: System.out.println("Message centre number");
						break;
						case 2: System.out.println("Messages sent as");
						break;
						case 3: System.out.println("Message validity");
						break;
						case 99: break;
						default: System.out.println("Invalid Message");
						break;
					}
					break;
					case 2: System.out.println("Common 3");
					String common3Menu = """
					1. Delivery reports
					2. Reply via same centre
					3. Character support
					99. Back to Main Menu

					Pick a number :
					""";

					System.out.println(common3Menu);
					int common3Entry = input.nextInt();
				
					switch(common3Entry){
						case 1: System.out.println("Delivery reports");
						break;
						case 2: System.out.println("Reply via same centre");
						break;
						case 3: System.out.println("Character support");
						break;
						case 99: break;
						default: System.out.println("Invalid Message");
						break;
					}
					break;
					
			default: System.out.println("Invalid Message");
			break;
			

					
					
					
			}

				break;
				case 8: System.out.println("Info service");
				break;
				case 9: System.out.println("Voice mailbox number 4");
				break;
				case 10: System.out.println("Service command editor");
				break;
				case 99: break;
				default:System.out.println("Invalid Number");
				break;
				
			}
			
			break;
			case 3: System.out.println("Chat");
			break;
			case 4: System.out.println("Call register");
			String callRegisterMenu = """
			1. Missed calls
			2. Received calls
			3. Dialled numbers
			4. Erase recent call lists
			5. Show call duration
			6. Show call costs
			7. Call cost settings
			8. Prepaid credit
			99. Back to Main Menu

			Pick a number :
			""";
			
			System.out.println(callRegisterMenu);
			int callRegisterEntry = input.nextInt();

			switch(callRegisterEntry){
				case 1: System.out.println("Missed calls");
				break;
				case 2: System.out.println("Received calls");
				break;
				case 3: System.out.println("Dialled numbers");
				break;
				case 4: System.out.println("Erase recent call lists");
				break;
				case 5: System.out.println("Show call duration");
				String showCallMenu = """
				1. Last call duration
				2. All calls’ duration
				3. Received calls’ duration
				4. Dialled calls’ duration
				5. Clear timers
				99. Back to Main Menu

				Pick a number :
				""";

				System.out.println(showCallMenu);
				int showCallEntry = input.nextInt();

				switch(showCallEntry){
					case 1: System.out.println("Last call duration");
					break;
					case 2: System.out.println("All calls’ duration");
					break;
					case 3: System.out.println("Received calls’ duration");
					break;
					case 4: System.out.println("Dialled calls’ duration");
					break;
					case 5: System.out.println("Clear timers");
					break;
					case 99: break;
					default:System.out.println("Invalid Number");
					break;
				}
				break;
				case 6: System.out.println("Show call costs");
				String callCostMenu = """
				1. Last call cost
				2. All calls’ cost
				3. Clear counters
				99. Back to Main Menu

				Pick a number :
				""";

				System.out.println(callCostMenu);
				int callCostEntry = input.nextInt();

				switch(callCostEntry){
					case 1: System.out.println("Last call cost");
					break;
					case 2: System.out.println("All calls’ cost");
					break;
					case 3: System.out.println("Clear counters");
					break;
					case 99: break;
					default: System.out.println("Invalid Number");
					break;
				}
				break;
				case 7: System.out.println("Call cost settings");
				String callCostSettingMenu = """
				1. Call cost limit
				2. Show costs in
				99. Back to Main Menu

				Pick a number :
				""";

				System.out.println(callCostSettingMenu);
				int callCostSettingsEntry = input.nextInt();

				switch(callCostSettingsEntry){
					case 1: System.out.println("Call cost limit");
					break;
					case 2: System.out.println("Show costs in");
					break;
					case 99: break;
					default: System.out.println("Invalid Number");
					break;
				}
				
				break;
				case 8: System.out.println("Prepaid credit");
				break;
				case 99: break;
				default:System.out.println("Invalid Number");
				break;

			}
			break;
			case 5: System.out.println("Tones");
			String tonesMenu = """
			1. Ringing tone
			2. Ringing volume
			3. Incoming call alert
			4. Message alert tone
			5. Keypad tones
			6. Warning tones
			7. Vibrating alert
			8. Screen saver
			99. Back to Main Menu

			Pick a number :
			""";

			System.out.println(tonesMenu);
			int tonesEntry = input.nextInt();

			switch(tonesEntry){
				case 1: System.out.println("Ringing tone");
				break;
				case 2: System.out.println("Ringing volume");
				break;
				case 3: System.out.println("Incoming call alert");
				break;
				case 4: System.out.println("Message alert tone");
				break;
				case 5: System.out.println("Keypad tones");
				break;
				case 6: System.out.println("Warning tones");
				break;
				case 7: System.out.println("Vibrating alert");
				break;
				case 8: System.out.println("Screen saver");
				break;
				case 99: break;
				default: System.out.println("Invalid Number");
				break;
			}
			break;
			case 6: System.out.println("Settings");
			String settingsMenu = """
			1. Call settings
			2. Phone settings
			3. Security settings
			4. Restore factory settings
			99. Back to Main Menu

			Pick a number :
			""";

			System.out.println(settingsMenu);
			int settingsEntry = input.nextInt();

			switch(settingsEntry){
				case 1: System.out.println("Call settings");
				String callSettingsMenu = """
				1. Automatic redial
				2. Speed dialling
				3. Call waiting options
				4. Own number sending
				5. Phone line in use
				6. Automatic answer
				99. Back to Main Menu

				Pick a number :
				""";

				System.out.println(callSettingsMenu);
				int callSettingsEntry = input.nextInt();

				switch(callSettingsEntry){
					case 1: System.out.println("Automatic redial");
					break;
					case 2: System.out.println("Speed dialling");
					break;
					case 3: System.out.println("Call waiting options");
					break;
					case 4: System.out.println("Own number sending");
					break;
					case 5: System.out.println("Phone line in use");
					break;
					case 6: System.out.println("Automatic answer");
					break;
					case 99: break;
					default: System.out.println("Invalid Number");
					break;
				}
				break;
				case 2: System.out.println("Phone settings");
				String phoneSettingsMenu = """
				1. Language
				2. Cell info display
				3. Welcome note
				4. Network selection
				5. Confirm SIM service actions
				99. Back to Main Menu

				Pick a number :
				""";

				System.out.println(phoneSettingsMenu);
				int phoneSettingsEntry = input.nextInt();

				switch(phoneSettingsEntry){
					case 1: System.out.println("Language");
					break;
					case 2: System.out.println("Cell info display");
					break;
					case 3: System.out.println("Welcome note");
					break;
					case 4: System.out.println("Network selection");
					break;
					case 5: System.out.println("Confirm SIM service actions");
					break;
					case 99: break;
					default: System.out.println("Invalid Number");
					break;
				}
				
				break;
				case 3: System.out.println("Security settings");
				String securitySettingsMenu = """
				1. PIN code request
				2. Call barring service
				3. Fixed dialling
				4. Closed user group
				5. Security level
				6. Change access codes
				99. Back to Main Menu

				Pick a number :
				""";

				System.out.println(securitySettingsMenu);
				int securitySettingEntry = input.nextInt();

				switch(securitySettingEntry){
					case 1: System.out.println("PIN code request");
					break;
					case 2: System.out.println("Call barring service");
					break;
					case 3: System.out.println("Fixed dialling");
					break;
					case 4: System.out.println("Closed user group");
					break;
					case 5: System.out.println("Security level");
					break;
					case 6: System.out.println("Change access codes");
					break;
					case 99: break;
					default: System.out.println("Invalid Number");
					break;
				}

				break;
				case 4: System.out.println("Restore factory settings");
				break;
				case 99: break;
				default: System.out.println("Invalid Number");
				break;
			}	
			
			break;
			case 7: System.out.println("Call divert");
			break;
			case 8: System.out.println("Music");
			String musicMenu = """
			1. Music player
			2. Radio
			3. Recorder
			4. Track list
			99. Back to Main Menu

			Pick a number :
			""";

			System.out.println(musicMenu);
			int musicEntry = input.nextInt();

			switch(musicEntry){
				case 1: System.out.println("Music player");
				break;
				case 2: System.out.println("Radio");
				break;
				case 3: System.out.println("Recorder");
				break;
				case 4: System.out.println("Track list");
				break;
				case 99: break;
				default: System.out.println("Invalid Number");
				break;
			}
			break;
			case 9: System.out.println("Games");
			break;
			case 10: System.out.println("Calculator");
			break;
			case 11: System.out.println("Reminders");
			break;
			case 12: System.out.println("Clock");
			String clockMenu = """
			1. Alarm clock
			2. Clock settings
			3. Date setting
			4. Stopwatch
			5. Countdown timer
			6. Auto update of date and time
			99. Back to Main Menu

			Pick a number :
			""";

			System.out.println(clockMenu);
			int clockEntry = input.nextInt();

			switch(clockEntry){
				case 1: System.out.println("Alarm clock");
				break;
				case 2: System.out.println("Clock settings");
				break;
				case 3: System.out.println("Date setting");
				break;
				case 4: System.out.println("Stopwatch");
				break;
				case 5: System.out.println("Countdown timer");
				break;
				case 6: System.out.println("Auto update of date and time");
				break;
				case 99: break;
				default: System.out.println("Invalid Number");
				break;
			}
			break;
			case 13: System.out.println("Profiles");
			break;
			case 14: System.out.println("Services");
			break;
			case 15: System.out.println("SIM services2");
			break;
			case 0: System.out.println("You have successfuly Exited this Program");
			running = false;
			break;
			default:System.out.println("Invalid Number");
			break;

		}


		}

	}

}