/*
 * package ci.gedoc.security;
 * 
 * import javax.sql.DataSource;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.context.annotation.Bean; import
 * org.springframework.context.annotation.Configuration; import
 * org.springframework.security.config.annotation.authentication.builders.
 * AuthenticationManagerBuilder; import
 * org.springframework.security.config.annotation.web.builders.HttpSecurity;
 * import org.springframework.security.config.annotation.web.configuration.
 * EnableWebSecurity; import
 * org.springframework.security.config.annotation.web.configuration.
 * WebSecurityConfigurerAdapter; import
 * org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder; import
 * org.springframework.security.crypto.password.PasswordEncoder;
 * 
 * @Configuration
 * 
 * @EnableWebSecurity public class SecurityConfig extends
 * WebSecurityConfigurerAdapter {
 * 
 * @Autowired private DataSource dataSource;
 * 
 * @Override protected void configure(AuthenticationManagerBuilder auth) throws
 * Exception {
 * 
 * 
 * auth.inMemoryAuthentication()
 * .withUser("admin").password("{noop}1234").roles("USER", "ADMIN");
 * auth.inMemoryAuthentication()
 * .withUser("user").password("{noop}1234").roles("USER");
 * 
 * 
 * auth.jdbcAuthentication().dataSource(dataSource)
 * .usersByUsernameQuery("select login as principal, pass as credentials, active from users where login=?"
 * )
 * .authoritiesByUsernameQuery("select login as principal, role as role from users_roles where login=?"
 * ) .passwordEncoder(passwordencoder()).rolePrefix("ROLE_");
 * 
 * }
 * 
 * @Override protected void configure(HttpSecurity http) throws Exception {
 * http.formLogin().loginPage("/login"); http.csrf().disable();
 * http.authorizeRequests().antMatchers("/user/*").hasRole("USER");
 * http.authorizeRequests().antMatchers("/admin/*").hasRole("ADMIN");
 * http.exceptionHandling().accessDeniedPage("/403"); }
 * 
 * @Bean(name = "passwordEncoder") public PasswordEncoder passwordencoder() {
 * return new BCryptPasswordEncoder(); } }
 */