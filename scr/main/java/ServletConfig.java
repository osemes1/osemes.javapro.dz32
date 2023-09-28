import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.DispatcherServlet;

@Configuration
public class ServletConfig {

    @Bean
    public ServletRegistrationBean<DispatcherServlet> dispatcherServlet() {
        return new ServletRegistrationBean<>(new DispatcherServlet(), "/");
    }
}
