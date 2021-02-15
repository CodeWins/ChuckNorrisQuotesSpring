package iva.springfreamework.chucknorrisquotesspring.chucknorrisquotesspring.services;

/**
 * Created By iVa on 2/14/2021.
 */
public class JokeService {
    public String getJoke(){
        guru.springframework.norris.chuck.ChuckNorrisQuotes q = new guru.springframework.norris.chuck.ChuckNorrisQuotes();
        return  q.getRandomQuote();
    }
}
