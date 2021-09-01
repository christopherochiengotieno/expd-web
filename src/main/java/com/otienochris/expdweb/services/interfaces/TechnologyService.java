package com.otienochris.expdweb.services.interfaces;

import com.otienochris.expdweb.domain.Technology;

import java.util.List;
/**
 * @author otien christopherochiengotieno@gmail.com
 * @version 1.0
 * @since 01/09/2021
 */
public interface TechnologyService {
    List<Technology> getAllTechnologies();

    Technology getTechnologyById(Long id);

    Technology addTechnology(Technology event);

    void deleteTechnologyById(Long id);

    void updateTechnology(Long id, Technology newTechnology);
}
