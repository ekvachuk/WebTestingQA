package org.itstep.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class Item {

    private String itemID;
    private String name;
    private Integer price;
    private String url;
    private String imageUrl;


}
