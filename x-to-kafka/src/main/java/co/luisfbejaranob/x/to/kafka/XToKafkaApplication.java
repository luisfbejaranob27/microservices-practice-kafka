package co.luisfbejaranob.x.to.kafka;

import co.luisfbejaranob.x.to.kafka.config.XToKafkaServiceDataConfig;
import co.luisfbejaranob.x.to.kafka.runner.StreamRunner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class XToKafkaApplication implements CommandLineRunner
{
	private static final Logger log = LoggerFactory.getLogger(XToKafkaApplication.class);

	private final XToKafkaServiceDataConfig dataConfig;

	private final StreamRunner streamRunner;

    public XToKafkaApplication(XToKafkaServiceDataConfig dataConfig, StreamRunner streamRunner)
	{
        this.dataConfig = dataConfig;
        this.streamRunner = streamRunner;
    }

    public static void main(String[] args)
	{
		SpringApplication.run(XToKafkaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception
	{
		log.info("X to Kafka service Started...");
		log.info(dataConfig.getXKeywords().toString());
		log.info(dataConfig.getMessage());
		streamRunner.start();
	}
}
