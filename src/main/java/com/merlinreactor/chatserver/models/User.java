
package com.merlinreactor.chatserver.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * The type User.

 */
@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	/** Username of chat user. */
	private String username;

	/** First name of chat user. */
	private String firstName;

	/** Last name of chat user. */
	private String lastName;

	/**
	 * Instantiates a new User.
	 */
	protected User() {
	}

	/**
	 * Instantiates a new User.
	 *
	 * @param theUsername the the username
	 * @param theFirstName the the first name
	 * @param theLastName the the last name
	 */
	public User(final String theUsername, final String theFirstName,
			final String theLastName) {
		this.username = theUsername;
		this.firstName = theFirstName;
		this.lastName = theLastName;
	}

	@SuppressWarnings("checkstyle:OperatorWrap")
	@Override
	public String toString() {
		return "User{" + "id=" + id + ", username='" + username + '\'' + ", firstName='"
				+ firstName + '\'' + ", lastName='" + lastName + '\'' + '}';
	}
}
