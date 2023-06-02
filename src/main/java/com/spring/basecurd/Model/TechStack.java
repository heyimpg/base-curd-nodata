package com.spring.basecurd.Model;

import com.spring.basecurd.Utils.DateTimeFormatUtils;
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

    @DateTimeFormat(pattern="dd-MM-yyyy")
    private LocalDate since;

//    public String getSince() {
//        return since.format(DateTimeFormatUtils.FORMAT_DEFAULT);
//    }

}
