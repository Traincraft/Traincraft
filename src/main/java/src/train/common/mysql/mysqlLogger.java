/**
 * @author Oliver Tiit
 */
package src.train.common.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import src.train.common.core.handlers.ConfigHandler;

public class mysqlLogger extends main implements mysqlLogInterface {
	//END OF SETTINGS :)
	public mysqlLogger() {}
	@Override
	public boolean logEvent(String type, Map args) {

		String q = getType(type, args);
		//System.out.println("Traincraft Logger: "+ q);
		if (q.equals("")) {
			return false;
		}
		boolean res = mysqlExecute(q);
		return res;
	}

	public String getTime() {
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
		String time = dateFormat.format(date);
		return time;
	}

	public String getType(String type, Map args) {
		if (type.equals("trainCreate")) {
			return "INSERT INTO traincreate (itemID, trainType, trainCreator, location, time, uID ) VALUES ('" + args.get("itemID") + "' , '" + args.get("trainType") + "' , '" + args.get("trainCreator") + "' , '" + args.get("location") + "' , '" + getTime() + "' , '" + args.get("uID") + "') ";
		}
		if (type.equals("trainDestroy")) {
			return "INSERT INTO traindestroy (itemID, trainType, trainCreator, location, trainDestroyer, time, uID ) VALUES ('" + args.get("itemID") + "' , '" + args.get("trainType") + "' , '" + args.get("trainCreator") + "' , '" + args.get("location") + "' , '" + args.get("trainDestroyer") + "' , '" + getTime() + "' , '" + args.get("uID") + "') ";
		}
		if (type.equals("trainExplode")) {
			return "INSERT INTO trainexplode (itemID, trainType, trainCreator, location, time, uID ) VALUES ('" + args.get("itemID") + "' , '" + args.get("trainType") + "' , '" + args.get("trainCreator") + "' , '" + args.get("location") + "' , '" + getTime() + "' , '" + args.get("uID") + "') ";
		}
		if (type.equals("trainPlace")) {
			return "INSERT INTO trainplace (itemID, trainType, trainCreator, location, trainPlacer, time, uID ) VALUES ('" + args.get("itemID") + "' , '" + args.get("trainType") + "' , '" + args.get("trainCreator") + "' , '" + args.get("location") + "' , '" + args.get("trainPlacer") + "' , '" + getTime() + "' , '" + args.get("uID") + "') ";
		}
		if (type.equals("trainColor")) {
			return "INSERT INTO traincolor (itemID, trainType, trainCreator, location, trainInteracter, color , time, uID) VALUES ('" + args.get("itemID") + "' , '" + args.get("trainType") + "' , '" + args.get("trainCreator") + "' , '" + args.get("location") + "' , '" + args.get("trainInteracter") + "' , '" + args.get("color") + "' , '" + getTime() + "' , '" + args.get("uID") + "') ";
		}
		System.out.println("Traincraft Logger: Wrong type");
		return "";
	}

	public boolean mysqlExecute(String query) {
		Connection conn = null;

		String url = "jdbc:mysql://" + ConfigHandler.MYSQL_URL;
		String driver = "com.mysql.jdbc.Driver";
		String databaseUserName = ConfigHandler.MYSQL_USER;
		String databasePassword = ConfigHandler.MYSQL_PASSWORD;
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, databaseUserName, databasePassword);
			PreparedStatement preparedStmt = conn.prepareStatement(query);
			preparedStmt.execute();
			conn.close();
		} catch (Exception e) {
			System.out.println(e);
			return false;
		}
		return true;
	}
	@Override
	public boolean enableLogger() { //this method returns true, if logger is able to work fine, if any errors, returns false! Also checks tables existance!
		String format1 = "CREATE TABLE trainCreate (id int NOT NULL AUTO_INCREMENT, itemID TEXT, trainType TEXT, trainCreator TEXT, location TEXT, time TEXT, uID TEXT,PRIMARY KEY (id))";
		String format2 = "CREATE TABLE trainDestroy (id int NOT NULL AUTO_INCREMENT, itemID TEXT, trainType TEXT, trainCreator TEXT, location TEXT, trainDestroyer TEXT, time TEXT,  uID TEXT,PRIMARY KEY (id))";
		String format3 = "CREATE TABLE trainExplode (id int NOT NULL AUTO_INCREMENT,itemID TEXT, trainType TEXT, trainCreator TEXT, location TEXT, time TEXT, uID TEXT,PRIMARY KEY (id))";
		String format4 = "CREATE TABLE trainPlace (id int NOT NULL AUTO_INCREMENT,itemID TEXT, trainType TEXT, trainCreator TEXT, location TEXT, trainPlacer TEXT, time TEXT, uID TEXT,PRIMARY KEY (id))";
		String format5 = "CREATE TABLE trainColor (id int NOT NULL AUTO_INCREMENT,itemID TEXT, trainType TEXT, trainCreator TEXT, location TEXT, trainInteracter TEXT, color TEXT, time TEXT, uID TEXT,PRIMARY KEY (id))";

		boolean res = tableCheck("trainCreate", format1);
		if (!res)
			return false;
		res = tableCheck("trainDestroy", format2);
		if (!res)
			return false;
		res = tableCheck("trainExplode", format3);
		if (!res)
			return false;
		res = tableCheck("trainPlace", format4);
		if (!res)
			return false;
		res = tableCheck("trainColor", format5);
		if (!res)
			return false;
		return true;
	}

	public boolean tableCheck(String table, String tableFormat) {
		Connection conn = null;

		String url = "jdbc:mysql://" + ConfigHandler.MYSQL_URL;
		String driver = "com.mysql.jdbc.Driver";
		String databaseUserName = ConfigHandler.MYSQL_USER;
		String databasePassword = ConfigHandler.MYSQL_PASSWORD;
		//System.out.println(url);
		try {

			Class.forName(driver);
			conn = DriverManager.getConnection(url, databaseUserName, databasePassword);
			PreparedStatement preparedStmt = conn.prepareStatement("Select * FROM " + table + "");
			preparedStmt.execute();
			conn.close();
		} catch (Exception e) {
			try {
				Class.forName(driver);
				conn = DriverManager.getConnection(url, databaseUserName, databasePassword);
				PreparedStatement preparedStmt = conn.prepareStatement(tableFormat);
				preparedStmt.execute();
				conn.close();
			} catch (Exception i) {
				System.out.println(i);
				return false;
			} //return that method is NOT able to connect to database at all!
		}
		return true;
	}
}

//create map requirements  -> itemID, trainType, trainCreator, location, uID
//destroy map requirements -> itemID, trainType, trainCreator, location, trainDestroyer, uID
//explode map requirements -> itemID, trainType, trainCreator, location, uID
//place map requirements   -> itemID, trainType, trainCreator, location, uID
//color map requirements   -> itemID, trainType, trainCreator, location, color, uID

//HOW MYSQL TABE WILL LOOK ***************************************************************

//itemID, trainType, trainCreator, location, time, uID
//itemID, trainType, trainCreator, location, time, trainDestroyer, uID
//itemID, trainType, trainCreator, location, time, uID
//itemID, trainType, trainCreator, location, time, uID
//itemID, trainType, trainCreator, location, time, color, uID