package com.ani.investocalci.investocalciapp.configuration;

import com.ani.investocalci.investocalciapp.entity.IPO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

@Configuration
public class WebSecurityConfig implements RepositoryRestConfigurer {
    private String allowedOrigin = "http://localhost:3000";
    //private String allowedOrigin = "http://192.168.0.111:3000";
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.authorizeRequests(authorizeRequests -> authorizeRequests.anyRequest()
                .permitAll()).csrf(AbstractHttpConfigurer::disable);;
        return http.build();
    }

    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config, CorsRegistry cors) {
        config.exposeIdsFor(IPO.class);
        cors.addMapping(config.getBasePath() + "/**").allowedOrigins(allowedOrigin);
    }
}
