package com.oignon.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookDTO
{
	private int bId;
	private String bName;
	private String bAuthor;
	private double bPrice;
	private String bType;
	private String aMail;

}
