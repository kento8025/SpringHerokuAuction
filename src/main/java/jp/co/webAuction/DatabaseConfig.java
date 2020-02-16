package jp.co.webAuction;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

@Configuration
public class DatabaseConfig {

  @Value("${postgres://pnhflcvsxxzedg:aa11e5f17c5a334e9d8737545b2e9ef31b59d86a9eac9d2e6b921415ea1ed49d@ec2-184-72-235-159.compute-1.amazonaws.com:5432/da7hr1lh3vbjua}")
  private String dbUrl;
  //じぇちｊぎえあｊ
  @Bean
  public DataSource dataSource() {
      HikariConfig config = new HikariConfig();
      config.setJdbcUrl(dbUrl);
      return new HikariDataSource(config);
  }
}