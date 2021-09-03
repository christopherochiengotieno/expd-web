package com.otienochris.expdweb.Exceptions;

/**
 * @author christopherochiengotieno@gmail.com
 * @version 1.0
 * @since 03/09/2021
 */
public class EventNotFoundException extends RuntimeException{
    public EventNotFoundException(Long id) {
        super("Event with id: " + id + " does not exist");
    }
}
