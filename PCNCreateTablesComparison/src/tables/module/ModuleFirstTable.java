package tables.module;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import function.Compare;

public class ModuleFirstTable {
	public static void ModuleFirst(Connection con, Connection con2, ResultSet rs, ResultSet rs2, Statement st, Statement st2) throws ClassNotFoundException, SQLException {
		// create object of Compare class
		Compare compare = new Compare();
				
		// create result set objects
		rs = st.executeQuery("SELECT COUNT(*) Module_Key FROM Plexus_Control.dbo.Customer_Module as CM where CM.Plexus_Customer_No = " + compare.getPlexusCustomerNumberSource() + " AND CM.Module_Key NOT IN (SELECT M.Module_Key FROM Plexus_Control.dbo.Module AS M WHERE M.Module_Group_Key = 55)");
		rs2 = st2.executeQuery("SELECT COUNT(*) FROM Plexus_Control.dbo.Customer_Module where plexus_customer_no = " + compare.getPlexusCustomerNumberTarget());
		
		// column quantity comparison
		compare.columnQuantityComparison(rs.getMetaData().getColumnCount(), rs2.getMetaData().getColumnCount());
		
		// row quantity comparison
		compare.rowQuantityComparison(compare.countRowQuantity(rs), compare.countRowQuantity(rs2));
	}
}
