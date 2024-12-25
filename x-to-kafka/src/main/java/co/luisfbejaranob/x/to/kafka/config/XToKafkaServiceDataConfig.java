package co.luisfbejaranob.x.to.kafka.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Getter
@Setter
@Configuration
@ConfigurationProperties(prefix = "x-to-kafka-service")
public class XToKafkaServiceDataConfig
{
    private List<String> xKeywords;

    private String message;

    private Boolean enableMockTweets;

    private Integer mockMinTweetLength;

    private Integer mockMaxTweetLength;

    private Long mockSleepMs;
}
