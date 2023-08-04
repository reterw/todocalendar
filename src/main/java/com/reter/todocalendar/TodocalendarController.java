// package com.reter.todocalendar;

// import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
// import org.springframework.http.HttpStatus;
// import org.springframework.http.ResponseEntity;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RestController;

// @RestController
// @RequestMapping("/api")
// public class TodocalendarController {

    
    
//     @GetMapping("/hello")
//     public String hello(){
//         return "Hello World";
//     }

//     @PostMapping("/create")
//     public ResponseEntity<String> createUser(@RequestBody User user){
//         return new ResponseEntity<>("user created successfully", HttpStatus.CREATED);

//     }

//     // @GetMapping("/users/{id}")
//     // public ResponseEntity<User> getUserById(@PathVariable Long id) {
//     //     // Code to fetch user by ID
//     //     User user = userService.getUserById(id);
//     //     if (user != null) {
//     //         return new ResponseEntity<>(user, HttpStatus.OK);
//     //     } else {
//     //         return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//     //     }
//     // }
    
// }
