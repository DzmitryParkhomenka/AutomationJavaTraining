package comparison;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import function.UsefullPrint;
import tables.unit.UnitsUXFifthTable;
import tables.unit.UnitsUXFirstTable;
import tables.unit.UnitsUXFourthTable;
import tables.unit.UnitsUXSecondTable;
import tables.unit.UnitsUXSeventhTable;
import tables.unit.UnitsUXSixthTable;
import tables.unit.UnitsUXThirdTable;

public class UnitsUXAllTablesComparison {
	public static void UnitsTablesComparison(Connection con, Connection con2, ResultSet rs, ResultSet rs2, Statement st, Statement st2) throws ClassNotFoundException, SQLException {	
		UnitsUXFirstTable.UnitsUXFirst(con, con2, rs, rs2, st, st2);
		UsefullPrint.nextTableComparisonMessage();
		
		UnitsUXSecondTable.UnitsUXSecond(con, con2, rs, rs2, st, st2);
		UsefullPrint.nextTableComparisonMessage();
		
		UnitsUXThirdTable.UnitsUXThird(con, con2, rs, rs2, st, st2);
		UsefullPrint.nextTableComparisonMessage();
		
		UnitsUXFourthTable.UnitsUXFourth(con, con2, rs, rs2, st, st2);
		UsefullPrint.nextTableComparisonMessage();
		
		UnitsUXFifthTable.UnitsUXFifth(con, con2, rs, rs2, st, st2);
		UsefullPrint.nextTableComparisonMessage();
		
		UnitsUXSixthTable.UnitsUXSixth(con, con2, rs, rs2, st, st2);
		UsefullPrint.nextTableComparisonMessage();
		
		UnitsUXSeventhTable.UnitsUXSeventh(con, con2, rs, rs2, st, st2);
		UsefullPrint.endMessage(UnitsUXAllTablesComparison.class.getSimpleName());
	}
}
