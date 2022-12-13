package kafka.connect.marklogic.sink;

import java.util.Map;

import kafka.connect.marklogic.MarkLogicBufferedWriter;

import org.apache.kafka.common.config.AbstractConfig;
import org.apache.kafka.common.config.ConfigDef;
import org.apache.kafka.common.config.ConfigDef.Importance;
import org.apache.kafka.common.config.ConfigDef.Type;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class MarkLogicSinkConfig extends AbstractConfig {
    
    private static final Logger logger = LoggerFactory.getLogger(MarkLogicSinkConfig.class);
	
	public static final String CONNECTION_HOST = "ml.connection.host";
	public static final String CONNECTION_PORT = "ml.connection.port";
	public static final String CONNECTION_USER = "ml.connection.user";
	public static final String CONNECTION_PASSWORD = "ml.connection.password";
	
	public static ConfigDef CONFIG_DEF = new ConfigDef()
			.define(CONNECTION_HOST)
			.define(CONNECTION_PORT)
			.define(CONNECTION_USER)
			.define(CONNECTION_PASSWORD);

	public MarkLogicSinkConfig(final Map<?, ?> originals) {
		
		super(CONFIG_DEF, originals, false);
		logger.info("Original Configs {}", originals);
	}

}
