package jp.co.webAuction;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

@Configuration
public class DatabaseConfig {

  @Value("postgres://nxfaxdtavfgalh:234962a1f8d6b2f4198a38709adec44357f4207b94786d840a9711e0295eee7e@ec2-50-17-178-87.compute-1.amazonaws.com:5432/dea9d804tl2d36")
  private String dbUrl;

  @Bean
  public DataSource dataSource() {
      HikariConfig config = new HikariConfig();
      config.setJdbcUrl(dbUrl);
      return new HikariDataSource(config);
  }
}