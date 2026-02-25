package org.owasp.webgoat.webwolf.mailbox.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record EmailDTO(
    @NotBlank @Size(max = 1024) String contents,
    @NotBlank String title,
    @NotBlank String recipient
) {}
