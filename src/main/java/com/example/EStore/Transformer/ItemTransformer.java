package com.example.EStore.Transformer;

import com.example.EStore.Dto.RequestDto.ItemRequestDto;
import com.example.EStore.Dto.ResponseDto.ItemResponseDto;
import com.example.EStore.Model.Item;

public class ItemTransformer {
    public static Item ItemRequestDtoToItem(ItemRequestDto itemRequestDto){
        return Item.builder()
                .requiredQuantity(itemRequestDto.getRequiredQuantity())
                .build();
    }

    public static ItemResponseDto ItemToItemResponseDto(Item item){
        return ItemResponseDto.builder()
                .quantityAdded(item.getRequiredQuantity())
                .price(item.getProduct().getPrice())
                .productName(item.getProduct().getName())
                .build();
    }
}
