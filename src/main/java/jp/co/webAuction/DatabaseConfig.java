package jp.co.webAuction;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

@Configuration
public class DatabaseConfig {

	@Value("${postgres://gqhgjalxfmqfnj:b5b57fad8ecbe6208e92d25b219e10eb808cb86e4abffd5449a901d2832386cc@ec2-3-215-41-107.compute-1.amazonaws.com:5432/dabkol4sarbsqh}")
	private String dbUrl;

	@Bean
	public DataSource dataSource() {
		HikariConfig config = new HikariConfig();
		config.setJdbcUrl(dbUrl);
		return new HikariDataSource(config);
	}
}
