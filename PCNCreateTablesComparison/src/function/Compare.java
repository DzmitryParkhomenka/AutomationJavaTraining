package function;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Objects;

public class Compare {		
	// string variable for connection
	private String baseConnectionStringSource = "jdbc:sqlserver://ah-n1-dev:12020;user=pmc_db01;password=yPO8Oq2>G+";
	private String baseConnectionStringTarget = "jdbc:sqlserver://ah-n1-dev:12020;user=pmc_db01;password=yPO8Oq2>G+";
	private String baseConnectionStringDenver = "jdbc:sqlserver://10.160.12.21:12020;user=pmc_db01;password=yPO8Oq2>G+";
	
	// int variable for plexus customer number
	private int plexusCustomerNumberSource = 268363;
	private int plexusCustomerNumberTarget = 83870;
	
	// getter method to get baseConnectionString
	public String getbaseConnectionStringSource() {
		return baseConnectionStringSource;
	}
	
	public String getBaseConnectionStringTarget() {
		return baseConnectionStringTarget;
	}
	
	public String getBaseConnectionStringDenver() {
		return baseConnectionStringDenver;
	}
	
	// getter method to get plexus customer number
	public int getPlexusCustomerNumberSource() {
		return plexusCustomerNumberSource;
	}
	
	public int getPlexusCustomerNumberTarget() {
		return plexusCustomerNumberTarget;
	}
	
	
	// method, that puts cursor of result set before first cell
	public void cursorToTheStart(ResultSet rs, ResultSet rs2) throws SQLException {
		rs.beforeFirst();
		rs2.beforeFirst();
	}

	// method, that compares cell values of current result sets
	public void compareCellValues(ResultSet rs, ResultSet rs2, int i, int same, int diff) throws SQLException {
		while (rs.next() && rs2.next()) {
			if (Objects.equals(rs.getString(i), rs2.getString(i))) {
				same++;
			} else {
				diff++;
			}
		}
		UsefullPrint.printResults(same, diff);
	}

	// method, that cycles through columns, compares cells values and prints result
	public void rowCycleComparison(ResultSet rs, ResultSet rs2, int same, int diff, int rsColNumber) throws SQLException {
		for (int i = 1; i <= rsColNumber; i++) {
			UsefullPrint.startCompareMessage(i);
			cursorToTheStart(rs, rs2);
			compareCellValues(rs, rs2, i, same, diff);
			}
	}

	// method, that compares quantity of columns
	public void columnQuantityComparison(int rsColNumber, int rsColNumber2) throws SQLException {
		if (Objects.equals(rsColNumber, rsColNumber2)) {
			UsefullPrint.columnSameQuantity(rsColNumber, rsColNumber2);
		} else {
			UsefullPrint.columnDifferentQuantity(rsColNumber, rsColNumber2);
		}
	}
	
	// method, that compares quantity of rows
	public void rowQuantityComparison(int rsRowNumber, int rsRowNumber2) throws SQLException{
		if (Objects.equals(rsRowNumber, rsRowNumber2)) {
			UsefullPrint.rowSameQuantity(rsRowNumber, rsRowNumber2);
		} else {
			UsefullPrint.rowDifferentQuantity(rsRowNumber, rsRowNumber2);
		}
	}

	public int countRowQuantity(ResultSet rs) throws SQLException {
		int rowQuantity = 0;
		rs.next();
		rowQuantity = rs.getInt(1);
		return rowQuantity;
	}

	// method to close resources
	public void closeResources(Connection con, Connection con2, ResultSet rs, ResultSet rs2, Statement st, Statement st2) {
		try {if (st != null) {st.close();}} catch (SQLException e) {}
		try {if (st2 != null) {st2.close();}} catch (SQLException e) {}
		try {if (rs != null) {rs.close();}} catch (SQLException e) {}
		try {if (rs2 != null) {rs2.close();}} catch (SQLException e) {}
		try {if (con != null) {con.close();}} catch (SQLException e) {}
		try {if (con2 != null) {con2.close();}} catch (SQLException e) {}
	}
}
