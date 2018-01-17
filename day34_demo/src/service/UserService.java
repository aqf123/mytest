package service;

import java.sql.SQLException;

import dao.UserDao;
import domain.User;

public class UserService {
	public User login(String username, String password) throws SQLException {
		UserDao dao = new UserDao();
		User user = dao.login(username, password);
		return user;
	}
}
