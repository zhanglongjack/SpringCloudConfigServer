package SpringCloud.Config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Hello world!
 *
 */
@EnableDiscoveryClient
@EnableConfigServer
@SpringBootApplication
public class ConfigApp 
{
    public static void main( String[] args )
    {
    	 System.out.println( "Hello World!" );
    	 SpringApplication.run(ConfigApp.class,args);
    }
}
