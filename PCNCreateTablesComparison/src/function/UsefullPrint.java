package function;

public class UsefullPrint {
	// establishing connection message
	public static void establishConnectionMessage() {
		System.out.println("Establishing connection to database");
		System.out.println();
	}
	
	// connection to database was established message
	public static void establishedConnectionMessage() {
		System.out.println("Connection to database was established");
		System.out.println();
	}
	
	// greet message method
	public static void greetMessage(String name) {
		System.out.println(name + " Table comparison process has started");
		System.out.println();
	}

	// bye message method
	public static void byeMessage() {
		System.out.println("Comparison process has been completed");
		System.out.println();
	}
	
	// end message method
	public static void endMessage(String name) {
		System.out.println();
		System.out.println("End " + name);
		System.out.println();
	}
	
	// next table comparison started
	public static void nextTableComparisonMessage() {
		System.out.println();
		System.out.println("Next table comparison process has been started");
		System.out.println();
	}

	// mehotd, that displays current column comparison process
	public static void startCompareMessage(int i) {
		System.out.println(i + " column comparison has started");
	}

	// method, that prints column comparison results
	public static void printResults(int same, int diff) {
		System.out.println("Same - " + same);
		System.out.println("Different - " + diff);
	}

	// method, that displays the start of column quantity comparison process
	public static void startColumnCompareMessage() {
		System.out.println("Column quantity comparison has started");
	}

	// method, that displays information if column quantity is the same
	public static void columnSameQuantity(int rsColNumber, int rsColNumber2) {
		System.out.println(
				"Column quantity is the same. First table - " + rsColNumber + " - Second table - " + rsColNumber2);
	}

	// method, that displays information if column quantity is different
	public static  void columnDifferentQuantity(int rsColNumber, int rsColNumber2) {
		System.out.println(
				"Table measurments are different. Columns are - First table - " + rsColNumber + " - Second table - " + rsColNumber2);
	}
	
	// method, that displays information if column quantity is the same
	public static void rowSameQuantity(int rsRowNumber, int rsRowNumber2) {
		System.out.println(
				"Row quantity is the same. First table - " + rsRowNumber + " - Second table - " + rsRowNumber2);
	}

	// method, that displays information if column quantity is different
	public static void rowDifferentQuantity(int rsRowNumber, int rsRowNumber2) {
		System.out.println(
				"Table measurments are different. Rows are - First table - " + rsRowNumber + " - Second table - " + rsRowNumber2);
	}
}
