package tables.unit;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import function.Compare;

public class UnitsUXThirdTable {
	public static void UnitsUXThird(Connection con, Connection con2, ResultSet rs, ResultSet rs2, Statement st, Statement st2) throws ClassNotFoundException, SQLException {
		// create object of Compare class
		Compare compare = new Compare();
				
		// create result set objects
		rs = st.executeQuery("SELECT COUNT(*) FROM Common.dbo.Unit_Group where Plexus_Customer_No = " + compare.getPlexusCustomerNumberSource());
		rs2 = st2.executeQuery("SELECT COUNT(*) FROM Common.dbo.Unit_Group where Plexus_Customer_No = " + compare.getPlexusCustomerNumberTarget());
		
		// column quantity comparison
		compare.columnQuantityComparison(rs.getMetaData().getColumnCount(), rs2.getMetaData().getColumnCount());
		
		// row quantity comparison
		compare.rowQuantityComparison(compare.countRowQuantity(rs), compare.countRowQuantity(rs2));
	}
}