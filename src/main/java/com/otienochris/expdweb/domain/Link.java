package com.otienochris.expdweb.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author otien christopherochiengotieno@gmail.com
 * @version 1.0
 * @since 01/09/2021
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Link {
    private String site;
    private String link;
}

