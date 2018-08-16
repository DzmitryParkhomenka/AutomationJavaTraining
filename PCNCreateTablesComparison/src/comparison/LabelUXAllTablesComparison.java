package comparison;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import function.UsefullPrint;
import tables.label.LabelUXEightTable;
import tables.label.LabelUXFifthTable;
import tables.label.LabelUXFirstTable;
import tables.label.LabelUXFourthTable;
import tables.label.LabelUXNinethTable;
import tables.label.LabelUXSecondTable;
import tables.label.LabelUXSeventhTable;
import tables.label.LabelUXSixthTable;
import tables.label.LabelUXTenthTable;
import tables.label.LabelUXThirdTable;


public class LabelUXAllTablesComparison {
	public static void LabelTablesComparison(Connection con, Connection con2, ResultSet rs, ResultSet rs2, Statement st, Statement st2) throws ClassNotFoundException, SQLException {	
		LabelUXFirstTable.LabelUXFirst(con, con2, rs, rs2, st, st2);
		UsefullPrint.nextTableComparisonMessage();
		
		LabelUXSecondTable.LabelUXSecond(con, con2, rs, rs2, st, st2);
		UsefullPrint.nextTableComparisonMessage();
		
		LabelUXThirdTable.LabelUXThird(con, con2, rs, rs2, st, st2);
		UsefullPrint.nextTableComparisonMessage();
		
		LabelUXFourthTable.LabelUXFourth(con, con2, rs, rs2, st, st2);
		UsefullPrint.nextTableComparisonMessage();
		
		LabelUXFifthTable.LabelUXFifth(con, con2, rs, rs2, st, st2);
		UsefullPrint.nextTableComparisonMessage();
		
		LabelUXSixthTable.LabelUXSixth(con, con2, rs, rs2, st, st2);
		UsefullPrint.nextTableComparisonMessage();
		
		LabelUXSeventhTable.LabelUXSeventh(con, con2, rs, rs2, st, st2);
		UsefullPrint.nextTableComparisonMessage();
		
		LabelUXEightTable.LabelUXEight(con, con2, rs, rs2, st, st2);
		UsefullPrint.nextTableComparisonMessage();
		
		LabelUXNinethTable.LabelUXNineth(con, con2, rs, rs2, st, st2);
		UsefullPrint.nextTableComparisonMessage();
		
		LabelUXTenthTable.LabelUXTenth(con, con2, rs, rs2, st, st2);
		UsefullPrint.endMessage(LabelUXAllTablesComparison.class.getSimpleName());
	}
}
