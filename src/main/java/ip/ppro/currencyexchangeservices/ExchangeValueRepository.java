package ip.ppro.currencyexchangeservices;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/***
 * @author Pawan Maurya
 * @since Aug 07, 2021
 */

@Repository
public interface ExchangeValueRepository extends JpaRepository<ExchangeValue, Integer> {

    ExchangeValue findByFromAndTo(String from, String to);

}
