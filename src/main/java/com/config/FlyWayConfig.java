package com.config;

import org.flywaydb.core.Flyway;

public class FlyWayConfig {

    private static final String URL = "jdbc:postgresql://ec2-3-214-2-141.compute-1.amazonaws.com:5432/d3fhh0rsdj93p6";
    private static final String USER = "aqichilkdccsob";
    private static final String PASSWORD = "a4823626d74b2792aa3fe9fcf5a6d03fd129fabd76a41a42736a385f78aeea52";
    private static final String SCHEMA = "public";
    private static final String LOCATION = "db/migration";

    private FlyWayConfig() {
    }

    public static Flyway getInstance() {
        return Flyway.configure()
                .dataSource(URL, USER, PASSWORD)
                .baselineOnMigrate(true)
                .schemas(SCHEMA)
                .locations(LOCATION)
                .load();
    }
}
