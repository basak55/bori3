package com.bori.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class CheckRequest {

	private String inputText;
	private String quest; // Sentence
}
