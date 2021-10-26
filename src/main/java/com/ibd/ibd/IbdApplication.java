package com.ibd.ibd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class IbdApplication implements CommandLineRunner{

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public static void main(String[] args) {
		SpringApplication.run(IbdApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		String sql ="INSERT INTO `ibd`.`Printouts`( `title` , `date`)VALUES('TEST','2020-10-10T10:20:20');";
		 jdbcTemplate.execute(sql);
	}

}
