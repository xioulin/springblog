package com.example.springboot1;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//import com.example.springboot1.services.UserDetailsLoader;


@Configuration
public class SecurityConfiguration {
//    @Autowired
//    private UserDetailsLoader usersLoader;
    public SecurityConfiguration(){}

//    public SecurityConfiguration(UserDetailsLoader usersLoader) {
//        this.usersLoader = usersLoader;
//    }

//    @Bean
//    public PasswordEncoder passwordEncoder() {
//        return new BCryptPasswordEncoder();
//    }

//    @Bean
//    public AuthenticationManager authenticationManager(AuthenticationConfiguration authenticationConfiguration) throws Exception {
//        return authenticationConfiguration.getAuthenticationManager();
//    }

//    @Bean
//    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//        http
//                /* Login configuration */
//                .formLogin()
//                .loginPage("/login")
//                .defaultSuccessUrl("/posts") // user's home page, it can be any URL
//                .permitAll() // Anyone can go to the login page
//                /* Logout configuration */
//                .and()
//                .logout()
//                .logoutSuccessUrl("/login?logout") // append a query string value
//                /* Pages that can be viewed without having to log in */
//                .and()
//                .authorizeRequests()
//                .antMatchers("/", "/posts", "/signup") // anyone can see the home and the ads pages
//                .permitAll()
//                /* Pages that require authentication */
//                .and()
//                .authorizeRequests()
//                .antMatchers(
//                        "/posts/create", // only authenticated users can create ads
//                        "/posts/{id}/edit" // only authenticated users can edit ads
//                )
//                .authenticated()
//        ;
//        return http.build();
//    }

}