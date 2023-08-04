package com.reter.todocalendar.model;

import java.time.LocalDateTime;

public record Content (
    Integer id,
    String title,
    String desc,
    Status status,
    Type contentType,
    LocalDateTime dateCreated,
    LocalDateTime dateupdated,
    String url
    ){

}

// public class Content{
//     private Integer id;
//     private String title;
//     private String desc;
//     private Status status;
//     private Type contentType;
//     private LocalDateTime dateCreated;
//     private LocalDateTime dateupdated;
//     private String url;

//     public Content(
//         Integer id,
//         String title,
//         String desc,
//         Status status,
//         Type contentType,
//         LocalDateTime dateCreated,
//         LocalDateTime dateupdated,
//         String url
//         ){
//             this.id=id;
//             this.title=title;
//             this.desc=desc;
//             this.status=status;
//             this.contentType=contentType;
//             this.dateCreated=dateCreated;
//             this.dateupdated=dateupdated;
//             this.url=url;

//         }

    
//     public Integer id(){
//         return id;
//     }
//     public String title(){
//         return title;
//     }
//     public String desc(){
//         return desc;
//     }
//     public Status status(){
//         return status;
//     }
//     public Type contentType(){
//         return contentType;
//     }
//     public LocalDateTime dateCreated(){
//         return dateCreated;
//     }
//     public LocalDateTime dateupdated(){
//         return dateupdated;
//     }
//     public String url(){
//         return url;
//     }
// }
