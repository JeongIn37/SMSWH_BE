package com.smswh.smswh_backend.dto;

import com.smswh.smswh_backend.domain.Menu;
import com.smswh.smswh_backend.domain.user.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MenuDto {

    private String menuName;
    private Double price;
    private int num;

    public Menu toEntity(String menuName, Double price, int num){
        return Menu.builder()
                .menuName(menuName)
                .price(price)
                .num(num).build();
    }

}