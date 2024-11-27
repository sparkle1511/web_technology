/*package com.externship.appointment.Security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.csrf(csrf -> csrf.disable()) // Disable CSRF for simplicity
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers("/").permitAll() // Publicly accessible
                        .requestMatchers("/register", "/registerdoc", "/patlog", "/doclog", "/fail_login").permitAll()
                        .requestMatchers("/home", "/docdetails", "/userdetails", "/patientlist").authenticated()
                        .anyRequest().authenticated()) // Default protection for other endpoints
                .formLogin(form -> form
                        .loginPage("/patlog") // Patient login page
                        .loginProcessingUrl("/authenticate") // Login processing for patients
                        .defaultSuccessUrl("/home", true) // Redirect to home on successful login
                        .failureUrl("/fail_login") // Redirect on failed login
                        .permitAll())
                .logout(logout -> logout
                        .logoutUrl("/logout") // Logout URL
                        .logoutSuccessUrl("/") // Redirect to home page on logout
                        .permitAll());

        return http.build();
    }
}*/
