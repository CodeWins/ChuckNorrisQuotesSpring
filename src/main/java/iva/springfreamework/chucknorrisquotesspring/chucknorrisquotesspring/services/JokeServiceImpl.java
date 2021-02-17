package iva.springfreamework.chucknorrisquotesspring.chucknorrisquotesspring.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

/**
 * Created By iVa on 2/14/2021.
 */
@Service
public class JokeServiceImpl implements JokeService {
    public JokeServiceImpl(ChuckNorrisQuotes chuckNorrisQuotes) {
        this.chuckNorrisQuotes = chuckNorrisQuotes;
    }

    private final ChuckNorrisQuotes chuckNorrisQuotes;


    @Override
    public String getJoke() {

        return chuckNorrisQuotes.getRandomQuote();
    }
}
