package iva.springfreamework.chucknorrisquotesspring.chucknorrisquotesspring.config;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created By iVa on 2/16/2021.
 */
//@Configuration
public class ChuckConfiguration {
//    @Bean
    public ChuckNorrisQuotes chuckNorrisQuotes(){
        return  new ChuckNorrisQuotes();
    }
}
