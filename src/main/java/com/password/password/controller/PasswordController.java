package com.password.password.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.password.password.Service.PasswordService;
import com.password.password.model.Password;


@RestController
public class PasswordController {
    @Autowired 
    private PasswordService service;
    @CrossOrigin
    @PostMapping("/createpassword")
    public ResponseEntity<Password> createCourse(@RequestBody Password basic){
        Password status = service.createCourse(basic);
        return new ResponseEntity<>(status, HttpStatus.CREATED);
    }
    @CrossOrigin
    @GetMapping("/password/{id}")

    public ResponseEntity<Password> getCourseById(@PathVariable Integer id){
        Password status = service.getCourseById(id);
        return new ResponseEntity<>(status, HttpStatus.CREATED);
    }
    @CrossOrigin
    @GetMapping("/getallpasswords")
    public ResponseEntity<Iterable<Password>> getAllCourses(){
        Iterable<Password> status = service.getAllCourses();
        return new ResponseEntity<>(status, HttpStatus.OK);
    }
    @PutMapping("/password/{id}")
    public ResponseEntity<Password> updateCourse(@PathVariable Integer id,@RequestBody Password basic){
        Password status = service.updateCourseById(id,basic);
        return new ResponseEntity<>(status, HttpStatus.CREATED);
    }
    @DeleteMapping("/password/{id}")
    public ResponseEntity<Password> deleteCourse(@PathVariable Integer id){
        Password status = service.deleteCourseById(id);
        return new ResponseEntity<>(status, HttpStatus.CREATED);
    }
}

    


    

