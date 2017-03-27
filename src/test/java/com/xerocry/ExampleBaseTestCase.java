package com.xerocry;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Used to dynamically load the avaje-ebeanorm-agent.
 * <p>
 * Alternatives:
 * - Use IntelliJ or Eclipse plugins,
 * - Rely on maven/ant enhancement (pain in dev, test cycle)
 * - Specify the java agent on the command line
 */
public class ExampleBaseTestCase {

    protected static Logger logger = LoggerFactory.getLogger(ExampleBaseTestCase.class);
//
//  static {
//    logger.debug("... preStart");
//    if (!AgentLoader.loadAgentFromClasspath("avaje-ebeanorm-agent","debug=1;packages=com.xerocry.**")) {
//      logger.info("avaje-ebeanorm-agent not found in classpath - not dynamically loaded");
//    }
//  }
}
