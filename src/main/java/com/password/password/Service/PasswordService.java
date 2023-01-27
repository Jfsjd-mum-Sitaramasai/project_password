package com.password.password.Service;

import com.password.password.model.Password;

public interface PasswordService {
        public Password createCourse(Password basic);
        public Password  getCourseById(Integer id);
        public Iterable<Password > getAllCourses();
        public Password  updateCourseById(Integer id, Password  basic);
        public Password  deleteCourseById(Integer id);
    
}
