package com.oguzhankurt.finalcase.config;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
@EnableWebSecurity
@RequiredArgsConstructor
@EnableMethodSecurity
public class SecurityConfiguration {

    private final JwtAuthorizationFilter jwtAuthFilter;
    private final AuthenticationProvider authenticationProvider;

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                    .csrf()
                    .disable()
                    .authorizeHttpRequests()
                    .requestMatchers(
                            "/api/v1/auth/**",
                            "api.openweathermap.org/data/2.5/forecast",
                            "/swagger-ui/**",
                            "/swagger-ui.html/**",
                            "/api-docs/**",
                            "/configuration/ui",
                            "/swagger-resources/**",
                            "/configuration/security",
                            "/webjars/**",
                            "/v3/api-docs/**"
                    )
                    .permitAll()
                    .requestMatchers("/api/v1/weather/","/api/v1/user/**").hasAnyRole("USER")
                    .anyRequest()
                    .authenticated()
                    .and()
                    .sessionManagement()
                    .sessionCreationPolicy(SessionCreationPolicy.STATELESS)
                    .and()
                    .authenticationProvider(authenticationProvider)
                    .addFilterBefore(jwtAuthFilter, UsernamePasswordAuthenticationFilter.class);
            return http.build();
        }
    }