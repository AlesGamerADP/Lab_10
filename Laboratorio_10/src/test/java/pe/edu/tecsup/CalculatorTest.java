package pe.edu.tecsup;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.config.Configurator;
import org.junit.Assert;
import org.junit.jupiter.api.*;

public class CalculatorTest {

    private static final Logger log = LogManager.getLogger(CalculatorTest.class);

    @BeforeAll
    static void beforeAll() {
        Configurator.setRootLevel(org.apache.logging.log4j.Level.INFO);
        log.info("initAll().....!");
    }

    @AfterAll
    static void finishAll() {
        log.info("finishAll().....!");
    }

    @BeforeEach
    void beforeTest() {
        log.info("beforeTest().....!");
    }

    @AfterEach
    void afterTest() {
        log.info("afterTest().....!");
    }

    @Test
    void testsub() {
        log.info("testsub().....!");

        final int EXPECTED = 1;

        Calculator app = new Calculator();
        int actual = app.sub(4, 3);

        Assert.assertEquals(EXPECTED, actual);
    }

    @Test
    void testadd() {
        log.info("testadd().....!");

        final int EXPECTED = 7;

        Calculator app = new Calculator();
        int actual = app.add(4, 3);

        Assert.assertEquals(EXPECTED, actual);
    }
}
