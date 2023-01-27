package com.password.password.Service;



import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.password.password.model.Password;
import com.password.password.repository.PasswordRepository;

@Service
public class PasswordServiceimpl implements PasswordService{
    @Autowired
    private PasswordRepository passwordrepo;

    public Password createCourse(Password course){
       return passwordrepo.save(course);
      
    }
    public Password getCourseById(Integer id){
        Optional<Password> findById=passwordrepo.findById(id);
        if(findById.isPresent()){
            return findById.get();
        }
    
        return null;
    }
    public Iterable<Password> getAllCourses(){
        return passwordrepo.findAll();
        
    }
    public Password updateCourseById(Integer id, Password basic){
        Optional<Password> courseToUpdateOptional=passwordrepo.findById(id);
        if (!courseToUpdateOptional.isPresent()) {
            return null;
          }
         
          
         Password courseToUpdate = courseToUpdateOptional.get();
         
          if (basic.getFirstname() != null) {
            courseToUpdate.setFirstname(basic.getFirstname());
          }
          
         
     Password updatedCourse = passwordrepo.save(courseToUpdate);
          return updatedCourse;
        }
        public Password deleteCourseById(Integer id) {
            Optional<Password> courseToDeleteOptional = passwordrepo.findById(id);
            if (!courseToDeleteOptional.isPresent()) {
              return null;
            }
           Password courseToDelete = courseToDeleteOptional.get();
            passwordrepo.delete(courseToDelete);
            return courseToDelete;
          }
       


    
}

