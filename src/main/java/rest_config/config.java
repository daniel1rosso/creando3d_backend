package rest_config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;

@Configuration
public class config extends WebSecurityConfigurerAdapter {

    @Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring().antMatchers("/swagger-ui.html")
                  .antMatchers("/webjars/springfox-swagger-ui/")
                  .antMatchers("/swagger-resources/")
                  .antMatchers("/v2/api-docs");
    }

    @Override
    public void configure(HttpSecurity http) throws Exception {
        http.csrf().disable();
    }

    public void addResourceHandlers(ResourceHandlerRegistry registry) {

       registry.addResourceHandler("swagger-ui.html")
                .addResourceLocations("classpath:/META-INF/resources/");

        registry.addResourceHandler("/webjars/**")
                .addResourceLocations("classpath:/META-INF/resources/webjars/");

    }
}
