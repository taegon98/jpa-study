package jpabook.jpashop2.service;

import jpabook.jpashop2.domain.Item.Book;
import jpabook.jpashop2.domain.Item.Item;
import jpabook.jpashop2.repository.ItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.Id;
import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class ItemService {

    private final ItemRepository itemRepository;

    public void saveItem(Item item) {
        itemRepository.save(item);
    }

    public void updateItem(Long itemId, UpdateItemDto itemDto) {
        Book findItem = (Book) itemRepository.findOne(itemId);
        findItem.setName(itemDto.getName());
        findItem.setPrice(itemDto.getPrice());
        findItem.setStockQuantity(itemDto.getStockQuantity());
        findItem.setAuthor(itemDto.getAuthor());
        findItem.setIsbn(itemDto.getIsbn());
    }

    public List<Item> findItems() {
        return itemRepository.findAll();
    }

    public Item findOne(Long itemId) {
        return itemRepository.findOne(itemId);
    }
}
