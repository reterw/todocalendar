package com.reter.todocalendar.repository;


import com.reter.todocalendar.model.Content;
import com.reter.todocalendar.model.Status;
import com.reter.todocalendar.model.Type;

import jakarta.annotation.PostConstruct;

import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;



@Repository
public class ContentCollectionRepository {
    private final List<Content> contentList = new ArrayList<>();

    public ContentCollectionRepository() {
    }
    public List<Content> findAll(){
        return contentList;

    }
    public Optional<Content> findById(Integer id){
        return contentList.stream().filter(c->c.id().equals(id)).findFirst();
    } 
    @PostConstruct
    private void init(){
        Content content = new Content(
            1, 
            "my first post", 
            "my first post", 
            Status.IDEA, 
            Type.ARTICLE, 
            LocalDateTime.now(), 
            null, 
            null
            );

         
        contentList.add(content);
    }
    public void save (Content content){
        contentList.add(content);
    }


}
