package tables.setting;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import function.Compare;

public class SettingsFirstTable {
	public static void SettingsFirst(Connection con, Connection con2, ResultSet rs, ResultSet rs2, Statement st, Statement st2) throws ClassNotFoundException, SQLException {
		// create object of Compare class
		Compare compare = new Compare();
				
		// create result set objects
		rs = st.executeQuery("SELECT COUNT(*) FROM Plexus_Control.dbo.Plexus_Customer_Setting AS PCS JOIN Plexus_Control.dbo.Setting AS S ON S.Setting_Key = PCS.Setting_Key AND S.Prevent_Synchronize = 0 WHERE PCS.Plexus_Customer_No = " + compare.getPlexusCustomerNumberSource());
		rs2 = st2.executeQuery("SELECT COUNT(*) FROM Plexus_Control.dbo.Plexus_Customer_Setting where plexus_customer_no = " + compare.getPlexusCustomerNumberTarget());
		
		// column quantity comparison
		compare.columnQuantityComparison(rs.getMetaData().getColumnCount(), rs2.getMetaData().getColumnCount());
		
		// row quantity comparison
		compare.rowQuantityComparison(compare.countRowQuantity(rs), compare.countRowQuantity(rs2));
	}
}
