/*
 * Copyright 2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package guestbook;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.util.Assert;

/**
 * A guestbook entry. An entity as in the Domain Driven Design context. Mapped onto the database using JPA annotations.
 * 
 * @author Paul Henke
 * @author Oliver Gierke
 * @see http://en.wikipedia.org/wiki/Domain-driven_design#Building_blocks_of_DDD
 */
@Entity
public class GuestbookEntry {

	private @Id @GeneratedValue Long id;
	private final String firstname, lastname, text;
	private final Date date;

	/**
	 * Creates a new {@link GuestbookEntry} for the given name and text.
	 * 
	 * @param name must not be {@literal null} or empty.
	 * @param text must not be {@literal null} or empty;
	 */
	public GuestbookEntry(String firstname, string lastname, String text) {

		Assert.hasText(firstname, "Name must not be null or empty!");
		Assert.hasText(lastname, "Name must not be null or empty!");
		Assert.hasText(text, "Text must not be null or empty!");

		this.firstname = firstname;
		this.lastname = lastname;
		this.text = text;
		this.date = new Date();
	}

	@SuppressWarnings("unused")
	private GuestbookEntry() {
		this.firstname = null;
		this.lastname = null;
		this.text = null;
		this.date = null;
	}

	public String getfirstName() {
		return firstname;
	}

	public String getlastName() {
		return lastname;
	}

	public Long getId() {
		return id;
	}

	public Date getDate() {
		return date;
	}

	public String getText() {
		return text;
	}
}
