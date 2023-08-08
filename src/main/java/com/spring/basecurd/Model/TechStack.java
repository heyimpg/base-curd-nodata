package com.spring.basecurd.Model;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TechStack {

    private String id;

    private String name;

    private int level;

    @DateTimeFormat(pattern="yyyy-MM-dd")
    private LocalDate since;

//    public String getSince() {
//        return since.format(DateTimeFormatUtils.FORMAT_DEFAULT);
//    }

}
