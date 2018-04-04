package com.willstay.domain;

public class Account {
    private final Long id;
    private final String name;
    private final Long ownerId;
    private Double volume;

    public Account(Long id, String name, Long ownerId, Double volume) {
        this.id = id;
        this.name = name;
        this.ownerId = ownerId;
        this.volume = volume;
    }

    public void setVolume(Double volume) {
        this.volume = volume;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Long getOwnerId() {
        return ownerId;
    }

    public Double getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Account{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", ownerId=").append(ownerId);
        sb.append(", volume=").append(volume);
        sb.append('}');
        return sb.toString();
    }
}
