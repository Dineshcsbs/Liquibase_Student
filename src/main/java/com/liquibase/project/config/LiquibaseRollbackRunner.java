package com.liquibase.project.config;

import liquibase.integration.spring.SpringLiquibase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class LiquibaseRollbackRunner implements CommandLineRunner {

    @Autowired
    private SpringLiquibase liquibase;

    @Override
    public void run(String... args) throws Exception {
        if (args.length > 0 && args[0].equals("rollback")) {
            liquibase.getDatabase().rollback(Integer.parseInt(args[1]), "");
            System.out.println("Rollback completed.");
        }
    }
}