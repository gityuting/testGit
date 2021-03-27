package com.example.demo;

import com.example.demo.demo.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.math.BigDecimal;
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
	@Test
	void structure(){
	/*	System.out.printf("%.1f",2.0-1.1);
		System.out.printf("%.2f",2.0-1.1);
		System.out.println(1.0-0.1);*/
	    //数字必须加：" "
		System.out.println(new BigDecimal(2.2));
		System.out.println(new BigDecimal("2.0").subtract(new BigDecimal("1.1")));
		BigDecimal bigDecimal = new BigDecimal(1.1);
		short s=1;
		s=(short)(s+1);
		float f=1;
		f=(float) (f+1d);
		int i=1;
		i=(int)(i+1.1);
		long l=1;
		l=(long)(l+1.1);
		double d = 1;
		d=d+1.1f;
		s+=1;
	}

	@Test
	public void tryfinall(){
		System.out.println(tf());
	}
	public int tf(){
		try{
			return 1;
		}finally {
			return 2;
		}
	}

}
