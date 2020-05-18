package com.base.main;

//<editor-fold defaultstate="collapsed" desc="IMPORT">
import java.security.GeneralSecurityException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
//</editor-fold>

/**
 *
 * @author TungAnhFaber
 * @email phamtunganh@fabercompany.co.jp
 */
@SpringBootApplication              //define spring boot main class
@ComponentScan("com.base.*")       //allow spring to scan and init all class with annotation
@EnableCaching                      //allow spring to use caching with redis, see config properties for more detail
public class Main {
    public static void main(String[] args) throws GeneralSecurityException, Exception {
        SpringApplication.run(Main.class, args);
    }
}
