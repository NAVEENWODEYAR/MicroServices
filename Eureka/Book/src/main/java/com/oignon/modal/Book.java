package com.oignon.modal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity(name = "Books")
public class Book 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int bId;
	private String bName;
	private String bAuthor;
	private double bPrice;
	private String bType;
	private String aMail;
}
