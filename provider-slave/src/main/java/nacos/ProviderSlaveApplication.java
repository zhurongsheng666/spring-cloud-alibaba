package nacos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Description:
 * @Auther: zhurongsheng
 * @Date: 2020/3/17 22:17
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ProviderSlaveApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProviderSlaveApplication.class, args);
    }
}
