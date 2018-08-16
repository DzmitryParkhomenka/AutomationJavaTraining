package comparison;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import function.UsefullPrint;
import tables.wizard.WizardUXFirstTable;

public class WizardUXAllTablesComparison {
	public static void WizardTablesComparison(Connection con, Connection con2, ResultSet rs, ResultSet rs2, Statement st, Statement st2) throws ClassNotFoundException, SQLException {		
		WizardUXFirstTable.WizardUXFirst(con, con2, rs, rs2, st, st2);
		UsefullPrint.endMessage(WizardUXAllTablesComparison.class.getSimpleName());
	}
}
