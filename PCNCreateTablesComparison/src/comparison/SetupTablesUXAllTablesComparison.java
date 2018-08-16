package comparison;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import function.UsefullPrint;
import tables.setuptable.SetupTablesUXFirstTable;
import tables.setuptable.SetupTablesUXSecondTable;

public class SetupTablesUXAllTablesComparison {
	public static void SetupTablesTablesComparison(Connection con, Connection con2, ResultSet rs, ResultSet rs2, Statement st, Statement st2) throws ClassNotFoundException, SQLException {
		SetupTablesUXFirstTable.SetupTablesUXFirst(con, con2, rs, rs2, st, st2);
		UsefullPrint.nextTableComparisonMessage();
		
		SetupTablesUXSecondTable.SetupTablesUXSecond(con, con2, rs, rs2, st, st2);
		UsefullPrint.endMessage(SetupTablesUXAllTablesComparison.class.getSimpleName());
	}
}
