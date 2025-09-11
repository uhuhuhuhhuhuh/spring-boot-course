package top.keke.config;

/**
 * @Author: zhangke
 * @Date: 2025/9/6
 * @Version: 1.0
 */
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
@ConfigurationProperties(prefix = "keke.sms.ccp")
public class CloopenConfig {

    private String serverIp;
    private String port;
    private String accountSid;
    private String accountToken;
    private String appId;
    private String templateId;
}