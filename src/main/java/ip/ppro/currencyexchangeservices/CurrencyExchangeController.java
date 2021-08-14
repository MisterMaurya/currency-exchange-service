package ip.ppro.currencyexchangeservices;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/***
 * @author Pawan Maurya
 * @since Aug 07, 2021
 */

@RestController
public class CurrencyExchangeController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    // To get the environment variable
    @Autowired
    private Environment environment;

    @Autowired
    private ExchangeValueRepository repository;

    @GetMapping("/currency-exchange/from/{from}/to/{to}")
    public ExchangeValue retrieveExchangeValue(@PathVariable String from,
                                               @PathVariable String to) {
        ExchangeValue byFromAndTo = repository.findByFromAndTo(from, to);
        logger.info("{}", "currency-exchange-service");
        byFromAndTo.setPort(environment.getProperty("local.server.port", Integer.class));
        return byFromAndTo;
    }

}
