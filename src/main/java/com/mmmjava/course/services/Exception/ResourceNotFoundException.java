package com.mmmjava.course.services.Exception;

public class ResourceNotFoundException  extends RuntimeException{
    public ResourceNotFoundException(Object id) {
        super("Resource not found. Id" + id);
    }
}
