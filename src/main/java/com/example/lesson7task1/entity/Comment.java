package com.example.lesson7task1.entity;

import com.example.lesson7task1.entity.teplate.AbstractEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@EntityListeners(AuditingEntityListener.class)
public class Comment extends AbstractEntity {
    @Column(nullable = false, columnDefinition = "text")
    private String text;
    @ManyToOne(fetch = FetchType.LAZY)
    private Post post;

    @CreatedBy
    private Long createdBy;

    @LastModifiedBy
    private Long updateBy;

    public Comment(String text, Post post) {
        this.text = text;
        this.post = post;
    }
}

