package jpabook.jpashop2.controller;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

@Getter
@Setter
public class MemberForm {

    private String name;

    private String city;

    private String street;

    private String zipcode;
}
