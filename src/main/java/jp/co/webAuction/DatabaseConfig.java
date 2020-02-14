package jp.co.webAuction;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

@Configuration
public class DatabaseConfig {

	@Value("${postgres://zerfwwntxwgkro:c9f690ef3727e48acba7bd939c64b45d6c8f60806165b433e2d2bc94aaac6aea@ec2-3-230-106-126.compute-1.amazonaws.com:5432/dc13l0ts7kb4ci}")
	private String dbUrl;

	@Bean
	public DataSource dataSource() {
		HikariConfig config = new HikariConfig();
		config.setJdbcUrl(dbUrl);
		return new HikariDataSource(config);
	}
}
