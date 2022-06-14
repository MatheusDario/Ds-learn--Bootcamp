package com.devsuperior.dslearnbds.entities;

import java.time.Instant;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.devsuperior.dslearnbds.entities.pk.EnrollmentPK;

@Entity
@Table(name = "tb_enrollment")
public class Enrollment {

	@EmbeddedId
	private EnrollmentPK id = new EnrollmentPK();
	
	@Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
	private Instant enronllMoment;
	
	@Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
	private Instant refoundMoment;
	private boolean availble;
	private boolean onlyUpdate;

	public Enrollment() {
	}

	public Enrollment(User user, Offer offer, Instant enronllMoment, Instant refoundMoment, boolean availble,
			boolean onlyUpdate) {
		id.setUser(user);
		id.setOffer(offer);
		this.enronllMoment = enronllMoment;
		this.refoundMoment = refoundMoment;
		this.availble = availble;
		this.onlyUpdate = onlyUpdate;
	}

	public User getStudent() {
		return id.getUser();
	}

	public void setStudent(User user) {
		id.setUser(user);
	}

	public Offer getOffer() {
		return id.getOffer();
	}

	public void setOffer(Offer offer) {
		id.setOffer(offer);
	}

	public Instant getEnronllMoment() {
		return enronllMoment;
	}

	public void setEnronllMoment(Instant enronllMoment) {
		this.enronllMoment = enronllMoment;
	}

	public Instant getRefoundMoment() {
		return refoundMoment;
	}

	public void setRefoundMoment(Instant refoundMoment) {
		this.refoundMoment = refoundMoment;
	}

	public boolean isAvailble() {
		return availble;
	}

	public void setAvailble(boolean availble) {
		this.availble = availble;
	}

	public boolean isOnlyUpdate() {
		return onlyUpdate;
	}

	public void setOnlyUpdate(boolean onlyUpdate) {
		this.onlyUpdate = onlyUpdate;
	}

}