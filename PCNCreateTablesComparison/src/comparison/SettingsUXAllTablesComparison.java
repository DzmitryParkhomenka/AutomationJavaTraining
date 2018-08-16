package comparison;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import function.UsefullPrint;
import tables.setting.SettingsFirstTable;

public class SettingsUXAllTablesComparison {
	public static void SettingsTablesComparison(Connection con, Connection con2, ResultSet rs, ResultSet rs2, Statement st, Statement st2) throws ClassNotFoundException, SQLException {		
		SettingsFirstTable.SettingsFirst(con, con2, rs, rs2, st, st2);
		UsefullPrint.endMessage(SettingsUXAllTablesComparison.class.getSimpleName());
	}
}
