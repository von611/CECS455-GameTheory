package valentines;
import java.math.BigInteger;
import java.util.ArrayList; 

public class StudentSolver {
	public static void main(String[] args) {
		ArrayList<BigInteger> problem1 = new ArrayList<BigInteger>();
		problem1.add(new BigInteger("2"));
		problem1.add(new BigInteger("2"));
		ArrayList<BigInteger> problem2 = new ArrayList<BigInteger>();
		problem2.add(new BigInteger("1"));
		problem2.add(new BigInteger("8"));
		problem2.add(new BigInteger("25"));
		problem2.add(new BigInteger("26"));
		problem2.add(new BigInteger("29"));
		problem2.add(new BigInteger("45"));

		ArrayList<ArrayList<BigInteger>> solveProb = new ArrayList<ArrayList<BigInteger>>();
		solveProb.add(problem1);
		solveProb.add(problem2);
		System.out.println("Runnning");
		ArrayList<Boolean> solution = solve(solveProb);
		for(int i = 0; i < solution.size(); i++) {
			System.out.println(i);
			System.out.println(solution.get(i));
		}
	}
	public static ArrayList<Boolean> solve(ArrayList<ArrayList<BigInteger>> problems){
		
		ArrayList<Boolean> solution = new ArrayList<Boolean>();
		
		for(int i = 0; i < problems.size(); i++) {
			System.out.println(i);
			int nimsum = 0;
			ArrayList<BigInteger> game = problems.get(i);
			for(int j = 0; j < game.size(); j++) {
				System.out.println(j);
				nimsum = nimsum ^ game.get(j).intValue();
			}
			
			if(nimsum != 0) {
				solution.add(true);
			} else {
				solution.add(false);
			}
		}
		
		return solution;
	}
}
