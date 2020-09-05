package com.vn.entities;

import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @author Huy
 *
 */
@Data
public class Category implements Serializable {
	private static final long serialVersionUID = -4534557616213069026L;

	private int id;
	private String name;
	private String imgPath;

}