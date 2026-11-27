package dev.rafael.movieflix.controller.response;

import lombok.Builder;

@Builder
public record StreamingResponse(Long id, String name) {
}
