package com.amit;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.r2dbc.config.AbstractR2dbcConfiguration;
import org.springframework.data.r2dbc.function.DatabaseClient;
import org.springframework.data.r2dbc.function.ReactiveDataAccessStrategy;
import org.springframework.data.r2dbc.repository.config.EnableR2dbcRepositories;
import org.springframework.data.r2dbc.repository.support.R2dbcRepositoryFactory;
import org.springframework.data.relational.core.mapping.RelationalMappingContext;

import io.r2dbc.postgresql.PostgresqlConnectionConfiguration;
import io.r2dbc.postgresql.PostgresqlConnectionFactory;
import io.r2dbc.spi.ConnectionFactory;

@Configuration
@EnableR2dbcRepositories
class DatabaseConfiguration extends AbstractR2dbcConfiguration {
	@Value("${spring.data.postgres.host}")
	String host;
	@Value("${spring.data.postgres.port}")
	int port;
	@Value("${spring.data.postgres.database}")
	String database;
	@Value("${spring.data.postgres.username}")
	String username;
	@Value("${spring.data.postgres.password}")
	String password;


	@Override
	public ConnectionFactory connectionFactory() {

		System.out.println(host);
		// TODO Auto-generated method stub
		PostgresqlConnectionConfiguration conf =
				PostgresqlConnectionConfiguration.builder().host(host).port(port)
				.database(database).username(username).password(password).build();
		System.out.println(conf);
		return new PostgresqlConnectionFactory(conf);
	}

}