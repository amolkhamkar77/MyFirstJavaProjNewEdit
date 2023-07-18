package ControlStatment;

public class SwitchCaseStatement3 {

	public static void main(String[] args) {
		String c = "dec";
		switch(c)
		{
		case "jan":
		System.out.println(c+ " is a firt month");
		break;
		case "feb":
			System.out.println(c+ " is a second month");
			break;
		case "march":
			System.out.println(c+ " is a third month");
			break;
			case "april":
				System.out.println(c+ " is a fourth month");
				break;
			case "may":
				System.out.println(c+ " is a fifth month");
				break;
				case "june":
					System.out.println(c+ " is a sixth month");
					break;
				case "july":
					System.out.println(c+ " is a seventh month");
					break;
					case "august":
						System.out.println(c+ " is a eighth month");
						break;
					case "sep":
						System.out.println(c+ " is a ninth month");
						break;
						case "oct":
							System.out.println(c+ " is a tenth month");
							break;
						case "nov":
							System.out.println(c+ " is a eleventh month");
							break;
							case "dec":
								System.out.println(c+ " is a twlveth month");
								break;
		default:
			System.out.println(c+ " is not a month");
		}
	}

}
