package com.otienochris.expdweb.services.interfaces;

import com.otienochris.expdweb.domain.Technology;

import java.util.List;

public interface TechnologyService {
    List<Technology> getAllTechnologies();

    Technology getTechnologyById(Long id);

    Technology addTechnology(Technology event);

    void deleteTechnologyById(Long id);

    void updateTechnology(Long id, Technology newTechnology);
}
