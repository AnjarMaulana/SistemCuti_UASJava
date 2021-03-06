//package org.javajarvis.SistemCuti_UASJava.config;
//
//import org.javajarvis.SistemCuti_UASJava.service.UserDetailService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//
//@EnableWebSecurity
//@Configuration
//public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {
//
//    @Autowired
//    private UserDetailService userDetailService;
//
//    @Override
//    protected void configure (AuthenticationManagerBuilder auth) throws Exception{
//        auth.userDetailsService(userDetailService);
//    }
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception{
//        http.authorizeRequests().antMatchers("/page1").hasRole("HRD")
//                .antMatchers("/page2").hasRole("KARYAWAN")
//                .antMatchers("/employees").hasRole("HRD")
//                .antMatchers("/role").hasRole("HRD")
//                .antMatchers("/register").permitAll()
//                .anyRequest().authenticated()
//                .and().formLogin().and().csrf().disable();
//
//    }
//
//    @Bean
//    public PasswordEncoder passwordEncoder(){
//        return new BCryptPasswordEncoder();
//    }
//}
