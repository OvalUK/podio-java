package com.podio.item.map;

import java.math.BigDecimal;
import java.util.Set;

import org.joda.money.Money;

public class BugMap1 {

	private long externalId;

	private Set<HireStatus> statuses;

	private Money alottaCash;

	private String writeAJoke;

	private BigDecimal importance;

	private long howFarAreWe;

	private String ignored;

	public BugMap1() {
		super();
	}

	public BugMap1(long externalId, Set<HireStatus> statuses,
			Money alottaCash, String writeAJoke, BigDecimal importance,
			long howFarAreWe, String ignored) {
		super();
		this.externalId = externalId;
		this.statuses = statuses;
		this.alottaCash = alottaCash;
		this.writeAJoke = writeAJoke;
		this.importance = importance;
		this.howFarAreWe = howFarAreWe;
		this.ignored = ignored;
	}

	@ExternalId
	public long getExternalId() {
		return externalId;
	}

	public void setExternalId(long externalId) {
		this.externalId = externalId;
	}

	@Field("is-hired")
	public Set<HireStatus> getStatuses() {
		return statuses;
	}

	public void setStatuses(Set<HireStatus> statuses) {
		this.statuses = statuses;
	}

	public Money getAlottaCash() {
		return alottaCash;
	}

	public void setAlottaCash(Money money) {
		this.alottaCash = money;
	}

	public String getWriteAJoke() {
		return writeAJoke;
	}

	public void setWriteAJoke(String writeAJoke) {
		this.writeAJoke = writeAJoke;
	}

	public BigDecimal getImportance() {
		return importance;
	}

	public void setImportance(BigDecimal importance) {
		this.importance = importance;
	}

	public long getHowFarAreWe() {
		return howFarAreWe;
	}

	public void setHowFarAreWe(long howFarAreWe) {
		this.howFarAreWe = howFarAreWe;
	}

	@Transient
	public String getIgnored() {
		return ignored;
	}

	public void setIgnored(String ignored) {
		this.ignored = ignored;
	}
}