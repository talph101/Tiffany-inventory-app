package com.tiffanysprojects.Tiffany_Inventory_Backend.service.impl;

import com.tiffanysprojects.Tiffany_Inventory_Backend.dto.ItemDTO;
import com.tiffanysprojects.Tiffany_Inventory_Backend.entity.Item;
import com.tiffanysprojects.Tiffany_Inventory_Backend.mapper.ItemMapper;
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

//    @Override
//    public List<ItemDTO> getAllItems() {
//        List<Item> items = itemRepository.findAll();
//        return items.stream().map((item) -> ItemMapper.mapToItemDto(item)).collect(Collectors.toList());
//    }

    @Override
    public Item createItem(Item item) {
        return itemRepository.save(item);
    }

//    @Override
//    public ItemDTO createItem(ItemDTO itemDto) {
////      MapTo is a library that programmatically generates the necessary code to map one object to another during compile-time.
//        Item item = ItemMapper.mapToItem(itemDto);
//        Item savedItem = itemRepository.save(item);
//        return ItemMapper.mapToItemDto(savedItem);
//    }

    @Override
    public List<Item> findAll() {
        return itemRepository.findAll();
    }

    @Override
    public Item getItemById(Long itemId) {
        return itemRepository.findById(itemId).orElse(null);
    }


}
