package com.elasticsearch.elasticsearch.demo.model;

import static org.springframework.data.elasticsearch.annotations.FieldType.Text;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;

@Document(indexName = "blog")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Author {

    @Field(type = Text)
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Author{" + "name='" + name + '\'' + '}';
    }
}
