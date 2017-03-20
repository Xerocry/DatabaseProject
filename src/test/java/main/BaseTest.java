package main;

import com.sun.org.apache.xpath.internal.SourceTree;
import io.ebean.Ebean;
import io.ebean.Platform;
import io.ebean.dbmigration.DbMigration;
import org.junit.AfterClass;
import org.junit.BeforeClass;

import java.io.IOException;

/**
 * Created by raskia on 3/10/2017.
 */
public class BaseTest {
    @BeforeClass
    public static void startApp() throws IOException {
        DbMigration dbMigration = new DbMigration();
        dbMigration.setPlatform(Platform.POSTGRES);
        // generate the migration ddl and xml
        // ... with EbeanServer in "offline" mode
        dbMigration.generateMigration();
        generate();


        // ignore test-ebean.properties
        System.setProperty("disableTestProperties", "true");

        // starting EbeanServer triggers the apply of migrations
        // ... when ebean.migration.run=true
        Ebean.getDefaultServer();

        System.out.println("Done!");

    }

    @AfterClass
    public static void stopApp() {

    }


    public static void generate() {

        System.setProperty("ddl.migration.generate", "true");

        System.setProperty("ddl.migration.version", "1.1");
        System.setProperty("ddl.migration.name", "support end dating");

        // migration will be generated when EbeanServer instance starts
        // ... typically by running your application.
    }
}
