package jpabook.jpashop2.service;

import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.GetMapping;

@Getter
@Setter
public class UpdateItemDto {

    private String name;

    private int price;

    private int stockQuantity;

    private String isbn;

    private String author;
}
