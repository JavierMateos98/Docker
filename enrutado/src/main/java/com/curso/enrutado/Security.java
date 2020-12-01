package com.curso.enrutado;

import com.curso.enrutado.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.core.userdetails.ReactiveUserDetailsService;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.server.SecurityWebFilterChain;

@EnableWebFluxSecurity
public class Security {

    @Autowired
    UserRepository userRepository;

    @Bean
    public ReactiveUserDetailsService userDetailsService(){
        return (username) -> userRepository.findByUsername(username);
    }

    @Bean
    public SecurityWebFilterChain springSecurityFilterChain(ServerHttpSecurity http) {

    }

    @Bean
    PasswordEncoder passwordEncoder() {
        return PasswordEncoderFactories.createDelegatingPasswordEncoder();
    }

    authorizeExchangeSpec.pathMatchers("/factura/**").hasRole("facturacion");
    authorizeExchangeSpec.pathMatchers("/**").authenticated();


    authorizeExchangeSpec.and().csrf().disable().httpBasic();



}
