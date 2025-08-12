package com.filehandeling;

import java.io.Serializable;

/*
 	Serialization & Deserialization
 a. Serialization is a process of converting object to byte code and 
 	storing that in a file system
 b. De-serialization is a process of reading byte code from the file
    and form Object based on byte code
 c.	To skip writing certain content to object during serialization 
 	we can use transient keyword
 	
 */
public class SerializationEx implements Serializable{
	String name="mike";
	transient String password="testing";

}
