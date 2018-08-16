package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import comparison.LabelUXAllTablesComparison;
import comparison.ModuleUXAllTablesComparison;
import comparison.PermissionUXAllTablesComparison;
import comparison.ReportUXAllTablesComparison;
import comparison.RoleBasedMenuUXAllTablesComparison;
import comparison.SettingsUXAllTablesComparison;
import comparison.SetupTablesUXAllTablesComparison;
import comparison.UnitsUXAllTablesComparison;
import comparison.WizardUXAllTablesComparison;
import function.Compare;
import function.UsefullPrint;

public class AllTablesCheck {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// create object of Compare class
		Compare compare = new Compare();

		// message, that connection to database establishing has started
		UsefullPrint.establishConnectionMessage();

		// driver launch
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

		// create connection objects
		Connection con = DriverManager.getConnection(compare.getbaseConnectionStringSource());
		Connection con2 = DriverManager.getConnection(compare.getBaseConnectionStringTarget());

		// create statement objects
		Statement st = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
		Statement st2 = con2.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

		// create result set objects
		ResultSet rs = null;
		ResultSet rs2 = null;

		// ALL TABLES CHECKING PROCESS HERE
		UsefullPrint.greetMessage(LabelUXAllTablesComparison.class.getSimpleName());
		LabelUXAllTablesComparison.LabelTablesComparison(con, con2, rs, rs2, st, st2);

		UsefullPrint.greetMessage(ReportUXAllTablesComparison.class.getSimpleName());
		ReportUXAllTablesComparison.ReportTablesComparison(con, con2, rs, rs2, st, st2);

		UsefullPrint.greetMessage(SetupTablesUXAllTablesComparison.class.getSimpleName());
		SetupTablesUXAllTablesComparison.SetupTablesTablesComparison(con, con2, rs, rs2, st, st2);

		UsefullPrint.greetMessage(UnitsUXAllTablesComparison.class.getSimpleName());
		UnitsUXAllTablesComparison.UnitsTablesComparison(con, con2, rs, rs2, st, st2);

		UsefullPrint.greetMessage(WizardUXAllTablesComparison.class.getSimpleName());
		WizardUXAllTablesComparison.WizardTablesComparison(con, con2, rs, rs2, st, st2);

		UsefullPrint.greetMessage(ModuleUXAllTablesComparison.class.getSimpleName());
		ModuleUXAllTablesComparison.ModuleTablesComparison(con, con2, rs, rs2, st, st2);

		UsefullPrint.greetMessage(PermissionUXAllTablesComparison.class.getSimpleName());
		PermissionUXAllTablesComparison.PermissionTablesComparison(con, con2, rs, rs2, st, st2);

		UsefullPrint.greetMessage(RoleBasedMenuUXAllTablesComparison.class.getSimpleName());
		RoleBasedMenuUXAllTablesComparison.RoleBasedMenuTablesComparison(con, con2, rs, rs2, st, st2);

		UsefullPrint.greetMessage(SettingsUXAllTablesComparison.class.getSimpleName());
		SettingsUXAllTablesComparison.SettingsTablesComparison(con, con2, rs, rs2, st, st2);

		// bye
		UsefullPrint.byeMessage();

		// close resources
		compare.closeResources(con, con2, rs, rs2, st, st2);
	}
}
