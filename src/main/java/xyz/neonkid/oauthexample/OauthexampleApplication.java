package xyz.neonkid.oauthexample;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import xyz.neonkid.oauthexample.resolver.UserArgumentResolver;

import java.util.List;

@RequiredArgsConstructor
@SpringBootApplication
public class OauthexampleApplication extends WebMvcConfigurationSupport {
    private final UserArgumentResolver userArgumentResolver;

    @Override
    protected void addArgumentResolvers(List<HandlerMethodArgumentResolver> argumentResolvers) {
        super.addArgumentResolvers(argumentResolvers);
        argumentResolvers.add(userArgumentResolver);
    }

    public static void main(String[] args) {
        SpringApplication.run(OauthexampleApplication.class, args);
    }
}
