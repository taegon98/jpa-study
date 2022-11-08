package jpabook.jpashop2.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Embeddable;

@Getter
@Setter
public class Address {
    private String city;
    private String street;
    private String zipcode;
}
