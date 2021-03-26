package com.example.demo;

import com.example.demo.demo.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@SpringBootTest
class DemoApplicationTests {

	public String AUSERNAME="1";
	@Resource
	private DataSource dataSource;
	@Resource
	private UserService userService2;
	@Test
	void contextLoads() throws SQLException {
		System.out.println("开始");
		System.out.println(dataSource.getClass());
		Connection connection = dataSource.getConnection();
		System.out.println(connection);
		connection.close();

	}
	@Test
	void userTest(){
		userService2.getUser();
	}

}
