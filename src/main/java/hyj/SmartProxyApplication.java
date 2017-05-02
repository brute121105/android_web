package hyj;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import hyj.persistence.pageAble.Dialect;
import hyj.persistence.pageAble.MySQLDialect;
import hyj.persistence.pageAble.MybatisPageableInterceptor;





@Configuration
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class} )
@SpringBootApplication 
public class SmartProxyApplication implements CommandLineRunner{  	 


	
    public static void main(String[] args) throws Exception { 
    	final ApplicationContext applicationContext =SpringApplication.run(SmartProxyApplication.class, args);     	
    	
    }

	@Override 
	public void run(String... arg0) throws Exception {
		System.out.println("服务器已经启动！");	
		
	} 
	
	 /**
     * 
    * @methodName:dialect
    * @Description: MySQL分页语法
    * @return
    * @author Liebin.Zheng
    * @date 2016年5月5日
     */
    @Bean
	public Dialect dialect(){
		return new MySQLDialect();
	}
	
    /**
     * 
    * @methodName:mybatisPageableInterceptor
    * @Description: mybatis分页插件
    * @return
    * @author Liebin.Zheng
    * @date 2016年5月5日
     */
	@Bean
	public MybatisPageableInterceptor mybatisPageableInterceptor(){
		MybatisPageableInterceptor mybatisPageableInterceptor = new MybatisPageableInterceptor();
		mybatisPageableInterceptor.setDialect(dialect());
		return mybatisPageableInterceptor;
	}
	
	
} 