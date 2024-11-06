package com.tiffanysprojects.Tiffany_Inventory_Backend.service.impl;

import com.tiffanysprojects.Tiffany_Inventory_Backend.entity.Item;
import com.tiffanysprojects.Tiffany_Inventory_Backend.repository.ItemRepository;
import com.tiffanysprojects.Tiffany_Inventory_Backend.service.ItemService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ItemServiceImpl  implements ItemService {
    private ItemRepository itemRepository;

    public ItemServiceImpl(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }


    @Override
    public Item createItem(Item item) {
        return itemRepository.save(item);
    }

    @Override
    public List<Item> findAll() {
        return itemRepository.findAll();
    }

    @Override
    public Item getItemById(Long itemId) {
        return itemRepository.findById(itemId).orElse(null);
    }
    @Override
    public Item updateItem(Long itemId, Item updatedItem) {
        Item existingItem = itemRepository.findById(itemId).orElse(null);
        existingItem.setName(updatedItem.getName());
        existingItem.setDescription(updatedItem.getDescription());
        existingItem.setPrice(updatedItem.getPrice());
        existingItem.setCategory(updatedItem.getCategory());
        existingItem.setImage(updatedItem.getImage());

        return itemRepository.save(existingItem);
    }

    @Override
    public Item deleteItem(Long itemId) {
        Item itemToDelete = itemRepository.findById(itemId).orElse(null);
        itemRepository.deleteById(itemId);
        return itemToDelete;
    }

    @Override
    public List<Item> searchItem(String itemName) {
        return itemRepository.findAll().stream().filter(item -> item.getName().toLowerCase().contains(itemName.toLowerCase()))
                .collect(Collectors.toList());
    }

}
