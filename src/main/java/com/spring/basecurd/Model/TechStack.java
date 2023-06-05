package com.spring.basecurd.Model;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "TBL_TECH_STACK")
public class TechStack {

    @Id
    @Column(name = "id")
    @GeneratedValue
    private String id;

    @Column(name = "name")
    private String name;

    @Column(name = "level")
    private int level;

    @Column(name = "since")
    @DateTimeFormat(pattern="dd-MM-yyyy")
    private LocalDate since;

//    public String getSince() {
//        return since.format(DateTimeFormatUtils.FORMAT_DEFAULT);
//    }

}
