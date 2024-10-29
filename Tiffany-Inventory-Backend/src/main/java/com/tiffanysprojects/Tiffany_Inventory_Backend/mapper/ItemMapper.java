package com.tiffanysprojects.Tiffany_Inventory_Backend.mapper;

import com.tiffanysprojects.Tiffany_Inventory_Backend.dto.ItemDTO;
import com.tiffanysprojects.Tiffany_Inventory_Backend.entity.Item;

public class ItemMapper {
    //Used to map Item entity to Item DTO
    public static ItemDTO mapToEmployeeDto(Item item){
        return new ItemDTO(
                item.getId(),
                item.getName(),
                item.getPrice(),
                item.getDescription(),
                item.getCategory(),
                item.getImage()

        );
    }

    //Used to map Item DTO to Item entity
    public static Item mapToItem(ItemDTO itemDto){
        return new Item(
                itemDto.getId(),
                itemDto.getName(),
                itemDto.getPrice(),
                itemDto.getDescription(),
                itemDto.getCategory(),
                itemDto.getImage()
        );
    }

    public static ItemDTO mapToItemDto(Item savedItem) {
        return null;
    }
}
