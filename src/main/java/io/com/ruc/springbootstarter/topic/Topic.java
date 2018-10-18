package io.com.ruc.springbootstarter.topic;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Topic {

	@Id
    private String id;
    private String name;
    private String description;

    /**
     * Getter method for property <tt>id</tt>.
     * 
     * @return property value of id
     */
    public String getId() {
	return id;
    }

    /**
     * Setter method for property <tt>id</tt>.
     * 
     * @param id
     *            value to be assigned to property id
     */
    public void setId(String id) {
	this.id = id;
    }

    /**
     * Getter method for property <tt>name</tt>.
     * 
     * @return property value of name
     */
    public String getName() {
	return name;
    }

    /**
     * Setter method for property <tt>name</tt>.
     * 
     * @param name
     *            value to be assigned to property name
     */
    public void setName(String name) {
	this.name = name;
    }

    /**
     * Getter method for property <tt>description</tt>.
     * 
     * @return property value of description
     */
    public String getDescription() {
	return description;
    }

    /**
     * Setter method for property <tt>description</tt>.
     * 
     * @param description
     *            value to be assigned to property description
     */
    public void setDescription(String description) {
	this.description = description;
    }

    public Topic() {

    }

    /**
     * @param id
     * @param name
     * @param description
     */
    public Topic(String id, String name, String description) {
	super();
	this.id = id;
	this.name = name;
	this.description = description;
    }

    /**
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
	return "Topic [id=" + id + ", name=" + name + ", description=" + description + "]";
    }

}
