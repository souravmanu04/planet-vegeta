package com.example.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "MarkDetails")
public class MarkBean {
        @Id

        int mark_id;
        int mark;
        float perc;
}
