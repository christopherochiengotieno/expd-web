package com.otienochris.expdweb.services.interfaces;

import com.otienochris.expdweb.domain.Link;

import java.util.List;
/**
 * @author otien christopherochiengotieno@gmail.com
 * @version 1.0
 * @since 01/09/2021
 */
public interface LinkService {
    List<Link> getAllLinks();

    Link getLinkById(Long id);

    Link addLink(Link event);

    void deleteLinkById(Long id);

    void updateLink(Long id, Link newLink);
}
