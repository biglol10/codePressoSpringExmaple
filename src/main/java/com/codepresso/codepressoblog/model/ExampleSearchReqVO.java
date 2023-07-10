package com.codepresso.codepressoblog.model;


import lombok.*;

import java.time.LocalDateTime;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor
@Data
@Builder
public class ExampleSearchReqVO {
    private String code;

    private String useYn;

    private LocalDateTime registerDate;

    private String[] types; // ?types=type1,type2
}
