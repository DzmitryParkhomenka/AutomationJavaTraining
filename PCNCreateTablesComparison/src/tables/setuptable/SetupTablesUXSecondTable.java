package tables.setuptable;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import function.Compare;

public class SetupTablesUXSecondTable {
	public static void SetupTablesUXSecond(Connection con, Connection con2, ResultSet rs, ResultSet rs2, Statement st, Statement st2) throws ClassNotFoundException, SQLException {
		// create object of Compare class
		Compare compare = new Compare();
				
		// create result set objects
		rs = st.executeQuery("DECLARE @Source_PCN INT = " + compare.getPlexusCustomerNumberSource() + "SELECT Count(*) FROM Plexus_Control.dbo.Setup_Field AS SF JOIN Plexus_Control.dbo.Setup_Table AS ST ON ST.Table_Node_No = SF.Table_Node_No JOIN Plexus_Control.dbo.Table_Info AS T ON T.Table_Key = ST.Table_Key WHERE ST.Plexus_Customer_No = " + compare.getPlexusCustomerNumberSource() + " AND T.Setup_Table_Allowed = 1");
		rs2 = st2.executeQuery("SELECT COUNT(*) FROM Plexus_Control.dbo.Setup_Field where Plexus_Customer_No = " + compare.getPlexusCustomerNumberTarget());
				
		// column quantity comparison
		compare.columnQuantityComparison(rs.getMetaData().getColumnCount(), rs2.getMetaData().getColumnCount());
		
		// row quantity comparison
		compare.rowQuantityComparison(compare.countRowQuantity(rs), compare.countRowQuantity(rs2));
	}
}
