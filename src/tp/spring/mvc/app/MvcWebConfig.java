//package tp.spring.mvc.app;
//
//import org.springframework.context.MessageSource;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.support.ReloadableResourceBundleMessageSource;
//import org.springframework.web.servlet.LocaleResolver;
//import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
//import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
//import org.springframework.web.servlet.i18n.CookieLocaleResolver;
//import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
//import org.springframework.web.servlet.theme.ThemeChangeInterceptor;
//
//public class MvcWebConfig {
//	
//	//@Override
//	   public void configureViewResolvers(ViewResolverRegistry registry) {
//	      registry.jsp("/WEB-INF/views/", ".jsp");
//	   }
//
//
//	   @Bean("messageSource")
//	   public MessageSource messageSource() {
//	      ReloadableResourceBundleMessageSource messageSource=new ReloadableResourceBundleMessageSource();
//	      messageSource.setBasename("classpath:locale/messages");
//	      messageSource.setDefaultEncoding("UTF-8");
//	      messageSource.setUseCodeAsDefaultMessage(true);
//	      return messageSource;
//	   }
//
//	   @Bean
//	   public LocaleResolver localeResolver() {
//	      CookieLocaleResolver localeResolver = new CookieLocaleResolver();
//	      return localeResolver;
//	   }
//
//	   //@Override
//	   public void addInterceptors(InterceptorRegistry registry) {
//	      ThemeChangeInterceptor themeChangeInterceptor = new ThemeChangeInterceptor();
//	      themeChangeInterceptor.setParamName("theme");
//	      registry.addInterceptor(themeChangeInterceptor);
//
//	      LocaleChangeInterceptor localeChangeInterceptor = new LocaleChangeInterceptor();
//	      localeChangeInterceptor.setParamName("lang");
//	      registry.addInterceptor(localeChangeInterceptor);
//	   }
//
//
//}
