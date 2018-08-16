package comparison;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import function.UsefullPrint;
import tables.report.ReportUXFirstTable;
import tables.report.ReportUXSecondTable;
import tables.report.ReportUXThirdTable;

public class ReportUXAllTablesComparison {
	public static void ReportTablesComparison(Connection con, Connection con2, ResultSet rs, ResultSet rs2, Statement st, Statement st2) throws ClassNotFoundException, SQLException {
		ReportUXFirstTable.ReportUXFirst(con, con2, rs, rs2, st, st2);
		UsefullPrint.nextTableComparisonMessage();
		
		ReportUXSecondTable.ReportUXSecond(con, con2, rs, rs2, st, st2);
		UsefullPrint.nextTableComparisonMessage();
		
		ReportUXThirdTable.ReportUXThird(con, con2, rs, rs2, st, st2);
		UsefullPrint.endMessage(ReportUXAllTablesComparison.class.getSimpleName());
	}
}
