package example;

//import example.model.Dog;
// import org.jooq.util.GenerationTool;
// import org.jooq.util.jaxb.*;

import java.sql.Connection;
import java.sql.DriverManager;

import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.Result;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;

import example.model.tables.*;

public class Main {

	public static void main(String[] args) {
		/*
		Configuration configuration = new Configuration()
		    .withJdbc(new Jdbc()
		        .withDriver("org.postgresql.Driver")
		        .withUrl("jdbc:postgresql://db/animal?user=maria&password=pass")
		        .withUser("maria")
		        .withPassword("pass"))
		    .withGenerator(new Generator()
		        .withName("org.jooq.util.DefaultGenerator")
		        .withDatabase(new Database()
		                .withName("org.jooq.util.postgres.PostgresDatabase")
		                .withIncludes(".*")
		                .withSchemata(new Schema().withInputSchema("animal"))
		        )
		        .withTarget(new Target()
		            .withPackageName("example.model")
		            .withDirectory("/target/src/main/java")));
		try {
		  GenerationTool.generate(configuration);
		} catch (Exception e) {
		  e.printStackTrace();
		}
		*/
		String user = "maria";
		String pass = "pass";
		String url = "jdbc:postgresql://db/animal";

		// Create a JDBC Connection
		try (Connection conn = DriverManager.getConnection(url, user, pass)) {
		    // Create a context for your database
		    DSLContext ctx = DSL.using(conn, SQLDialect.POSTGRES);
				System.out.println
				(
					ctx.selectFrom(Dog.DOG).fetch()
				);
		} catch (Exception e) {
		    e.printStackTrace();
		}
		System.out.println("Hello World");
	}
}
