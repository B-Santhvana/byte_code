//print subjects based on year and branch using switch case
package assignment4;

public class SwitchCase {

	public static void main(String[] args) {
		int year=1;
		String branch="eee";
		switch(year) {
		case 1:
			System.out.println(" common subjects for all branches : physics, maths,environmental science, english");
			break;
		case 2:
			switch (branch) {
			case "cse":
				System.out.println("data structures,BEEE, maths");
				break;
			case "ece":
				System.out.println("maths,physics,circuit analysis");
				break;
			case "eee":
				System.out.println("power systems, analytic functions");
				break;
			case "mechanical":
				System.out.println("fluid mechanics, machine dynamics");
				break;
			case "civil":
				System.out.println("building material, maths, eng drawing");
				break;
			case "mme":
				System.out.println("statistics, elements of analysis");
				break;
			default:
				System.out.println("enter valid branch");
			}
			break;
		case 3:
			switch (branch) {
			case "cse":
				System.out.println("oop,linear algebra,os");
				break;
			case "ece":
				System.out.println("COA,digital circuits");
				break;
			case "eee":
				System.out.println("digital logic, transmission lines");
				break;
			case "mechanical":
				System.out.println("thermo dynamics, fluid mechanics");
				break;
			case "civil":
				System.out.println("transportation eng, maths, eng drawing");
				break;
			case "mme":
				System.out.println("advanced physics,welding metallurgy");
				break;
			default:
				System.out.println("enter valid branch");
			}
			break;
		case 4:
			switch (branch) {
			case "cse":
				System.out.println("CNS, AI, cloud computing");
				break;
			case "ece":
				System.out.println("c++, analogs");
				break;
			case "eee":
				System.out.println("circuit analysis, signals and systems");
				break;
			case "mechanical":
				System.out.println("welding, thermal engineering");
				break;
			case "civil":
				System.out.println("fluid mechanics, building mechanics");
				break;
			case "mme":
				System.out.println("maths, physics, environmental science");
				break;
			default:
				System.out.println("enter valid branch");
			}
			break;
		default:
			System.out.println("enter valid year");


	}

}
}