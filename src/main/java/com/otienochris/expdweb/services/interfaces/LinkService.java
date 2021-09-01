package com.otienochris.expdweb.services.interfaces;

import com.otienochris.expdweb.domain.Link;

import java.util.List;

public interface LinkService {
    List<Link> getAllLinks();

    Link getLinkById(Long id);

    Link addLink(Link event);

    void deleteLinkById(Long id);

    void updateLink(Long id, Link newLink);
}
