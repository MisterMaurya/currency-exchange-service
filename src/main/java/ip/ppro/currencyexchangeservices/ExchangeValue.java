package ip.ppro.currencyexchangeservices;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/***
 * @author Pawan Maurya
 * @since Aug 07, 2021
 */

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class ExchangeValue {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "currency_from")
    private String from;

    @Column(name = "currency_to")
    private String to;

    @Column(name = "conversion_multiple")
    private BigDecimal conversionMultiple;

    @Column(name = "port")
    private Integer port;

}
