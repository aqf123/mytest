package dao;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import domain.User;
import utils.JDBCUtils;

public class UserDao {
	public User login(String username , String password) throws SQLException{
		QueryRunner runner = new QueryRunner(JDBCUtils.getDataSource());
		String sql = "select * from t_user where username = ? and pwd = ?";
		return runner.query(sql, new BeanHandler<User>(User.class) , username , password);
	}
}
