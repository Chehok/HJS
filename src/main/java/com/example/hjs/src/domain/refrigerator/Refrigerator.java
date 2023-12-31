package com.example.hjs.src.domain.refrigerator;

import com.example.hjs.src.domain.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;

@Getter
@Entity
@DynamicInsert
@DynamicUpdate
@Table(name = "Refrigerators")
@AllArgsConstructor
@Builder
public class Refrigerator extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "refrigeratorId")
    private Long refrigeratorId;

    private String refrigeratorName;


    protected Refrigerator() {

    }
}
