package jp.co.webAuction;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

@Configuration
public class DatabaseConfig {

	@Value("${ postgres://gyroakjdlbokxr:1cc587e334e2bc9f58e9d367a884c9572f94355a893c4f05dc6b92514e92df66@ec2-3-214-53-225.compute-1.amazonaws.com:5432/d8v6q9n7jq66g8}")
	private String dbUrl;

	@Bean
	public DataSource dataSource() {
		HikariConfig config = new HikariConfig();
		config.setJdbcUrl(dbUrl);
		return new HikariDataSource(config);
	}
}
