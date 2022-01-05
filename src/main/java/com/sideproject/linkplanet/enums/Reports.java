package com.sideproject.linkplanet.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public enum Reports {
    SEXUALHARASSMENT(1, "성희롱");

    private int value;

    private String name;
}
