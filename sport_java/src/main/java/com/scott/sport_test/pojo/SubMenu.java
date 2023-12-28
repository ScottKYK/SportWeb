package com.scott.sport_test.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SubMenu {
    private int id;
    private String title;
    private String path;

    public SubMenu(String title, String path) {
        this.title = title;
        this.path = path;
    }
}
